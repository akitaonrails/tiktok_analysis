package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.social.sticker.repo.api.StoryPosterCelebrationApi;

/* JADX INFO: renamed from: X.0zCM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1886760zCM {
    public static final /* synthetic */ C1886760zCM LIZ = new C1886760zCM();
    public static final StoryPosterCelebrationApi LIZIZ;

    static {
        InterfaceC2661011f interfaceC2661011fLIZ;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        LIZIZ = (iRetrofitFactory == null || (interfaceC2661011fLIZ = iRetrofitFactory.LIZ(C0CQT.LIZJ)) == null) ? null : (StoryPosterCelebrationApi) interfaceC2661011fLIZ.create(StoryPosterCelebrationApi.class);
    }
}
