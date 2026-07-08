package X;

import android.content.Intent;
import android.os.Bundle;
import android.util.LruCache;
import com.bytedance.ies.powerpreload.task.TaskTraceMetric;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0hPW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203000hPW {
    public static final LruCache<String, TaskTraceMetric> LIZ = new LruCache<>(16);

    public static final String LIZ(Intent intent) {
        try {
            return intent.getStringExtra("PRELOAD_TRACE_INFO_LIFECYCLE_KEY");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final String LIZIZ(Bundle bundle) {
        return bundle.getString("PRELOAD_TRACE_INFO_LIFECYCLE_KEY");
    }
}
