package X;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1D7h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2250671D7h {
    public static final <E> void LIZ(Function1<? super E, Unit> function1, E e, CoroutineContext coroutineContext) {
        C2250681D7i c2250681D7iLIZIZ = LIZIZ(function1, e, null);
        if (c2250681D7iLIZIZ != null) {
            C2185108hF.LIZ(coroutineContext, c2250681D7iLIZIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.1D7i] */
    public static final <E> C2250681D7i LIZIZ(Function1<? super E, Unit> function1, E e, C2250681D7i c2250681D7i) {
        try {
            function1.invoke(e);
            return c2250681D7i;
        } catch (Throwable th) {
            if (c2250681D7i != null && c2250681D7i.getCause() != th) {
                C13SZ.LIZ(c2250681D7i, th);
                return c2250681D7i;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Exception in undelivered element handler for ");
            sbLIZ.append(e);
            final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            return new RuntimeException(strLIZIZ, th) { // from class: X.1D7i
            };
        }
    }
}
