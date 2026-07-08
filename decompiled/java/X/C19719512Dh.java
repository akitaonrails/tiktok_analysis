package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Dh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19719512Dh {
    public static Collection LIZ(Object obj) {
        if ((obj instanceof C03W4) && !(obj instanceof InterfaceC19719812Dk)) {
            LJIIJ(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIIIZ(e);
            throw null;
        }
    }

    public static List LIZIZ(Object obj) {
        if ((obj instanceof C03W4) && !(obj instanceof InterfaceC1687470u0v)) {
            LJIIJ(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIIIZ(e);
            throw null;
        }
    }

    public static Map LIZJ(Object obj) {
        if ((obj instanceof C03W4) && !(obj instanceof InterfaceC2095908Iz)) {
            LJIIJ(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIIIZ(e);
            throw null;
        }
    }

    public static Set LIZLLL(Object obj) {
        if ((obj instanceof C03W4) && !(obj instanceof InterfaceC835440Wpy)) {
            LJIIJ(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIIIZ(e);
            throw null;
        }
    }

    public static boolean LJI(Object obj) {
        if (obj instanceof List) {
            if (!(obj instanceof C03W4) || (obj instanceof InterfaceC1687470u0v)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJII(Object obj) {
        if (obj instanceof Map) {
            if (!(obj instanceof C03W4) || (obj instanceof InterfaceC2095908Iz)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJIIIIZZ(Object obj) {
        if (obj instanceof Set) {
            if (!(obj instanceof C03W4) || (obj instanceof InterfaceC835440Wpy)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LJIIIZ(ClassCastException classCastException) {
        Intrinsics.LJIIIZ(C19719512Dh.class.getName(), classCastException);
        throw classCastException;
    }

    public static void LJ(int i, Object obj) {
        if (obj != null && !LJFF(i, obj)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("kotlin.jvm.functions.Function");
            sbLIZ.append(i);
            LJIIJ(obj, C2188811AlT.LIZIZ(sbLIZ));
            throw null;
        }
    }

    public static boolean LJFF(int i, Object obj) {
        int arity;
        if (!(obj instanceof InterfaceC1451105m9)) {
            return false;
        }
        if (obj instanceof C09B3) {
            arity = ((C09B3) obj).getArity();
        } else if (obj instanceof Function0) {
            arity = 0;
        } else if (obj instanceof Function1) {
            arity = 1;
        } else if (obj instanceof Function2) {
            arity = 2;
        } else if (obj instanceof InterfaceC1631620sYq) {
            arity = 3;
        } else if (obj instanceof InterfaceC1631630sYr) {
            arity = 4;
        } else if (obj instanceof InterfaceC1685420txc) {
            arity = 5;
        } else if (obj instanceof InterfaceC1685430txd) {
            arity = 6;
        } else if (obj instanceof InterfaceC2280171EMt) {
            arity = 7;
        } else if (obj instanceof InterfaceC2280181EMu) {
            arity = 8;
        } else if (obj instanceof InterfaceC2280191EMv) {
            arity = 9;
        } else if (obj instanceof InterfaceC2280201EMw) {
            arity = 10;
        } else if (obj instanceof InterfaceC2280211EMx) {
            arity = 11;
        } else if (obj instanceof InterfaceC2280221EMy) {
            arity = 12;
        } else if (obj instanceof InterfaceC2280231EMz) {
            arity = 13;
        } else if (obj instanceof C1EN0) {
            arity = 14;
        } else if (obj instanceof C1EN1) {
            arity = 15;
        } else if (obj instanceof C1EN2) {
            arity = 16;
        } else if (obj instanceof C1EN3) {
            arity = 17;
        } else if (obj instanceof C1EN4) {
            arity = 18;
        } else if (obj instanceof C1EN5) {
            arity = 19;
        } else if (obj instanceof C1EN6) {
            arity = 20;
        } else if (obj instanceof C1EN7) {
            arity = 21;
        } else if (obj instanceof C1EN8) {
            arity = 22;
        } else {
            arity = -1;
        }
        if (arity != i) {
            return false;
        }
        return true;
    }

    public static void LJIIJ(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(name);
        sbLIZ.append(" cannot be cast to ");
        sbLIZ.append(str);
        LJIIIZ(new ClassCastException(C2188811AlT.LIZIZ(sbLIZ)));
        throw null;
    }
}
