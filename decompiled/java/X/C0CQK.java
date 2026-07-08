package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.unifiedauth.api.UnifiedAuthEdmApi;

/* JADX INFO: renamed from: X.0CQK, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CQK {
    public static final /* synthetic */ C0CQK LIZ = new C0CQK();
    public static final UnifiedAuthEdmApi LIZIZ = (UnifiedAuthEdmApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(UnifiedAuthEdmApi.class);
}
