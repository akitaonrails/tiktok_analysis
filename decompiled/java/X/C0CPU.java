package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.video.api.SubOnlyVideoApi;

/* JADX INFO: renamed from: X.0CPU, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CPU {
    public static final /* synthetic */ C0CPU LIZ = new C0CPU();
    public static final SubOnlyVideoApi LIZIZ;

    static {
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LLIIIJ());
        LIZIZ = (SubOnlyVideoApi) iRetrofitFactory.createBuilder(C2188811AlT.LIZIZ(sbLIZ)).build().retrofit.LIZ(SubOnlyVideoApi.class);
    }
}
