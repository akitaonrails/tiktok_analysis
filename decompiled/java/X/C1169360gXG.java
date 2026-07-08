package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.api.response.PlaylistTimeGapInterceptor;

/* JADX INFO: renamed from: X.0gXG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1169360gXG {
    public static final /* synthetic */ C1169360gXG LIZ = new C1169360gXG();
    public static final MixFeedApi LIZIZ;

    static {
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C1ER1.LIZIZ.LJIILJJIL());
        c1499850p8JCreateBuilder.LIZ(new PlaylistTimeGapInterceptor());
        LIZIZ = (MixFeedApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(MixFeedApi.class);
    }

    public static MixFeedApi LIZ() {
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ);
        c1499850p8JCreateBuilder.LIZ(new PlaylistTimeGapInterceptor());
        return (MixFeedApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(MixFeedApi.class);
    }
}
