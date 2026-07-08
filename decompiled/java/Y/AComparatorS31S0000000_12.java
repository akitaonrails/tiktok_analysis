package Y;

import X.C0TN4;
import X.C0TRZ;
import X.C1123980fM4;
import X.C1727970v4F;
import X.C20085613iQ;
import X.C740650T3n;
import X.C750740Tce;
import X.C755180Tjo;
import X.C756800TmQ;
import X.C770670UKz;
import X.InterfaceC1124060fMC;
import X.InterfaceC771310UNl;
import com.bytedance.android.live.effect.model.composer.LiveComposerNode;
import com.bytedance.android.livesdk.broadcast.dynamic.DynamicStrategy;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushOffReason;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;

/* JADX INFO: loaded from: classes13.dex */
public class AComparatorS31S0000000_12 implements Comparator {
    public final int $t;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, obj, obj2);
            case 1:
                return compare$1(this, obj, obj2);
            case 2:
                return compare$2(this, obj, obj2);
            case 3:
                return compare$3(this, obj, obj2);
            case 4:
                return compare$4(this, obj, obj2);
            case 5:
                return compare$5(this, obj, obj2);
            case 6:
                return compare$6(this, obj, obj2);
            case 7:
                return compare$7(this, obj, obj2);
            case 8:
                return compare$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return compare$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return compare$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return compare$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return compare$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return compare$13(this, obj, obj2);
            case 14:
                return compare$14(this, obj, obj2);
            case 15:
                return compare$15(this, obj, obj2);
            case 16:
                return compare$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return compare$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return compare$18(this, obj, obj2);
            case 19:
                return compare$19(this, obj, obj2);
            default:
                return 0;
        }
    }

    public AComparatorS31S0000000_12(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS31S0000000_12 aComparatorS31S0000000_12, Object obj, Object obj2) {
        return ((C1123980fM4) obj).LIZ - ((C1123980fM4) obj2).LIZ;
    }

    public static final int compare$1(AComparatorS31S0000000_12 aComparatorS31S0000000_12, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((PushOffReason) obj).category), Integer.valueOf(((PushOffReason) obj2).category));
    }

    public static final int compare$10(AComparatorS31S0000000_12 aComparatorS31S0000000_12, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C0TN4) obj).LJI), Integer.valueOf(((C0TN4) obj2).LJI));
    }

    public static final int compare$11(AComparatorS31S0000000_12 aComparatorS31S0000000_12, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C0TN4) obj).LJI), Integer.valueOf(((C0TN4) obj2).LJI));
    }

    public static final int compare$12(AComparatorS31S0000000_12 aComparatorS31S0000000_12, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC771310UNl) obj).getPriority()), Integer.valueOf(((InterfaceC771310UNl) obj2).getPriority()));
    }

    public static final int compare$13(AComparatorS31S0000000_12 aComparatorS31S0000000_12, Object obj, Object obj2) {
        return ((C1123980fM4) obj).LIZ - ((C1123980fM4) obj2).LIZ;
    }

    public static final int compare$14(AComparatorS31S0000000_12 aComparatorS31S0000000_12, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(C756800TmQ.LIZIZ(((InterfaceC1124060fMC) obj).LIZ())), Integer.valueOf(C756800TmQ.LIZIZ(((InterfaceC1124060fMC) obj2).LIZ())));
    }

    public static final int compare$15(AComparatorS31S0000000_12 aComparatorS31S0000000_12, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C740650T3n) obj2).LIZIZ), Long.valueOf(((C740650T3n) obj).LIZIZ));
    }

    public static final int compare$16(AComparatorS31S0000000_12 aComparatorS31S0000000_12, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C755180Tjo) obj).LIZ.LJIIIIZZ), Integer.valueOf(((C755180Tjo) obj2).LIZ.LJIIIIZZ));
    }

    public static final int compare$17(AComparatorS31S0000000_12 aComparatorS31S0000000_12, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((C0TRZ) obj).LIZLLL, ((C0TRZ) obj2).LIZLLL);
    }

    public static final int compare$18(AComparatorS31S0000000_12 aComparatorS31S0000000_12, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C750740Tce) obj).LJI), Integer.valueOf(((C750740Tce) obj2).LJI));
    }

    public static final int compare$19(AComparatorS31S0000000_12 aComparatorS31S0000000_12, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C770670UKz) obj).LIZ.priority), Integer.valueOf(((C770670UKz) obj2).LIZ.priority));
    }

    public static final int compare$2(AComparatorS31S0000000_12 aComparatorS31S0000000_12, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((LiveComposerNode) obj).updateTime), Long.valueOf(((LiveComposerNode) obj2).updateTime));
    }

    public static final int compare$3(AComparatorS31S0000000_12 aComparatorS31S0000000_12, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((LiveComposerNode) obj).updateTime), Long.valueOf(((LiveComposerNode) obj2).updateTime));
    }

    public static final int compare$4(AComparatorS31S0000000_12 aComparatorS31S0000000_12, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((LiveComposerNode) obj).updateTime), Long.valueOf(((LiveComposerNode) obj2).updateTime));
    }

    public static final int compare$5(AComparatorS31S0000000_12 aComparatorS31S0000000_12, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((LiveComposerNode) obj).updateTime), Long.valueOf(((LiveComposerNode) obj2).updateTime));
    }

    public static final int compare$6(AComparatorS31S0000000_12 aComparatorS31S0000000_12, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((LiveComposerNode) obj).updateTime), Long.valueOf(((LiveComposerNode) obj2).updateTime));
    }

    public static final int compare$7(AComparatorS31S0000000_12 aComparatorS31S0000000_12, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((LiveComposerNode) obj).updateTime), Long.valueOf(((LiveComposerNode) obj2).updateTime));
    }

    public static final int compare$8(AComparatorS31S0000000_12 aComparatorS31S0000000_12, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((DynamicStrategy) obj).mPriority), Integer.valueOf(((DynamicStrategy) obj2).mPriority));
    }

    public static final int compare$9(AComparatorS31S0000000_12 aComparatorS31S0000000_12, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((C1727970v4F) obj).LIZIZ, ((C1727970v4F) obj2).LIZIZ);
    }
}
