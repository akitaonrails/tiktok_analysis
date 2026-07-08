package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.13Sc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20012813Sc {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Map map) {
        if (!LIZIZ(map)) {
            return false;
        }
        if (map != null) {
            C13E8 c13e8 = (C13E8) ((LinkedHashMap) map).get(EnumC20027813Xw.PROACTIVE_LOGIN_AFTER_SHARE);
            if (c13e8 != null) {
                if (c13e8.size() >= 3) {
                    return false;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (c13e8.size() < 1) {
                    return true;
                }
                if (((Number) c13e8.get(0)).longValue() + (((long) 1) * 86400000) >= jCurrentTimeMillis) {
                    return false;
                }
                if ((C306400Bzi.LIZ() == 3 || C306400Bzi.LIZ() == 4) && c13e8.size() >= 2 && ((Number) c13e8.get(1)).longValue() + (((long) 7) * 86400000) >= jCurrentTimeMillis) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean LIZIZ(Map map) {
        Collection collectionValues;
        List listLJLLL;
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("proactive_login_global_frequency_killswitch", true)) {
            return false;
        }
        if (map == null || (collectionValues = ((LinkedHashMap) map).values()) == null || (listLJLLL = C13LP.LJLLL(C15438062q.LJIJJLI(collectionValues))) == null || LIZJ(1, 3, listLJLLL)) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(int i, int i2, List list) {
        if (i2 == 0) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iMax = Math.max(i, 1);
        if (list.size() < 1) {
            return true;
        }
        if (((Number) ListProtector.get(list, 0)).longValue() + (((long) iMax) * 3600000) >= jCurrentTimeMillis) {
            return false;
        }
        int iMin = Math.min(Math.max(i2, 1), 3);
        if (list.size() >= iMin && ((Number) ListProtector.get(list, iMin - 1)).longValue() + (((long) 1) * 86400000) >= jCurrentTimeMillis) {
            return false;
        }
        return true;
    }
}
