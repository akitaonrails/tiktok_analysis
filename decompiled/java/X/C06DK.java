package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.06DK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06DK {
    public static final Map<String, Set<String>> LIZ = new LinkedHashMap();

    public static boolean LIZIZ(C06H2 c06h2, int i, String str) {
        Map<String, Set<String>> map = LIZ;
        synchronized (map) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c06h2.getValue());
                sbLIZ.append('_');
                sbLIZ.append(i);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                Set<String> linkedHashSet = (Set) ((LinkedHashMap) map).get(strLIZIZ);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet<>();
                    map.put(strLIZIZ, linkedHashSet);
                }
                if (linkedHashSet.contains(str)) {
                    return false;
                }
                linkedHashSet.add(str);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.util.Map r7, java.lang.String r8, com.ss.android.ugc.aweme.im.streak.api.StreakData r9, com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData r10) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06DK.LIZ(java.util.Map, java.lang.String, com.ss.android.ugc.aweme.im.streak.api.StreakData, com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData):void");
    }
}
