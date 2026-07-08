package Y;

import X.C01GW;
import X.C0VSJ;
import X.C1473000oR0;
import X.C1474810oTv;
import X.C1475000oUE;
import X.C1478080oZC;
import X.C1480850odf;
import X.C1484090oit;
import X.C1484570ojf;
import X.C1499630p7x;
import X.C1510700pPo;
import X.C1524510pm5;
import X.EnumC799870VZh;
import android.os.HandlerThread;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.simreporterdt.SimDtReportService;
import com.ss.android.ugc.aweme.simreporterdt.SimDtReportServiceV2;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes24.dex */
public class AObjectS73S0000000_23 implements Function0 {
    public final int $t;

    public static final Object invoke$14(AObjectS73S0000000_23 aObjectS73S0000000_23) {
        return null;
    }

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
            default:
                return null;
        }
    }

    public AObjectS73S0000000_23(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS73S0000000_23 aObjectS73S0000000_23) {
        String str = C1524510pm5.LIZIZ;
        if (str == null) {
            str = null;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        return new C0VSJ(c0vsj, "network/downloadfile/").getAbsolutePath();
    }

    public static final Object invoke$1(AObjectS73S0000000_23 aObjectS73S0000000_23) {
        return new ARunnableS98S0000000_23(3);
    }

    public static final Object invoke$10(AObjectS73S0000000_23 aObjectS73S0000000_23) {
        C01GW c01gw = C1478080oZC.LIZ;
        return C1478080oZC.LIZJ((String) C1474810oTv.U0.getValue());
    }

    public static final Object invoke$11(AObjectS73S0000000_23 aObjectS73S0000000_23) {
        return new C1484090oit();
    }

    public static final Object invoke$12(AObjectS73S0000000_23 aObjectS73S0000000_23) {
        return new C1473000oR0(((Number) C1474810oTv.LLLLLZL.getValue()).intValue());
    }

    public static final Object invoke$13(AObjectS73S0000000_23 aObjectS73S0000000_23) {
        boolean z = true;
        if (C1480850odf.LIZJ.getPlayerBackgroundSleepStrategy() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$15(AObjectS73S0000000_23 aObjectS73S0000000_23) {
        return SimDtReportService.executorService_delegate$lambda$0();
    }

    public static final Object invoke$16(AObjectS73S0000000_23 aObjectS73S0000000_23) {
        return SimDtReportServiceV2.executorService_delegate$lambda$0();
    }

    public static final Object invoke$17(AObjectS73S0000000_23 aObjectS73S0000000_23) {
        HandlerThread handlerThread = new HandlerThread("SimThread");
        handlerThread.start();
        return handlerThread;
    }

    public static final Object invoke$18(AObjectS73S0000000_23 aObjectS73S0000000_23) {
        return KevaImpl.getRepoFromSp(C1475000oUE.LIZ, "player_sdk_cache", 0);
    }

    public static final Object invoke$2(AObjectS73S0000000_23 aObjectS73S0000000_23) {
        return new C1484570ojf();
    }

    public static final Object invoke$3(AObjectS73S0000000_23 aObjectS73S0000000_23) {
        C1499630p7x.LIZIZ = null;
        C1499630p7x.LIZJ = null;
        return null;
    }

    public static final Object invoke$4(AObjectS73S0000000_23 aObjectS73S0000000_23) {
        return EnumC799870VZh.BACKGROUND;
    }

    public static final Object invoke$5(AObjectS73S0000000_23 aObjectS73S0000000_23) {
        return EnumC799870VZh.IDLE;
    }

    public static final Object invoke$6(AObjectS73S0000000_23 aObjectS73S0000000_23) {
        C1510700pPo.LIZ();
        return null;
    }

    public static final Object invoke$7(AObjectS73S0000000_23 aObjectS73S0000000_23) {
        C01GW c01gw = C1478080oZC.LIZ;
        return C1478080oZC.LIZJ(C1474810oTv.LLIIII());
    }

    public static final Object invoke$8(AObjectS73S0000000_23 aObjectS73S0000000_23) {
        C01GW c01gw = C1478080oZC.LIZ;
        return C1478080oZC.LIZJ(C1474810oTv.LJIILLIIL());
    }

    public static final Object invoke$9(AObjectS73S0000000_23 aObjectS73S0000000_23) {
        C01GW c01gw = C1478080oZC.LIZ;
        return C1478080oZC.LIZJ(C1474810oTv.LJIIIIZZ());
    }
}
