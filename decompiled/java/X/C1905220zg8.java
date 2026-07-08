package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushBanStrategy;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;

/* JADX INFO: renamed from: X.0zg8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1905220zg8 implements InterfaceC1905200zg6 {
    public final InterfaceC1905180zg4 LL = new InterfaceC1905180zg4() { // from class: X.0zg7
        @Override // X.InterfaceC19330810jy
        public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
            return false;
        }

        @Override // X.InterfaceC19330810jy
        public final int[] LIZJ() {
            return new int[]{2460};
        }

        @Override // X.InterfaceC19330810jy
        public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
            return false;
        }

        @Override // X.InterfaceC19330810jy
        public final boolean LJFF(InnerPushMessage innerPushMessage) {
            return true;
        }

        @Override // X.InterfaceC19330810jy
        public final boolean LJI(InnerPushMessage innerPushMessage) {
            return true;
        }

        @Override // X.InterfaceC19330810jy
        public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
            C1905300zgG.LIZ.getClass();
            C1905300zgG.LJ(1, "auto", null);
            return null;
        }
    };
    public final int LLILLJJLI = 1;
    public final int LLILLL = 2460;
    public final String LLILZ = "inner_lite_mode_push_plan_a";
    public final int LLILZIL = 2131836509;
    public final int LLILZLL = 2131836508;
    public final long LLIZ = 9214157878975800L;
    public final InnerPushBanStrategy LLIZLLLIL = null;
    public final String LLJ = "aweme://settings/lite_mode?enter_from=push";

    @Override // X.InterfaceC1905200zg6
    public final long LIZ() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1905200zg6
    public final String LIZIZ() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1905200zg6
    public final int LIZJ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1905200zg6
    public final String LIZLLL() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1905200zg6
    public final int LJ() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1905200zg6
    public final InterfaceC1905180zg4 LJFF() {
        return this.LL;
    }

    @Override // X.InterfaceC1905200zg6
    public final int LJI() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1905200zg6
    public final InnerPushBanStrategy LJII() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1905200zg6
    public final int LJIIJJI() {
        return this.LLILLJJLI;
    }
}
