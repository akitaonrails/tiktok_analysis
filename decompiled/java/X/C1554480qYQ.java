package X;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0qYQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1554480qYQ extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final int $t;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
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
    public C1554480qYQ(C2185208hG c2185208hG, int i) {
        super(c2185208hG);
        this.$t = i;
    }

    public static final void LJJ$0(C1554480qYQ c1554480qYQ, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("exception in prefetchPdpResource");
        sbLIZ.append(th.getMessage());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("exception in prefetchPdpResource");
        sbLIZ2.append(th.getMessage());
        C1326490kch.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
        C1AF0.LIZJ(strLIZIZ);
    }

    public static final void LJJ$1(C1554480qYQ c1554480qYQ, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("exception in prefetchPdpResource");
        sbLIZ.append(th.getMessage());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("exception in prefetchPdpResource");
        sbLIZ2.append(th.getMessage());
        C1326490kch.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
        C1AF0.LIZJ(strLIZIZ);
    }
}
