package Y;

import X.C0OFL;
import X.C1155700gBE;
import X.C1158210gFH;
import X.C1160660gJE;
import X.C1161100gJw;
import X.C1177210gjv;
import X.C1178080glK;
import X.C1178200glW;
import X.C120200cy;
import X.C12M1;
import X.C12M3;
import X.C136N;
import X.C1784480wXO;
import X.C20085613iQ;
import X.C21697219vm;
import X.EnumC2005707tP;
import X.InterfaceC1193730hAZ;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.event.StoreMixJumpLynxEvent;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.Material;
import com.ss.android.ugc.aweme.slash.component.navigation.ElevatorNaviGroup;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class AComparatorS37S0000000_18 implements Comparator {
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
            default:
                return 0;
        }
    }

    public AComparatorS37S0000000_18(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS37S0000000_18 aComparatorS37S0000000_18, Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        Pair pair2 = (Pair) obj2;
        if (pair == null) {
            if (pair2 == null) {
                return 0;
            }
            return -1;
        }
        if (pair2 == null) {
            return 1;
        }
        return ((Integer) ((C136N) pair.first).LIZ).intValue() - ((Integer) ((C136N) pair2.first).LIZ).intValue();
    }

    public static final int compare$1(AComparatorS37S0000000_18 aComparatorS37S0000000_18, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((StoreMixJumpLynxEvent) obj).zIndex, ((StoreMixJumpLynxEvent) obj2).zIndex);
    }

    public static final int compare$10(AComparatorS37S0000000_18 aComparatorS37S0000000_18, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C21697219vm) obj).LJFF), Integer.valueOf(((C21697219vm) obj2).LJFF));
    }

    public static final int compare$11(AComparatorS37S0000000_18 aComparatorS37S0000000_18, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C21697219vm) obj).LJ), Integer.valueOf(((C21697219vm) obj2).LJ));
    }

    public static final int compare$12(AComparatorS37S0000000_18 aComparatorS37S0000000_18, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(C120200cy.LIZ(((C0OFL) obj).LIZ().mobKey)), Integer.valueOf(C120200cy.LIZ(((C0OFL) obj2).LIZ().mobKey)));
    }

    public static final int compare$13(AComparatorS37S0000000_18 aComparatorS37S0000000_18, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1160660gJE) obj).LIZ), Integer.valueOf(((C1160660gJE) obj2).LIZ));
    }

    public static final int compare$14(AComparatorS37S0000000_18 aComparatorS37S0000000_18, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1161100gJw) obj).LIZ), Integer.valueOf(((C1161100gJw) obj2).LIZ));
    }

    public static final int compare$15(AComparatorS37S0000000_18 aComparatorS37S0000000_18, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1178080glK) obj2).LIZLLL), Integer.valueOf(((C1178080glK) obj).LIZLLL));
    }

    public static final int compare$16(AComparatorS37S0000000_18 aComparatorS37S0000000_18, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C12M3) obj).LIZ), Integer.valueOf(((C12M3) obj2).LIZ));
    }

    public static final int compare$17(AComparatorS37S0000000_18 aComparatorS37S0000000_18, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1178200glW) obj2).LJII), Integer.valueOf(((C1178200glW) obj).LJII));
    }

    public static final int compare$18(AComparatorS37S0000000_18 aComparatorS37S0000000_18, Object obj, Object obj2) {
        Integer num;
        ElevatorNaviGroup elevatorNaviGroup = (ElevatorNaviGroup) obj;
        Integer num2 = null;
        if (elevatorNaviGroup != null) {
            num = elevatorNaviGroup.groupLevel;
        } else {
            num = null;
        }
        ElevatorNaviGroup elevatorNaviGroup2 = (ElevatorNaviGroup) obj2;
        if (elevatorNaviGroup2 != null) {
            num2 = elevatorNaviGroup2.groupLevel;
        }
        return C20085613iQ.LIZIZ(num, num2);
    }

    public static final int compare$19(AComparatorS37S0000000_18 aComparatorS37S0000000_18, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1177210gjv) obj2).LJ), Integer.valueOf(((C1177210gjv) obj).LJ));
    }

    public static final int compare$2(AComparatorS37S0000000_18 aComparatorS37S0000000_18, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((String) obj).length()), Integer.valueOf(((String) obj2).length()));
    }

    public static final int compare$20(AComparatorS37S0000000_18 aComparatorS37S0000000_18, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1158210gFH) obj2).LIZ), Integer.valueOf(((C1158210gFH) obj).LIZ));
    }

    public static final int compare$21(AComparatorS37S0000000_18 aComparatorS37S0000000_18, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Long) ((Map.Entry) obj).getValue(), (Long) ((Map.Entry) obj2).getValue());
    }

    public static final int compare$22(AComparatorS37S0000000_18 aComparatorS37S0000000_18, Object obj, Object obj2) {
        Material material = ((C1155700gBE) obj).LIZIZ;
        double d = material.duration;
        double d2 = 1.5d;
        if (d <= 0.0d) {
            if (material.type == EnumC2005707tP.IMAGE) {
                d = 1.5d;
            } else {
                d = 2.5d;
            }
        }
        Double dValueOf = Double.valueOf(d);
        Material material2 = ((C1155700gBE) obj2).LIZIZ;
        double d3 = material2.duration;
        if (d3 > 0.0d) {
            d2 = d3;
        } else if (material2.type != EnumC2005707tP.IMAGE) {
            d2 = 2.5d;
        }
        return C20085613iQ.LIZIZ(dValueOf, Double.valueOf(d2));
    }

    public static final int compare$23(AComparatorS37S0000000_18 aComparatorS37S0000000_18, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C12M1) obj).LIZ), Integer.valueOf(((C12M1) obj2).LIZ));
    }

    public static final int compare$3(AComparatorS37S0000000_18 aComparatorS37S0000000_18, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((PoiGeneralCard) obj).getSortPoiRating(), ((PoiGeneralCard) obj2).getSortPoiRating());
    }

    public static final int compare$4(AComparatorS37S0000000_18 aComparatorS37S0000000_18, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((PoiGeneralCard) obj).getSortDistanceMeter(), ((PoiGeneralCard) obj2).getSortDistanceMeter());
    }

    public static final int compare$5(AComparatorS37S0000000_18 aComparatorS37S0000000_18, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((PoiGeneralCard) obj).getOriginalIndex()), Integer.valueOf(((PoiGeneralCard) obj2).getOriginalIndex()));
    }

    public static final int compare$6(AComparatorS37S0000000_18 aComparatorS37S0000000_18, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((InterfaceC1193730hAZ) obj).LJII().LLJJLIIIJLLLLLLLZ), Long.valueOf(((InterfaceC1193730hAZ) obj2).LJII().LLJJLIIIJLLLLLLLZ));
    }

    public static final int compare$7(AComparatorS37S0000000_18 aComparatorS37S0000000_18, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C1784480wXO) obj2).LJIIJJI), Long.valueOf(((C1784480wXO) obj).LJIIJJI));
    }

    public static final int compare$8(AComparatorS37S0000000_18 aComparatorS37S0000000_18, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C1784480wXO) obj2).LJIIJJI), Long.valueOf(((C1784480wXO) obj).LJIIJJI));
    }

    public static final int compare$9(AComparatorS37S0000000_18 aComparatorS37S0000000_18, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C1784480wXO) obj2).LJIIJJI), Long.valueOf(((C1784480wXO) obj).LJIIJJI));
    }
}
