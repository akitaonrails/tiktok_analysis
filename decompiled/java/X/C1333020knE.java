package X;

import android.graphics.Bitmap;
import com.fackbook.imagepipeline.IImagePipelineOutService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0knE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1333020knE extends C09AY implements Function0<Bitmap.Config> {
    public C1333020knE() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Bitmap.Config invoke() {
        IImagePipelineOutService iImagePipelineOutService = (IImagePipelineOutService) ServiceManager.get().getService(IImagePipelineOutService.class);
        if (iImagePipelineOutService != null) {
            return iImagePipelineOutService.LIZ();
        }
        return null;
    }
}
