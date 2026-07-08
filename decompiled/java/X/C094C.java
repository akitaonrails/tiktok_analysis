package X;

import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: renamed from: X.094C, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C094C {
    public static final void LIZ(AnonymousClass0954<?> anonymousClass0954, Throwable th) {
        CancellationException cancellationExceptionLIZ = null;
        if (th != null && (!(th instanceof CancellationException) || (cancellationExceptionLIZ = (CancellationException) th) == null)) {
            cancellationExceptionLIZ = C2239008pw.LIZ("Channel was consumed, consumer had failed", th);
        }
        anonymousClass0954.LIZIZ(cancellationExceptionLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> Object LIZIZ(AnonymousClass0955<? super E> anonymousClass0955, E e) {
        if (!(anonymousClass0955.LJIIIIZZ(e) instanceof C094O)) {
            return Unit.LIZ;
        }
        return ((C094N) C23250099c.LJ(C23271099x.INSTANCE, new C094B(anonymousClass0955, e, null))).LIZ;
    }
}
