package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.home.router.WalletIntermediateRoute;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0cO0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1009860cO0 extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final /* synthetic */ DialogC1389620mGW LL;
    public final /* synthetic */ WalletIntermediateRoute LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        C1AF0.LJ(th);
        C786410Ut5.LJIIJ(this.LL);
        this.LLILLJJLI.showErrorPopup(this.LLILLL, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1009860cO0(C2185208hG c2185208hG, DialogC1389620mGW dialogC1389620mGW, WalletIntermediateRoute walletIntermediateRoute, Activity activity) {
        super(c2185208hG);
        this.LL = dialogC1389620mGW;
        this.LLILLJJLI = walletIntermediateRoute;
        this.LLILLL = activity;
    }
}
