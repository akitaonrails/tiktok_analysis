package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0wvx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1799710wvx implements InterfaceC914930Zut<Unit> {
    public final /* synthetic */ C1799680wvu LIZ;
    public final /* synthetic */ CompletionBlock<InterfaceC1799720wvy> LIZIZ;

    @Override // X.InterfaceC914930Zut
    public final void onSuccess(Unit unit) {
        this.LIZ.getClass();
        this.LIZIZ.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1799720wvy.class, null), "");
    }

    public C1799710wvx(C1799680wvu c1799680wvu, CompletionBlock<InterfaceC1799720wvy> completionBlock) {
        this.LIZ = c1799680wvu;
        this.LIZIZ = completionBlock;
    }

    @Override // X.InterfaceC914930Zut
    public final void LIZ(int i, String str, Throwable th) {
        C2382909Vj.LIZ(this.LIZIZ, i, str, null, 4);
    }
}
