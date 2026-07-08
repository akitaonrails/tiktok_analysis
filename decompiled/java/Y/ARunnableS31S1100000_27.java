package Y;

import X.AbstractC808800Vo6;
import X.C1792220wjs;
import X.C1819090xRD;
import X.C1851920yIA;
import X.C1851940yIC;
import X.C1C7U;
import X.C325210Cox;
import X.C786410Ut5;
import X.C808790Vo5;
import X.C829590WgX;
import X.InterfaceC1794150wmz;
import com.bytedance.android.livesdk.game.partnership.widget.GamePartnershipGamePinCardWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.cards.sug.TakoSugListCardAssem;
import com.ss.android.ugc.aweme.tako.multiconversation.sug.TakoMiddlePageSugListCardAssem;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public class ARunnableS31S1100000_27 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (Intrinsics.LJFF(((C1819090xRD) this.l1).LLILLJJLI, this.s0)) {
            C1819090xRD c1819090xRD = (C1819090xRD) this.l1;
            C786410Ut5.LLFF(8, c1819090xRD.LLILLL);
            C786410Ut5.LJZ(0, c1819090xRD.LLILZ);
            C786410Ut5.LLFF(0, c1819090xRD.LLILZIL);
            C786410Ut5.LLLLLLZZ(c1819090xRD.LLILZLL, 8);
            ((C1819090xRD) this.l1).LLILZIL.invalidate();
        }
    }

    public final void LIZ$1() {
        new C808790Vo5();
        try {
            ((InterfaceC1794150wmz) this.l1).onResponse(AbstractC808800Vo6.LIZ.LIZIZ(this.s0, null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int responseCode = th instanceof C829590WgX ? th.getResponseCode() : -100;
            InterfaceC1794150wmz interfaceC1794150wmz = (InterfaceC1794150wmz) this.l1;
            C1792220wjs c1792220wjs = new C1792220wjs();
            c1792220wjs.LIZ = 1;
            c1792220wjs.LIZIZ = responseCode;
            c1792220wjs.LJ = th.getMessage();
            interfaceC1794150wmz.LIZ(c1792220wjs);
        }
    }

    public static final void run$0(ARunnableS31S1100000_27 aRunnableS31S1100000_27) {
        boolean zLIZ;
        C1C7U.LIZ("GamePartnershipGamePinCardWidget@3fec.checkContinueShowingDropsCard$1");
        try {
            ((GamePartnershipGamePinCardWidget) aRunnableS31S1100000_27.l1).M1(1, aRunnableS31S1100000_27.s0, "", "enter_room");
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GamePartnershipGamePinCardWidget@3fec.checkContinueShowingDropsCard$1");
    }

    public static final void run$1(ARunnableS31S1100000_27 aRunnableS31S1100000_27) {
        boolean zLIZ;
        C1C7U.LIZ("TakoSugListCardAssem@717e.onBind$5");
        try {
            TuxTextView tuxTextView = ((TakoSugListCardAssem) aRunnableS31S1100000_27.l1).LLJLLIL;
            if (tuxTextView != null && tuxTextView.getParent() != null) {
                C325210Cox c325210Cox = C325210Cox.LIZ;
                String str = aRunnableS31S1100000_27.s0;
                AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(216);
                c325210Cox.getClass();
                C325210Cox.LIZJ(str, aFwS269S0000000_27);
                C325210Cox.LIZIZ(aRunnableS31S1100000_27.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoSugListCardAssem@717e.onBind$5");
    }

    public static final void run$2(ARunnableS31S1100000_27 aRunnableS31S1100000_27) {
        boolean zLIZ;
        C1C7U.LIZ("EcSearchAsrSessionManager@e403.scheduleMaxDurationTimeout$runnable$1");
        try {
            if (C1851920yIA.LIZJ.containsKey(aRunnableS31S1100000_27.s0)) {
                ((C1851940yIC) aRunnableS31S1100000_27.l1).LJFF = true;
                C1851920yIA c1851920yIA = C1851920yIA.LIZ;
                String str = aRunnableS31S1100000_27.s0;
                c1851920yIA.getClass();
                C1851920yIA.LIZIZ(str, null);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcSearchAsrSessionManager@e403.scheduleMaxDurationTimeout$runnable$1");
    }

    public static final void run$3(ARunnableS31S1100000_27 aRunnableS31S1100000_27) {
        boolean zLIZ;
        C1C7U.LIZ("MinisOperationBannerContentView@379f.bindRevisitRewardIcon$2$onComplete$1");
        try {
            aRunnableS31S1100000_27.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisOperationBannerContentView@379f.bindRevisitRewardIcon$2$onComplete$1");
    }

    public static final void run$4(ARunnableS31S1100000_27 aRunnableS31S1100000_27) {
        boolean zLIZ;
        C1C7U.LIZ("MinisOperationBannerContentView@379f.bindRevisitRewardIcon$2$onFailed$1");
        try {
            if (Intrinsics.LJFF(((C1819090xRD) aRunnableS31S1100000_27.l1).LLILLJJLI, aRunnableS31S1100000_27.s0)) {
                ((C1819090xRD) aRunnableS31S1100000_27.l1).LIZIZ();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisOperationBannerContentView@379f.bindRevisitRewardIcon$2$onFailed$1");
    }

    public static final void run$5(ARunnableS31S1100000_27 aRunnableS31S1100000_27) {
        boolean zLIZ;
        C1C7U.LIZ("TakoMiddlePageSugListCardAssem@54f6.onBind$1");
        try {
            TuxTextView tuxTextView = ((TakoMiddlePageSugListCardAssem) aRunnableS31S1100000_27.l1).LLJLIL;
            if (tuxTextView != null && tuxTextView.getParent() != null) {
                C325210Cox c325210Cox = C325210Cox.LIZ;
                String str = aRunnableS31S1100000_27.s0;
                AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(452);
                c325210Cox.getClass();
                C325210Cox.LIZJ(str, aFwS269S0000000_27);
                C325210Cox.LIZIZ(aRunnableS31S1100000_27.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoMiddlePageSugListCardAssem@54f6.onBind$1");
    }

    public static final void run$6(ARunnableS31S1100000_27 aRunnableS31S1100000_27) {
        boolean zLIZ;
        C1C7U.LIZ("NetworkService@c742.get$1");
        try {
            aRunnableS31S1100000_27.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NetworkService@c742.get$1");
    }

    public ARunnableS31S1100000_27(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
