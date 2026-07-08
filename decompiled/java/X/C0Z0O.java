package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Z0O, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z0O {
    public final C882890YkJ LIZ;
    public final String LIZIZ;
    public final Map<InterfaceC892680Z0g, C882890YkJ> LIZJ;
    public InterfaceC892680Z0g LIZLLL;
    public final Map<String, Object> LJ = new LinkedHashMap();
    public final C0Z0Q LJFF;

    public final C882890YkJ LIZ() {
        C882890YkJ c882890YkJ;
        InterfaceC892680Z0g interfaceC892680Z0g = this.LIZLLL;
        return (interfaceC892680Z0g == null || (c882890YkJ = (C882890YkJ) ((LinkedHashMap) this.LIZJ).get(interfaceC892680Z0g)) == null) ? this.LIZ : c882890YkJ;
    }

    public final void LIZIZ(InterfaceC892680Z0g interfaceC892680Z0g) {
        C882890YkJ c882890YkJLIZ = LIZ();
        C882890YkJ c882890YkJ = new C882890YkJ(c882890YkJLIZ.LIZJ, interfaceC892680Z0g.getName());
        c882890YkJ.LIZLLL = this;
        this.LIZJ.put(interfaceC892680Z0g, c882890YkJ);
        C882890YkJ c882890YkJ2 = c882890YkJLIZ.LJI;
        while (c882890YkJ2 != null) {
            if (c882890YkJ != null) {
                C882890YkJ c882890YkJ3 = new C882890YkJ(c882890YkJ2.LIZJ, interfaceC892680Z0g.getName());
                c882890YkJ3.LIZLLL = this;
                c882890YkJ.LJI = c882890YkJ3;
            }
            c882890YkJ2 = c882890YkJ2.LJI;
            if (c882890YkJ != null) {
                c882890YkJ = c882890YkJ.LJI;
            } else {
                c882890YkJ = null;
            }
        }
        this.LIZLLL = interfaceC892680Z0g;
    }

    public C0Z0O(InterfaceC892680Z0g interfaceC892680Z0g, C882890YkJ c882890YkJ, String str) {
        this.LIZ = c882890YkJ;
        this.LIZIZ = str;
        this.LIZJ = C2097608Jq.LJIIJ(new Pair(interfaceC892680Z0g, c882890YkJ));
        this.LJFF = new C0Z0Q(str, 1);
        c882890YkJ.LIZLLL = this;
    }
}
