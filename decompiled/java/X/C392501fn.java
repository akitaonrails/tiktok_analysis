package X;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.01fn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C392501fn extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final /* synthetic */ InterfaceC2329309At LL;
    public final /* synthetic */ long LLILLJJLI;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        this.LL.onError(th);
        if (th instanceof C386801es) {
            C392601fo.LIZ.LJ(this.LLILLJJLI, new C392701fp((C386801es) th));
            return;
        }
        if (th instanceof CancellationException) {
            return;
        }
        C392601fo c392601fo = C392601fo.LIZ;
        long j = this.LLILLJJLI;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        c392601fo.LJ(j, new C392701fp(new C386801es(-1008, message)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C392501fn(C2185208hG c2185208hG, C11KT c11kt, long j) {
        super(c2185208hG);
        this.LL = c11kt;
        this.LLILLJJLI = j;
    }
}
