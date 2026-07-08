package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u5H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690170u5H {
    public final /* synthetic */ C1690080u58 LIZ;

    public C1690170u5H(C1690080u58 c1690080u58) {
        this.LIZ = c1690080u58;
    }

    public final InterfaceC1564810qp5 LIZ(int i) {
        Function1<Object, Unit> function1LJ;
        C1690080u58 c1690080u58 = this.LIZ;
        C13YG c13ygLIZ = C13YI.LIZ();
        if (c13ygLIZ != null) {
            function1LJ = c13ygLIZ.LJ();
        } else {
            function1LJ = null;
        }
        C13YG c13ygLIZIZ = C13YI.LIZIZ(c13ygLIZ);
        try {
            long j = ((C1690070u57) ((C13FE) c1690080u58.LJ).getValue()).LJIIIZ;
            C13YI.LJ(c13ygLIZ, c13ygLIZIZ, function1LJ);
            return this.LIZ.LJIILJJIL.LIZ(i, j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C13YI.LJ(c13ygLIZ, c13ygLIZIZ, function1LJ);
            throw th;
        }
    }
}
