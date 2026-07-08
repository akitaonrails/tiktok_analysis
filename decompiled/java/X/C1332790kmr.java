package X;

import com.fackbook.imagepipeline.IImagePipelineOutService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kmr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1332790kmr extends C09AY implements Function0<InterfaceC1320070kSL<C1329770khz>> {
    public C1332790kmr() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1320070kSL<C1329770khz> invoke() {
        IImagePipelineOutService iImagePipelineOutService = (IImagePipelineOutService) ServiceManager.get().getService(IImagePipelineOutService.class);
        if (iImagePipelineOutService != null) {
            return iImagePipelineOutService.LJJJI();
        }
        return null;
    }
}
