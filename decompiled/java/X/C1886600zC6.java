package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;

/* JADX INFO: renamed from: X.0zC6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1886600zC6 implements InterfaceC20433214xO {
    public final /* synthetic */ CompletionBlock<InterfaceC1886610zC7> LIZ;

    public C1886600zC6(CompletionBlock<InterfaceC1886610zC7> completionBlock) {
        this.LIZ = completionBlock;
    }

    @Override // X.InterfaceC20433214xO
    public final void onSuccess(String str) {
        InterfaceC1886610zC7 interfaceC1886610zC7 = (InterfaceC1886610zC7) C1909107dp.LIZJ(InterfaceC1886610zC7.class, null);
        interfaceC1886610zC7.setCredentialAssertionData(str);
        this.LIZ.onSuccess(interfaceC1886610zC7, "");
    }

    @Override // X.InterfaceC20433214xO
    public final void onError(int i, String str) {
        C2382909Vj.LIZ(this.LIZ, i, str, null, 4);
    }
}
