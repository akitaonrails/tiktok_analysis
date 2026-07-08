package X;

import Y.ARunnableS115S0100000_15;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchBeansSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bRW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973600bRW {
    public final View LIZ;
    public final DataChannel LIZIZ;
    public final String LIZJ;
    public EnumC1120860fH2 LIZLLL;
    public final ARunnableS115S0100000_15 LJ = new ARunnableS115S0100000_15(this, 116);
    public final ARunnableS115S0100000_15 LJFF = new ARunnableS115S0100000_15(this, 120);
    public final ARunnableS115S0100000_15 LJI = new ARunnableS115S0100000_15(this, 118);
    public final ARunnableS115S0100000_15 LJII = new ARunnableS115S0100000_15(this, 119);
    public final ARunnableS115S0100000_15 LJIIIIZZ = new ARunnableS115S0100000_15(this, 117);

    public final void LIZ() {
        LIZIZ(false);
        LIZJ(false);
        LIZLLL(false);
    }

    public final void LJ() {
        if (!Intrinsics.LJFF(this.LIZJ, "plaza_icon")) {
            LIZ();
            return;
        }
        LIZIZ(true);
        LIZJ(true);
        LIZLLL(C915980Zwa.LIZIZ().Dn0().isTakeTheStage());
    }

    public final void LJFF() {
        Integer numLIZIZ;
        C786410Ut5.LJLIIL(10000L, C473410IhP.LIZ(), this.LJ);
        if (Intrinsics.LJFF(this.LIZJ, "plaza_icon")) {
            Integer numLIZIZ2 = InterfaceC960800b6s.LLL.LIZIZ();
            if (numLIZIZ2 != null && numLIZIZ2.intValue() == 0) {
                C786410Ut5.LJLIIL(10000L, C473410IhP.LIZ(), this.LJI);
            } else if (C915980Zwa.LJII().LLILZLL(true).size() == 2 && LiveMatchBeansSettings.INSTANCE.isAnchorEnabled() && (numLIZIZ = InterfaceC1106030et7.R4.LIZIZ()) != null && numLIZIZ.intValue() == 0) {
                C786410Ut5.LJLIIL(10000L, C473410IhP.LIZ(), this.LJIIIIZZ);
            }
        }
    }

    public final void LIZIZ(boolean z) {
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        C1113800f5e.LIZJ(EnumC1120860fH2.ANCHOR_CATCH_BEANS_NEW_MODE);
        C473410IhP.LIZ().removeCallbacks(this.LJIIIIZZ);
        if (z) {
            InterfaceC1106030et7.R4.LJFF(1);
        }
    }

    public final void LIZJ(boolean z) {
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        C1113800f5e.LIZJ(EnumC1120860fH2.ANCHOR_TAKE_THE_STAGE_NEW_MODE_V2);
        C473410IhP.LIZ().removeCallbacks(this.LJI);
        if (z) {
            InterfaceC960800b6s.LLL.LJFF(1);
        }
    }

    public final void LIZLLL(boolean z) {
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        C1113800f5e.LIZJ(EnumC1120860fH2.ANCHOR_TAKE_THE_STAGE_ROTATE);
        C473410IhP.LIZ().removeCallbacks(this.LJII);
        if (z) {
            InterfaceC960800b6s.LLLF.LJFF(1);
        }
    }

    public C973600bRW(View view, DataChannel dataChannel, String str) {
        this.LIZ = view;
        this.LIZIZ = dataChannel;
        this.LIZJ = str;
    }
}
