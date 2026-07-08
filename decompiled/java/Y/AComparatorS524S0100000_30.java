package Y;

import X.AbstractC20013613Sk;
import X.C13UC;
import X.C20014813Sw;
import X.C20038013ak;
import X.C20068213fc;
import X.C20085613iQ;
import X.EnumC1083290eIR;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.shortvideo.network.ToolsInterceptor;
import java.util.Comparator;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes31.dex */
public class AComparatorS524S0100000_30 implements Comparator {
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
            case 6:
                return compare$6(this, obj, obj2);
            case 7:
                return compare$7(this, obj, obj2);
            default:
                return 0;
        }
    }

    public AComparatorS524S0100000_30(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(AComparatorS524S0100000_30 aComparatorS524S0100000_30, Object obj, Object obj2) {
        return ((Number) ((Function2) aComparatorS524S0100000_30.l0).invoke(obj, obj2)).intValue();
    }

    public static final int compare$1(AComparatorS524S0100000_30 aComparatorS524S0100000_30, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS524S0100000_30.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(Integer.valueOf(((C20068213fc) obj).LJI), Integer.valueOf(((C20068213fc) obj2).LJI));
        }
        return iCompare;
    }

    public static final int compare$2(AComparatorS524S0100000_30 aComparatorS524S0100000_30, Object obj, Object obj2) {
        ((ToolsInterceptor) aComparatorS524S0100000_30.l0).getClass();
        EnumC1083290eIR enumC1083290eIRLIZ = ToolsInterceptor.LIZ((Request) obj2);
        ((ToolsInterceptor) aComparatorS524S0100000_30.l0).getClass();
        return C20085613iQ.LIZIZ(enumC1083290eIRLIZ, ToolsInterceptor.LIZ((Request) obj));
    }

    public static final int compare$3(AComparatorS524S0100000_30 aComparatorS524S0100000_30, Object obj, Object obj2) {
        ((ToolsInterceptor) aComparatorS524S0100000_30.l0).getClass();
        EnumC1083290eIR enumC1083290eIRLIZ = ToolsInterceptor.LIZ((Request) obj2);
        ((ToolsInterceptor) aComparatorS524S0100000_30.l0).getClass();
        return C20085613iQ.LIZIZ(enumC1083290eIRLIZ, ToolsInterceptor.LIZ((Request) obj));
    }

    public static final int compare$4(AComparatorS524S0100000_30 aComparatorS524S0100000_30, Object obj, Object obj2) {
        long j;
        C20014813Sw c20014813Sw = ((AbstractC20013613Sk) aComparatorS524S0100000_30.l0).LIZLLL.get(obj);
        long j2 = 0;
        if (c20014813Sw != null) {
            j = c20014813Sw.LJ;
        } else {
            j = 0;
        }
        Long lValueOf = Long.valueOf(j);
        C20014813Sw c20014813Sw2 = ((AbstractC20013613Sk) aComparatorS524S0100000_30.l0).LIZLLL.get(obj2);
        if (c20014813Sw2 != null) {
            j2 = c20014813Sw2.LJ;
        }
        return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(j2));
    }

    public static final int compare$5(AComparatorS524S0100000_30 aComparatorS524S0100000_30, Object obj, Object obj2) {
        Long lValueOf;
        C20014813Sw c20014813Sw = ((C13UC) aComparatorS524S0100000_30.l0).LIZLLL.get(obj);
        Long lValueOf2 = null;
        if (c20014813Sw != null) {
            lValueOf = Long.valueOf(c20014813Sw.LJ);
        } else {
            lValueOf = null;
        }
        C20014813Sw c20014813Sw2 = ((C13UC) aComparatorS524S0100000_30.l0).LIZLLL.get(obj2);
        if (c20014813Sw2 != null) {
            lValueOf2 = Long.valueOf(c20014813Sw2.LJ);
        }
        return C20085613iQ.LIZIZ(lValueOf, lValueOf2);
    }

    public static final int compare$6(AComparatorS524S0100000_30 aComparatorS524S0100000_30, Object obj, Object obj2) {
        return C20085613iQ.LIZJ(obj, obj2, (Function1[]) aComparatorS524S0100000_30.l0);
    }

    public static final int compare$7(AComparatorS524S0100000_30 aComparatorS524S0100000_30, Object obj, Object obj2) {
        Integer num = (Integer) ((WeakHashMap) ((C20038013ak) aComparatorS524S0100000_30.l0).LIZJ.getValue()).get(obj);
        Integer num2 = 0;
        if (num == null) {
            num = num2;
        }
        Integer num3 = (Integer) ((WeakHashMap) ((C20038013ak) aComparatorS524S0100000_30.l0).LIZJ.getValue()).get(obj2);
        if (num3 != null) {
            num2 = num3;
        }
        return num.intValue() - num2.intValue();
    }
}
