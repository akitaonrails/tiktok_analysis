package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0aTk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936540aTk {
    public final LinkPlayerInfo LIZ;
    public int LIZIZ = -1;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 554));
    public EnumC936560aTm LIZLLL;
    public final C11PQ<Boolean> LJ;
    public final C11PQ<Long> LJFF;
    public final C11PQ<Boolean> LJI;
    public int LJII;

    public final boolean LIZ() {
        return ((User) this.LIZJ.getValue()).getId() == UserService.getInstance().user().getCurrentUserId();
    }

    public C936540aTk(LinkPlayerInfo linkPlayerInfo) {
        EnumC936560aTm enumC936560aTm;
        this.LIZ = linkPlayerInfo;
        this.LIZLLL = EnumC936560aTm.STATE_IDLE;
        Boolean bool = Boolean.FALSE;
        this.LJ = C11PQ.LJLLLLLL(bool);
        this.LJFF = C11PQ.LJLLLLLL(Long.valueOf(linkPlayerInfo.mFanTicket));
        this.LJI = C11PQ.LJLLLLLL(bool);
        this.LJII = -1;
        if (LIZ()) {
            enumC936560aTm = EnumC936560aTm.STATE_PREPARING;
        } else {
            enumC936560aTm = EnumC936560aTm.STATE_LINKED;
        }
        this.LIZLLL = enumC936560aTm;
    }
}
