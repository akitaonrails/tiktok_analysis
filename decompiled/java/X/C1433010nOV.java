package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.liveevent.LiveEventResponse;

/* JADX INFO: renamed from: X.0nOV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1433010nOV {
    public static final C1433010nOV LIZ = new C1433010nOV();
    public static final InterfaceC2661011f LIZIZ = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(Api.LIZ).build();

    public static LiveEventResponse LIZ(String str) {
        try {
            return ((InterfaceC1433020nOW) LIZIZ.create(InterfaceC1433020nOW.class)).LIZ(str, 6, 0, 100).get();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
