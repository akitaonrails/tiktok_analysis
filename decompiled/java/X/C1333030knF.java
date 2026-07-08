package X;

import com.fackbook.imagepipeline.IImagePipelineOutService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0knF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1333030knF extends C09AY implements Function0<InterfaceC1328030kfB> {
    public C1333030knF() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1328030kfB invoke() {
        IImagePipelineOutService iImagePipelineOutService = (IImagePipelineOutService) ServiceManager.get().getService(IImagePipelineOutService.class);
        if (iImagePipelineOutService != null) {
            return iImagePipelineOutService.LJIJI();
        }
        return null;
    }
}
