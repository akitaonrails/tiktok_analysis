package X;

import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletedExceptionally;

/* JADX INFO: renamed from: X.099C, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C099C {
    public static final Object LIZ(C099Z c099z, C099Z c099z2, Function2 function2) {
        Object completedExceptionally;
        try {
            C19719512Dh.LJ(2, function2);
            completedExceptionally = function2.invoke(c099z2, c099z);
        } catch (Throwable th) {
            completedExceptionally = new CompletedExceptionally(th, false, 2, null);
        }
        if (completedExceptionally == C099R.LJFF()) {
            return C099R.LJFF();
        }
        Object objLJJLIIIJJI = c099z.LJJLIIIJJI(completedExceptionally);
        if (objLJJLIIIJJI == C1DFI.LIZIZ) {
            return C099R.LJFF();
        }
        if (!(objLJJLIIIJJI instanceof CompletedExceptionally)) {
            return C1DFI.LIZ(objLJJLIIIJJI);
        }
        throw ((CompletedExceptionally) objLJJLIIIJJI).cause;
    }
}
