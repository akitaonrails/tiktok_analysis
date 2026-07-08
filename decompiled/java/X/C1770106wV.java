package X;

import Y.ARunnableS102S0100000_2;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.06wV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1770106wV extends AbstractC23273099z implements CoroutineExceptionHandler {
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
            case 3:
                LJJ$3(this, coroutineContext, th);
                break;
            case 4:
                LJJ$4(this, coroutineContext, th);
                break;
            case 5:
                LJJ$5(this, coroutineContext, th);
                break;
            case 6:
                LJJ$6(this, coroutineContext, th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1770106wV(InterfaceC23272099y interfaceC23272099y, Object obj, int i) {
        super(interfaceC23272099y);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJ$0(C1770106wV c1770106wV, CoroutineContext coroutineContext, Throwable th) {
        ((Function1) c1770106wV.l0).invoke(th);
    }

    public static final void LJJ$1(C1770106wV c1770106wV, CoroutineContext coroutineContext, Throwable th) {
        C1260120ite.LIZIZ(new ARunnableS102S0100000_2((DialogC1389620mGW) c1770106wV.l0, 23));
    }

    public static final void LJJ$2(C1770106wV c1770106wV, CoroutineContext coroutineContext, Throwable th) {
        ((Function1) c1770106wV.l0).invoke(Boolean.FALSE);
    }

    public static final void LJJ$3(C1770106wV c1770106wV, CoroutineContext coroutineContext, Throwable th) {
        C2382909Vj.LIZ((CompletionBlock) c1770106wV.l0, 0, "get conversation user info failed", null, 4);
    }

    public static final void LJJ$4(C1770106wV c1770106wV, CoroutineContext coroutineContext, Throwable th) {
        th.getMessage();
        CompletionBlock completionBlock = (CompletionBlock) c1770106wV.l0;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
    }

    public static final void LJJ$5(C1770106wV c1770106wV, CoroutineContext coroutineContext, Throwable th) {
        CompletionBlock completionBlock = (CompletionBlock) c1770106wV.l0;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
    }

    public static final void LJJ$6(C1770106wV c1770106wV, CoroutineContext coroutineContext, Throwable th) {
        C1260120ite.LIZIZ(new ARunnableS102S0100000_2((C06RP) c1770106wV.l0, 77));
    }
}
