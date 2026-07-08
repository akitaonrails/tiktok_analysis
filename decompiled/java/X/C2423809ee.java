package X;

import android.content.Intent;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.09ee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2423809ee {
    public static final Set<String> LIZ = new LinkedHashSet();

    public static long LIZ(Intent intent) {
        if (intent != null) {
            long longExtra = intent.getLongExtra("ttrc_session_start_time", 0L);
            try {
                String stringExtra = intent.getStringExtra("ttrc_session_id");
                if (stringExtra != null) {
                    Set<String> set = LIZ;
                    if (!set.contains(stringExtra) && longExtra > 0) {
                        set.add(stringExtra);
                        return SystemClock.elapsedRealtime() - longExtra;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return 0L;
    }
}
