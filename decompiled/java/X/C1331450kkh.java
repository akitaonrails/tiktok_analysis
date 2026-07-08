package X;

import com.fackbook.imagepipeline.IImagePipelineOutService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kkh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331450kkh extends C09AY implements Function0<InterfaceC1328710kgH<? extends C1328680kgE>> {
    public C1331450kkh() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1328710kgH<? extends C1328680kgE> invoke() {
        IImagePipelineOutService iImagePipelineOutService = (IImagePipelineOutService) ServiceManager.get().getService(IImagePipelineOutService.class);
        if (iImagePipelineOutService != null) {
            return iImagePipelineOutService.LJJIIZI();
        }
        return null;
    }
}
