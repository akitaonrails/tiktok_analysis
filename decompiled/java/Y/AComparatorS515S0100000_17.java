package Y;

import X.AbstractC1126600fQI;
import X.C1094950ebF;
import X.C1097740efk;
import X.C1102080emk;
import X.C1111930f2d;
import X.C20085613iQ;
import com.bytedance.android.livesdk.model.Gift;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class AComparatorS515S0100000_17 implements Comparator {
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
            case 3:
                return compare$3(this, obj, obj2);
            case 4:
                return compare$4(this, obj, obj2);
            case 5:
                return compare$5(this, obj, obj2);
            default:
                return 0;
        }
    }

    public AComparatorS515S0100000_17(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(AComparatorS515S0100000_17 aComparatorS515S0100000_17, Object obj, Object obj2) {
        C1102080emk c1102080emk = (C1102080emk) obj;
        C1102080emk c1102080emk2 = (C1102080emk) obj2;
        if (c1102080emk == null) {
            return -1;
        }
        if (c1102080emk2 != null) {
            long jLJI = ((C1097740efk) aComparatorS515S0100000_17.l0).LJI(c1102080emk.LIZ);
            long jLJI2 = ((C1097740efk) aComparatorS515S0100000_17.l0).LJI(c1102080emk2.LIZ);
            if (jLJI <= jLJI2) {
                if (jLJI < jLJI2) {
                    return -1;
                }
                long j = c1102080emk.LJII;
                long j2 = c1102080emk2.LJII;
                if (j <= j2) {
                    if (j < j2) {
                        return -1;
                    }
                    return 0;
                }
                return 1;
            }
            return 1;
        }
        return 1;
    }

    public static final int compare$1(AComparatorS515S0100000_17 aComparatorS515S0100000_17, Object obj, Object obj2) {
        C1111930f2d c1111930f2d = (C1111930f2d) aComparatorS515S0100000_17.l0;
        int iLJI = c1111930f2d.LLJLL.LJI(obj);
        int iLJI2 = c1111930f2d.LLJLL.LJI(obj2);
        if (iLJI < iLJI2) {
            return -1;
        }
        if (iLJI == iLJI2) {
            return 0;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int compare$2(AComparatorS515S0100000_17 aComparatorS515S0100000_17, Object obj, Object obj2) {
        Object obj3;
        Long lValueOf;
        Object obj4;
        Gift gift;
        Gift gift2;
        Map map = (Map) aComparatorS515S0100000_17.l0;
        AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) ((IndexedValue) obj).LIZIZ;
        Long lValueOf2 = null;
        if (abstractC1126600fQI != null) {
            obj3 = abstractC1126600fQI.LIZIZ;
        } else {
            obj3 = null;
        }
        if ((obj3 instanceof Gift) && (gift2 = (Gift) obj3) != null) {
            lValueOf = Long.valueOf(gift2.id);
        } else {
            lValueOf = null;
        }
        Integer num = (Integer) map.get(lValueOf);
        Map map2 = (Map) aComparatorS515S0100000_17.l0;
        AbstractC1126600fQI abstractC1126600fQI2 = (AbstractC1126600fQI) ((IndexedValue) obj2).LIZIZ;
        if (abstractC1126600fQI2 != null) {
            obj4 = abstractC1126600fQI2.LIZIZ;
        } else {
            obj4 = null;
        }
        if ((obj4 instanceof Gift) && (gift = (Gift) obj4) != null) {
            lValueOf2 = Long.valueOf(gift.id);
        }
        return C20085613iQ.LIZIZ(num, (Integer) map2.get(lValueOf2));
    }

    public static final int compare$3(AComparatorS515S0100000_17 aComparatorS515S0100000_17, Object obj, Object obj2) {
        return Intrinsics.LJI(((List) aComparatorS515S0100000_17.l0).indexOf(obj), ((List) aComparatorS515S0100000_17.l0).indexOf(obj2));
    }

    public static final int compare$4(AComparatorS515S0100000_17 aComparatorS515S0100000_17, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS515S0100000_17.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(Long.valueOf(((C1094950ebF) obj).LIZ), Long.valueOf(((C1094950ebF) obj2).LIZ));
        }
        return iCompare;
    }

    public static final int compare$5(AComparatorS515S0100000_17 aComparatorS515S0100000_17, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS515S0100000_17.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(Long.valueOf(((C1094950ebF) obj).LIZJ), Long.valueOf(((C1094950ebF) obj2).LIZJ));
        }
        return iCompare;
    }
}
