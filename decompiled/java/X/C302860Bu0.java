package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Bu0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C302860Bu0 {
    public static final Map<Object, Boolean> LIZ = new ConcurrentHashMap();
    public static final Map<Object, Integer> LIZIZ = new ConcurrentHashMap();
    public static final Map<Object, Long> LIZJ = new ConcurrentHashMap();
    public static final Map<Object, Float> LIZLLL = new ConcurrentHashMap();
    public static final Map<Object, Double> LJ = new ConcurrentHashMap();
    public static final Map<Object, String> LJFF = new ConcurrentHashMap();
    public static final Map<Object, Object> LJI = new ConcurrentHashMap();
    public static final Object LJII = new Object();
    public static boolean LJIIIIZZ = false;

    public static <T> T LIZ(String str) {
        try {
            Map<String, Object> map = C2503009rQ.LIZ;
            if (((HashMap) map).containsKey(str)) {
                return (T) ((HashMap) map).get(str);
            }
            Map<String, Object> map2 = C2503009rQ.LIZIZ;
            if (((HashMap) map2).containsKey(str)) {
                return (T) ((HashMap) map2).get(str);
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static boolean LIZIZ(String str) {
        if (!C302880Bu2.LIZIZ) {
            C302880Bu2.LIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("performance_opt_great_reversal_2440", false);
            C302880Bu2.LIZIZ = true;
        }
        if (C302880Bu2.LIZ) {
            return ((HashMap) C2503009rQ.LIZ).containsKey(str);
        }
        if (!C302870Bu1.LIZ()) {
            return false;
        }
        return ((HashMap) C2503009rQ.LIZIZ).containsKey(str);
    }
}
