package Y;

import X.AbstractC939840aZ4;
import X.C1276780jKW;
import X.C20085613iQ;
import X.C2095008Iq;
import X.C915980Zwa;
import X.C933770aPH;
import X.C953770avX;
import X.C954460awe;
import X.C955080axe;
import X.C956260azY;
import X.C957020b0m;
import X.C982910bgX;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;
import tikcast.linkmic.common.CohostTypeSpotExtra;
import tikcast.linkmic.common.MultiGuestSpotExtra;
import webcast.data.multi_guest_play.WallpaperContext;

/* JADX INFO: loaded from: classes16.dex */
public class AComparatorS34S0000000_15 implements Comparator {
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
            default:
                return 0;
        }
    }

    public AComparatorS34S0000000_15(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS34S0000000_15 aComparatorS34S0000000_15, Object obj, Object obj2) {
        int iIntValue;
        Integer numLJIIJJI = C2095008Iq.LJIIJJI(((C982910bgX) obj).LJIILJJIL);
        int iIntValue2 = 0;
        if (numLJIIJJI != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(((C982910bgX) obj2).LJIILJJIL);
        if (numLJIIJJI2 != null) {
            iIntValue2 = numLJIIJJI2.intValue();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIntValue2));
    }

    public static final int compare$1(AComparatorS34S0000000_15 aComparatorS34S0000000_15, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        if (num != null && num2 != null) {
            return num.intValue() - num2.intValue();
        }
        return 0;
    }

    public static final int compare$10(AComparatorS34S0000000_15 aComparatorS34S0000000_15, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1276780jKW) obj).LJFF), Integer.valueOf(((C1276780jKW) obj2).LJFF));
    }

    public static final int compare$11(AComparatorS34S0000000_15 aComparatorS34S0000000_15, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C954460awe) obj).LJIIJ), Long.valueOf(((C954460awe) obj2).LJIIJ));
    }

    public static final int compare$12(AComparatorS34S0000000_15 aComparatorS34S0000000_15, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C954460awe) obj).LJIIIZ), Long.valueOf(((C954460awe) obj2).LJIIIZ));
    }

    public static final int compare$13(AComparatorS34S0000000_15 aComparatorS34S0000000_15, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C954460awe) obj).LJIIIZ), Long.valueOf(((C954460awe) obj2).LJIIIZ));
    }

    public static final int compare$14(AComparatorS34S0000000_15 aComparatorS34S0000000_15, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C933770aPH) obj).LL.LJIIIIZZ()), Integer.valueOf(((C933770aPH) obj2).LL.LJIIIIZZ()));
    }

    public static final int compare$15(AComparatorS34S0000000_15 aComparatorS34S0000000_15, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C933770aPH) obj).LL.LJIIIIZZ()), Integer.valueOf(((C933770aPH) obj2).LL.LJIIIIZZ()));
    }

    public static final int compare$16(AComparatorS34S0000000_15 aComparatorS34S0000000_15, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C955080axe) obj).LJ), Integer.valueOf(((C955080axe) obj2).LJ));
    }

    public static final int compare$17(AComparatorS34S0000000_15 aComparatorS34S0000000_15, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(C915980Zwa.LJII().LLLFF((LinkUser) obj)), Integer.valueOf(C915980Zwa.LJII().LLLFF((LinkUser) obj2)));
    }

    public static final int compare$18(AComparatorS34S0000000_15 aComparatorS34S0000000_15, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf((int) ((C956260azY) obj).LIZIZ.LIZ), Integer.valueOf((int) ((C956260azY) obj2).LIZIZ.LIZ));
    }

    public static final int compare$19(AComparatorS34S0000000_15 aComparatorS34S0000000_15, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C953770avX) obj2).LIZJ), Long.valueOf(((C953770avX) obj).LIZJ));
    }

    public static final int compare$2(AComparatorS34S0000000_15 aComparatorS34S0000000_15, Object obj, Object obj2) {
        Long l = (Long) obj;
        Long l2 = (Long) obj2;
        if (l != null && l2 != null) {
            if (l.longValue() > l2.longValue()) {
                return 1;
            }
            if (l.longValue() < l2.longValue()) {
                return -1;
            }
            return 0;
        }
        return 0;
    }

    public static final int compare$20(AComparatorS34S0000000_15 aComparatorS34S0000000_15, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C954460awe) obj).LJIIJ), Long.valueOf(((C954460awe) obj2).LJIIJ));
    }

    public static final int compare$21(AComparatorS34S0000000_15 aComparatorS34S0000000_15, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        if (num != null && num2 != null) {
            return num.intValue() - num2.intValue();
        }
        return 0;
    }

    public static final int compare$22(AComparatorS34S0000000_15 aComparatorS34S0000000_15, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((AbstractC939840aZ4) obj).getPriority().LIZ), Integer.valueOf(((AbstractC939840aZ4) obj2).getPriority().LIZ));
    }

    public static final int compare$3(AComparatorS34S0000000_15 aComparatorS34S0000000_15, Object obj, Object obj2) {
        int i;
        MultiGuestSpotExtra multiGuestExtra = ((C957020b0m) obj).getMultiGuestExtra();
        int i2 = 0;
        if (multiGuestExtra != null) {
            i = multiGuestExtra.spotRank;
        } else {
            i = 0;
        }
        Integer numValueOf = Integer.valueOf(i);
        MultiGuestSpotExtra multiGuestExtra2 = ((C957020b0m) obj2).getMultiGuestExtra();
        if (multiGuestExtra2 != null) {
            i2 = multiGuestExtra2.spotRank;
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(i2));
    }

    public static final int compare$4(AComparatorS34S0000000_15 aComparatorS34S0000000_15, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((WallpaperContext) obj).wallpaperStartTime), Long.valueOf(((WallpaperContext) obj2).wallpaperStartTime));
    }

    public static final int compare$5(AComparatorS34S0000000_15 aComparatorS34S0000000_15, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C954460awe) obj).LJIIJ), Long.valueOf(((C954460awe) obj2).LJIIJ));
    }

    public static final int compare$6(AComparatorS34S0000000_15 aComparatorS34S0000000_15, Object obj, Object obj2) {
        int iIntValue;
        Integer numLJIIJJI = C2095008Iq.LJIIJJI(((C982910bgX) obj).LJIILJJIL);
        int iIntValue2 = 0;
        if (numLJIIJJI != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(((C982910bgX) obj2).LJIILJJIL);
        if (numLJIIJJI2 != null) {
            iIntValue2 = numLJIIJJI2.intValue();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIntValue2));
    }

    public static final int compare$7(AComparatorS34S0000000_15 aComparatorS34S0000000_15, Object obj, Object obj2) {
        int i;
        CohostTypeSpotExtra cohostTypeSpotExtra = ((C955080axe) obj).LJIILJJIL;
        int i2 = 0;
        if (cohostTypeSpotExtra != null) {
            i = cohostTypeSpotExtra.preEnlargeSpotId;
        } else {
            i = 0;
        }
        Integer numValueOf = Integer.valueOf(i);
        CohostTypeSpotExtra cohostTypeSpotExtra2 = ((C955080axe) obj2).LJIILJJIL;
        if (cohostTypeSpotExtra2 != null) {
            i2 = cohostTypeSpotExtra2.preEnlargeSpotId;
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(i2));
    }

    public static final int compare$8(AComparatorS34S0000000_15 aComparatorS34S0000000_15, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((LinkUser) obj).channelOwnerLinkedTime, ((LinkUser) obj2).channelOwnerLinkedTime);
    }

    public static final int compare$9(AComparatorS34S0000000_15 aComparatorS34S0000000_15, Object obj, Object obj2) {
        int i;
        CohostTypeSpotExtra cohostTypeSpotExtra = ((C955080axe) obj).LJIILJJIL;
        int i2 = 0;
        if (cohostTypeSpotExtra != null) {
            i = cohostTypeSpotExtra.preEnlargeSpotId;
        } else {
            i = 0;
        }
        Integer numValueOf = Integer.valueOf(i);
        CohostTypeSpotExtra cohostTypeSpotExtra2 = ((C955080axe) obj2).LJIILJJIL;
        if (cohostTypeSpotExtra2 != null) {
            i2 = cohostTypeSpotExtra2.preEnlargeSpotId;
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(i2));
    }
}
