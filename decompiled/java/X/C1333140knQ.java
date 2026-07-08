package X;

import com.fackbook.imagepipeline.IImagePipelineOutService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0knQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1333140knQ extends C09AY implements Function0<InterfaceC1327160kdm> {
    public C1333140knQ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1327160kdm invoke() {
        IImagePipelineOutService iImagePipelineOutService = (IImagePipelineOutService) ServiceManager.get().getService(IImagePipelineOutService.class);
        if (iImagePipelineOutService == null) {
            return null;
        }
        iImagePipelineOutService.LJJJ();
        return null;
    }
}
