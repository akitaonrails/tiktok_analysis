package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rtn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710410Rtn extends C09AY implements Function0<Executor> {
    public C710410Rtn() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // kotlin.jvm.functions.Function0
    public final Executor invoke() {
        Object obj;
        if (((Boolean) C2184411AeN.LIZIZ.getValue()).booleanValue()) {
            if (C2184411AeN.LIZ() == 2 || C2184411AeN.LIZ() == 4) {
                try {
                    Executor executorLIZIZ = C21172617tM.LJFF.LIZIZ();
                    C189200o6.m2constructorimpl(executorLIZIZ);
                    obj = executorLIZIZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    obj = c098200Yq;
                }
                boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
                ?? r1 = obj;
                if (zM7isFailureimpl) {
                    r1 = 0;
                }
                if (r1 != 0) {
                    return r1;
                }
            }
        }
        return C823050WQl.LIZLLL();
    }
}
