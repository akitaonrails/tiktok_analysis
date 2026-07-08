package X;

import com.fackbook.imagepipeline.IImagePipelineOutService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kn0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1332880kn0 extends C09AY implements Function0<InterfaceC1330460kj6> {
    public C1332880kn0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1330460kj6 invoke() {
        IImagePipelineOutService iImagePipelineOutService = (IImagePipelineOutService) ServiceManager.get().getService(IImagePipelineOutService.class);
        if (iImagePipelineOutService != null) {
            return iImagePipelineOutService.LJFF();
        }
        return null;
    }
}
