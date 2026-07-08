package X;

import java.lang.ref.Reference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0VWa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799020VWa {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C799040VWc());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C799030VWb());

    public static ConcurrentHashMap LIZIZ() {
        return (ConcurrentHashMap) LIZ.getValue();
    }

    public static void LIZ(String str) {
        InterfaceC799080VWg interfaceC799080VWg;
        if (LIZIZ().containsKey(str)) {
            Reference reference = (Reference) ((ConcurrentHashMap) LIZIZ.getValue()).get(str);
            if (reference != null && (interfaceC799080VWg = (InterfaceC799080VWg) reference.get()) != null) {
                interfaceC799080VWg.onExit();
            }
            LIZIZ().remove(str);
        }
    }

    public static void LIZJ(String str) {
        InterfaceC799080VWg interfaceC799080VWg;
        if (!LIZIZ().containsKey(str)) {
            LIZIZ().put(str, new C213800s4(null));
            Reference reference = (Reference) ((ConcurrentHashMap) LIZIZ.getValue()).get(str);
            if (reference != null && (interfaceC799080VWg = (InterfaceC799080VWg) reference.get()) != null) {
                interfaceC799080VWg.LIZ(str);
            }
        }
    }

    public static void LIZLLL(C213900s5 c213900s5) {
        InterfaceC799080VWg interfaceC799080VWg;
        String str = c213900s5.LIZ;
        if (str != null && !LIZIZ().containsKey(str)) {
            LIZIZ().put(str, c213900s5);
            Reference reference = (Reference) ((ConcurrentHashMap) LIZIZ.getValue()).get(str);
            if (reference != null && (interfaceC799080VWg = (InterfaceC799080VWg) reference.get()) != null) {
                interfaceC799080VWg.LIZ(str);
            }
        }
    }
}
