package X;

import Y.ARunnableS128S0100000_28;
import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushBanStrategy;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.litemode.LiteModePushConfig;

/* JADX INFO: renamed from: X.0zgA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1905240zgA implements InterfaceC1905200zg6, C0VWA, C1BC4 {
    public final InterfaceC1905180zg4 LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final long LLIZ;
    public final InnerPushBanStrategy LLIZLLLIL;
    public final String LLJ;

    public C1905240zgA() {
        String str;
        InterfaceC1905180zg4 interfaceC1905180zg4 = new InterfaceC1905180zg4() { // from class: X.0zg2
            public InterfaceC539120LCk LL;

            @Override // X.InterfaceC19330810jy
            public final int[] LIZJ() {
                return new int[]{2461};
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
            public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
                if (innerPushMessage == null || innerPushMessage.getUiTemplate() == null || i != 3) {
                    return false;
                }
                C1905300zgG.LIZ.getClass();
                C1905300zgG.LJ(1, "push", null);
                InterfaceC539120LCk interfaceC539120LCk = this.LL;
                if (interfaceC539120LCk != null) {
                    interfaceC539120LCk.LIZIZ("dismiss_reason_click_right", null, false);
                }
                Activity activityLIZIZ = null;
                this.LL = null;
                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                if (abstractC1387200mCcLJ != null) {
                    activityLIZIZ = abstractC1387200mCcLJ.LIZIZ();
                }
                Activity activityLIZ = C06MM.LIZ(activityLIZIZ);
                if (activityLIZ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    c1389890mGx.LJIIJ(activityLIZ.getString(2131836512));
                    c1389890mGx.LJIIJJI();
                }
                try {
                    C1908480zlO.LIZIZ.LJII(C18JY.CLICK, innerPushMessage, "click", 3);
                    return true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return true;
                }
            }

            @Override // X.InterfaceC19330810jy
            public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
                this.LL = c20663515tR;
                return null;
            }
        };
        LiteModePushConfig liteModePushConfigLIZ = C1905280zgE.LIZ();
        long jHashCode = (liteModePushConfigLIZ == null || (str = liteModePushConfigLIZ.banStrategyId) == null) ? 12331180L : str.hashCode();
        LiteModePushConfig liteModePushConfigLIZ2 = C1905280zgE.LIZ();
        InnerPushBanStrategy innerPushBanStrategy = new InnerPushBanStrategy(jHashCode, liteModePushConfigLIZ2 != null ? liteModePushConfigLIZ2.banByCancelTimes : 0, 9214157878975800L, null);
        this.LL = interfaceC1905180zg4;
        this.LLILLJJLI = 2;
        this.LLILLL = 2461;
        this.LLILZ = "inner_lite_mode_push_plan_b";
        this.LLILZIL = 2131836511;
        this.LLILZLL = 2131836510;
        this.LLIZ = 86400L;
        this.LLIZLLLIL = innerPushBanStrategy;
        this.LLJ = null;
    }

    @Override // X.C0VWA
    public final void LJIIIIZZ() {
        LiteModePushConfig liteModePushConfigLIZ = C1905280zgE.LIZ();
        if (liteModePushConfigLIZ == null || liteModePushConfigLIZ.showPushByBadScroll != 1) {
            return;
        }
        C0VW0.LJIIL.remove(this);
        LJIILIIL();
    }

    @Override // X.C0VWA
    public final void LJIIIZ() {
        LiteModePushConfig liteModePushConfigLIZ = C1905280zgE.LIZ();
        if (liteModePushConfigLIZ == null || liteModePushConfigLIZ.showPushByBadScroll != 1) {
            C0VW0.LJIIL.remove(this);
            LJIILIIL();
        }
    }

    public final void LJIIL() {
        LiteModePushConfig liteModePushConfigLIZ = C1905280zgE.LIZ();
        if (liteModePushConfigLIZ == null || liteModePushConfigLIZ.planBDefaultTurnOn != 1) {
            C1905190zg5.LIZ(this);
        } else {
            C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS128S0100000_28(new C1905220zg8(), 79));
        }
    }

    public final void LJIILIIL() {
        LiteModePushConfig liteModePushConfigLIZ = C1905280zgE.LIZ();
        if (liteModePushConfigLIZ == null || liteModePushConfigLIZ.enablePreciseExp != 1) {
            LJIIL();
        } else if (C1833307Fz.LIZ() == 1) {
            LJIIL();
        }
    }

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

    @Override // X.InterfaceC1006670cIr
    public final void LJIIJ(C2189391AmP c2189391AmP, C2189391AmP c2189391AmP2) {
        C2189391AmP c2189391AmP3 = c2189391AmP2;
        LiteModePushConfig liteModePushConfigLIZ = C1905280zgE.LIZ();
        if (liteModePushConfigLIZ != null && liteModePushConfigLIZ.disablePushByTemperature == 0 && c2189391AmP3.LIZIZ()) {
            C1BCA.LJJIJIL(this);
            LJIILIIL();
        }
    }
}
