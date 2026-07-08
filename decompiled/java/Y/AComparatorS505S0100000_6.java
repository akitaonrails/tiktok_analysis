package Y;

import X.C20085613iQ;
import X.C448580HiS;
import X.C448590HiT;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class AComparatorS505S0100000_6 implements Comparator {
    public final int $t;
    public Object l0;

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
            default:
                return 0;
        }
    }

    public AComparatorS505S0100000_6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(AComparatorS505S0100000_6 aComparatorS505S0100000_6, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((Map) aComparatorS505S0100000_6.l0).get(obj), (Integer) ((Map) aComparatorS505S0100000_6.l0).get(obj2));
    }

    public static final int compare$1(AComparatorS505S0100000_6 aComparatorS505S0100000_6, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((Map) aComparatorS505S0100000_6.l0).get(obj), (Integer) ((Map) aComparatorS505S0100000_6.l0).get(obj2));
    }

    public static final int compare$2(AComparatorS505S0100000_6 aComparatorS505S0100000_6, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((Map) aComparatorS505S0100000_6.l0).get(obj), (Integer) ((Map) aComparatorS505S0100000_6.l0).get(obj2));
    }

    public static final int compare$3(AComparatorS505S0100000_6 aComparatorS505S0100000_6, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((Map) aComparatorS505S0100000_6.l0).get(obj), (Integer) ((Map) aComparatorS505S0100000_6.l0).get(obj2));
    }

    public static final int compare$4(AComparatorS505S0100000_6 aComparatorS505S0100000_6, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((SpannableString) aComparatorS505S0100000_6.l0).getSpanStart(obj)), Integer.valueOf(((SpannableString) aComparatorS505S0100000_6.l0).getSpanStart(obj2)));
    }

    public static final int compare$5(AComparatorS505S0100000_6 aComparatorS505S0100000_6, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((SpannableString) aComparatorS505S0100000_6.l0).getSpanStart(obj)), Integer.valueOf(((SpannableString) aComparatorS505S0100000_6.l0).getSpanStart(obj2)));
    }

    public static final int compare$6(AComparatorS505S0100000_6 aComparatorS505S0100000_6, Object obj, Object obj2) {
        C448580HiS c448580HiS = (C448580HiS) obj;
        C448590HiT c448590HiT = (C448590HiT) aComparatorS505S0100000_6.l0;
        float fExactCenterX = c448580HiS.LIZJ.exactCenterX() - c448590HiT.LIZ;
        float fExactCenterY = c448580HiS.LIZJ.exactCenterY() - c448590HiT.LIZIZ;
        Float fValueOf = Float.valueOf((fExactCenterX * fExactCenterX) + (fExactCenterY * fExactCenterY));
        C448580HiS c448580HiS2 = (C448580HiS) obj2;
        C448590HiT c448590HiT2 = (C448590HiT) aComparatorS505S0100000_6.l0;
        float fExactCenterX2 = c448580HiS2.LIZJ.exactCenterX() - c448590HiT2.LIZ;
        float fExactCenterY2 = c448580HiS2.LIZJ.exactCenterY() - c448590HiT2.LIZIZ;
        return C20085613iQ.LIZIZ(fValueOf, Float.valueOf((fExactCenterX2 * fExactCenterX2) + (fExactCenterY2 * fExactCenterY2)));
    }

    public static final int compare$7(AComparatorS505S0100000_6 aComparatorS505S0100000_6, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS505S0100000_6.l0).compare(obj, obj2);
        if (iCompare == 0) {
            C448580HiS c448580HiS = (C448580HiS) obj2;
            C448580HiS c448580HiS2 = (C448580HiS) obj;
            return C20085613iQ.LIZIZ(Integer.valueOf(c448580HiS.LIZJ.width() * c448580HiS.LIZJ.height()), Integer.valueOf(c448580HiS2.LIZJ.width() * c448580HiS2.LIZJ.height()));
        }
        return iCompare;
    }

    public static final int compare$8(AComparatorS505S0100000_6 aComparatorS505S0100000_6, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((Spanned) aComparatorS505S0100000_6.l0).getSpanStart(obj)), Integer.valueOf(((Spanned) aComparatorS505S0100000_6.l0).getSpanStart(obj2)));
    }
}
