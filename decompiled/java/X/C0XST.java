package X;

import com.ss.android.ugc.aweme.effectplatform.EPRequestInterceptor;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy;
import com.ss.android.ugc.gamora.recorder.navi.service.NaviVideoCreationService;
import java.util.Collections;

/* JADX INFO: renamed from: X.0XST, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XST {
    public static final /* synthetic */ C0XST LIZ = new C0XST();

    public static NaviVideoCreationService LIZ() {
        return (NaviVideoCreationService) ((IFoundationAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getNetworkService().createRetrofitWithInterceptors(C0CHQ.LIZ().getNetworkService().getApiHost(), true, NaviVideoCreationService.class, Collections.singletonList(new EPRequestInterceptor()));
    }
}
