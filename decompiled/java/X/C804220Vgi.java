package X;

import android.util.Log;
import com.bytedance.crash.monitor.k;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Vgi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C804220Vgi implements InterfaceC1583760rJe {
    @Override // X.InterfaceC1583760rJe
    public final void LIZJ(Exception exc) {
        try {
            C2344809Gs.LJI(exc);
            PrintStream printStream = System.err;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parent is null");
            sbLIZ.append(": ");
            sbLIZ.append(Log.getStackTraceString(exc));
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
            k.LIZJ().LJFF(4);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC1583760rJe
    public final void log(String str) {
        C2344809Gs.LIZLLL(4, "hox-init", str);
        PrintStream printStream = System.err;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hox-init");
        sbLIZ.append(": ");
        sbLIZ.append(str);
        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
    }
}
