package X;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08TY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08TY extends C09AY implements Function0<ExecutorService> {
    public C08TY() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ExecutorService invoke() {
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.FIXED);
        c2123408ToLIZ.LIZIZ = "LegoExecutor_executorWork";
        c2123408ToLIZ.LIZJ = Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));
        return C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }
}
