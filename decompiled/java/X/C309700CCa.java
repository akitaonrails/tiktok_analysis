package X;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0CCa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C309700CCa {
    public static final Keva LIZ = Keva.getRepo("memory_process_startup");

    public static final void LIZ() {
        if (Build.VERSION.SDK_INT >= 24) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + Process.getStartElapsedRealtime();
            Keva keva = LIZ;
            long j = keva.getLong("current", 0L);
            if (j > 0) {
                keva.storeLong("last", j);
            }
            keva.storeLong("current", jCurrentTimeMillis);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("current process start time stored:");
            sbLIZ.append(jCurrentTimeMillis);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
