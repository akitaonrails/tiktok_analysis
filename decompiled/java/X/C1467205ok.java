package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.zhiliaoapp.musically.R;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.05ok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1467205ok extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final /* synthetic */ CompletionBlock LL;
    public final /* synthetic */ Activity LLILLJJLI;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("e: ");
        sbLIZ.append(th.getMessage());
        C2188811AlT.LIZIZ(sbLIZ);
        C2382909Vj.LIZ(this.LL, 0, "error", null, 4);
        Activity activity = this.LLILLJJLI;
        if (activity != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(activity.getString(2131824894));
            c1389890mGx.LJFF(R.raw.icon_info_circle_fill);
            c1389890mGx.LJIIJJI();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1467205ok(C2185208hG c2185208hG, CompletionBlock completionBlock, Activity activity) {
        super(c2185208hG);
        this.LL = completionBlock;
        this.LLILLJJLI = activity;
    }
}
