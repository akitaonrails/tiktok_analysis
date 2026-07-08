package X;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08TZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08TZ extends C09AY implements Function0<ExecutorService> {
    public C08TZ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ExecutorService invoke() {
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.SERIAL);
        c2123408ToLIZ.LIZIZ = "LegoExecutor_executorRequest";
        return C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }
}
