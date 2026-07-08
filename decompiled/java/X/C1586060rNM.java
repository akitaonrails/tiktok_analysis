package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.INetwork;
import com.ss.android.ugc.aweme.offline.mocktime.IMockTimeService;

/* JADX INFO: renamed from: X.0rNM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1586060rNM {
    public static final long LIZ() {
        IMockTimeService iMockTimeService = (IMockTimeService) PluggableExtentionKt.pluggableSpi$default(IMockTimeService.class, false, false, false, 14, null);
        if (iMockTimeService != null) {
            iMockTimeService.isOpen();
        }
        long jLIZIZ = C1586080rNO.LJII.LIZIZ();
        if (jLIZIZ != 0) {
            return jLIZIZ;
        }
        INetwork iNetwork = (INetwork) PluggableExtentionKt.pluggableSpi$default(INetwork.class, false, false, false, 14, null);
        return iNetwork != null ? iNetwork.LIZIZ() : System.currentTimeMillis();
    }
}
