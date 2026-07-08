package Y;

import X.C1651520t4w;
import X.C20085613iQ;
import X.EnumC1651310t4b;
import X.InterfaceC1689980u4y;
import X.InterfaceC1691130u6p;
import java.util.Comparator;
import myl.c;

/* JADX INFO: loaded from: classes26.dex */
public class AComparatorS522S0100000_25 implements Comparator {
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

    public AComparatorS522S0100000_25(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(AComparatorS522S0100000_25 aComparatorS522S0100000_25, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC1691130u6p) aComparatorS522S0100000_25.l0).LIZ(((InterfaceC1689980u4y) obj).getKey())), Integer.valueOf(((InterfaceC1691130u6p) aComparatorS522S0100000_25.l0).LIZ(((InterfaceC1689980u4y) obj2).getKey())));
    }

    public static final int compare$1(AComparatorS522S0100000_25 aComparatorS522S0100000_25, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC1691130u6p) aComparatorS522S0100000_25.l0).LIZ(((InterfaceC1689980u4y) obj).getKey())), Integer.valueOf(((InterfaceC1691130u6p) aComparatorS522S0100000_25.l0).LIZ(((InterfaceC1689980u4y) obj2).getKey())));
    }

    public static final int compare$2(AComparatorS522S0100000_25 aComparatorS522S0100000_25, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC1691130u6p) aComparatorS522S0100000_25.l0).LIZ(((InterfaceC1689980u4y) obj2).getKey())), Integer.valueOf(((InterfaceC1691130u6p) aComparatorS522S0100000_25.l0).LIZ(((InterfaceC1689980u4y) obj).getKey())));
    }

    public static final int compare$3(AComparatorS522S0100000_25 aComparatorS522S0100000_25, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC1691130u6p) aComparatorS522S0100000_25.l0).LIZ(((InterfaceC1689980u4y) obj2).getKey())), Integer.valueOf(((InterfaceC1691130u6p) aComparatorS522S0100000_25.l0).LIZ(((InterfaceC1689980u4y) obj).getKey())));
    }

    public static final int compare$4(AComparatorS522S0100000_25 aComparatorS522S0100000_25, Object obj, Object obj2) {
        return ((c) aComparatorS522S0100000_25.l0).LIZ.LIZ(EnumC1651310t4b.FIXED, ((C1651520t4w) obj).LIZ, ((C1651520t4w) obj2).LIZ);
    }

    public static final int compare$5(AComparatorS522S0100000_25 aComparatorS522S0100000_25, Object obj, Object obj2) {
        return ((c) aComparatorS522S0100000_25.l0).LIZ.LIZ(EnumC1651310t4b.SLIDE, ((C1651520t4w) obj).LIZ, ((C1651520t4w) obj2).LIZ);
    }
}
