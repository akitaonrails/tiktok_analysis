package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.unifiedauth.api.UnifiedAuthConfigApi;

/* JADX INFO: renamed from: X.0CQJ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CQJ {
    public static final /* synthetic */ C0CQJ LIZ = new C0CQJ();
    public static final UnifiedAuthConfigApi LIZIZ = (UnifiedAuthConfigApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(UnifiedAuthConfigApi.class);
}
