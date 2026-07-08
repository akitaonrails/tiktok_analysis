package Y;

import X.C20085613iQ;
import X.C21529619Nm;
import X.C21531519Of;
import X.C21537019Qi;
import X.C21597419fg;
import X.C21598819fu;
import X.C21603219gc;
import X.C21687119u9;
import X.C2174561A8o;
import X.InterfaceC19211810Ea;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;

/* JADX INFO: loaded from: classes34.dex */
public class AComparatorS52S0000000_33 implements Comparator {
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
            default:
                return 0;
        }
    }

    public AComparatorS52S0000000_33(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS52S0000000_33 aComparatorS52S0000000_33, Object obj, Object obj2) {
        return Integer.compare(((C21529619Nm) obj).LIZ, ((C21529619Nm) obj2).LIZ);
    }

    public static final int compare$1(AComparatorS52S0000000_33 aComparatorS52S0000000_33, Object obj, Object obj2) {
        return ((C21531519Of) obj).LIZJ - ((C21531519Of) obj2).LIZJ;
    }

    public static final int compare$10(AComparatorS52S0000000_33 aComparatorS52S0000000_33, Object obj, Object obj2) {
        return ((C21597419fg) obj).LIZIZ - ((C21597419fg) obj2).LIZIZ;
    }

    public static final int compare$11(AComparatorS52S0000000_33 aComparatorS52S0000000_33, Object obj, Object obj2) {
        return ((C21598819fu) obj).LIZIZ - ((C21598819fu) obj2).LIZIZ;
    }

    public static final int compare$12(AComparatorS52S0000000_33 aComparatorS52S0000000_33, Object obj, Object obj2) {
        return ((C21687119u9) obj).LIZ() - ((C21687119u9) obj2).LIZ();
    }

    public static final int compare$13(AComparatorS52S0000000_33 aComparatorS52S0000000_33, Object obj, Object obj2) {
        return ((C21537019Qi) obj).LLILLJJLI - ((C21537019Qi) obj2).LLILLJJLI;
    }

    public static final int compare$2(AComparatorS52S0000000_33 aComparatorS52S0000000_33, Object obj, Object obj2) {
        return ((C21603219gc) obj).LIZIZ - ((C21603219gc) obj2).LIZIZ;
    }

    public static final int compare$3(AComparatorS52S0000000_33 aComparatorS52S0000000_33, Object obj, Object obj2) {
        TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
        TEFrameSizei tEFrameSizei2 = (TEFrameSizei) obj2;
        return (tEFrameSizei2.width * tEFrameSizei2.height) - (tEFrameSizei.width * tEFrameSizei.height);
    }

    public static final int compare$4(AComparatorS52S0000000_33 aComparatorS52S0000000_33, Object obj, Object obj2) {
        TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
        TEFrameSizei tEFrameSizei2 = (TEFrameSizei) obj2;
        return (tEFrameSizei2.width * tEFrameSizei2.height) - (tEFrameSizei.width * tEFrameSizei.height);
    }

    public static final int compare$5(AComparatorS52S0000000_33 aComparatorS52S0000000_33, Object obj, Object obj2) {
        TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
        TEFrameSizei tEFrameSizei2 = (TEFrameSizei) obj2;
        return (tEFrameSizei2.width * tEFrameSizei2.height) - (tEFrameSizei.width * tEFrameSizei.height);
    }

    public static final int compare$6(AComparatorS52S0000000_33 aComparatorS52S0000000_33, Object obj, Object obj2) {
        TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
        TEFrameSizei tEFrameSizei2 = (TEFrameSizei) obj2;
        return (tEFrameSizei2.width * tEFrameSizei2.height) - (tEFrameSizei.width * tEFrameSizei.height);
    }

    public static final int compare$7(AComparatorS52S0000000_33 aComparatorS52S0000000_33, Object obj, Object obj2) {
        TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
        TEFrameSizei tEFrameSizei2 = (TEFrameSizei) obj2;
        return (tEFrameSizei2.width * tEFrameSizei2.height) - (tEFrameSizei.width * tEFrameSizei.height);
    }

    public static final int compare$8(AComparatorS52S0000000_33 aComparatorS52S0000000_33, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(C2174561A8o.LIZ((InterfaceC19211810Ea) obj)), Integer.valueOf(C2174561A8o.LIZ((InterfaceC19211810Ea) obj2)));
    }

    public static final int compare$9(AComparatorS52S0000000_33 aComparatorS52S0000000_33, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((CaptionUtterance) obj).LIZJ()), Long.valueOf(((CaptionUtterance) obj2).LIZJ()));
    }
}
