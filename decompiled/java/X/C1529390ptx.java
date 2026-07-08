package X;

import android.content.Context;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.ISSPService;

/* JADX INFO: renamed from: X.0ptx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529390ptx extends C1529440pu2 implements ISSPService {
    public final InterfaceC1529430pu1 LIZIZ;

    public C1529390ptx(InterfaceC1529430pu1 interfaceC1529430pu1) {
        this.LIZIZ = interfaceC1529430pu1;
    }

    @Override // com.bytedance.lynx.hybrid.service.ISSPService
    public final C1536330q59 bootSSPLifecycle(Context context, C1537480q70 c1537480q70, HybridSchemaParam hybridSchemaParam) {
        InterfaceC1529430pu1 interfaceC1529430pu1 = this.LIZIZ;
        if (interfaceC1529430pu1 != null) {
            return interfaceC1529430pu1.LIZ(c1537480q70, hybridSchemaParam);
        }
        return null;
    }
}
