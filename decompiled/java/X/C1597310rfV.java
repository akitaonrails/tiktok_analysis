package X;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0rfV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1597310rfV {
    public final C1597490rfn LIZ;
    public final Map<EnumC1597060rf6, List<InterfaceC1891350zJl>> LIZIZ;
    public final EnumC1597050rf5 LIZJ;
    public final Map<EnumC1597060rf6, List<InterfaceC1891350zJl>> LIZLLL;
    public final Map<EnumC1597060rf6, Map<String, Object>> LJ;

    public final Map<String, Object> LIZ(EnumC1597060rf6 enumC1597060rf6) {
        Map<String, Object> map = this.LJ.get(enumC1597060rf6);
        if (map == null) {
            return C2097608Jq.LJ();
        }
        return map;
    }

    public final String LIZIZ(InterfaceC1891350zJl interfaceC1891350zJl) {
        String strLIZ = this.LIZ.LIZ(interfaceC1891350zJl);
        if (strLIZ != null) {
            return strLIZ;
        }
        throw new IllegalArgumentException("Item not found in ItemIndex");
    }

    public final List<InterfaceC1891350zJl> LIZJ(EnumC1597060rf6 enumC1597060rf6) {
        List<InterfaceC1891350zJl> list = this.LIZIZ.get(enumC1597060rf6);
        if (list == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }

    public C1597310rfV(C1597490rfn c1597490rfn, Map map, EnumC1597050rf5 enumC1597050rf5, Map map2, Map map3) {
        this.LIZ = c1597490rfn;
        this.LIZIZ = map;
        this.LIZJ = enumC1597050rf5;
        this.LIZLLL = map2;
        this.LJ = map3;
    }
}
