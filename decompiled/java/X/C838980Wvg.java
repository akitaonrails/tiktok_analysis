package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wvg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838980Wvg {
    public static JSONObject LIZIZ;
    public static long LIZJ;
    public static JSONObject LIZLLL;
    public static ScheduledFuture<?> LJII;
    public static final ConcurrentHashMap<Integer, Integer> LIZ = new ConcurrentHashMap<>();
    public static final C839000Wvi LJ = new C839000Wvi();
    public static final C839000Wvi LJFF = new C839000Wvi();
    public static final C839000Wvi LJI = new C839000Wvi();

    public static void LIZ(long j) {
        C839000Wvi c839000Wvi = LJI;
        c839000Wvi.LIZ.addAndGet(j);
        c839000Wvi.LIZIZ.incrementAndGet();
    }

    public static void LIZIZ(long j) {
        C839000Wvi c839000Wvi = LJFF;
        c839000Wvi.LIZ.addAndGet(j);
        c839000Wvi.LIZIZ.incrementAndGet();
    }

    public static void LIZJ(long j) {
        C839000Wvi c839000Wvi = LJ;
        c839000Wvi.LIZ.addAndGet(j);
        c839000Wvi.LIZIZ.incrementAndGet();
    }
}
