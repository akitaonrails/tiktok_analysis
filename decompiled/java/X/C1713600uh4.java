package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0uh4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713600uh4 {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final ConcurrentHashMap<String, C1713570uh1> LIZIZ = new ConcurrentHashMap<>();
    public static InterfaceC1713820uhQ LIZJ;
    public static C1713710uhF LIZLLL;
    public static InterfaceC1713480ugs LJ;
    public static InterfaceC1713470ugr LJFF;
    public static InterfaceC1713610uh5 LJI;
    public static InterfaceC1713510ugv LJII;

    public static C1713570uh1 LIZ(String str) {
        return LIZIZ.get(str);
    }

    public static void LIZIZ(Throwable th) {
        InterfaceC1713610uh5 interfaceC1713610uh5 = LJI;
        if (interfaceC1713610uh5 != null) {
            interfaceC1713610uh5.LIZ(th);
        }
    }
}
