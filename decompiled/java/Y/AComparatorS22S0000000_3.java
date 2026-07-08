package Y;

import X.C07YE;
import X.C08H6;
import X.C08LK;
import X.C09HE;
import X.C09KW;
import X.C1240530iO3;
import X.C1629220sUy;
import X.C1921507fp;
import X.C1969607na;
import X.C20085613iQ;
import X.C2098708Kb;
import X.C2100408Ks;
import X.C2124208Tw;
import X.C2209908lF;
import X.C2255508sb;
import X.C2280601EOk;
import X.C2338709Ej;
import X.EnumC207101162h;
import X.InterfaceC2495909qH;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.zoin.decode.DecodeProcessor;
import com.bytedance.zoin.model.ZoinBlockInfo;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.net.experiment.Strategy;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public class AComparatorS22S0000000_3 implements Comparator {
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
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return compare$20(this, obj, obj2);
            case 21:
                return compare$21(this, obj, obj2);
            case 22:
                return compare$22(this, obj, obj2);
            case 23:
                return compare$23(this, obj, obj2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return compare$24(this, obj, obj2);
            case 25:
                return compare$25(this, obj, obj2);
            case 26:
                return compare$26(this, obj, obj2);
            case 27:
                return compare$27(this, obj, obj2);
            case 28:
                return compare$28(this, obj, obj2);
            case 29:
                return compare$29(this, obj, obj2);
            case 30:
                return compare$30(this, obj, obj2);
            case 31:
                return compare$31(this, obj, obj2);
            case 32:
                return compare$32(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return compare$33(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return compare$34(this, obj, obj2);
            case 35:
                return compare$35(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return compare$36(this, obj, obj2);
            case 37:
                return compare$37(this, obj, obj2);
            case 38:
                return compare$38(this, obj, obj2);
            case 39:
                return compare$39(this, obj, obj2);
            case 40:
                return compare$40(this, obj, obj2);
            case 41:
                return compare$41(this, obj, obj2);
            case 42:
                return compare$42(this, obj, obj2);
            case 43:
                return compare$43(this, obj, obj2);
            case 44:
                return compare$44(this, obj, obj2);
            case 45:
                return compare$45(this, obj, obj2);
            case 46:
                return compare$46(this, obj, obj2);
            case 47:
                return compare$47(this, obj, obj2);
            default:
                return 0;
        }
    }

    public AComparatorS22S0000000_3(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        Pair pair2 = (Pair) obj2;
        return (((Number) pair.getSecond()).intValue() - ((Number) pair.getFirst()).intValue()) - (((Number) pair2.getSecond()).intValue() - ((Number) pair2.getFirst()).intValue());
    }

    public static final int compare$1(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((C09KW) obj).LIZ, ((C09KW) obj2).LIZ);
    }

    public static final int compare$10(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
    }

    public static final int compare$11(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) obj;
        String segmentBeginTime = timeSpeedModelExtension.getSegmentBeginTime();
        if (segmentBeginTime != null && segmentBeginTime.length() != 0) {
            jCurrentTimeMillis = CastLongProtector.parseLong(timeSpeedModelExtension.getSegmentBeginTime());
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        TimeSpeedModelExtension timeSpeedModelExtension2 = (TimeSpeedModelExtension) obj2;
        String segmentBeginTime2 = timeSpeedModelExtension2.getSegmentBeginTime();
        if (segmentBeginTime2 != null && segmentBeginTime2.length() != 0) {
            jCurrentTimeMillis2 = CastLongProtector.parseLong(timeSpeedModelExtension2.getSegmentBeginTime());
        } else {
            jCurrentTimeMillis2 = System.currentTimeMillis();
        }
        return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(jCurrentTimeMillis2));
    }

    public static final int compare$12(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1629220sUy) obj).LIZJ), Integer.valueOf(((C1629220sUy) obj2).LIZJ));
    }

    public static final int compare$13(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((MediaModel) obj2).modify), Long.valueOf(((MediaModel) obj).modify));
    }

    public static final int compare$14(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((MediaModel) obj2).modify), Long.valueOf(((MediaModel) obj).modify));
    }

    public static final int compare$15(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Long) ((Pair) obj).getSecond(), (Long) ((Pair) obj2).getSecond());
    }

    public static final int compare$16(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((Strategy) obj2).threshold), Integer.valueOf(((Strategy) obj).threshold));
    }

    public static final int compare$17(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return DecodeProcessor.lambda$decodeAndVerify$0((ZoinBlockInfo) obj, (ZoinBlockInfo) obj2);
    }

    public static final int compare$18(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((EnumC207101162h) obj).getValue()), Integer.valueOf(((EnumC207101162h) obj2).getValue()));
    }

    public static final int compare$19(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        Iterator it2 = ((List) obj2).iterator();
        if (it2.hasNext()) {
            Long lValueOf = Long.valueOf(((EditorProAIGCMediaItemModel) it2.next()).creationTime);
            while (it2.hasNext()) {
                Long lValueOf2 = Long.valueOf(((EditorProAIGCMediaItemModel) it2.next()).creationTime);
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            Iterator it3 = ((List) obj).iterator();
            if (it3.hasNext()) {
                Long lValueOf3 = Long.valueOf(((EditorProAIGCMediaItemModel) it3.next()).creationTime);
                while (it3.hasNext()) {
                    Long lValueOf4 = Long.valueOf(((EditorProAIGCMediaItemModel) it3.next()).creationTime);
                    if (lValueOf3.compareTo(lValueOf4) < 0) {
                        lValueOf3 = lValueOf4;
                    }
                }
                return C20085613iQ.LIZIZ(lValueOf, lValueOf3);
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public static final int compare$2(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((C09KW) obj).LIZ, ((C09KW) obj2).LIZ);
    }

    public static final int compare$20(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        long jLongValue;
        Long l;
        Iterator it2 = ((List) obj2).iterator();
        Long lValueOf = null;
        if (it2.hasNext()) {
            lValueOf = Long.valueOf(((EditorProAIGCMediaItemModel) it2.next()).creationTime);
            while (it2.hasNext()) {
                Long lValueOf2 = Long.valueOf(((EditorProAIGCMediaItemModel) it2.next()).creationTime);
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
        }
        long jLongValue2 = 0;
        if (lValueOf != null) {
            jLongValue = lValueOf.longValue();
        } else {
            jLongValue = 0;
        }
        Long lValueOf3 = Long.valueOf(jLongValue);
        Iterator it3 = ((List) obj).iterator();
        if (it3.hasNext()) {
            Long lValueOf4 = Long.valueOf(((EditorProAIGCMediaItemModel) it3.next()).creationTime);
            loop1: while (true) {
                l = lValueOf4;
                while (it3.hasNext()) {
                    lValueOf4 = Long.valueOf(((EditorProAIGCMediaItemModel) it3.next()).creationTime);
                    if (l.compareTo(lValueOf4) < 0) {
                        break;
                    }
                }
            }
            if (l != null) {
                jLongValue2 = l.longValue();
            }
        }
        return C20085613iQ.LIZIZ(lValueOf3, Long.valueOf(jLongValue2));
    }

    public static final int compare$21(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        Iterator it2 = ((List) obj2).iterator();
        if (it2.hasNext()) {
            Long lValueOf = Long.valueOf(((EditorProAIGCMediaItemModel) it2.next()).creationTime);
            while (it2.hasNext()) {
                Long lValueOf2 = Long.valueOf(((EditorProAIGCMediaItemModel) it2.next()).creationTime);
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            Iterator it3 = ((List) obj).iterator();
            if (it3.hasNext()) {
                Long lValueOf3 = Long.valueOf(((EditorProAIGCMediaItemModel) it3.next()).creationTime);
                while (it3.hasNext()) {
                    Long lValueOf4 = Long.valueOf(((EditorProAIGCMediaItemModel) it3.next()).creationTime);
                    if (lValueOf3.compareTo(lValueOf4) < 0) {
                        lValueOf3 = lValueOf4;
                    }
                }
                return C20085613iQ.LIZIZ(lValueOf, lValueOf3);
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public static final int compare$22(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1921507fp) obj).LIZJ), Integer.valueOf(((C1921507fp) obj2).LIZJ));
    }

    public static final int compare$23(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C2209908lF) obj).LIZ), Long.valueOf(((C2209908lF) obj2).LIZ));
    }

    public static final int compare$24(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C2124208Tw) obj).LIZJ), Long.valueOf(((C2124208Tw) obj2).LIZJ));
    }

    public static final int compare$25(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C2255508sb) obj2).LJFF), Long.valueOf(((C2255508sb) obj).LJFF));
    }

    public static final int compare$26(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
    }

    public static final int compare$27(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C08LK) obj).LIZIZ), Long.valueOf(((C08LK) obj2).LIZIZ));
    }

    public static final int compare$28(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C2098708Kb) ((Map.Entry) obj2).getValue()).LIZJ), Long.valueOf(((C2098708Kb) ((Map.Entry) obj).getValue()).LIZJ));
    }

    public static final int compare$29(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C2098708Kb) ((Map.Entry) obj2).getValue()).LIZJ), Long.valueOf(((C2098708Kb) ((Map.Entry) obj).getValue()).LIZJ));
    }

    public static final int compare$3(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return ((C08H6) obj2).LIZ - ((C08H6) obj).LIZ;
    }

    public static final int compare$30(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C1969607na) obj2).LIZJ), Long.valueOf(((C1969607na) obj).LIZJ));
    }

    public static final int compare$31(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C2100408Ks) obj2).LIZ()), Long.valueOf(((C2100408Ks) obj).LIZ()));
    }

    public static final int compare$32(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C2100408Ks) obj2).LIZ()), Long.valueOf(((C2100408Ks) obj).LIZ()));
    }

    public static final int compare$33(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
    }

    public static final int compare$34(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
    }

    public static final int compare$35(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
    }

    public static final int compare$36(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
    }

    public static final int compare$37(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((C2280601EOk) obj).LIZIZ, ((C2280601EOk) obj2).LIZIZ);
    }

    public static final int compare$38(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(-((File) obj).lastModified()), Long.valueOf(-((File) obj2).lastModified()));
    }

    public static final int compare$39(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(CastLongProtector.parseLong(((String[]) ((Pair) obj).getSecond())[0])), Long.valueOf(CastLongProtector.parseLong(((String[]) ((Pair) obj2).getSecond())[0])));
    }

    public static final int compare$4(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        long j;
        C07YE c07ye = ((C1240530iO3) obj2).LLILLL;
        long j2 = 0;
        if (c07ye != null) {
            j = c07ye.LIZ;
        } else {
            j = 0;
        }
        Long lValueOf = Long.valueOf(j);
        C07YE c07ye2 = ((C1240530iO3) obj).LLILLL;
        if (c07ye2 != null) {
            j2 = c07ye2.LIZ;
        }
        return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(j2));
    }

    public static final int compare$40(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
    }

    public static final int compare$41(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1629220sUy) obj2).LIZJ), Integer.valueOf(((C1629220sUy) obj).LIZJ));
    }

    public static final int compare$42(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return ((File) obj).getName().compareTo(((File) obj2).getName());
    }

    public static final int compare$43(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return ((File) obj).getName().compareTo(((File) obj2).getName());
    }

    public static final int compare$44(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((Message) obj).versionSeq), Long.valueOf(((Message) obj2).versionSeq));
    }

    public static final int compare$45(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
    }

    public static final int compare$46(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C09HE) obj2).getTimeStamp()), Long.valueOf(((C09HE) obj).getTimeStamp()));
    }

    public static final int compare$47(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C2338709Ej.LIZIZ((Field) obj).compareTo(C2338709Ej.LIZIZ((Field) obj2));
    }

    public static final int compare$5(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Long) ((Pair) obj).getSecond(), (Long) ((Pair) obj2).getSecond());
    }

    public static final int compare$6(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC2495909qH) obj).getPriority()), Integer.valueOf(((InterfaceC2495909qH) obj2).getPriority()));
    }

    public static final int compare$7(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((MediaModel) obj2).date), Long.valueOf(((MediaModel) obj).date));
    }

    public static final int compare$8(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((MediaModel) obj2).date), Long.valueOf(((MediaModel) obj).date));
    }

    public static final int compare$9(AComparatorS22S0000000_3 aComparatorS22S0000000_3, Object obj, Object obj2) {
        return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
    }
}
