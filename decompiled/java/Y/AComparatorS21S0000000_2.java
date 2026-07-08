package Y;

import X.AbstractC1053500dWO;
import X.C05M1;
import X.C0Y8T;
import X.C0Y9G;
import X.C1053410dWF;
import X.C1322005Fi;
import X.C1397705dX;
import X.C1622406Ww;
import X.C1756006uE;
import X.C20085613iQ;
import X.C2095008Iq;
import X.C869590Y9l;
import X.C879540Yeu;
import X.InterfaceC1443105kr;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.affinity.model.SocialAffinityItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.streak.impl.utils.StreakCmdMessageUploadInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class AComparatorS21S0000000_2 implements Comparator {
    public final int $t;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, t, t2);
            case 1:
                return compare$1(this, t, t2);
            case 2:
                return compare$2(this, t, t2);
            case 3:
                return compare$3(this, t, t2);
            case 4:
                return compare$4(this, t, t2);
            case 5:
                return compare$5(this, t, t2);
            case 6:
                return compare$6(this, t, t2);
            case 7:
                return compare$7(this, t, t2);
            case 8:
                return compare$8(this, t, t2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return compare$9(this, t, t2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return compare$10(this, t, t2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return compare$11(this, t, t2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return compare$12(this, t, t2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return compare$13(this, t, t2);
            case 14:
                return compare$14(this, t, t2);
            case 15:
                return compare$15(this, t, t2);
            case 16:
                return compare$16(this, t, t2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return compare$17(this, t, t2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return compare$18(this, t, t2);
            case 19:
                return compare$19(this, t, t2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return compare$20(this, t, t2);
            case 21:
                return compare$21(this, t, t2);
            case 22:
                return compare$22(this, t, t2);
            case 23:
                return compare$23(this, t, t2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return compare$24(this, t, t2);
            case 25:
                return compare$25(this, t, t2);
            case 26:
                return compare$26(this, t, t2);
            case 27:
                return compare$27(this, t, t2);
            case 28:
                return compare$28(this, t, t2);
            case 29:
                return compare$29(this, t, t2);
            default:
                return 0;
        }
    }

    public AComparatorS21S0000000_2(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((IndexedValue) obj).LIZ), Integer.valueOf(((IndexedValue) obj2).LIZ));
    }

    public static final int compare$1(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C1322005Fi) obj).LIZIZ), Long.valueOf(((C1322005Fi) obj2).LIZIZ));
    }

    public static final int compare$10(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1397705dX) obj).LIZJ), Integer.valueOf(((C1397705dX) obj2).LIZJ));
    }

    public static final int compare$11(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1397705dX) obj).LIZJ), Integer.valueOf(((C1397705dX) obj2).LIZJ));
    }

    public static final int compare$12(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1397705dX) obj).LIZJ), Integer.valueOf(((C1397705dX) obj2).LIZJ));
    }

    public static final int compare$13(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        int iIntValue;
        Integer numLJIILJJIL = ((InterfaceC1443105kr) obj).LJIILJJIL();
        int iIntValue2 = Integer.MAX_VALUE;
        if (numLJIILJJIL != null) {
            iIntValue = numLJIILJJIL.intValue();
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numLJIILJJIL2 = ((InterfaceC1443105kr) obj2).LJIILJJIL();
        if (numLJIILJJIL2 != null) {
            iIntValue2 = numLJIILJJIL2.intValue();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIntValue2));
    }

    public static final int compare$14(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C0Y9G) obj2).LJ), Long.valueOf(((C0Y9G) obj).LJ));
    }

    public static final int compare$15(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Double.valueOf(((SocialAffinityItem) obj2).score), Double.valueOf(((SocialAffinityItem) obj).score));
    }

    public static final int compare$16(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C05M1) obj).LJ), Long.valueOf(((C05M1) obj2).LJ));
    }

    public static final int compare$17(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C869590Y9l) obj).getIndex()), Long.valueOf(((C869590Y9l) obj2).getIndex()));
    }

    public static final int compare$18(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C869590Y9l) obj).getIndex()), Long.valueOf(((C869590Y9l) obj2).getIndex()));
    }

    public static final int compare$19(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((Aweme) obj2).getCreateTime()), Long.valueOf(((Aweme) obj).getCreateTime()));
    }

    public static final int compare$2(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((MusicModel) obj2).getDateLastModified(), ((MusicModel) obj).getDateLastModified());
    }

    public static final int compare$20(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C869590Y9l) obj2).getOrderIndex()), Long.valueOf(((C869590Y9l) obj).getOrderIndex()));
    }

    public static final int compare$21(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Comparable) ((Pair) obj2).getSecond(), (Comparable) ((Pair) obj).getSecond());
    }

    public static final int compare$22(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Comparable) ((Map.Entry) obj2).getValue(), (Comparable) ((Map.Entry) obj).getValue());
    }

    public static final int compare$23(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1756006uE) obj2).LJFF), Integer.valueOf(((C1756006uE) obj).LJFF));
    }

    public static final int compare$24(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        C869590Y9l c869590Y9l = (C869590Y9l) obj;
        C869590Y9l c869590Y9l2 = (C869590Y9l) obj2;
        if (Intrinsics.LJFF(c869590Y9l, c869590Y9l2)) {
            return 0;
        }
        if (c869590Y9l == null) {
            return 1;
        }
        if (c869590Y9l2 == null) {
            return -1;
        }
        int iLJII = Intrinsics.LJII(c869590Y9l2.getOrderIndex(), c869590Y9l.getOrderIndex());
        if (iLJII != 0) {
            return iLJII;
        }
        return Intrinsics.LJII(c869590Y9l2.getCreatedAt(), c869590Y9l.getCreatedAt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int compare$25(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        Long lValueOf;
        C0Y8T c0y8t;
        C0Y8T c0y8t2;
        T t = ((C879540Yeu) obj2).LIZJ;
        Long lValueOf2 = null;
        if ((t instanceof C0Y8T) && (c0y8t2 = (C0Y8T) t) != null) {
            lValueOf = Long.valueOf(c0y8t2.getUpdatedTime());
        } else {
            lValueOf = null;
        }
        T t2 = ((C879540Yeu) obj).LIZJ;
        if ((t2 instanceof C0Y8T) && (c0y8t = (C0Y8T) t2) != null) {
            lValueOf2 = Long.valueOf(c0y8t.getUpdatedTime());
        }
        return C20085613iQ.LIZIZ(lValueOf, lValueOf2);
    }

    public static final int compare$26(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        C1053410dWF c1053410dWF;
        long jLongValue;
        C1053410dWF c1053410dWF2;
        Long l;
        Long l2;
        AbstractC1053500dWO abstractC1053500dWO = (AbstractC1053500dWO) obj2;
        if (abstractC1053500dWO instanceof C1053410dWF) {
            c1053410dWF = (C1053410dWF) abstractC1053500dWO;
        } else {
            c1053410dWF = null;
        }
        long jLongValue2 = 0;
        if (c1053410dWF != null && (l2 = c1053410dWF.LJIIIIZZ) != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = 0;
        }
        Long lValueOf = Long.valueOf(jLongValue);
        AbstractC1053500dWO abstractC1053500dWO2 = (AbstractC1053500dWO) obj;
        if ((abstractC1053500dWO2 instanceof C1053410dWF) && (c1053410dWF2 = (C1053410dWF) abstractC1053500dWO2) != null && (l = c1053410dWF2.LJIIIIZZ) != null) {
            jLongValue2 = l.longValue();
        }
        return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(jLongValue2));
    }

    public static final int compare$27(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
    }

    public static final int compare$28(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int compare$29(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Float) ((IndexedValue) obj2).LIZIZ, (Float) ((IndexedValue) obj).LIZIZ);
    }

    public static final int compare$3(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
    }

    public static final int compare$4(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1397705dX) obj).LIZJ), Integer.valueOf(((C1397705dX) obj2).LIZJ));
    }

    public static final int compare$5(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1622406Ww) obj2).LIZLLL.getLevel()), Integer.valueOf(((C1622406Ww) obj).LIZLLL.getLevel()));
    }

    public static final int compare$6(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        int iIntValue;
        Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) ((Map.Entry) obj).getKey());
        int iIntValue2 = 0;
        if (numLJIIJJI != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numLJIIJJI2 = C2095008Iq.LJIIJJI((String) ((Map.Entry) obj2).getKey());
        if (numLJIIJJI2 != null) {
            iIntValue2 = numLJIIJJI2.intValue();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIntValue2));
    }

    public static final int compare$7(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((StreakCmdMessageUploadInfo) ((Pair) obj).getSecond()).receiveTime), Long.valueOf(((StreakCmdMessageUploadInfo) ((Pair) obj2).getSecond()).receiveTime));
    }

    public static final int compare$8(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((StreakCmdMessageUploadInfo) ((Pair) obj).getSecond()).receiveTime), Long.valueOf(((StreakCmdMessageUploadInfo) ((Pair) obj2).getSecond()).receiveTime));
    }

    public static final int compare$9(AComparatorS21S0000000_2 aComparatorS21S0000000_2, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((StreakCmdMessageUploadInfo) obj2).receiveTime), Long.valueOf(((StreakCmdMessageUploadInfo) obj).receiveTime));
    }
}
