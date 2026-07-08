package X;

import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0q41, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1535630q41 {
    public static C1529750puX LIZIZ;
    public static C843720X7y LIZJ;
    public static C1535700q48 LIZLLL;
    public static C1530600pvu LJ;
    public static boolean LJFF;
    public static int LJI;
    public static C1535850q4N LJII;
    public static C1535840q4M LJIIIIZZ;
    public static boolean LJIIIZ;
    public static boolean LJIILIIL;
    public static boolean LJIILJJIL;
    public static boolean LJIILL;
    public static boolean LJIILLIIL;
    public static boolean LJIIZILJ;
    public static boolean LJIJ;
    public static boolean LJIJI;
    public static boolean LJIJJLI;
    public static boolean LJIL;
    public static int LJJ;
    public static boolean LJJI;
    public static boolean LJJIII;
    public static boolean LJJIIJ;
    public static boolean LJJIIZI;
    public static boolean LJJIJIIJI;
    public static C788250Uw3 LJJIJIIJIL;
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1104100eq0());
    public static final Map<String, Object> LJIIJ = new LinkedHashMap();
    public static String LJIIJJI = "10/starling/resource";
    public static long LJIIL = 180000;
    public static int LJIJJ = -1;
    public static final C1535190q3J LJJIFFI = new InterfaceC1530490pvj() { // from class: X.0q3J
        @Override // X.InterfaceC1530490pvj
        public final boolean LIZ(C1534360q1y<?> c1534360q1y, C1533790q13 c1533790q13, boolean z, boolean z2) {
            if (Intrinsics.LJFF(c1534360q1y.LIZJ, byte[].class)) {
                if (C1535630q41.LJIJI) {
                    if (!z && !z2) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
    };
    public static final C1535680q46 LJJII = new InterfaceC1533160q02() { // from class: X.0q46
        @Override // X.InterfaceC1533160q02
        public final boolean LIZ(Class cls, boolean z) {
            if ((Intrinsics.LJFF(cls, byte[].class) || Intrinsics.LJFF(cls, ByteBuffer.class)) && !z) {
                return true;
            }
            return false;
        }
    };
    public static boolean LJJIIJZLJL = true;
    public static boolean LJJIIZ = true;
    public static boolean LJJIJ = true;

    public static void LJII() {
        LJJIII = true;
    }

    public static void LJIIIIZZ() {
        LJIL = true;
    }

    public static int LIZJ() {
        return LJIJJ;
    }

    public static boolean LIZ(String str) {
        C1535700q48 c1535700q48 = LIZLLL;
        if (c1535700q48 == null || !c1535700q48.LIZ) {
            return false;
        }
        List<String> list = c1535700q48.LIZIZ;
        if (list != null) {
            for (String str2 : list) {
                if (str != null && a0.LJJIIZI(str, str2, false)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Object LIZIZ(String str) {
        return ((LinkedHashMap) LJIIJ).get(str);
    }

    public static void LJ(int i) {
        LJI = i;
    }

    public static void LJFF(int i) {
        LJJ = i;
    }

    public static void LJI(boolean z) {
        LJIJ = z;
    }

    public static void LJIIIZ(boolean z) {
        LJIJI = z;
    }

    public static void LJIIJ(boolean z) {
        LJJIIJ = z;
    }

    public static void LJIIJJI(boolean z) {
        LJJIJIIJI = z;
    }

    public static void LJIIL(boolean z) {
        LJJIIZI = z;
    }

    public static void LJIILIIL(C1535850q4N c1535850q4N) {
        LJII = c1535850q4N;
    }

    public static void LJIILJJIL(C1529750puX c1529750puX) {
        LIZIZ = c1529750puX;
    }

    public static void LJIILL(C843720X7y c843720X7y) {
        LIZJ = c843720X7y;
    }

    public static void LJIILLIIL(C1535840q4M c1535840q4M) {
        LJIIIIZZ = c1535840q4M;
    }

    public static void LJIIZILJ(boolean z) {
        LJJIIJZLJL = z;
    }

    public static void LJIJ(boolean z) {
        LJJIIZ = z;
    }

    public static void LJIJI(boolean z) {
        LJIILLIIL = z;
    }

    public static void LJIJJ(boolean z) {
        LJIIZILJ = z;
    }

    public static void LJIJJLI(long j) {
        LJIIL = j;
    }

    public static void LJIL(String str) {
        LJIIJJI = str;
    }

    public static void LJJ(boolean z) {
        LJIJJLI = z;
    }

    public static void LJJI(boolean z) {
        LJFF = z;
    }

    public static void LJJIFFI(boolean z) {
        LJIIIZ = z;
    }

    public static void LJJII(boolean z) {
        LJIILL = z;
    }

    public static void LJJIII(boolean z) {
        LJIILJJIL = z;
    }

    public static void LJJIIJ(boolean z) {
        LJJIJ = z;
    }

    public static void LJJIIJZLJL(C1535700q48 c1535700q48) {
        LIZLLL = c1535700q48;
    }

    public static void LJJIIZ(boolean z) {
        LJIILIIL = z;
    }

    public static void LIZLLL(Object obj, String str) {
        LJIIJ.put(str, obj);
    }
}
