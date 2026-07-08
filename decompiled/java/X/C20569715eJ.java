package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15eJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20569715eJ {
    public static void LJII(InterfaceC20562615dA interfaceC20562615dA, Function0<String> function0, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa) {
        C20039813b2.LIZLLL(C13MH.DEBUG, interfaceC20562615dA.getNodeType(), interfaceC20562615dA.getName(), function0, interfaceC1604490rr5, c0raa);
    }

    public static void LJIIIZ(InterfaceC20562615dA interfaceC20562615dA, Function0<String> function0, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa) {
        C20039813b2.LIZLLL(C13MH.ERROR, interfaceC20562615dA.getNodeType(), interfaceC20562615dA.getName(), function0, interfaceC1604490rr5, c0raa);
    }

    public static void LJIIJJI(InterfaceC20562615dA interfaceC20562615dA, Function0<String> function0, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa) {
        C20039813b2.LIZLLL(C13MH.INFO, interfaceC20562615dA.getNodeType(), interfaceC20562615dA.getName(), function0, interfaceC1604490rr5, c0raa);
    }

    public static void LIZ(InterfaceC20562615dA interfaceC20562615dA, C0T9Y c0t9y, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa, Function0<? extends Object> function0) {
        Pair pair;
        Pair pair2;
        Pair pair3;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("type", new AwS575S0100000_31(interfaceC20562615dA, 1547));
        pairArr[1] = new Pair("name", new AwS575S0100000_31(interfaceC20562615dA, 1548));
        pairArr[2] = new Pair("msg", function0);
        if (c0t9y != null) {
            pair = new Pair("context", new C20569815eK(c0t9y));
        } else {
            pair = null;
        }
        pairArr[3] = pair;
        if (interfaceC1604490rr5 != null) {
            pair2 = new Pair("params", new AwS575S0100000_31(interfaceC1604490rr5, 1549));
        } else {
            pair2 = null;
        }
        pairArr[4] = pair2;
        if (c0raa != null) {
            pair3 = new Pair("result", new AwS575S0100000_31(c0raa, 1550));
        } else {
            pair3 = null;
        }
        pairArr[5] = pair3;
        AbstractC1879030yzt.LIZJ(null, EnumC1910950zpN.CONTINUE, pairArr);
    }

    public static void LIZJ(InterfaceC20562615dA interfaceC20562615dA, C0T9Y c0t9y, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa, Function0<? extends Object> function0) {
        Pair pair;
        Pair pair2;
        Pair pair3;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("type", new AwS575S0100000_31(interfaceC20562615dA, 1551));
        pairArr[1] = new Pair("name", new AwS575S0100000_31(interfaceC20562615dA, 1552));
        pairArr[2] = new Pair("msg", function0);
        if (c0t9y != null) {
            pair = new Pair("context", new AwS575S0100000_31(c0t9y, 1553));
        } else {
            pair = null;
        }
        pairArr[3] = pair;
        if (interfaceC1604490rr5 != null) {
            pair2 = new Pair("params", new AwS575S0100000_31(interfaceC1604490rr5, 1554));
        } else {
            pair2 = null;
        }
        pairArr[4] = pair2;
        if (c0raa != null) {
            pair3 = new Pair("result", new AwS575S0100000_31(c0raa, 1555));
        } else {
            pair3 = null;
        }
        pairArr[5] = pair3;
        AbstractC1879030yzt.LIZJ(null, EnumC1910950zpN.END, pairArr);
    }

    public static void LJ(InterfaceC20562615dA interfaceC20562615dA, C0T9Y c0t9y, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa, Function0<? extends Object> function0) {
        Pair pair;
        Pair pair2;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("type", new AwS575S0100000_31(interfaceC20562615dA, 1556));
        pairArr[1] = new Pair("name", new AwS575S0100000_31(interfaceC20562615dA, 1557));
        pairArr[2] = new Pair("msg", function0);
        Pair pair3 = null;
        if (c0t9y != null) {
            pair = new Pair("context", new AwS575S0100000_31(c0t9y, 1558));
        } else {
            pair = null;
        }
        pairArr[3] = pair;
        if (interfaceC1604490rr5 != null) {
            pair2 = new Pair("params", new AwS575S0100000_31(interfaceC1604490rr5, 1559));
        } else {
            pair2 = null;
        }
        pairArr[4] = pair2;
        if (c0raa != null) {
            pair3 = new Pair("result", new AwS575S0100000_31(c0raa, 1560));
        }
        pairArr[5] = pair3;
        AbstractC1879030yzt.LIZIZ(pairArr);
    }

    public static void LJI(InterfaceC20562615dA interfaceC20562615dA, C0T9Y c0t9y, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa, Function0<? extends Object> function0) {
        Pair pair;
        Pair pair2;
        Pair pair3;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("type", new AwS575S0100000_31(interfaceC20562615dA, 1561));
        pairArr[1] = new Pair("name", new AwS575S0100000_31(interfaceC20562615dA, 1562));
        pairArr[2] = new Pair("msg", function0);
        if (c0t9y != null) {
            pair = new Pair("context", new AwS575S0100000_31(c0t9y, 1563));
        } else {
            pair = null;
        }
        pairArr[3] = pair;
        if (interfaceC1604490rr5 != null) {
            pair2 = new Pair("params", new AwS575S0100000_31(interfaceC1604490rr5, 1564));
        } else {
            pair2 = null;
        }
        pairArr[4] = pair2;
        if (c0raa != null) {
            pair3 = new Pair("result", new AwS575S0100000_31(c0raa, 1565));
        } else {
            pair3 = null;
        }
        pairArr[5] = pair3;
        AbstractC1879030yzt.LIZJ(null, EnumC1910950zpN.FINISH, pairArr);
    }

    public static void LJIILIIL(InterfaceC20562615dA interfaceC20562615dA, C0T9Y c0t9y, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa, AFwS221S0000000_31 aFwS221S0000000_31) {
        Pair pair;
        Pair pair2;
        Pair pair3;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("type", new AwS575S0100000_31(interfaceC20562615dA, 1566));
        pairArr[1] = new Pair("name", new AwS575S0100000_31(interfaceC20562615dA, 1567));
        pairArr[2] = new Pair("msg", aFwS221S0000000_31);
        if (c0t9y != null) {
            pair = new Pair("context", new AwS575S0100000_31(c0t9y, 1568));
        } else {
            pair = null;
        }
        pairArr[3] = pair;
        if (interfaceC1604490rr5 != null) {
            pair2 = new Pair("params", new AwS575S0100000_31(interfaceC1604490rr5, 1569));
        } else {
            pair2 = null;
        }
        pairArr[4] = pair2;
        if (c0raa != null) {
            pair3 = new Pair("result", new AwS575S0100000_31(c0raa, 1570));
        } else {
            pair3 = null;
        }
        pairArr[5] = pair3;
        AbstractC1879030yzt.LIZJ(null, EnumC1910950zpN.START, pairArr);
    }
}
