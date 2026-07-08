package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.12cr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19796312cr {
    public static double LIZ(double d) {
        int i;
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (!Double.isInfinite(d) && d != 0.0d && d != -0.0d) {
            if (d > 0.0d) {
                i = 1;
            } else {
                i = -1;
            }
            return ((double) i) * Math.floor(Math.abs(d));
        }
        return d;
    }

    public static EnumC19798012d8 LIZIZ(String str) {
        EnumC19798012d8 enumC19798012d8Zza;
        if (str != null && !str.isEmpty() && (enumC19798012d8Zza = EnumC19798012d8.zza(CastIntegerProtector.parseInt(str))) != null) {
            return enumC19798012d8Zza;
        }
        throw new IllegalArgumentException(C786410Ut5.j4("Unsupported commandId %s", new Object[]{str}));
    }

    public static Object LIZJ(InterfaceC19797112cz interfaceC19797112cz) {
        if (InterfaceC19797112cz.LJIILJJIL.equals(interfaceC19797112cz)) {
            return null;
        }
        if (InterfaceC19797112cz.LJIILIIL.equals(interfaceC19797112cz)) {
            return "";
        }
        if (interfaceC19797112cz instanceof C19796012co) {
            return LIZLLL((C19796012co) interfaceC19797112cz);
        }
        if (interfaceC19797112cz instanceof C19796612cu) {
            ArrayList arrayList = new ArrayList();
            C19796612cu c19796612cu = (C19796612cu) interfaceC19797112cz;
            c19796612cu.getClass();
            C19796412cs c19796412cs = new C19796412cs(c19796612cu);
            while (c19796412cs.hasNext()) {
                Object objLIZJ = LIZJ((InterfaceC19797112cz) c19796412cs.next());
                if (objLIZJ != null) {
                    arrayList.add(objLIZJ);
                }
            }
            return arrayList;
        }
        if (!interfaceC19797112cz.LJ().isNaN()) {
            return interfaceC19797112cz.LJ();
        }
        return interfaceC19797112cz.LJFF();
    }

    public static Map<String, Object> LIZLLL(C19796012co c19796012co) {
        HashMap map = new HashMap();
        c19796012co.getClass();
        for (String str : new ArrayList(((HashMap) c19796012co.LL).keySet())) {
            Object objLIZJ = LIZJ(c19796012co.LJIIIIZZ(str));
            if (objLIZJ != null) {
                map.put(str, objLIZJ);
            }
        }
        return map;
    }

    public static void LJI(C19795712cl c19795712cl) {
        int iLJIIIIZZ = LJIIIIZZ(c19795712cl.LIZJ("runtime.counter").LJ().doubleValue() + 1.0d);
        if (iLJIIIIZZ <= 1000000) {
            c19795712cl.LJI("runtime.counter", new C19816212g4(Double.valueOf(iLJIIIIZZ)));
            return;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static int LJIIIIZZ(double d) {
        int i;
        if (!Double.isNaN(d) && !Double.isInfinite(d) && d != 0.0d) {
            if (d > 0.0d) {
                i = 1;
            } else {
                i = -1;
            }
            return (int) ((((double) i) * Math.floor(Math.abs(d))) % 4.294967296E9d);
        }
        return 0;
    }

    public static boolean LJIIJJI(InterfaceC19797112cz interfaceC19797112cz) {
        if (interfaceC19797112cz == null) {
            return false;
        }
        Double dLJ = interfaceC19797112cz.LJ();
        if (dLJ.isNaN() || dLJ.doubleValue() < 0.0d || !dLJ.equals(Double.valueOf(Math.floor(dLJ.doubleValue())))) {
            return false;
        }
        return true;
    }

    public static long LJIIL(double d) {
        return ((long) LJIIIIZZ(d)) & 4294967295L;
    }

    public static boolean LJII(InterfaceC19797112cz interfaceC19797112cz, InterfaceC19797112cz interfaceC19797112cz2) {
        if (!interfaceC19797112cz.getClass().equals(interfaceC19797112cz2.getClass())) {
            return false;
        }
        if ((interfaceC19797112cz instanceof C19796212cq) || (interfaceC19797112cz instanceof C19794812cc)) {
            return true;
        }
        if (interfaceC19797112cz instanceof C19816212g4) {
            if (Double.isNaN(interfaceC19797112cz.LJ().doubleValue()) || Double.isNaN(interfaceC19797112cz2.LJ().doubleValue())) {
                return false;
            }
            return interfaceC19797112cz.LJ().equals(interfaceC19797112cz2.LJ());
        }
        if (interfaceC19797112cz instanceof C19797512d3) {
            return interfaceC19797112cz.LJFF().equals(interfaceC19797112cz2.LJFF());
        }
        if (interfaceC19797112cz instanceof C19798912dH) {
            return interfaceC19797112cz.LIZLLL().equals(interfaceC19797112cz2.LIZLLL());
        }
        if (interfaceC19797112cz != interfaceC19797112cz2) {
            return false;
        }
        return true;
    }

    public static void LJ(int i, String str, List list) {
        if (list.size() == i) {
        } else {
            throw new IllegalArgumentException(C786410Ut5.j4("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    public static void LJFF(EnumC19798012d8 enumC19798012d8, int i, List<InterfaceC19797112cz> list) {
        LJ(i, enumC19798012d8.name(), list);
    }

    public static void LJIIIZ(int i, String str, List list) {
        if (list.size() >= i) {
        } else {
            throw new IllegalArgumentException(C786410Ut5.j4("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    public static void LJIIJ(EnumC19798012d8 enumC19798012d8, int i, List<InterfaceC19797112cz> list) {
        LJIIIZ(i, enumC19798012d8.name(), list);
    }

    public static void LJIILIIL(int i, String str, List list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() <= i) {
        } else {
            throw new IllegalArgumentException(C786410Ut5.j4("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(arrayList.size())}));
        }
    }
}
