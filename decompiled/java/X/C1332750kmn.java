package X;

import com.fackbook.imagepipeline.IImagePipelineOutService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kmn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1332750kmn extends C09AY implements Function0<HashMap<String, C1329030kgn>> {
    public C1332750kmn() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final HashMap<String, C1329030kgn> invoke() {
        IImagePipelineOutService iImagePipelineOutService = (IImagePipelineOutService) ServiceManager.get().getService(IImagePipelineOutService.class);
        if (iImagePipelineOutService != null) {
            return iImagePipelineOutService.LJJIFFI();
        }
        return null;
    }
}
