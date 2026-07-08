package X;

import com.ss.android.ugc.aweme.effectplatform.EPRequestInterceptor;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service.TemplateEffectsService;
import java.util.Collections;

/* JADX INFO: renamed from: X.0XSZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XSZ {
    public static final /* synthetic */ C0XSZ LIZ = new C0XSZ();

    public static TemplateEffectsService LIZ() {
        return (TemplateEffectsService) ((IFoundationAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getNetworkService().createRetrofitWithInterceptors(C0CHQ.LIZ().getNetworkService().getApiHost(), true, TemplateEffectsService.class, Collections.singletonList(new EPRequestInterceptor()));
    }
}
