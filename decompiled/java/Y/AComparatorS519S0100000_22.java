package Y;

import X.C20085613iQ;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import java.util.Comparator;

/* JADX INFO: loaded from: classes23.dex */
public class AComparatorS519S0100000_22 implements Comparator {
    public final int $t;
    public Object l0;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, t, t2);
            case 1:
                return compare$1(this, t, t2);
            default:
                return 0;
        }
    }

    public AComparatorS519S0100000_22(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(AComparatorS519S0100000_22 aComparatorS519S0100000_22, Object obj, Object obj2) {
        int iValueOf;
        int iValueOf2;
        int iCompare = ((Comparator) aComparatorS519S0100000_22.l0).compare(obj, obj2);
        if (iCompare == 0) {
            int i = ((AutoCutThemeData) obj).reuseMusicAlignDisplayIndex;
            if (i > 0) {
                iValueOf = Integer.valueOf(i);
            } else {
                iValueOf = Integer.MAX_VALUE;
            }
            int i2 = ((AutoCutThemeData) obj2).reuseMusicAlignDisplayIndex;
            if (i2 > 0) {
                iValueOf2 = Integer.valueOf(i2);
            } else {
                iValueOf2 = Integer.MAX_VALUE;
            }
            return C20085613iQ.LIZIZ(iValueOf, iValueOf2);
        }
        return iCompare;
    }

    public static final int compare$1(AComparatorS519S0100000_22 aComparatorS519S0100000_22, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS519S0100000_22.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(Integer.valueOf(((AutoCutThemeData) obj).indexFromSource), Integer.valueOf(((AutoCutThemeData) obj2).indexFromSource));
        }
        return iCompare;
    }
}
