package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qdN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557550qdN {
    public static boolean LIZ = true;
    public static Executor LIZIZ;
    public static InterfaceC1554870qZ3 LIZJ;
    public static InterfaceC1557560qdO LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LJI;

    public static void LIZ(String str, Function0 function0) {
        String strLIZIZ;
        InterfaceC1557560qdO interfaceC1557560qdO = LIZLLL;
        if (interfaceC1557560qdO != null) {
            try {
                strLIZIZ = (String) function0.invoke();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("catch err ");
                sbLIZ.append(Log.getStackTraceString(th));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            interfaceC1557560qdO.LIZ(4, str, strLIZIZ);
        }
    }
}
