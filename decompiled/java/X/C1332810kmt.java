package X;

import com.fackbook.imagepipeline.IImagePipelineOutService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kmt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1332810kmt extends C09AY implements Function0<Integer> {
    public C1332810kmt() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        IImagePipelineOutService iImagePipelineOutService = (IImagePipelineOutService) ServiceManager.get().getService(IImagePipelineOutService.class);
        if (iImagePipelineOutService != null) {
            return iImagePipelineOutService.LJIIIIZZ();
        }
        return null;
    }
}
