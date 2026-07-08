package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ugm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713420ugm {
    public static final List<InterfaceC2185021AfM> LIZ;
    public static final ConcurrentHashMap<String, Long> LIZIZ;
    public static final ConcurrentHashMap<String, EnumC2184291AeB> LIZJ;
    public static final ConcurrentHashMap<String, Boolean> LIZLLL;
    public static C2184901AfA LJ;

    static {
        ArrayList arrayList = new ArrayList();
        LIZ = arrayList;
        LIZIZ = new ConcurrentHashMap<>();
        LIZJ = new ConcurrentHashMap<>();
        LIZLLL = new ConcurrentHashMap<>();
        arrayList.add(C1701690uNr.LIZ);
        arrayList.add(new InterfaceC2185021AfM() { // from class: X.0ugl
            @Override // X.InterfaceC2185021AfM
            public final void LIZ(C2184901AfA c2184901AfA) {
            }

            @Override // X.InterfaceC2185021AfM
            public final void LIZJ(C2184901AfA c2184901AfA) {
            }

            public static boolean LIZLLL(String str, List list) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    if (str2.length() > 0 && a0.LJJIIZI(str, str2, false)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // X.InterfaceC2185021AfM
            public final C1701700uNs LIZIZ(C2184901AfA c2184901AfA, String str, String str2) {
                for (C2184301AeC c2184301AeC : c2184901AfA.LIZIZ) {
                    if (((Boolean) c2184301AeC.LJIIJJI.getValue()).booleanValue()) {
                        if ((!c2184301AeC.LIZLLL().isEmpty()) && c2184301AeC.LIZIZ().isEmpty() && c2184301AeC.LIZ().isEmpty()) {
                            if (LIZLLL(str2, c2184301AeC.LIZLLL())) {
                                return new C1701700uNs(!c2184301AeC.LJ ? 1 : 0, c2184301AeC);
                            }
                        } else if ((!c2184301AeC.LIZJ().isEmpty()) && c2184301AeC.LIZIZ().isEmpty() && c2184301AeC.LIZ().isEmpty()) {
                            if (!LIZLLL(str2, c2184301AeC.LIZJ())) {
                                return new C1701700uNs(!c2184301AeC.LJ ? 1 : 0, c2184301AeC);
                            }
                        } else if ((!c2184301AeC.LIZIZ().isEmpty()) && c2184301AeC.LIZLLL().isEmpty() && c2184301AeC.LIZJ().isEmpty()) {
                            if (LIZLLL(str, c2184301AeC.LIZIZ())) {
                                return new C1701700uNs(!c2184301AeC.LJ ? 1 : 0, c2184301AeC);
                            }
                        } else if ((!c2184301AeC.LIZ().isEmpty()) && c2184301AeC.LIZLLL().isEmpty() && c2184301AeC.LIZJ().isEmpty()) {
                            if (!LIZLLL(str, c2184301AeC.LIZ())) {
                                return new C1701700uNs(!c2184301AeC.LJ ? 1 : 0, c2184301AeC);
                            }
                        } else if ((!c2184301AeC.LIZLLL().isEmpty()) && (!c2184301AeC.LIZ().isEmpty())) {
                            if (LIZLLL(str2, c2184301AeC.LIZLLL()) && !LIZLLL(str, c2184301AeC.LIZ())) {
                                return new C1701700uNs(!c2184301AeC.LJ ? 1 : 0, c2184301AeC);
                            }
                        } else if ((!c2184301AeC.LIZLLL().isEmpty()) && (!c2184301AeC.LIZIZ().isEmpty())) {
                            if (LIZLLL(str2, c2184301AeC.LIZLLL()) || LIZLLL(str, c2184301AeC.LIZIZ())) {
                                return new C1701700uNs(!c2184301AeC.LJ ? 1 : 0, c2184301AeC);
                            }
                        } else if ((!c2184301AeC.LIZJ().isEmpty()) && (!c2184301AeC.LIZIZ().isEmpty())) {
                            if (!LIZLLL(str2, c2184301AeC.LIZJ()) || LIZLLL(str, c2184301AeC.LIZIZ())) {
                                return new C1701700uNs(!c2184301AeC.LJ ? 1 : 0, c2184301AeC);
                            }
                        } else if ((!c2184301AeC.LIZJ().isEmpty()) && (!c2184301AeC.LIZ().isEmpty()) && !LIZLLL(str2, c2184301AeC.LIZJ()) && !LIZLLL(str, c2184301AeC.LIZ())) {
                            return new C1701700uNs(!c2184301AeC.LJ ? 1 : 0, c2184301AeC);
                        }
                    }
                }
                return new C1701700uNs(2, null);
            }
        });
        arrayList.add(C1713400ugk.LIZ);
    }
}
