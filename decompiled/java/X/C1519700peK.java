package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sync.ISyncInitProvider;

/* JADX INFO: renamed from: X.0peK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519700peK {
    public static final ISyncInitProvider LIZ;

    static {
        ISyncInitProvider iSyncInitProvider = (ISyncInitProvider) PluggableExtentionKt.pluggableSpi$default(ISyncInitProvider.class, false, false, false, 14, null);
        if (iSyncInitProvider != null) {
            LIZ = iSyncInitProvider;
        } else {
            "no impl for ISyncInitProvider".toString();
            throw new IllegalStateException("no impl for ISyncInitProvider");
        }
    }
}
