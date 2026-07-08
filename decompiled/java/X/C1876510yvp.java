package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0yvp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1876510yvp implements InterfaceC1876240yvO<Object> {
    public final /* synthetic */ CompletionBlock<InterfaceC1876520yvq> LIZ;
    public final /* synthetic */ InterfaceC1876540yvs LIZIZ;
    public final /* synthetic */ C1876500yvo LIZJ;

    @Override // X.InterfaceC1876240yvO
    public final void onSuccess(Object obj) {
        this.LIZ.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1876520yvq.class, this.LIZIZ.getReactId()), "");
    }

    @Override // X.InterfaceC1876240yvO
    public final void onFail(int i, String str) {
        C2382909Vj.LIZ(this.LIZ, i, str, null, 4);
        C1876760ywE.LIZ(this.LIZJ, i, str);
    }

    public C1876510yvp(CompletionBlock<InterfaceC1876520yvq> completionBlock, InterfaceC1876540yvs interfaceC1876540yvs, C1876500yvo c1876500yvo) {
        this.LIZ = completionBlock;
        this.LIZIZ = interfaceC1876540yvs;
        this.LIZJ = c1876500yvo;
    }
}
