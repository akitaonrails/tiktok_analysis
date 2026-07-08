package X;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0Jcz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496150Jcz extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final /* synthetic */ AbstractC496140Jcy LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C496150Jcz(C2185208hG c2185208hG, AbstractC496140Jcy abstractC496140Jcy) {
        super(c2185208hG);
        this.LL = abstractC496140Jcy;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        C20441214yg.LIZIZ("AbstractLiveProfileRepository", "exception");
        if ((th instanceof C477520Io2) && ((C501520Jle) th).getErrorCode() == 4024075) {
            this.LL.LIZLLL.setValue(new C496270JdB<>(4, null, th));
        } else {
            this.LL.LIZLLL.setValue(new C496270JdB<>(3, null, th));
        }
    }
}
