package X;

import com.bytedance.android.livesdk.internal.Live;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.feedpage.LiveRoomInfoApi;

/* JADX INFO: renamed from: X.15ZK, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15ZK {
    public static final /* synthetic */ C15ZK LIZ = new C15ZK();

    public static LiveRoomInfoApi LIZ() {
        IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(Live.getLiveDomain());
        return (LiveRoomInfoApi) iRetrofitService.createNewRetrofit(C2188811AlT.LIZIZ(sbLIZ)).create(LiveRoomInfoApi.class);
    }
}
