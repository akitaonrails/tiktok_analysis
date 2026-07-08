package X;

import com.fackbook.imagepipeline.IImagePipelineOutService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0knO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1333120knO extends C09AY implements Function0<AbstractC1301670jyf> {
    public C1333120knO() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final AbstractC1301670jyf invoke() {
        IImagePipelineOutService iImagePipelineOutService = (IImagePipelineOutService) ServiceManager.get().getService(IImagePipelineOutService.class);
        if (iImagePipelineOutService == null) {
            return null;
        }
        iImagePipelineOutService.LJIJJ();
        return null;
    }
}
