package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.INetwork;

/* JADX INFO: renamed from: X.18U8, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18U8 {
    public static final C18U8 LIZ = new C18U8();

    public static long LIZ() {
        INetwork iNetwork = (INetwork) PluggableExtentionKt.pluggableSpi$default(INetwork.class, false, false, false, 14, null);
        if (iNetwork != null) {
            long jLIZIZ = iNetwork.LIZIZ();
            if (jLIZIZ != 0) {
                return jLIZIZ;
            }
        }
        return System.currentTimeMillis();
    }
}
