package X;

import Y.ARunnableS88S0200000_19;
import android.app.Activity;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0hqf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1219830hqf extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final /* synthetic */ C1222520hv0 LL;
    public final /* synthetic */ Activity LLILLJJLI;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        C1260120ite.LIZIZ(new ARunnableS88S0200000_19(this.LL, this.LLILLJJLI, 32));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219830hqf(C2185208hG c2185208hG, C1222520hv0 c1222520hv0, C19EG c19eg) {
        super(c2185208hG);
        this.LL = c1222520hv0;
        this.LLILLJJLI = c19eg;
    }
}
