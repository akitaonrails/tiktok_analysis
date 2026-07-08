package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.profile.business.effect.userlevel.IEffectUserBadgeNetApi;

/* JADX INFO: renamed from: X.0Z65, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z65 {
    public final IEffectUserBadgeNetApi LIZ = (IEffectUserBadgeNetApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(IEffectUserBadgeNetApi.class);
}
