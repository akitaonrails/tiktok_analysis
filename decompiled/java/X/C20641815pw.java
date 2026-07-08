package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.15pw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20641815pw {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C20642015py());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C20641715pv());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C20641915px());

    public static InterfaceC19330810jy LIZ(int i) {
        return (InterfaceC19330810jy) ((ConcurrentHashMap) LIZ.getValue()).get(Integer.valueOf(i));
    }

    public static void LIZIZ(InterfaceC19330810jy interfaceC19330810jy) {
        for (int i : interfaceC19330810jy.LIZJ()) {
            ((ConcurrentHashMap) LIZ.getValue()).put(Integer.valueOf(i), interfaceC19330810jy);
        }
    }
}
