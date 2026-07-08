package Y;

import X.C1507970pLP;
import X.C1507980pLQ;
import java.util.Comparator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public class AComparatorS520S0100000_23 implements Comparator {
    public final int $t;
    public Object l0;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, obj, obj2);
            case 1:
                return compare$1(this, obj, obj2);
            case 2:
                return compare$2(this, obj, obj2);
            default:
                return 0;
        }
    }

    public AComparatorS520S0100000_23(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(AComparatorS520S0100000_23 aComparatorS520S0100000_23, Object obj, Object obj2) {
        return ((Number) ((Function2) aComparatorS520S0100000_23.l0).invoke(obj, obj2)).intValue();
    }

    public static final int compare$1(AComparatorS520S0100000_23 aComparatorS520S0100000_23, Object obj, Object obj2) {
        return ((Number) ((Function2) aComparatorS520S0100000_23.l0).invoke(obj, obj2)).intValue();
    }

    public static final int compare$2(AComparatorS520S0100000_23 aComparatorS520S0100000_23, Object obj, Object obj2) {
        int i;
        int i2;
        C1507980pLQ c1507980pLQ = (C1507980pLQ) obj;
        C1507980pLQ c1507980pLQ2 = (C1507980pLQ) obj2;
        if (Intrinsics.LJFF(c1507980pLQ.LIZ.LJIIIZ, c1507980pLQ2.LIZ.LJIIIZ)) {
            i = c1507980pLQ.LIZ.LIZLLL;
            i2 = c1507980pLQ2.LIZ.LIZLLL;
        } else {
            if (Intrinsics.LJFF(c1507980pLQ.LIZ.LJIIIZ, ((C1507970pLP) aComparatorS520S0100000_23.l0).LJIIIZ)) {
                return -1;
            }
            if (Intrinsics.LJFF(c1507980pLQ2.LIZ.LJIIIZ, ((C1507970pLP) aComparatorS520S0100000_23.l0).LJIIIZ)) {
                return 1;
            }
            i = c1507980pLQ.LIZ.LIZLLL;
            i2 = c1507980pLQ2.LIZ.LIZLLL;
        }
        return i - i2;
    }
}
