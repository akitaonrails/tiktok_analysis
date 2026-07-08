package X;

import com.fackbook.imagepipeline.IImagePipelineOutService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0knN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1333110knN extends C09AY implements Function0<C1328130kfL> {
    public C1333110knN() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1328130kfL invoke() {
        IImagePipelineOutService iImagePipelineOutService = (IImagePipelineOutService) ServiceManager.get().getService(IImagePipelineOutService.class);
        if (iImagePipelineOutService != null) {
            return iImagePipelineOutService.LJJIII();
        }
        return null;
    }
}
