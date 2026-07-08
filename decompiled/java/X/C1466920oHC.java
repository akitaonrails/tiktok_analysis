package X;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0oHC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466920oHC extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final int $t;

    public static final void LJJ$0(C1466920oHC c1466920oHC, CoroutineContext coroutineContext, Throwable th) {
    }

    public static final void LJJ$3(C1466920oHC c1466920oHC, CoroutineContext coroutineContext, Throwable th) {
    }

    public static final void LJJ$5(C1466920oHC c1466920oHC, CoroutineContext coroutineContext, Throwable th) {
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
                C1AF0.LJFF(th, "EditPreviewComponent-loader-fail");
                break;
            case 3:
                LJJ$3(this, coroutineContext, th);
                break;
            case 4:
                C1AF0.LJFF(th, "edit photo mode post");
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
    public C1466920oHC(C2185208hG c2185208hG, int i) {
        super(c2185208hG);
        this.$t = i;
    }

    public static final void LJJ$1(C1466920oHC c1466920oHC, CoroutineContext coroutineContext, Throwable th) {
        C201955140j.LJIIJ(C1398350mUb.LIZIZ, "TemplateTabsContainer", th);
    }

    public static final void LJJ$6(C1466920oHC c1466920oHC, CoroutineContext coroutineContext, Throwable th) {
        C201955140j.LJIIIIZZ(C1421580n64.LIZIZ, "ai_fingerprint_server", "exception");
    }
}
