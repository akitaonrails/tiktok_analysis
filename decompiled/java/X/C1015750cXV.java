package X;

import com.ss.android.ugc.aweme.settings.AnoleImagePreloadModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0cXV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1015750cXV {
    public static final Map<String, Integer> LIZ = new LinkedHashMap();
    public static final Map<String, Long> LIZIZ = new LinkedHashMap();
    public static final Map<String, Boolean> LIZJ = new LinkedHashMap();
    public static final Map<String, Integer> LIZLLL = new LinkedHashMap();

    public static void LIZIZ(int i, String str) {
        if (!C301090Br9.LIZ() || str == null) {
            return;
        }
        LIZ.put(str, Integer.valueOf(i));
    }

    public static void LIZ(long j, String str, boolean z) {
        int i;
        if ((!((AnoleImagePreloadModel) C1015490cX5.LIZIZ.getValue()).enable && !C301090Br9.LIZ()) || str == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnoleGeckoPreloader preload gecko result = ");
        sbLIZ.append(z);
        sbLIZ.append(",startLoadTime = ");
        sbLIZ.append(j);
        C2188811AlT.LIZIZ(sbLIZ);
        LIZIZ.put(str, Long.valueOf(System.currentTimeMillis()));
        Map<String, Integer> map = LIZ;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        map.put(str, Integer.valueOf(i));
    }
}
