package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0yw0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1876620yw0 implements InterfaceC1876240yvO<InterfaceC1876660yw4> {
    public final /* synthetic */ CompletionBlock<InterfaceC1876660yw4> LIZ;
    public final /* synthetic */ InterfaceC1876650yw3 LIZIZ;
    public final /* synthetic */ C1876560yvu LIZJ;

    @Override // X.InterfaceC1876240yvO
    public final void onSuccess(InterfaceC1876660yw4 interfaceC1876660yw4) {
        InterfaceC1876660yw4 interfaceC1876660yw42 = interfaceC1876660yw4;
        CompletionBlock<InterfaceC1876660yw4> completionBlock = this.LIZ;
        if (interfaceC1876660yw42 == null) {
            interfaceC1876660yw42 = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC1876660yw4.class, this.LIZIZ.getReactId());
        }
        completionBlock.onSuccess(interfaceC1876660yw42, "");
    }

    @Override // X.InterfaceC1876240yvO
    public final void onFail(int i, String str) {
        C2382909Vj.LIZ(this.LIZ, i, str, null, 4);
        C1876760ywE.LIZ(this.LIZJ, i, str);
    }

    public C1876620yw0(CompletionBlock<InterfaceC1876660yw4> completionBlock, InterfaceC1876650yw3 interfaceC1876650yw3, C1876560yvu c1876560yvu) {
        this.LIZ = completionBlock;
        this.LIZIZ = interfaceC1876650yw3;
        this.LIZJ = c1876560yvu;
    }
}
