package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0oke, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1485180oke implements InterfaceC1485650olP {
    public final Map<C0NKF, InterfaceC1485260okm> LIZ = new HashMap();

    public final InterfaceC1485260okm LIZ(C0NKF c0nkf, C1478300oZY c1478300oZY) {
        if (((HashMap) this.LIZ).containsKey(c0nkf)) {
            return (InterfaceC1485260okm) ((HashMap) this.LIZ).get(c0nkf);
        }
        InterfaceC1485260okm interfaceC1485260okm = (InterfaceC1485260okm) C1126604au.LIZ(c0nkf.LL);
        ((HashMap) this.LIZ).put(c0nkf, interfaceC1485260okm);
        return interfaceC1485260okm;
    }
}
