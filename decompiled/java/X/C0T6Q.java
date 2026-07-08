package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: renamed from: X.0T6Q, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T6Q {
    public static Map LIZ(Context context) {
        SharedPreferences sharedPreferencesLIZJ = LIZJ(context, "CLIENT_EXPERIMENT_CACHE_TAG");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, ?> entry : sharedPreferencesLIZJ.getAll().entrySet()) {
            if (entry.getValue() instanceof Integer) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    public static Map<String, String> LIZIZ(Context context, String str) {
        SharedPreferences sharedPreferencesLIZJ = LIZJ(context, str);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, ?> entry : sharedPreferencesLIZJ.getAll().entrySet()) {
            if (entry.getValue() instanceof String) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    public static SharedPreferences LIZJ(Context context, String str) {
        try {
            return C810670Vr7.LIZJ(context, 0, str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (Build.VERSION.SDK_INT >= 24) {
                return C810670Vr7.LIZJ(context.createDeviceProtectedStorageContext(), 0, str);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("abtest SharedPreferences :");
            sbLIZ.append(str);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static Set LIZLLL(Context context, String str) {
        return new ConcurrentSkipListSet(LIZJ(context, "SP_EXPERIMENT_CACHE").getStringSet(str, new ConcurrentSkipListSet()));
    }
}
