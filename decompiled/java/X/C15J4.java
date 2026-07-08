package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.topic.trendingtopic.api.VideoTrendingTopicApi;

/* JADX INFO: renamed from: X.15J4, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15J4 {
    public static final /* synthetic */ C15J4 LIZ = new C15J4();

    public static VideoTrendingTopicApi LIZ() {
        return (VideoTrendingTopicApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(VideoTrendingTopicApi.class);
    }
}
