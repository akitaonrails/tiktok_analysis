package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.140j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C201955140j {
    public static final boolean LIZ;
    public static final boolean LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;
    public static final InterfaceC201960140o LJ;
    public static final List<InterfaceC2189808i0> LJFF;

    static {
        LIZ = (C280610AzD.LIZ() & 1) != 0;
        LIZIZ = (C280610AzD.LIZ() & 2) != 0;
        LIZJ = (C280610AzD.LIZ() & 4) != 0;
        LIZLLL = (C280610AzD.LIZ() & 8) != 0;
        LJFF = new CopyOnWriteArrayList();
        if (!((Boolean) C201957140l.LIZ.getValue()).booleanValue()) {
            LJ = new InterfaceC201960140o() { // from class: X.140k
                @Override // X.InterfaceC201960140o
                public final void LIZ(int i, String str, String str2) {
                    C2344809Gs.LIZLLL(i, str, str2);
                }
            };
        } else {
            LJ = new InterfaceC201960140o() { // from class: X.140n
                @Override // X.InterfaceC201960140o
                public final void LIZ(int i, String str, String str2) {
                }
            };
            LIZJ(C823920WTu.LIZIZ, "=========================== ToolsLogUtil use AndroidLogger =========================");
        }
    }

    @InterfaceC1294060jmO
    public static void LIZ(String str) {
        LIZJ(C1696610uFf.LIZIZ, str);
    }

    @InterfaceC1294060jmO
    public static void LJ(String str) {
        LJII(C1696610uFf.LIZIZ, str);
    }

    public static String LJIIJJI(Throwable th) {
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof UnknownHostException) {
                return "UnknownHostException";
            }
        }
        return Log.getStackTraceString(th);
    }

    @InterfaceC1294060jmO
    public static void LJIIL(String str) {
        LJIILJJIL(C1696610uFf.LIZIZ, str);
    }

    @InterfaceC1294060jmO
    public static void LJIIZILJ(String str) {
        LJIJI(C1696610uFf.LIZIZ, str);
    }

    @InterfaceC1294060jmO
    public static void LIZIZ(String str, String str2) {
        LIZLLL(C1696610uFf.LIZIZ, str, str2);
    }

    public static void LIZJ(AbstractC201949140d abstractC201949140d, String str) {
        String str2 = abstractC201949140d.LIZ;
        if (LIZ && !C280610AzD.LIZIZ(str2)) {
            return;
        }
        LJIILLIIL(3, str2, str);
    }

    @InterfaceC1294060jmO
    public static void LJFF(String str, String str2) {
        LJIIIIZZ(C1696610uFf.LIZIZ, str, str2);
    }

    @InterfaceC1294060jmO
    public static void LJI(String str, Throwable th) {
        LJIIJ(C1696610uFf.LIZIZ, str, th);
    }

    public static void LJII(AbstractC201949140d abstractC201949140d, String str) {
        String str2 = abstractC201949140d.LIZ;
        if (LIZLLL && !C280610AzD.LIZIZ(str2)) {
            return;
        }
        LJIILLIIL(6, str2, str);
    }

    @InterfaceC1294060jmO
    public static void LJIILIIL(String str, String str2) {
        LJIILL(C1696610uFf.LIZIZ, str, str2);
    }

    public static void LJIILJJIL(AbstractC201949140d abstractC201949140d, String str) {
        String str2 = abstractC201949140d.LIZ;
        if (LIZIZ && !C280610AzD.LIZIZ(str2)) {
            return;
        }
        LJIILLIIL(4, str2, str);
    }

    @InterfaceC1294060jmO
    public static void LJIJ(String str, String str2) {
        LJIJJ(C1696610uFf.LIZIZ, str, str2);
    }

    public static void LJIJI(AbstractC201949140d abstractC201949140d, String str) {
        String str2 = abstractC201949140d.LIZ;
        if (LIZJ && !C280610AzD.LIZIZ(str2)) {
            return;
        }
        LJIILLIIL(5, str2, str);
    }

    public static void LIZLLL(AbstractC201949140d abstractC201949140d, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(abstractC201949140d.LIZ);
        sbLIZ.append(e3.d);
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (LIZ && !C280610AzD.LIZIZ(strLIZIZ)) {
            return;
        }
        LJIILLIIL(3, strLIZIZ, str2);
    }

    public static void LJIIIIZZ(AbstractC201949140d abstractC201949140d, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(abstractC201949140d.LIZ);
        sbLIZ.append(e3.d);
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (LIZLLL && !C280610AzD.LIZIZ(strLIZIZ)) {
            return;
        }
        LJIILLIIL(6, strLIZIZ, str2);
    }

    public static void LJIIJ(AbstractC201949140d abstractC201949140d, String str, Throwable th) {
        String str2 = abstractC201949140d.LIZ;
        if (LIZLLL && !C280610AzD.LIZIZ(str2)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("\n");
        sbLIZ.append(LJIIJJI(th));
        LJIILLIIL(6, str2, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJIILL(AbstractC201949140d abstractC201949140d, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(abstractC201949140d.LIZ);
        sbLIZ.append(e3.d);
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (LIZIZ && !C280610AzD.LIZIZ(strLIZIZ)) {
            return;
        }
        LJIILLIIL(4, strLIZIZ, str2);
    }

    public static void LJIILLIIL(int i, String str, String str2) {
        LJ.LIZ(i, str, str2);
        List<InterfaceC2189808i0> list = LJFF;
        if (!list.isEmpty()) {
            Iterator<InterfaceC2189808i0> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().LIZJ(i, str, str2);
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    LJ.LIZ(6, str, e.getMessage());
                }
            }
        }
    }

    public static void LJIJJ(AbstractC201949140d abstractC201949140d, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(abstractC201949140d.LIZ);
        sbLIZ.append(e3.d);
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (LIZJ && !C280610AzD.LIZIZ(strLIZIZ)) {
            return;
        }
        LJIILLIIL(5, strLIZIZ, str2);
    }

    public static void LJIIIZ(AbstractC201949140d abstractC201949140d, String str, String str2, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(abstractC201949140d.LIZ);
        sbLIZ.append(e3.d);
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (LIZLLL && !C280610AzD.LIZIZ(strLIZIZ)) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str2);
        sbLIZ2.append("\n");
        sbLIZ2.append(LJIIJJI(th));
        LJIILLIIL(6, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
    }
}
