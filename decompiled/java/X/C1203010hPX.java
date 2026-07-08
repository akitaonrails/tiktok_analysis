package X;

import android.content.Intent;
import android.os.Bundle;
import android.util.LruCache;
import com.bytedance.ies.powerpreload.task.TaskTraceMetric;
import java.util.UUID;

/* JADX INFO: renamed from: X.0hPX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203010hPX {
    public static final TaskTraceMetric LIZ(Bundle bundle) {
        LruCache<String, TaskTraceMetric> lruCache = C1203000hPW.LIZ;
        String string = bundle.getString("PRELOAD_TRACE_INFO_LIFECYCLE_KEY");
        if (string != null) {
            return C1203000hPW.LIZ.get(string);
        }
        return null;
    }

    public static final void LIZIZ(Intent intent) {
        String strLIZ = C1203000hPW.LIZ(intent);
        if (strLIZ == null) {
            strLIZ = UUID.randomUUID().toString();
            intent.putExtra("PRELOAD_TRACE_INFO_LIFECYCLE_KEY", strLIZ);
        }
        LruCache<String, TaskTraceMetric> lruCache = C1203000hPW.LIZ;
        if (lruCache.get(strLIZ) == null) {
            lruCache.put(strLIZ, new TaskTraceMetric());
        }
    }
}
