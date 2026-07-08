package X;

import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.feedpage.LiveStateApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0J85, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J85 extends C09AY implements Function0<LiveStateApi> {
    public C0J85() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.live.feedpage.LiveStateApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final LiveStateApi invoke() {
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(Live.getLiveDomain());
        return iRetrofitFactory.LIZ(C2188811AlT.LIZIZ(sbLIZ)).create(LiveStateApi.class);
    }
}
