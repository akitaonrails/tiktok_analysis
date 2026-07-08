package X;

import com.fackbook.imagepipeline.IImagePipelineOutService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1332800kms extends C09AY implements Function0<InterfaceC1320070kSL<Boolean>> {
    public C1332800kms() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1320070kSL<Boolean> invoke() {
        IImagePipelineOutService iImagePipelineOutService = (IImagePipelineOutService) ServiceManager.get().getService(IImagePipelineOutService.class);
        if (iImagePipelineOutService != null) {
            return iImagePipelineOutService.LJJIIZ();
        }
        return null;
    }
}
