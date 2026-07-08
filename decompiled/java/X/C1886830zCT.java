package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.partnership.api.GamePartnershipVideoApi;
import webcast.api.game_station.GameDetailVideosRequest;

/* JADX INFO: renamed from: X.0zCT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1886830zCT {
    public static final /* synthetic */ C1886830zCT LIZ = new C1886830zCT();
    public static final GamePartnershipVideoApi LIZIZ;

    static {
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LLIIIJ());
        LIZIZ = (GamePartnershipVideoApi) iRetrofitFactory.createBuilder(C2188811AlT.LIZIZ(sbLIZ)).build().retrofit.LIZ(GamePartnershipVideoApi.class);
    }

    public static C11O8 LIZ(GameDetailVideosRequest gameDetailVideosRequest) {
        return LIZIZ.requestAnchorGameDetailVideos(C500260Jjc.LL(C1516000pYM.LIZJ(gameDetailVideosRequest))).LJL(C11S5.LIZ()).LJJLIIIJJIZ(3L).LJJJLZIJ(C1701940uOG.LIZIZ());
    }
}
