package X;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.12Yu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19775412Yu extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final int $t;

    public static final void LJJ$2(C19775412Yu c19775412Yu, CoroutineContext coroutineContext, Throwable th) {
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        switch (this.$t) {
            case 0:
                LJJ$0(this, coroutineContext, th);
                break;
            case 1:
                LJJ$1(this, coroutineContext, th);
                break;
            case 2:
                LJJ$2(this, coroutineContext, th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19775412Yu(C2185208hG c2185208hG, int i) {
        super(c2185208hG);
        this.$t = i;
    }

    public static final void LJJ$0(C19775412Yu c19775412Yu, CoroutineContext coroutineContext, Throwable th) {
        InterfaceC19570411hW interfaceC19570411hW = C19570511hX.LIZ;
        if (interfaceC19570411hW != null) {
            interfaceC19570411hW.LIZIZ(th);
        } else {
            if (th == null) {
                return;
            }
            th.getMessage();
        }
    }

    public static final void LJJ$1(C19775412Yu c19775412Yu, CoroutineContext coroutineContext, Throwable th) {
        C122D c122dLIZIZ = C123O.LIZIZ();
        if (c122dLIZIZ != null) {
            c122dLIZIZ.LIZIZ(th);
        }
    }
}
