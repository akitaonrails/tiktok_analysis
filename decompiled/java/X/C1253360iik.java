package X;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1253360iik {
    public static final Map<String, Set<String>> LIZ = new LinkedHashMap();
    public static final Map<String, Boolean> LIZIZ = new LinkedHashMap();
    public static final Set<String> LIZJ = new LinkedHashSet();
    public static final Set<String> LIZLLL = new LinkedHashSet();
    public static boolean LJ;

    public static Set LIZ(String str) {
        Map<String, Set<String>> map = LIZ;
        Set set = (Set) ((LinkedHashMap) map).get(str);
        if (set == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            map.put(str, linkedHashSet);
            return linkedHashSet;
        }
        return set;
    }

    public static void LIZIZ(long j, boolean z) {
        long jCurrentTimeMillis;
        C1245340iVo.LIZ.getClass();
        long j2 = C1245340iVo.LJIIIIZZ;
        if (((int) j2) == 0) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("Profile_ProfileFirstScreenStatistics", "reportFirstScreenData enterTime is 0");
            return;
        }
        if (z) {
            jCurrentTimeMillis = System.currentTimeMillis() - j2;
        } else {
            jCurrentTimeMillis = j - j2;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportMyFirstScreenData costTime: ");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(", lastImageCostTime: ");
        sbLIZ.append(j);
        sbLIZ.append(", firstEnterMyPageTime: ");
        sbLIZ.append(j2);
        sbLIZ.append(", SystemCurrent: ");
        sbLIZ.append(System.currentTimeMillis());
        C1720106oR.LJI("Profile_ProfileFirstScreenStatistics", C2188811AlT.LIZIZ(sbLIZ));
        if (jCurrentTimeMillis <= 0) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (LJ) {
            linkedHashMap.put("has_load_image_failed", "true");
        }
        if (C818490W8x.LIZ()) {
            C0W93 c0w93 = C0W93.SUCCESS;
            C818470W8v c818470W8v = C818480W8w.LIZJ;
            if (c818470W8v != null) {
                C823050WQl.LIZIZ().execute(new RunnableC818500W8y(c818470W8v, "new_calibre_my_profile", c0w93, jCurrentTimeMillis, linkedHashMap));
            }
        }
        C1253130iiN.LJFF = false;
        LIZJ.clear();
        LIZLLL.clear();
        LJ = false;
    }

    public static void LIZJ(long j, String str, boolean z) {
        boolean z2;
        long j2;
        long jCurrentTimeMillis;
        long j3;
        String str2;
        if (str == null) {
            return;
        }
        if (str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("Profile_ProfileFirstScreenStatistics", "reportFirstScreenData userId is null");
            return;
        }
        ConcurrentHashMap<String, Boolean> concurrentHashMap = C1253130iiN.LIZJ;
        Boolean bool = concurrentHashMap.get(str);
        Boolean bool2 = Boolean.TRUE;
        boolean zLJFF = Intrinsics.LJFF(bool, bool2);
        ConcurrentHashMap<String, Boolean> concurrentHashMap2 = C1253130iiN.LIZLLL;
        boolean zLJFF2 = Intrinsics.LJFF(concurrentHashMap2.get(str), bool2);
        if (zLJFF) {
            C1245340iVo.LIZ.getClass();
            j2 = C1245340iVo.LJI;
        } else if (zLJFF2) {
            C1245340iVo.LIZ.getClass();
            j2 = C1245340iVo.LJII;
        } else {
            j2 = 0;
        }
        if (((int) j2) == 0) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZ("Profile_ProfileFirstScreenStatistics", "reportFirstScreenData enterTime is 0");
            return;
        }
        if (z) {
            jCurrentTimeMillis = System.currentTimeMillis() - j2;
        } else {
            if (zLJFF) {
                C1245340iVo.LIZ.getClass();
                j3 = C1245340iVo.LJI;
            } else if (zLJFF2) {
                C1245340iVo.LIZ.getClass();
                j3 = C1245340iVo.LJII;
            } else {
                jCurrentTimeMillis = 0;
            }
            jCurrentTimeMillis = j - j3;
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportFirstScreenData isFirstEnter: ");
        sbLIZ.append(zLJFF);
        sbLIZ.append(" noIsFrist: ");
        sbLIZ.append(zLJFF2);
        sbLIZ.append(" costTime: ");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(", lastImageCostTime: ");
        sbLIZ.append(j);
        sbLIZ.append(", firstEnterOtherPageTime: ");
        C1245340iVo.LIZ.getClass();
        sbLIZ.append(C1245340iVo.LJI);
        sbLIZ.append(",  notFirstEnterOtherPageTime: ");
        sbLIZ.append(C1245340iVo.LJII);
        sbLIZ.append("， SytemCurrent: ");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(", userId: ");
        sbLIZ.append(str);
        C1720106oR.LJI("Profile_ProfileFirstScreenStatistics", C2188811AlT.LIZIZ(sbLIZ));
        if (jCurrentTimeMillis <= 0) {
            return;
        }
        if (!zLJFF && zLJFF2) {
            str2 = "user_calibre_profile";
        } else {
            str2 = "new_user_calibre_profile";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Boolean> map = LIZIZ;
        if (Intrinsics.LJFF(((LinkedHashMap) map).get(str), bool2)) {
            linkedHashMap.put("has_load_image_failed", "true");
        }
        if (C818490W8x.LIZ()) {
            C0W93 c0w93 = C0W93.SUCCESS;
            C818470W8v c818470W8v = C818480W8w.LIZJ;
            if (c818470W8v != null) {
                C823050WQl.LIZIZ().execute(new RunnableC818500W8y(c818470W8v, str2, c0w93, jCurrentTimeMillis, linkedHashMap));
            }
        }
        if (zLJFF) {
            concurrentHashMap.remove(str);
        } else if (zLJFF2) {
            concurrentHashMap2.remove(str);
        }
        LIZ.remove(str);
        map.remove(str);
    }
}
