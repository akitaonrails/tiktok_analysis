package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.profile.business.effect.dashboard.ICreateCenterDashboardNetApi;

/* JADX INFO: renamed from: X.11Xo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19517411Xo {
    public final ICreateCenterDashboardNetApi LIZ = (ICreateCenterDashboardNetApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(ICreateCenterDashboardNetApi.class);
}
