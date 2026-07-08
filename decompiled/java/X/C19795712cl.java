package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.12cl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19795712cl {
    public final C19795712cl LIZ;
    public final C19797812d6 LIZIZ;
    public final Map<String, InterfaceC19797112cz> LIZJ = new HashMap();
    public final Map<String, Boolean> LIZLLL = new HashMap();

    public final C19795712cl LIZLLL() {
        return new C19795712cl(this, this.LIZIZ);
    }

    public final InterfaceC19797112cz LIZ(C19796612cu c19796612cu) {
        InterfaceC19797112cz interfaceC19797112czLIZ = InterfaceC19797112cz.LJIILIIL;
        Iterator<Integer> itLJIL = c19796612cu.LJIL();
        while (itLJIL.hasNext()) {
            interfaceC19797112czLIZ = this.LIZIZ.LIZ(this, c19796612cu.LIZJ(itLJIL.next().intValue()));
            if (interfaceC19797112czLIZ instanceof C19797212d0) {
                break;
            }
        }
        return interfaceC19797112czLIZ;
    }

    public final InterfaceC19797112cz LIZIZ(InterfaceC19797112cz interfaceC19797112cz) {
        return this.LIZIZ.LIZ(this, interfaceC19797112cz);
    }

    public final InterfaceC19797112cz LIZJ(String str) {
        C19795712cl c19795712cl = this;
        while (!((HashMap) c19795712cl.LIZJ).containsKey(str)) {
            c19795712cl = c19795712cl.LIZ;
            if (c19795712cl == null) {
                throw new IllegalArgumentException(C786410Ut5.j4("%s is not defined", new Object[]{str}));
            }
        }
        return (InterfaceC19797112cz) ((HashMap) c19795712cl.LIZJ).get(str);
    }

    public final boolean LJFF(String str) {
        C19795712cl c19795712cl = this;
        while (!((HashMap) c19795712cl.LIZJ).containsKey(str)) {
            c19795712cl = c19795712cl.LIZ;
            if (c19795712cl == null) {
                return false;
            }
        }
        return true;
    }

    public C19795712cl(C19795712cl c19795712cl, C19797812d6 c19797812d6) {
        this.LIZ = c19795712cl;
        this.LIZIZ = c19797812d6;
    }

    public final void LJ(String str, InterfaceC19797112cz interfaceC19797112cz) {
        if (!((HashMap) this.LIZLLL).containsKey(str)) {
            if (interfaceC19797112cz == null) {
                ((HashMap) this.LIZJ).remove(str);
            } else {
                ((HashMap) this.LIZJ).put(str, interfaceC19797112cz);
            }
        }
    }

    public final void LJI(String str, InterfaceC19797112cz interfaceC19797112cz) {
        C19795712cl c19795712cl;
        C19795712cl c19795712cl2 = this;
        while (!((HashMap) c19795712cl2.LIZJ).containsKey(str) && (c19795712cl = c19795712cl2.LIZ) != null && c19795712cl.LJFF(str)) {
            c19795712cl2 = c19795712cl2.LIZ;
        }
        if (!((HashMap) c19795712cl2.LIZLLL).containsKey(str)) {
            if (interfaceC19797112cz == null) {
                ((HashMap) c19795712cl2.LIZJ).remove(str);
            } else {
                ((HashMap) c19795712cl2.LIZJ).put(str, interfaceC19797112cz);
            }
        }
    }
}
