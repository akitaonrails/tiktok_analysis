package X;

import com.ss.android.ugc.tiktok.tools.performance.api.storage.ToolsCustomCacheConfig;

/* JADX INFO: renamed from: X.13UI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13UI {
    public static final C20013713Sl LIZ(ToolsCustomCacheConfig toolsCustomCacheConfig) {
        long j = toolsCustomCacheConfig.expireDay;
        if (j <= 86400000) {
            j *= 86400000;
        }
        boolean z = toolsCustomCacheConfig.independentClean;
        boolean z2 = toolsCustomCacheConfig.useOldStrategy;
        long j2 = toolsCustomCacheConfig.maxSizeMB * 1048576;
        long j3 = 1048576 * toolsCustomCacheConfig.trimSizeMB;
        long j4 = toolsCustomCacheConfig.expireDayForLowStorage;
        if (j4 >= 0) {
            if (j4 <= 86400000) {
                j4 *= 86400000;
            }
        } else {
            j4 = j;
        }
        long j5 = toolsCustomCacheConfig.expireDayForELowStorage;
        if (j5 >= 0) {
            if (j5 <= 86400000) {
                j5 *= 86400000;
            }
        } else {
            j5 = j;
        }
        return new C20013713Sl(z, z2, j, j2, j3, j4, j5, toolsCustomCacheConfig.removeDeadFiles);
    }
}
