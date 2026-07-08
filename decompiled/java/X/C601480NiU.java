package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0NiU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C601480NiU extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final /* synthetic */ CompletionBlock LL;
    public final /* synthetic */ String LLILLJJLI;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        CompletionBlock completionBlock = this.LL;
        String message = th.getMessage();
        XBaseResultModel xBaseResultModel = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC601770Nix.class, this.LLILLJJLI);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error - ");
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
        if (message == null) {
            message = "";
        }
        completionBlock.onFailure(0, message, xBaseResultModel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C601480NiU(C2185208hG c2185208hG, CompletionBlock completionBlock, String str) {
        super(c2185208hG);
        this.LL = completionBlock;
        this.LLILLJJLI = str;
    }
}
