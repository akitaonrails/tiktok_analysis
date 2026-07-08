package X;

import com.ss.android.ugc.feed.platform.cell.interact.mob.ComponentSizeParams;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0Rs4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C709340Rs4 {
    public static final C01GW LIZ = C452501pT.LIZ(EnumC452301pR.PUBLICATION, new C0T5Q());
    public static final C199596137q LIZIZ;
    public static final C199596137q LIZJ;
    public static final Map<String, String> LIZLLL;
    public static final Map<String, Integer> LJ;
    public static final Map<String, Integer> LJFF;
    public static int LJI;
    public static int LJII;
    public static final C01GW LJIIIIZZ;

    static {
        C199593137n c199593137n = new C199593137n();
        c199593137n.LIZLLL(10L);
        LIZIZ = c199593137n.LIZ();
        C199593137n c199593137n2 = new C199593137n();
        c199593137n2.LIZLLL(10L);
        LIZJ = c199593137n2.LIZ();
        LIZLLL = new LinkedHashMap();
        LJ = new LinkedHashMap();
        LJFF = new LinkedHashMap();
        LJIIIIZZ = C452501pT.LIZIZ(new C709350Rs5());
    }

    public static Map LIZ(ConcurrentHashMap concurrentHashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            linkedHashMap.put(entry.getKey(), new ComponentSizeParams(((ComponentSizeParams) entry.getValue()).componentKey, ((ComponentSizeParams) entry.getValue()).width, ((ComponentSizeParams) entry.getValue()).height));
        }
        return linkedHashMap;
    }

    public static void LIZIZ(Runnable runnable) {
        ((ExecutorService) LIZ.getValue()).execute(runnable);
    }
}
