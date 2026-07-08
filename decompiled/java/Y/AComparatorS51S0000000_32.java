package Y;

import X.C20085613iQ;
import X.C21342118fb;
import X.InterfaceC21154317qP;
import java.util.Comparator;

/* JADX INFO: loaded from: classes33.dex */
public class AComparatorS51S0000000_32 implements Comparator {
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
            default:
                return 0;
        }
    }

    public AComparatorS51S0000000_32(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS51S0000000_32 aComparatorS51S0000000_32, Object obj, Object obj2) {
        return ((C21342118fb) obj).LIZ - ((C21342118fb) obj2).LIZ;
    }

    public static final int compare$1(AComparatorS51S0000000_32 aComparatorS51S0000000_32, Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return C20085613iQ.LIZIZ(200, 200);
    }

    public static final int compare$2(AComparatorS51S0000000_32 aComparatorS51S0000000_32, Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return C20085613iQ.LIZIZ(200, 200);
    }

    public static final int compare$3(AComparatorS51S0000000_32 aComparatorS51S0000000_32, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC21154317qP) obj).LIZIZ().LIZ), Integer.valueOf(((InterfaceC21154317qP) obj2).LIZIZ().LIZ));
    }
}
