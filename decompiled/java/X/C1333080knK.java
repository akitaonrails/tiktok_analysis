package X;

import com.fackbook.imagepipeline.IImagePipelineOutService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0knK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1333080knK extends C09AY implements Function0<C1329060kgq> {
    public C1333080knK() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1329060kgq invoke() {
        IImagePipelineOutService iImagePipelineOutService = (IImagePipelineOutService) ServiceManager.get().getService(IImagePipelineOutService.class);
        if (iImagePipelineOutService != null) {
            return iImagePipelineOutService.LJJIJIIJI();
        }
        return null;
    }
}
