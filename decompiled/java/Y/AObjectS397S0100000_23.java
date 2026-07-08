package Y;

import X.C1473120oRC;
import X.C1473170oRH;
import X.C1473190oRJ;
import X.C1473300oRU;
import X.C1479690obn;
import X.C1480620odI;
import X.C1482330og3;
import X.C1483905rR;
import X.C1487360ooA;
import X.C1492110ovp;
import X.C1499500p7k;
import X.C1499630p7x;
import X.C19221910Hx;
import X.C2179591ARx;
import X.C2187451AjH;
import X.C786410Ut5;
import X.EnumC1523070pjl;
import X.InterfaceC1499640p7y;
import X.InterfaceC1499650p7z;
import X.InterfaceC1523020pjg;
import X.InterfaceC1528040prm;
import X.RunnableC1492130ovr;
import android.os.HandlerThread;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.video.preload.DVideoPreloadManager;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes24.dex */
public class AObjectS397S0100000_23 implements Function0 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS397S0100000_23 aObjectS397S0100000_23) {
        ((InterfaceC1523020pjg) aObjectS397S0100000_23.l0).onError(EnumC1523070pjl.SOCKET_SEND_FAIL.getCode(), "send fail");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS397S0100000_23 aObjectS397S0100000_23) {
        ((InterfaceC1523020pjg) aObjectS397S0100000_23.l0).onError(EnumC1523070pjl.SOCKET_CREATE_FAIL.getCode(), "create socket fail");
        return Unit.LIZ;
    }

    public static final Object invoke$10(AObjectS397S0100000_23 aObjectS397S0100000_23) {
        InterfaceC1499650p7z interfaceC1499650p7z;
        ((C19221910Hx) aObjectS397S0100000_23.l0).getClass();
        if (C1483905rR.LIZ() != null && C1483905rR.LIZ().size() > 4) {
            C1499500p7k.LIZIZ = 2500L;
            Map<String, InterfaceC1499640p7y> map = C1499630p7x.LIZ;
            if (C2187451AjH.LJIIJ()) {
                interfaceC1499650p7z = new InterfaceC1499650p7z() { // from class: X.0p7m
                    @Override // X.InterfaceC1499650p7z
                    public final void LIZ(long j, String str) {
                    }

                    @Override // X.InterfaceC1499650p7z
                    public final void LIZIZ(String str) {
                    }
                };
            } else {
                interfaceC1499650p7z = null;
            }
            C1499630p7x.LIZ("enter_shoot", interfaceC1499650p7z);
            C1492110ovp.LIZ(null, true, 5000, new AObjectS73S0000000_23(3));
        }
        return null;
    }

    public static final Object invoke$11(AObjectS397S0100000_23 aObjectS397S0100000_23) {
        ((RunnableC1492130ovr) aObjectS397S0100000_23.l0).LL.run();
        return null;
    }

    public static final Object invoke$12(AObjectS397S0100000_23 aObjectS397S0100000_23) {
        C1487360ooA.LJFF((C1487360ooA) aObjectS397S0100000_23.l0, 6, null, 2);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$13(AObjectS397S0100000_23 aObjectS397S0100000_23) {
        return (Function2) aObjectS397S0100000_23.l0;
    }

    public static final Object invoke$14(AObjectS397S0100000_23 aObjectS397S0100000_23) {
        return ((AtomicReference) aObjectS397S0100000_23.l0).getAndSet(null);
    }

    public static final Object invoke$15(AObjectS397S0100000_23 aObjectS397S0100000_23) {
        WeakReference<View> weakReference;
        View view;
        C1473170oRH c1473170oRH = (C1473170oRH) aObjectS397S0100000_23.l0;
        if (c1473170oRH.LJ) {
            C1473190oRJ c1473190oRJ = c1473170oRH.LIZ.LJI;
            if (c1473190oRJ.LIZIZ && (weakReference = c1473190oRJ.LIZ) != null && (view = weakReference.get()) != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            c1473170oRH.LJIIL(c1473170oRH.LIZJ, "IE-HideCoverTimeout");
            C1473120oRC.LJIIJJI("HideCoverTimeoutAnalyzer", new C1473300oRU("IE-HideCoverTimeout"), c1473170oRH.LIZJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AObjectS397S0100000_23 aObjectS397S0100000_23) {
        return new BPEAHandler(C786410Ut5.W2((HandlerThread) ((C1480620odI) aObjectS397S0100000_23.l0).LJJIIJ.getValue()));
    }

    public static final Object invoke$17(AObjectS397S0100000_23 aObjectS397S0100000_23) {
        C1480620odI c1480620odI = (C1480620odI) aObjectS397S0100000_23.l0;
        return new C1482330og3(c1480620odI.LIZIZ, c1480620odI, c1480620odI.LJIIJ, c1480620odI.LJLJI());
    }

    public static final Object invoke$18(AObjectS397S0100000_23 aObjectS397S0100000_23) {
        C1480620odI c1480620odI = (C1480620odI) aObjectS397S0100000_23.l0;
        return new C1479690obn(c1480620odI.LIZIZ, c1480620odI, c1480620odI.LJIILJJIL, c1480620odI.LJLJI());
    }

    public static final Object invoke$19(AObjectS397S0100000_23 aObjectS397S0100000_23) {
        DVideoPreloadManager dVideoPreloadManager = (DVideoPreloadManager) aObjectS397S0100000_23.l0;
        BPEAHandler bPEAHandler = DVideoPreloadManager.LJI;
        if (!dVideoPreloadManager.LIZJ) {
            boolean zLJIJJLI = dVideoPreloadManager.LIZIZ.LJIJJLI();
            dVideoPreloadManager.LIZJ = zLJIJJLI;
            if (zLJIJJLI) {
                dVideoPreloadManager.LJ.countDown();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS397S0100000_23 aObjectS397S0100000_23) {
        ((InterfaceC1523020pjg) aObjectS397S0100000_23.l0).onError(EnumC1523070pjl.TIMEOUT.getCode(), "connect timeout");
        return Unit.LIZ;
    }

    public static final Object invoke$20(AObjectS397S0100000_23 aObjectS397S0100000_23) {
        ((DVideoPreloadManager) aObjectS397S0100000_23.l0).LIZIZ.clearCache();
        return Unit.LIZ;
    }

    public static final Object invoke$21(AObjectS397S0100000_23 aObjectS397S0100000_23) {
        ((DVideoPreloadManager) aObjectS397S0100000_23.l0).LIZIZ.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS397S0100000_23 aObjectS397S0100000_23) {
        ((InterfaceC1523020pjg) aObjectS397S0100000_23.l0).LIZ(LSPassThroughRecordSizeConfig.DEFAULT, "connect timeout");
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS397S0100000_23 aObjectS397S0100000_23) {
        C2179591ARx c2179591ARx = (C2179591ARx) aObjectS397S0100000_23.l0;
        c2179591ARx.LJII.LJIIIIZZ();
        InterfaceC1528040prm interfaceC1528040prm = c2179591ARx.LJFF;
        if (interfaceC1528040prm != null) {
            interfaceC1528040prm.LIZIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS397S0100000_23 aObjectS397S0100000_23) {
        ((C2179591ARx) aObjectS397S0100000_23.l0).LJII.LIZJ();
        return Unit.LIZ;
    }

    public static final Object invoke$6(AObjectS397S0100000_23 aObjectS397S0100000_23) {
        C2179591ARx c2179591ARx = (C2179591ARx) aObjectS397S0100000_23.l0;
        c2179591ARx.LJII.LJFF();
        InterfaceC1528040prm interfaceC1528040prm = c2179591ARx.LJFF;
        if (interfaceC1528040prm != null) {
            interfaceC1528040prm.LIZLLL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AObjectS397S0100000_23 aObjectS397S0100000_23) {
        C2179591ARx c2179591ARx = (C2179591ARx) aObjectS397S0100000_23.l0;
        c2179591ARx.LJII.LJ();
        InterfaceC1528040prm interfaceC1528040prm = c2179591ARx.LJFF;
        if (interfaceC1528040prm != null) {
            interfaceC1528040prm.LIZJ(2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AObjectS397S0100000_23 aObjectS397S0100000_23) {
        C2179591ARx c2179591ARx = (C2179591ARx) aObjectS397S0100000_23.l0;
        c2179591ARx.LJII.LJIIJ();
        InterfaceC1528040prm interfaceC1528040prm = c2179591ARx.LJFF;
        if (interfaceC1528040prm != null) {
            interfaceC1528040prm.LJ(2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AObjectS397S0100000_23 aObjectS397S0100000_23) {
        ((C2179591ARx) aObjectS397S0100000_23.l0).LJII.LJII();
        return Unit.LIZ;
    }

    public AObjectS397S0100000_23(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
