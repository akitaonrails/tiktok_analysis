package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS106S1000000_22;

/* JADX INFO: renamed from: X.0mpq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411520mpq {
    public static final C1411520mpq LIZ = new C1411520mpq();
    public static final List<String> LIZIZ;
    public static final ConcurrentHashMap<String, Integer> LIZJ;
    public static final boolean LIZLLL;
    public static final C01GW LJ;

    static {
        List<String> listLJIIJJI = C1697810uHb.LJIIJJI("shoot", "enter_video_shoot_page", "click_music_entrance");
        LIZIZ = listLJIIJJI;
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        Iterator<String> it2 = listLJIIJJI.iterator();
        while (it2.hasNext()) {
            concurrentHashMap.put(it2.next(), 0);
        }
        LIZJ = concurrentHashMap;
        C0CHQ.LIZ().isDebugConfigOpen();
        LIZLLL = false;
        LJ = C452501pT.LIZIZ(new C1411540mps());
    }

    public static void LIZ(String str) {
        Integer num;
        if (str != null && ((Boolean) C0ATS.LIZ.getValue()).booleanValue() && C298260Bma.LIZ() && (num = LIZJ.get(str)) != null && num.intValue() == 0) {
            C0CNO.LIZLLL(0L, new AwS106S1000000_22(str, 0));
        }
    }

    public static void LIZIZ(String str, Map map) {
        if (!LIZLLL) {
            C20684815ws.LJIILLIIL(str, map);
            return;
        }
        ConcurrentHashMap<String, Integer> concurrentHashMap = LIZJ;
        Integer num = concurrentHashMap.get(str);
        if (num != null) {
            concurrentHashMap.put(str, Integer.valueOf(num.intValue() + 1));
        }
        C20684815ws.LJIILLIIL(str, map);
        if (concurrentHashMap.get(str) != null) {
            concurrentHashMap.put(str, Integer.valueOf(r0.intValue() - 1));
        }
    }
}
