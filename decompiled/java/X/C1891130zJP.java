package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.creatorcenter.InspirationSettingApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0zJP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1891130zJP {
    public static final /* synthetic */ C1891130zJP LIZ = new C1891130zJP();

    public static InspirationSettingApi LIZ() {
        return (InspirationSettingApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(Api.LIZ).create(InspirationSettingApi.class);
    }
}
