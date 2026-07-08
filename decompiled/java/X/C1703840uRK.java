package X;

import com.ss.android.ugc.aweme.compliance.IContentClassificationDepService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.model.BaseResponse;

/* JADX INFO: renamed from: X.0uRK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1703840uRK implements InterfaceC1703830uRJ {
    public static final C1703840uRK LIZIZ = new C1703840uRK();
    public final /* synthetic */ InterfaceC1703830uRJ LIZ;

    @Override // X.InterfaceC1703830uRJ
    public final void LIZ(boolean z) {
        this.LIZ.LIZ(z);
    }

    @Override // X.InterfaceC1703830uRJ
    public final Object LIZIZ(boolean z, InterfaceC1364105Vn<? super C189200o6<? extends BaseResponse>> interfaceC1364105Vn) {
        Object objLIZIZ = this.LIZ.LIZIZ(z, interfaceC1364105Vn);
        C099R.LJFF();
        return objLIZIZ;
    }

    @Override // X.InterfaceC1703830uRJ
    public final boolean LIZJ() {
        return this.LIZ.LIZJ();
    }

    public C1703840uRK() {
        IContentClassificationDepService.LIZ.getClass();
        IContentClassificationDepService iContentClassificationDepService = (IContentClassificationDepService) PluggableExtentionKt.pluggableSpi$default(IContentClassificationDepService.class, false, false, false, 14, null);
        this.LIZ = (iContentClassificationDepService == null ? new IContentClassificationDepService() { // from class: X.0uRL
            @Override // com.ss.android.ugc.aweme.compliance.IContentClassificationDepService
            public final InterfaceC1703830uRJ LIZ() {
                return new InterfaceC1703830uRJ() { // from class: X.0uRM
                    @Override // X.InterfaceC1703830uRJ
                    public final void LIZ(boolean z) {
                    }

                    @Override // X.InterfaceC1703830uRJ
                    public final boolean LIZJ() {
                        return false;
                    }

                    @Override // X.InterfaceC1703830uRJ
                    public final Object LIZIZ(boolean z, InterfaceC1364105Vn<? super C189200o6<? extends BaseResponse>> interfaceC1364105Vn) {
                        C098200Yq c098200Yq = new C098200Yq(new Throwable("not implemented"));
                        C189200o6.m2constructorimpl(c098200Yq);
                        return c098200Yq;
                    }
                };
            }
        } : iContentClassificationDepService).LIZ();
    }
}
