package X;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08Pw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2113808Pw {
    public static ExecutorService LIZ;
    public static final ExecutorC2043307zT LIZIZ = new ExecutorC2043307zT();

    public static ExecutorService LIZ() {
        if (LIZ == null) {
            LIZ = C786410Ut5.h4();
        }
        ExecutorService executorService = LIZ;
        if (executorService == null) {
            Intrinsics.LJIIL();
        }
        return executorService;
    }
}
