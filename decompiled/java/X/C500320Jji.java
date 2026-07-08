package X;

import Y.ACListenerS142S0100000_7;
import Y.AfS176S0100000_7;
import android.view.View;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0Jji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C500320Jji {
    public final View LIZ;
    public final C954460awe LIZIZ;
    public final DataChannel LIZJ;
    public C11JL LIZLLL;
    public C11JF LJ;
    public Long LJFF;
    public final ACListenerS142S0100000_7 LJI = new ACListenerS142S0100000_7(this, 190);

    public final void onEvent(Integer num) {
        if (num != null) {
            if (num.intValue() == 0) {
                this.LIZIZ.LJIJJLI = 0L;
            } else if (num.intValue() == 1) {
                this.LIZIZ.LJIJJLI = 1L;
            } else if (num.intValue() == 2) {
                this.LIZIZ.LJIJJLI = 2L;
            } else if (num.intValue() == 3) {
                this.LIZIZ.LJIJJLI = 3L;
            }
        }
        LIZ("", "", false);
    }

    public final void onEvent(C257100z3 c257100z3) {
        FollowPair followPair;
        C954460awe c954460awe;
        if (c257100z3 != null && (followPair = c257100z3.LIZ) != null && (c954460awe = this.LIZIZ) != null && followPair.LIZ == c954460awe.LJ) {
            onEvent(Integer.valueOf(followPair.followStatus));
        }
    }

    public C500320Jji(View view, C954460awe c954460awe, DataChannel dataChannel) {
        this.LIZ = view;
        this.LIZIZ = c954460awe;
        this.LIZJ = dataChannel;
    }

    public final void LIZ(String str, String str2, boolean z) {
        if (this.LIZ == null) {
            return;
        }
        if (this.LIZIZ.LJI()) {
            C500260Jjc.LJIILIIL(this.LIZ);
            return;
        }
        long j = this.LIZIZ.LJIJJLI;
        if (j == -1) {
            if (z) {
                C11JL c11jl = this.LIZLLL;
                if (c11jl != null) {
                    c11jl.dispose();
                }
                this.LIZLLL = (C11JL) UserService.getInstance().user().LJ(this.LIZIZ.LJ, str, str2).LJJIIJZLJL(new AfS176S0100000_7(this, 175));
                return;
            }
            return;
        }
        if (j != 1 && j != 2) {
            C786410Ut5.I7(this.LJI, this.LIZ);
            C500260Jjc.LLFFF(this.LIZ);
            return;
        }
        C500260Jjc.LJIILIIL(this.LIZ);
    }
}
