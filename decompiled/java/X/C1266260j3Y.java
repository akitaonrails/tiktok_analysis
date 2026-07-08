package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0j3Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266260j3Y extends AbstractC23273099z implements CoroutineExceptionHandler {
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
            case 2:
                LJJ$2(this, coroutineContext, th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266260j3Y(InterfaceC23272099y interfaceC23272099y, Object obj, int i) {
        super(interfaceC23272099y);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJ$0(C1266260j3Y c1266260j3Y, CoroutineContext coroutineContext, Throwable th) {
        ((Function1) c1266260j3Y.l0).invoke(null);
    }

    public static final void LJJ$1(C1266260j3Y c1266260j3Y, CoroutineContext coroutineContext, Throwable th) {
        ((C1227860i3c) c1266260j3Y.l0).LIZ.getTag();
    }

    public static final void LJJ$2(C1266260j3Y c1266260j3Y, CoroutineContext coroutineContext, Throwable th) {
        ((AbstractC1225770i0F) c1266260j3Y.l0).getTag();
    }
}
