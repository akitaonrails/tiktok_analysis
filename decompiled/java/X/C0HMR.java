package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.external.ability.IAbilityService;
import com.ss.android.ugc.profile.business.ur.socialavatar.network.SocialAvatarCreationApi;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0HMR, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HMR {
    public static final C0HMR LIZ = new C0HMR();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(629));

    public static C0HEN LIZ() {
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ);
        c1499850p8JCreateBuilder.LIZ(((IAbilityService) LIZIZ.getValue()).effectService().getEpRequestInterceptor());
        return new C0HEN((SocialAvatarCreationApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(SocialAvatarCreationApi.class));
    }
}
