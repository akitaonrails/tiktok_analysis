package X;

import com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cdB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1019270cdB {
    public static String LIZ;
    public static String LIZIZ;
    public static String LIZLLL;
    public static Long LJ;
    public static boolean LJFF;
    public static final Map<String, Integer> LIZJ = new LinkedHashMap();
    public static final Set<String> LJI = Collections.synchronizedSet(new LinkedHashSet());

    public static void LIZJ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZLLL);
        sbLIZ.append(jCurrentTimeMillis);
        LIZ = C2188811AlT.LIZIZ(sbLIZ);
        LIZIZ = UUID.randomUUID().toString();
        ((LinkedHashMap) LIZJ).clear();
        LJI.clear();
        LJFF = true;
        AdSessionPositionHelper.LIZ.getClass();
        AdSessionPositionHelper.LJIIL(jCurrentTimeMillis);
        C1019400cdO.LJI();
    }

    public static Integer LIZ(String str) {
        Map<String, Integer> map = LIZJ;
        Integer num = (Integer) ((LinkedHashMap) map).get(str);
        if (num != null) {
            map.put(str, Integer.valueOf(num.intValue() + 1));
            return (Integer) ((LinkedHashMap) map).get(str);
        }
        map.put(str, 1);
        return (Integer) ((LinkedHashMap) map).get(str);
    }

    public static String LIZIZ(String str) {
        if (!Intrinsics.LJFF(LIZLLL, str)) {
            LIZLLL = str;
            LIZJ();
        }
        return LIZ;
    }
}
