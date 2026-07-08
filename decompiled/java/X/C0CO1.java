package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.INetwork;

/* JADX INFO: renamed from: X.0CO1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CO1 {
    public static final C0CO1 LIZ = new C0CO1();

    public static final INetwork LIZ() {
        try {
            INetwork iNetwork = (INetwork) ServiceManager.get().getService(INetwork.class);
            if (iNetwork != null) {
                return iNetwork;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        throw new IllegalStateException("SPI have not got the INetwork instance");
    }
}
