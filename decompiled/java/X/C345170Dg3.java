package X;

import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0Dg3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345170Dg3 extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final /* synthetic */ C345210Dg7 LL;
    public final /* synthetic */ CreativeLoadingDialog LLILLJJLI;
    public final /* synthetic */ C1DRG LLILLL;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        if (th instanceof C345190Dg5) {
            C23250099c.LIZLLL(this.LL.LIZ, null, null, new C345160Dg2(this.LLILLJJLI, th, this.LLILLL, null), 3);
        } else {
            C345180Dg4.LIZ(th);
        }
        C345210Dg7 c345210Dg7 = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("execution met with exception, throwable=");
        sbLIZ.append(th);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c345210Dg7.getClass();
        C345210Dg7.LIZIZ(strLIZIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C345170Dg3(C2185208hG c2185208hG, C345210Dg7 c345210Dg7, CreativeDialogWrapper creativeDialogWrapper, C1DRG c1drg) {
        super(c2185208hG);
        this.LL = c345210Dg7;
        this.LLILLJJLI = creativeDialogWrapper;
        this.LLILLL = c1drg;
    }
}
