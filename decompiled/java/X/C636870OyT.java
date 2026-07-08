package X;

import com.google.gson.n;
import com.google.gson.o;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0OyT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C636870OyT extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final /* synthetic */ String LL;
    public final /* synthetic */ n LLILLJJLI;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZIZ("M2BannerAssem", "M2BannerAssem handleException called", th);
        if (th instanceof o) {
            C1901570zaF c1901570zaF = C1901570zaF.LIZ;
            String str = this.LL;
            n nVar = this.LLILLJJLI;
            c1901570zaF.getClass();
            C1901570zaF.LIZIZ(nVar, str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C636870OyT(C2185208hG c2185208hG, String str, n nVar) {
        super(c2185208hG);
        this.LL = str;
        this.LLILLJJLI = nVar;
    }
}
