package X;

import Y.ARunnableS90S0200000_21;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0lZI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362820lZI extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final /* synthetic */ SharePanelViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1362820lZI(C2185208hG c2185208hG, SharePanelViewModel sharePanelViewModel) {
        super(c2185208hG);
        this.LL = sharePanelViewModel;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadSuccess failed ");
        sbLIZ.append(this.LL.LLJJIJI);
        sbLIZ.append(" :");
        C1720006oQ.LIZJ("SharePanelViewModel", C2188811AlT.LIZIZ(sbLIZ), th);
        C2487409ou.LIZJ(new ARunnableS90S0200000_21(th, this.LL, 72));
    }
}
