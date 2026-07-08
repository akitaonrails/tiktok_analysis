package Y;

import X.C1BGR;
import X.C1BGS;
import X.C2192491ArP;
import X.EnumC799870VZh;
import com.bytedance.applog.priority.PriorityWrapper;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes35.dex */
public class AObjectS81S0000000_34 implements Function0 {
    public final int $t;

    public static final Object invoke$10(AObjectS81S0000000_34 aObjectS81S0000000_34) {
        List<String> list = PriorityWrapper.LJFF;
        return "start init native priority...";
    }

    public static final Object invoke$11(AObjectS81S0000000_34 aObjectS81S0000000_34) {
        List<String> list = PriorityWrapper.LJFF;
        return "init native priority success!";
    }

    public static final Object invoke$12(AObjectS81S0000000_34 aObjectS81S0000000_34) {
        List<String> list = PriorityWrapper.LJFF;
        return "start flush priority...";
    }

    public static final Object invoke$13(AObjectS81S0000000_34 aObjectS81S0000000_34) {
        List<String> list = PriorityWrapper.LJFF;
        return "start to init priority...";
    }

    public static final Object invoke$14(AObjectS81S0000000_34 aObjectS81S0000000_34) {
        List<String> list = PriorityWrapper.LJFF;
        return "init failed";
    }

    public static final Object invoke$15(AObjectS81S0000000_34 aObjectS81S0000000_34) {
        List<String> list = PriorityWrapper.LJFF;
        return "parseDefaultReportUrl error: ";
    }

    public static final Object invoke$8(AObjectS81S0000000_34 aObjectS81S0000000_34) {
        List<String> list = PriorityWrapper.LJFF;
        return "add version config error!";
    }

    public static final Object invoke$9(AObjectS81S0000000_34 aObjectS81S0000000_34) {
        List<String> list = PriorityWrapper.LJFF;
        return "native config is empty, skip event!";
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
            default:
                return null;
        }
    }

    public AObjectS81S0000000_34(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS81S0000000_34 aObjectS81S0000000_34) {
        return new C2192491ArP();
    }

    public static final Object invoke$1(AObjectS81S0000000_34 aObjectS81S0000000_34) {
        return EnumC799870VZh.BACKGROUND;
    }

    public static final Object invoke$2(AObjectS81S0000000_34 aObjectS81S0000000_34) {
        return EnumC799870VZh.BOOT_FINISH;
    }

    public static final Object invoke$3(AObjectS81S0000000_34 aObjectS81S0000000_34) {
        return new ConcurrentHashSet();
    }

    public static final Object invoke$4(AObjectS81S0000000_34 aObjectS81S0000000_34) {
        return new ConcurrentHashSet();
    }

    public static final Object invoke$5(AObjectS81S0000000_34 aObjectS81S0000000_34) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$6(AObjectS81S0000000_34 aObjectS81S0000000_34) {
        return new C1BGR();
    }

    public static final Object invoke$7(AObjectS81S0000000_34 aObjectS81S0000000_34) throws Exception {
        throw new Exception("can't reach here");
    }

    public AObjectS81S0000000_34(C1BGS c1bgs, int i) {
        this.$t = i;
    }
}
