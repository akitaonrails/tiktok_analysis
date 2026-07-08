package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS5S0510000_26;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0205, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class AnonymousClass0205 extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final int $t;
    public Object l0;

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
    public AnonymousClass0205(C2185208hG c2185208hG, AwS5S0510000_26 awS5S0510000_26, int i) {
        super(c2185208hG);
        this.$t = i;
        this.l0 = awS5S0510000_26;
    }

    public static final void LJJ$0(AnonymousClass0205 anonymousClass0205, CoroutineContext coroutineContext, Throwable th) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C344801Vm((Function2) anonymousClass0205.l0, null), 3);
    }

    public static final void LJJ$1(AnonymousClass0205 anonymousClass0205, CoroutineContext coroutineContext, Throwable th) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C344901Vn((Function2) anonymousClass0205.l0, null), 3);
    }
}
