package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.di.push.PushServiceMock;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.awemepushapi.IPushApi;

/* JADX INFO: renamed from: X.0BuF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C303010BuF {
    public static IPushApi LIZ() {
        IPushApi iPushApi;
        try {
            iPushApi = (IPushApi) ServiceManager.get().getService(IPushApi.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return iPushApi == null ? new PushServiceMock() : iPushApi;
    }
}
