package X;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0H2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434640H2o {
    public final List<InterfaceC434580H2i> LIZ;
    public final Map<String, String> LIZIZ;
    public final C434640H2o LIZJ;
    public final int LIZLLL;
    public final boolean LJ;

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Map<String, String> map = this.LIZIZ;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        C434640H2o c434640H2o = this.LIZJ;
        return ((((iHashCode2 + (c434640H2o != null ? c434640H2o.hashCode() : 0)) * 31) + this.LIZLLL) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public static C434640H2o LIZ(C434640H2o c434640H2o, Map map) {
        return new C434640H2o(c434640H2o.LIZ, map, c434640H2o.LIZJ, c434640H2o.LIZLLL, c434640H2o.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C434640H2o(List<? extends InterfaceC434580H2i> list, Map<String, String> map, C434640H2o c434640H2o, int i, boolean z) {
        this.LIZ = list;
        this.LIZIZ = map;
        this.LIZJ = c434640H2o;
        this.LIZLLL = i;
        this.LJ = z;
    }

    public /* synthetic */ C434640H2o(List list, Map map, C434640H2o c434640H2o, int i, boolean z, int i2) {
        this(list, (i2 & 2) != 0 ? null : map, (i2 & 4) == 0 ? c434640H2o : null, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? false : z);
    }
}
