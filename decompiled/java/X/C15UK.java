package X;

import com.ss.android.ugc.aweme.explore.data.ExploreStage;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.15UK, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15UK {
    public static long LIZIZ;
    public static int LIZLLL;
    public static boolean LJ;
    public static final C15UK LIZ = new C15UK();
    public static String LIZJ = "refresh";
    public static final Map<String, String> LJFF = new LinkedHashMap();

    public static void LIZ(boolean z) {
        if (LIZIZ == 0) {
            return;
        }
        boolean z2 = LJ;
        String str = LIZJ;
        long jCurrentTimeMillis = System.currentTimeMillis() - LIZIZ;
        int i = LIZLLL;
        Map<String, String> map = LJFF;
        C20532515Vz.LIZ(new C00HZ(z2, str, z, jCurrentTimeMillis, i, new LinkedHashMap(map)));
        LIZIZ = 0L;
        ((LinkedHashMap) map).clear();
    }

    public static void LIZIZ(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ExploreStage exploreStage = (ExploreStage) it2.next();
                linkedHashMap.put(exploreStage.type, exploreStage.duration);
            }
        }
        LJFF.putAll(linkedHashMap);
    }
}
