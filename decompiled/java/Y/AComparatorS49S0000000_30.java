package Y;

import X.C13LP;
import X.C1456960o18;
import X.C14L9;
import X.C20035013aG;
import X.C20053713dH;
import X.C20085613iQ;
import X.C20155613ti;
import X.C20183913yH;
import X.C2252061DCq;
import android.util.Size;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.aigc.C2PACacheItem;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.framework.annotation.EcommerceRegion;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.music.model.StrippedMusicInfo;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public class AComparatorS49S0000000_30 implements Comparator {
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
            default:
                return 0;
        }
    }

    public AComparatorS49S0000000_30(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS49S0000000_30 aComparatorS49S0000000_30, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Long) ((Pair) obj).getSecond(), (Long) ((Pair) obj2).getSecond());
    }

    public static final int compare$1(AComparatorS49S0000000_30 aComparatorS49S0000000_30, Object obj, Object obj2) {
        return Intrinsics.LJI(((C20035013aG) obj).LIZIZ, ((C20035013aG) obj2).LIZIZ);
    }

    public static final int compare$10(AComparatorS49S0000000_30 aComparatorS49S0000000_30, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((StrippedMusicInfo) obj).getStartTimeInMs(), ((StrippedMusicInfo) obj2).getStartTimeInMs());
    }

    public static final int compare$11(AComparatorS49S0000000_30 aComparatorS49S0000000_30, Object obj, Object obj2) {
        int iPriority;
        Annotation[] annotations = obj.getClass().getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (Annotation annotation : annotations) {
            if (annotation instanceof EcommerceRegion) {
                arrayList.add(annotation);
            }
        }
        EcommerceRegion ecommerceRegion = (EcommerceRegion) C13LP.LJJJLL(arrayList);
        int iPriority2 = 100;
        if (ecommerceRegion != null) {
            iPriority = ecommerceRegion.priority();
        } else {
            iPriority = 100;
        }
        Integer numValueOf = Integer.valueOf(iPriority);
        Annotation[] annotations2 = obj2.getClass().getAnnotations();
        ArrayList arrayList2 = new ArrayList();
        for (Annotation annotation2 : annotations2) {
            if (annotation2 instanceof EcommerceRegion) {
                arrayList2.add(annotation2);
            }
        }
        EcommerceRegion ecommerceRegion2 = (EcommerceRegion) C13LP.LJJJLL(arrayList2);
        if (ecommerceRegion2 != null) {
            iPriority2 = ecommerceRegion2.priority();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iPriority2));
    }

    public static final int compare$12(AComparatorS49S0000000_30 aComparatorS49S0000000_30, Object obj, Object obj2) {
        Integer numValueOf;
        Size sizeLIZJ = ((C20155613ti) obj2).LIZJ();
        Integer numValueOf2 = null;
        if (sizeLIZJ != null) {
            numValueOf = Integer.valueOf(sizeLIZJ.getWidth());
        } else {
            numValueOf = null;
        }
        Size sizeLIZJ2 = ((C20155613ti) obj).LIZJ();
        if (sizeLIZJ2 != null) {
            numValueOf2 = Integer.valueOf(sizeLIZJ2.getWidth());
        }
        return C20085613iQ.LIZIZ(numValueOf, numValueOf2);
    }

    public static final int compare$13(AComparatorS49S0000000_30 aComparatorS49S0000000_30, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((Aweme) obj2).getCreateTime()), Long.valueOf(((Aweme) obj).getCreateTime()));
    }

    public static final int compare$14(AComparatorS49S0000000_30 aComparatorS49S0000000_30, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C20183913yH) obj2).LJ), Long.valueOf(((C20183913yH) obj).LJ));
    }

    public static final int compare$15(AComparatorS49S0000000_30 aComparatorS49S0000000_30, Object obj, Object obj2) {
        return ((Comparable) obj).compareTo(obj2);
    }

    public static final int compare$16(AComparatorS49S0000000_30 aComparatorS49S0000000_30, Object obj, Object obj2) {
        long jLongValue;
        Long l = ((C2PACacheItem) obj).lastUseTime;
        long jLongValue2 = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Long lValueOf = Long.valueOf(-jLongValue);
        Long l2 = ((C2PACacheItem) obj2).lastUseTime;
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        }
        return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(-jLongValue2));
    }

    public static final int compare$17(AComparatorS49S0000000_30 aComparatorS49S0000000_30, Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    public static final int compare$18(AComparatorS49S0000000_30 aComparatorS49S0000000_30, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((Option) obj).id), Integer.valueOf(((Option) obj2).id));
    }

    public static final int compare$19(AComparatorS49S0000000_30 aComparatorS49S0000000_30, Object obj, Object obj2) {
        C20053713dH c20053713dH = (C20053713dH) obj;
        C20053713dH c20053713dH2 = (C20053713dH) obj2;
        float f = c20053713dH.LLJLLL.LJIILL.LLJLLIL;
        float f2 = c20053713dH2.LLJLLL.LJIILL.LLJLLIL;
        if (f == f2) {
            return Intrinsics.LJI(c20053713dH.LJJIJL(), c20053713dH2.LJJIJL());
        }
        return Float.compare(f, f2);
    }

    public static final int compare$2(AComparatorS49S0000000_30 aComparatorS49S0000000_30, Object obj, Object obj2) {
        return ((int[]) obj)[0] - ((int[]) obj2)[0];
    }

    public static final int compare$20(AComparatorS49S0000000_30 aComparatorS49S0000000_30, Object obj, Object obj2) {
        C20053713dH c20053713dH = (C20053713dH) obj;
        C20053713dH c20053713dH2 = (C20053713dH) obj2;
        int iLJI = Intrinsics.LJI(c20053713dH.LLJJI, c20053713dH2.LLJJI);
        if (iLJI == 0) {
            return Intrinsics.LJI(c20053713dH.hashCode(), c20053713dH2.hashCode());
        }
        return iLJI;
    }

    public static final int compare$21(AComparatorS49S0000000_30 aComparatorS49S0000000_30, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((C2252061DCq) obj2).LJJIIZI, ((C2252061DCq) obj).LJJIIZI);
    }

    public static final int compare$3(AComparatorS49S0000000_30 aComparatorS49S0000000_30, Object obj, Object obj2) {
        return ((int[]) obj2)[0] - ((int[]) obj)[0];
    }

    public static final int compare$4(AComparatorS49S0000000_30 aComparatorS49S0000000_30, Object obj, Object obj2) {
        return ((int[]) obj2)[1] - ((int[]) obj)[1];
    }

    public static final int compare$5(AComparatorS49S0000000_30 aComparatorS49S0000000_30, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C14L9) obj).LIZIZ), Integer.valueOf(((C14L9) obj2).LIZIZ));
    }

    public static final int compare$6(AComparatorS49S0000000_30 aComparatorS49S0000000_30, Object obj, Object obj2) {
        int iPriority;
        Annotation[] annotations = obj.getClass().getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (Annotation annotation : annotations) {
            if (annotation instanceof EcommerceRegion) {
                arrayList.add(annotation);
            }
        }
        EcommerceRegion ecommerceRegion = (EcommerceRegion) C13LP.LJJJLL(arrayList);
        int iPriority2 = 100;
        if (ecommerceRegion != null) {
            iPriority = ecommerceRegion.priority();
        } else {
            iPriority = 100;
        }
        Integer numValueOf = Integer.valueOf(iPriority);
        Annotation[] annotations2 = obj2.getClass().getAnnotations();
        ArrayList arrayList2 = new ArrayList();
        for (Annotation annotation2 : annotations2) {
            if (annotation2 instanceof EcommerceRegion) {
                arrayList2.add(annotation2);
            }
        }
        EcommerceRegion ecommerceRegion2 = (EcommerceRegion) C13LP.LJJJLL(arrayList2);
        if (ecommerceRegion2 != null) {
            iPriority2 = ecommerceRegion2.priority();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iPriority2));
    }

    public static final int compare$7(AComparatorS49S0000000_30 aComparatorS49S0000000_30, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((Aweme) obj2).getCreateTime()), Long.valueOf(((Aweme) obj).getCreateTime()));
    }

    public static final int compare$8(AComparatorS49S0000000_30 aComparatorS49S0000000_30, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((Aweme) obj2).getCreateTime()), Long.valueOf(((Aweme) obj).getCreateTime()));
    }

    public static final int compare$9(AComparatorS49S0000000_30 aComparatorS49S0000000_30, Object obj, Object obj2) {
        Long startTime;
        C1456960o18 c1456960o18 = ((MusicBuzModel) obj).stripMusicModel;
        Long startTime2 = null;
        if (c1456960o18 != null) {
            startTime = c1456960o18.getStartTime();
        } else {
            startTime = null;
        }
        C1456960o18 c1456960o182 = ((MusicBuzModel) obj2).stripMusicModel;
        if (c1456960o182 != null) {
            startTime2 = c1456960o182.getStartTime();
        }
        return C20085613iQ.LIZIZ(startTime, startTime2);
    }
}
