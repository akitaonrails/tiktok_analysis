package X;

import com.fackbook.imagepipeline.IImagePipelineOutService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kn1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1332890kn1 extends C09AY implements Function0<InterfaceC1330230kij> {
    public C1332890kn1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1330230kij invoke() {
        IImagePipelineOutService iImagePipelineOutService = (IImagePipelineOutService) ServiceManager.get().getService(IImagePipelineOutService.class);
        if (iImagePipelineOutService != null) {
            return iImagePipelineOutService.LJII();
        }
        return null;
    }
}
