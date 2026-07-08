package X;

import com.fackbook.imagepipeline.IImagePipelineOutService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kmm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1332740kmm extends C09AY implements Function0<Set<? extends InterfaceC1325670kbN>> {
    public C1332740kmm() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<? extends InterfaceC1325670kbN> invoke() {
        IImagePipelineOutService iImagePipelineOutService = (IImagePipelineOutService) ServiceManager.get().getService(IImagePipelineOutService.class);
        if (iImagePipelineOutService != null) {
            return iImagePipelineOutService.LJJIJ();
        }
        return null;
    }
}
