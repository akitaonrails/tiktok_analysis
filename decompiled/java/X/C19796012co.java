package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.12co, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19796012co implements InterfaceC19797012cy, InterfaceC19797112cz {
    public final Map<String, InterfaceC19797112cz> LL = new HashMap();

    @Override // X.InterfaceC19797112cz
    public final String LJFF() {
        return "[object Object]";
    }

    @Override // X.InterfaceC19797112cz
    public final InterfaceC19797112cz LIZIZ() {
        C19796012co c19796012co = new C19796012co();
        for (Map.Entry entry : ((HashMap) this.LL).entrySet()) {
            if (entry.getValue() instanceof InterfaceC19797012cy) {
                ((HashMap) c19796012co.LL).put(entry.getKey(), entry.getValue());
            } else {
                ((HashMap) c19796012co.LL).put(entry.getKey(), ((InterfaceC19797112cz) entry.getValue()).LIZIZ());
            }
        }
        return c19796012co;
    }

    @Override // X.InterfaceC19797112cz
    public final Double LJ() {
        return Double.valueOf(Double.NaN);
    }

    @Override // X.InterfaceC19797112cz
    public final Iterator<InterfaceC19797112cz> LJI() {
        return new C19796112cp(((HashMap) this.LL).keySet().iterator());
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!((HashMap) this.LL).isEmpty()) {
            for (Object obj : ((HashMap) this.LL).keySet()) {
                sb.append(C786410Ut5.j4("%s: %s,", new Object[]{obj, ((HashMap) this.LL).get(obj)}));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // X.InterfaceC19797112cz
    public final Boolean LIZLLL() {
        return Boolean.TRUE;
    }

    @Override // X.InterfaceC19797012cy
    public final InterfaceC19797112cz LJIIIIZZ(String str) {
        if (((HashMap) this.LL).containsKey(str)) {
            return (InterfaceC19797112cz) ((HashMap) this.LL).get(str);
        }
        return InterfaceC19797112cz.LJIILIIL;
    }

    @Override // X.InterfaceC19797012cy
    public final boolean LJIIIZ(String str) {
        return ((HashMap) this.LL).containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19796012co)) {
            return false;
        }
        return this.LL.equals(((C19796012co) obj).LL);
    }

    @Override // X.InterfaceC19797012cy
    public final void LJIIJJI(String str, InterfaceC19797112cz interfaceC19797112cz) {
        if (interfaceC19797112cz == null) {
            ((HashMap) this.LL).remove(str);
        } else {
            ((HashMap) this.LL).put(str, interfaceC19797112cz);
        }
    }

    public InterfaceC19797112cz LJIIJ(String str, C19795712cl c19795712cl, List<InterfaceC19797112cz> list) {
        if ("toString".equals(str)) {
            return new C19797512d3(toString());
        }
        return C19796712cv.LIZ(this, new C19797512d3(str), c19795712cl, list);
    }
}
