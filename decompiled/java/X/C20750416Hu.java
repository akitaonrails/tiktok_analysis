package X;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.16Hu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20750416Hu extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final int $t;

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
    public C20750416Hu(C2185208hG c2185208hG, int i) {
        super(c2185208hG);
        this.$t = i;
    }

    public static final void LJJ$0(C20750416Hu c20750416Hu, CoroutineContext coroutineContext, Throwable th) throws Throwable {
        C169Q.LLILLJJLI.getClass();
        if (!C169Q.LJIIL()) {
        } else {
            throw th;
        }
    }

    public static final void LJJ$1(C20750416Hu c20750416Hu, CoroutineContext coroutineContext, Throwable th) throws Throwable {
        C169Q.LLILLJJLI.getClass();
        if (!C169Q.LJIIL()) {
        } else {
            throw th;
        }
    }
}
