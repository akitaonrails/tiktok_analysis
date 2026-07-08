package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0wvr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1799650wvr implements InterfaceC914930Zut<Unit> {
    public final /* synthetic */ C1799640wvq LIZ;
    public final /* synthetic */ CompletionBlock<InterfaceC1799660wvs> LIZIZ;

    @Override // X.InterfaceC914930Zut
    public final void onSuccess(Unit unit) {
        this.LIZ.getClass();
        this.LIZIZ.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1799660wvs.class, null), "");
    }

    public C1799650wvr(C1799640wvq c1799640wvq, CompletionBlock<InterfaceC1799660wvs> completionBlock) {
        this.LIZ = c1799640wvq;
        this.LIZIZ = completionBlock;
    }

    @Override // X.InterfaceC914930Zut
    public final void LIZ(int i, String str, Throwable th) {
        C2382909Vj.LIZ(this.LIZIZ, i, str, null, 4);
    }
}
