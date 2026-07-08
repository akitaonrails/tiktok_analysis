package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0aAK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924500aAK implements InterfaceC926460aDU {
    public final Map<Class<? extends Object>, InterfaceC924420aAC> LIZ = new HashMap();
    public final Map<Class<? extends Object>, InterfaceC924420aAC> LIZIZ = new HashMap();

    @Override // X.InterfaceC926460aDU
    public final void release() {
        ((HashMap) this.LIZ).clear();
        ((HashMap) this.LIZIZ).clear();
    }

    @Override // X.InterfaceC926460aDU
    public final void LIZ(InterfaceC924420aAC interfaceC924420aAC) {
        Class<Object> clsLIZJ = interfaceC924420aAC.LIZJ();
        if (clsLIZJ != null && clsLIZJ.isAssignableFrom(interfaceC924420aAC.getClass())) {
            ((HashMap) this.LIZ).put(clsLIZJ, interfaceC924420aAC);
        }
        Class<Object> clsLJIIIIZZ = interfaceC924420aAC.LJIIIIZZ();
        if (clsLJIIIIZZ != null && clsLJIIIIZZ.isAssignableFrom(interfaceC924420aAC.getClass())) {
            ((HashMap) this.LIZ).put(clsLJIIIIZZ, interfaceC924420aAC);
        }
    }

    @Override // X.InterfaceC926470aDV
    public final <T> T LIZIZ(Class<T> cls) {
        T t = (T) ((HashMap) this.LIZ).get(cls);
        if (t == null) {
            T t2 = (T) ((HashMap) this.LIZIZ).get(cls);
            if (t2 == null) {
                return null;
            }
            return t2;
        }
        return t;
    }
}
