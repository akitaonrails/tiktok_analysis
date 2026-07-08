package X;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0zn4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909520zn4 {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1909510zn3());
    public static String LIZIZ = "";

    public static String LIZ() {
        C1389350mG5 c1389350mG5LIZJ = C1389340mG4.LIZJ(null, null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("- c:");
        sbLIZ.append(C1389340mG4.LJ());
        sbLIZ.append(',');
        sbLIZ.append(C1389340mG4.LIZLLL());
        sbLIZ.append(";n:");
        sbLIZ.append(c1389350mG5LIZJ.LIZIZ());
        sbLIZ.append(',');
        sbLIZ.append(c1389350mG5LIZJ.LIZ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(": ");
        sbLIZ.append(str2);
        LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1909500zn2 interfaceC1909500zn2 = (InterfaceC1909500zn2) LIZ.getValue();
        if (interfaceC1909500zn2 != null) {
            interfaceC1909500zn2.LIZ();
        }
        ExecutorService executorService = C15O7.LJI;
        C15O7.LIZIZ(new Callable() { // from class: X.0zn5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("DebugHelper@9d58.putLog$1");
                InterfaceC1909500zn2 interfaceC1909500zn22 = (InterfaceC1909500zn2) C1909520zn4.LIZ.getValue();
                Unit unit = null;
                if (interfaceC1909500zn22 != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("size_cache:");
                    sbLIZ2.append(C1389340mG4.LJ());
                    sbLIZ2.append(',');
                    sbLIZ2.append(C1389340mG4.LIZLLL());
                    sbLIZ2.append(" \nsize_now: ");
                    sbLIZ2.append(C1389340mG4.LIZJ(null, null).LIZIZ());
                    sbLIZ2.append(',');
                    sbLIZ2.append(C1389340mG4.LIZJ(null, null).LIZ());
                    sbLIZ2.append(" \nisLandscape:");
                    sbLIZ2.append(C1389340mG4.LIZJ(null, null).LJFF);
                    sbLIZ2.append(" \nauth:");
                    C20594815iM.LIZ.getClass();
                    sbLIZ2.append("");
                    sbLIZ2.append(" \nlast_log:");
                    sbLIZ2.append(C1909520zn4.LIZIZ);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    interfaceC1909500zn22.LIZJ();
                    unit = Unit.LIZ;
                }
                C1C7U.LIZIZ("DebugHelper@9d58.putLog$1");
                return unit;
            }
        }, C15O7.LJIIIIZZ, null);
    }
}
