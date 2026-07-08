package X;

import com.bytedance.otis.protos.RunnableInfo;
import com.bytedance.otis.resource.cpu.OtisCPUTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: renamed from: X.1C7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225241C7m {
    public static volatile boolean LIZ;
    public static long LIZJ;
    public static OtisCPUTime LIZLLL;
    public static int LJFF;
    public static long LIZIZ = 1000;
    public static List<RunnableInfo> LJ = new ArrayList();
    public static final ConcurrentHashMap<String, C2225251C7n> LJI = new ConcurrentHashMap<>();
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(265));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(266));

    public static void LIZ(long j, String str) {
        ConcurrentHashMap<String, C2225251C7n> concurrentHashMap = LJI;
        C2225251C7n c2225251C7n = concurrentHashMap.get(str);
        if (c2225251C7n != null) {
            long j2 = c2225251C7n.LIZ;
            if (j > j2) {
                c2225251C7n.LIZIZ += j - j2;
            }
            c2225251C7n.LIZ = j;
            c2225251C7n.LIZLLL = C07KH.LIZLLL.invoke();
            c2225251C7n.LJFF = C07KH.LJFF.invoke();
            return;
        }
        concurrentHashMap.put(str, new C2225251C7n(0L, j, null, C07KH.LIZLLL.invoke(), null, C07KH.LJFF.invoke(), 42));
    }
}
