package X;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0j3X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266250j3X extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final int $t;

    public static final void LJJ$2(C1266250j3X c1266250j3X, CoroutineContext coroutineContext, Throwable th) {
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        switch (this.$t) {
            case 0:
                C1720006oQ.LIZJ("CreateGroupService", "create group error", th);
                break;
            case 1:
                C1AF0.LJ(th);
                break;
            case 2:
                LJJ$2(this, coroutineContext, th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266250j3X(C2185208hG c2185208hG, int i) {
        super(c2185208hG);
        this.$t = i;
    }
}
