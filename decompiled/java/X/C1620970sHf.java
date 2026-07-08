package X;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0sHf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620970sHf extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final int $t;

    public static final void LJJ$1(C1620970sHf c1620970sHf, CoroutineContext coroutineContext, Throwable th) {
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) throws Throwable {
        switch (this.$t) {
            case 0:
                LJJ$0(this, coroutineContext, th);
                break;
            case 1:
                LJJ$1(this, coroutineContext, th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1620970sHf(C2185208hG c2185208hG, int i) {
        super(c2185208hG);
        this.$t = i;
    }

    public static final void LJJ$0(C1620970sHf c1620970sHf, CoroutineContext coroutineContext, Throwable th) throws Throwable {
        if (th instanceof C738120SxO) {
        } else {
            throw th;
        }
    }
}
