package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0okc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1485160okc implements InterfaceC1485650olP {
    public final HashMap<C0NKF, InterfaceC1485260okm> LIZ = new HashMap<>();

    public final synchronized InterfaceC1485260okm LIZ(C0NKF c0nkf, C1478300oZY c1478300oZY) {
        C0NKF c0nkf2;
        if (c0nkf == null) {
            c0nkf2 = C0NKF.MediaLoader;
        } else {
            c0nkf2 = c0nkf;
        }
        if (this.LIZ.containsKey(c0nkf)) {
            return this.LIZ.get(c0nkf);
        }
        InterfaceC1485260okm interfaceC1485260okm = (InterfaceC1485260okm) C1126604au.LIZ(c0nkf2.LL);
        if (interfaceC1485260okm != null) {
            interfaceC1485260okm.LJJLIIIIJ();
        }
        this.LIZ.put(c0nkf2, interfaceC1485260okm);
        return interfaceC1485260okm;
    }
}
