package Y;

import X.C13LP;
import X.C20085613iQ;
import X.C698160Ra2;
import X.C703090Rhz;
import X.C703160Ri6;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class AComparatorS510S0100000_11 implements Comparator {
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
            default:
                return 0;
        }
    }

    public AComparatorS510S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(AComparatorS510S0100000_11 aComparatorS510S0100000_11, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(C703090Rhz.LIZIZ((String) obj, (Map) aComparatorS510S0100000_11.l0)), Integer.valueOf(C703090Rhz.LIZIZ((String) obj2, (Map) aComparatorS510S0100000_11.l0)));
    }

    public static final int compare$1(AComparatorS510S0100000_11 aComparatorS510S0100000_11, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS510S0100000_11.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ((String) obj, (String) obj2);
        }
        return iCompare;
    }

    public static final int compare$2(AComparatorS510S0100000_11 aComparatorS510S0100000_11, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS510S0100000_11.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(Integer.valueOf(((C703160Ri6) obj).LIZIZ.ordinal()), Integer.valueOf(((C703160Ri6) obj2).LIZIZ.ordinal()));
        }
        return iCompare;
    }

    public static final int compare$3(AComparatorS510S0100000_11 aComparatorS510S0100000_11, Object obj, Object obj2) {
        long jValueOf;
        int iCompare = ((Comparator) aComparatorS510S0100000_11.l0).compare(obj, obj2);
        if (iCompare == 0) {
            Long l = ((C703160Ri6) obj).LIZJ;
            long j = 0;
            if (l != null) {
                long jLongValue = l.longValue();
                if (jLongValue < 0) {
                    jLongValue = 0;
                }
                jValueOf = Long.valueOf(jLongValue);
            } else {
                jValueOf = 0L;
            }
            Long l2 = ((C703160Ri6) obj2).LIZJ;
            if (l2 != null) {
                long jLongValue2 = l2.longValue();
                if (jLongValue2 >= 0) {
                    j = jLongValue2;
                }
            }
            return C20085613iQ.LIZIZ(jValueOf, Long.valueOf(j));
        }
        return iCompare;
    }

    public static final int compare$4(AComparatorS510S0100000_11 aComparatorS510S0100000_11, Object obj, Object obj2) {
        String strLJJLIIIJ;
        String strLJJLIIIJ2;
        int iCompare = ((Comparator) aComparatorS510S0100000_11.l0).compare(obj, obj2);
        if (iCompare == 0) {
            List<String> list = ((C703160Ri6) obj).LIZLLL;
            String str = "";
            if (list == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62)) == null) {
                strLJJLIIIJ = "";
            }
            List<String> list2 = ((C703160Ri6) obj2).LIZLLL;
            if (list2 != null && (strLJJLIIIJ2 = C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, null, 62)) != null) {
                str = strLJJLIIIJ2;
            }
            return C20085613iQ.LIZIZ(strLJJLIIIJ, str);
        }
        return iCompare;
    }

    public static final int compare$5(AComparatorS510S0100000_11 aComparatorS510S0100000_11, Object obj, Object obj2) {
        boolean z;
        int iIndexOf;
        C698160Ra2 c698160Ra2 = (C698160Ra2) obj;
        List list = (List) aComparatorS510S0100000_11.l0;
        if (list != null && list.contains(c698160Ra2.LIZIZ)) {
            z = true;
        } else {
            z = false;
        }
        int iIndexOf2 = Integer.MAX_VALUE;
        if (z) {
            iIndexOf = ((List) aComparatorS510S0100000_11.l0).indexOf(c698160Ra2.LIZIZ);
        } else {
            iIndexOf = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iIndexOf);
        C698160Ra2 c698160Ra22 = (C698160Ra2) obj2;
        List list2 = (List) aComparatorS510S0100000_11.l0;
        if (list2 != null && list2.contains(c698160Ra22.LIZIZ)) {
            iIndexOf2 = ((List) aComparatorS510S0100000_11.l0).indexOf(c698160Ra22.LIZIZ);
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIndexOf2));
    }
}
