package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.api.AuthListApi;

/* JADX INFO: renamed from: X.0v1S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1726240v1S {
    public static final /* synthetic */ C1726240v1S LIZ = new C1726240v1S();

    public static AuthListApi LIZ() {
        return (AuthListApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(AuthListApi.class);
    }
}
