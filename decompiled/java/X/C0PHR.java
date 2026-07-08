package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0PHR, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PHR {
    public static final C0PHR LIZ = new C0PHR();
    public static final boolean LIZIZ;

    static {
        LIZIZ = ((Number) C18108077i.LIZ.getValue()).intValue() == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(C0PHT c0pht) {
        if (c0pht.LIZJ != null) {
            c0pht.LJIIJJI = true;
            return;
        }
        c0pht.LJIIJJI = false;
        c0pht.LIZJ = null;
        c0pht.LIZLLL = null;
        c0pht.LIZ = null;
        c0pht.LJ = null;
        c0pht.LIZIZ = null;
        c0pht.LJFF = null;
        c0pht.LJI = null;
        c0pht.LJII = null;
        c0pht.LJIIIZ = new C0P7A();
        c0pht.LJIIJ = new C642240PHa(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 16383);
        c0pht.LJIIL = false;
    }

    public static C0PHX LIZJ(C0PHX c0phx) {
        C0PHX c0phx2;
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        C0PHX c0phx3 = c0phx.LIZLLL;
        int i = 0;
        while (c0phx3 != null) {
            c0phx3.LJ();
            if (c0phx3.LJIIJ.LJIIIIZZ) {
                arrayList.add(c0phx3);
            } else {
                map.put(Integer.valueOf(i), c0phx3);
            }
            c0phx3 = c0phx3.LIZLLL;
            i++;
        }
        C0PHX c0phx4 = c0phx.LJ;
        if (arrayList.size() == 0) {
            c0phx.LJFF();
        }
        int i2 = -1;
        C0PHX c0phx5 = null;
        while (arrayList.size() > 0) {
            if (c0phx4 == null) {
                if (map.get(Integer.valueOf(i2)) != null) {
                    c0phx4 = (C0PHX) map.remove(Integer.valueOf(i2));
                } else {
                    c0phx4 = (C0PHX) C19719612Di.LJJIIZ(arrayList);
                }
            } else {
                if (map.get(Integer.valueOf(i2)) != null) {
                    c0phx2 = (C0PHX) map.remove(Integer.valueOf(i2));
                } else {
                    c0phx2 = (C0PHX) C19719612Di.LJJIIZ(arrayList);
                }
                if (c0phx2 != null) {
                    c0phx2.LIZLLL = null;
                    c0phx2.LJ = c0phx4;
                    c0phx4.LIZLLL = c0phx2;
                }
                c0phx4 = c0phx4.LIZLLL;
            }
            if (i2 == 0) {
                c0phx5 = c0phx4;
            }
            if (arrayList.size() == 0) {
                for (Map.Entry entry : map.entrySet()) {
                    i2++;
                    ((C0PHX) entry.getValue()).LJIIIIZZ = ((Number) entry.getKey()).intValue() - i2;
                    if (c0phx4 != null) {
                        C0PHX c0phx6 = (C0PHX) entry.getValue();
                        c0phx6.LIZLLL = null;
                        c0phx6.LJ = c0phx4;
                        c0phx4.LIZLLL = c0phx6;
                    }
                }
            }
            i2++;
        }
        if (LIZIZ) {
            C0PI1.LIZIZ(c0phx.LIZ, "align padding check");
        }
        return c0phx5;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0PHU LJ(X.C0PHT r14) {
        /*
            Method dump skipped, instruction units count: 1003
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PHR.LJ(X.0PHT):X.0PHU");
    }

    public static void LIZ(C0PHT c0pht, String str) {
        String str2;
        C0PHX c0phx;
        String str3;
        C0PHX c0phx2;
        if (c0pht.LJFF()) {
            return;
        }
        if (!c0pht.LJ()) {
            c0pht.LJI = String.valueOf(((C646370PWx) C0Q3E.LJI().wO2().LIZJ()).LLJIJIL);
            c0pht.LJFF = str;
            C0PHW c0phwLIZ = c0pht.LIZ();
            if (c0phwLIZ != null) {
                C0PHX c0phx3 = c0phwLIZ.LIZJ;
                c0phx3.LJ();
                c0pht.LJI = c0phx3.LJIIIZ;
            }
            c0pht.LJII = c0phwLIZ;
            if (LIZIZ) {
                C0PI1.LIZ(c0pht, "compat enter");
                return;
            }
            return;
        }
        if (c0pht.LJII == null) {
            C0PHW c0phwLIZ2 = c0pht.LIZ();
            if (c0phwLIZ2 != null) {
                C0PHX c0phx4 = c0phwLIZ2.LIZJ;
                c0phx4.LJ();
                c0pht.LJI = c0phx4.LJIIIZ;
            }
            c0pht.LJII = c0phwLIZ2;
        }
        C0PHW c0phwLIZIZ = c0pht.LJII;
        if (c0phwLIZIZ == null) {
            return;
        }
        C0PHW c0phwLIZ3 = c0phwLIZIZ;
        while (true) {
            if (c0phwLIZ3 != null) {
                str2 = c0phwLIZ3.LIZ;
            } else {
                str2 = null;
            }
            if (u.LJIJI(str2, str, false)) {
                if (c0phwLIZ3 != null && (c0phx = c0phwLIZ3.LIZJ) != null) {
                    c0phx.LJI = true;
                }
                c0pht.LJII = c0phwLIZ3;
                return;
            }
            if (c0phwLIZIZ != null) {
                str3 = c0phwLIZIZ.LIZ;
            } else {
                str3 = null;
            }
            if (u.LJIJI(str3, str, false)) {
                if (c0phwLIZIZ != null && (c0phx2 = c0phwLIZIZ.LIZJ) != null) {
                    c0phx2.LJI = true;
                }
                c0pht.LJII = c0phwLIZIZ;
                return;
            }
            if (c0phwLIZIZ != null) {
                c0phwLIZIZ = c0phwLIZIZ.LIZIZ();
            } else {
                c0phwLIZIZ = null;
            }
            if (c0phwLIZ3 != null) {
                c0phwLIZ3 = c0phwLIZ3.LIZ();
            } else {
                c0phwLIZ3 = null;
            }
            if (LIZIZ) {
                C0PI1.LIZ(c0pht, "compat consume");
            }
            if (c0phwLIZIZ == null && c0phwLIZ3 == null) {
                return;
            }
        }
    }

    public static boolean LIZLLL(C0PHR c0phr, C0PHT c0pht, boolean z, int i) {
        boolean z2;
        int i2;
        C0PHX c0phxLJFF;
        C0PHX c0phx;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = 4;
        if ((i & 4) != 0) {
            z = false;
        }
        c0phr.getClass();
        HashSet hashSet = new HashSet();
        if (z) {
            i2 = 100;
        } else {
            i2 = 4;
        }
        C0PHW c0phw = c0pht.LJ;
        if (c0phw != null) {
            c0phxLJFF = c0phw.LIZJ;
            if (c0phxLJFF != null) {
                c0phxLJFF.LJ();
                List<C0PHW> list = c0phxLJFF.LJIIJJI;
                if (list != null) {
                    for (C0PHW c0phw2 : (ArrayList) list) {
                        c0phxLJFF.LJ();
                        C642240PHa c642240PHa = c0phxLJFF.LJIIJ;
                        if (c642240PHa != null && c642240PHa.LJII) {
                            hashSet.add(c0phw2.LIZ);
                        }
                    }
                }
                while (c0phxLJFF.LJ != null && i2 > 0) {
                    c0phxLJFF = c0phxLJFF.LJ;
                    i2--;
                    if (c0phxLJFF == null) {
                        break;
                    }
                }
            }
        } else {
            c0phxLJFF = null;
        }
        if (z) {
            i3 = 100;
        }
        boolean z3 = false;
        for (int i4 = i3 * 2; c0phxLJFF != null && i4 > 0; i4--) {
            c0phxLJFF.LJ();
            Iterator it2 = ((ArrayList) c0phxLJFF.LJIIJJI).iterator();
            boolean z4 = false;
            while (it2.hasNext()) {
                if (hashSet.contains(((C0PHW) it2.next()).LIZ)) {
                    c0phxLJFF.LJ();
                    C642240PHa c642240PHa2 = c0phxLJFF.LJIIJ;
                    if (c642240PHa2 != null && c642240PHa2.LJII) {
                        C0PHW c0phw3 = c0pht.LJ;
                        if (c0phw3 != null) {
                            c0phx = c0phw3.LIZJ;
                        } else {
                            c0phx = null;
                        }
                        if (!Intrinsics.LJFF(c0phxLJFF, c0phx)) {
                            z4 = true;
                        }
                    }
                }
            }
            if (z4) {
                C0PDG c0pdg = c0pht.LJIIIIZZ;
                if (c0pdg != null) {
                    c0pdg.LIZ(c0phxLJFF, C0PG9.INFLOW_CONSUMED_DUPLICATE);
                }
                if (z2) {
                    c0phxLJFF.LJ();
                    if (c0phxLJFF.LJIIJ.LJIIIZ) {
                        z3 = !z3;
                    }
                    c0phxLJFF = LIZJ(c0phxLJFF);
                } else {
                    c0phxLJFF = c0phxLJFF.LJFF();
                }
            } else {
                c0phxLJFF = c0phxLJFF.LIZLLL;
            }
        }
        if (LIZIZ) {
            C0PI1.LIZ(c0pht, "remove redundant");
        }
        return z3;
    }
}
