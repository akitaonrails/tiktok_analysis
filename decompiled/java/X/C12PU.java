package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS144S1200000_29;

/* JADX INFO: renamed from: X.12PU, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12PU {
    public final C12PY LIZ;
    public C12PV LIZLLL;
    public final HashMap<String, InterfaceC19669411xU> LIZIZ = new HashMap<>();
    public final List<C12PR> LIZJ = new ArrayList();
    public final Map<Function0<Unit>, Function0<Unit>> LJ = new LinkedHashMap();

    public C12PU(C12PY c12py) {
        this.LIZ = c12py;
    }

    public final void LIZ(C12PR c12pr) {
        ((ArrayList) this.LIZJ).add(c12pr);
    }

    public final void LIZIZ(String str) {
        InterfaceC19669411xU interfaceC19669411xU = this.LIZIZ.get(str);
        if (interfaceC19669411xU == null) {
            return;
        }
        interfaceC19669411xU.LIZLLL();
        Iterator<C12PR> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(str);
        }
    }

    public final void LIZJ(String str) {
        InterfaceC19669411xU interfaceC19669411xU = this.LIZIZ.get(str);
        if (interfaceC19669411xU == null) {
            return;
        }
        interfaceC19669411xU.LIZ();
        Iterator it2 = ((ArrayList) this.LIZJ).iterator();
        while (it2.hasNext()) {
            ((C12PR) it2.next()).LIZIZ(str);
        }
    }

    public final void LJ(Function0<Unit> function0) {
        C12PV c12pv;
        Object obj = ((LinkedHashMap) this.LJ).get(function0);
        if (obj != null && (c12pv = this.LIZLLL) != null && c12pv.LIZIZ.contains(obj)) {
            c12pv.LIZIZ.remove(obj);
        }
    }

    public final void LIZLLL(String str, Function0<Unit> function0) {
        AwS144S1200000_29 awS144S1200000_29 = new AwS144S1200000_29((Function0) function0, (Function0<Unit>) this, (C12PU) str, (String) 6);
        this.LJ.put(function0, awS144S1200000_29);
        C12PV c12pv = this.LIZLLL;
        if (c12pv != null && !c12pv.LIZIZ.contains(awS144S1200000_29)) {
            c12pv.LIZIZ.push(awS144S1200000_29);
        }
    }
}
