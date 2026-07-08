package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.feed.api.FeedCacheForLoadMoreApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NHr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C591450NHr extends C09AY implements Function0<FeedCacheForLoadMoreApi.FeedCacheForLoadMoreService> {
    public C591450NHr() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.feed.api.FeedCacheForLoadMoreApi$FeedCacheForLoadMoreService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final FeedCacheForLoadMoreApi.FeedCacheForLoadMoreService invoke() {
        return ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(FeedCacheForLoadMoreApi.FeedCacheForLoadMoreService.class);
    }
}
