package X;

import Y.ARunnableS130S0100000_30;
import Y.ARunnableS4S1110000_18;
import Y.ARunnableS5S0001000_18;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.nearby.container.model.NearbyRevampResponse;
import com.ss.android.ugc.nearby.roaming.RoamingLocationInfo;
import com.ss.android.ugc.nearby.settings.NearbyDoubleColumnCacheOptExperiment;
import com.ss.android.ugc.nearby.settings.NearbyRegionCacheOptAB;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hR1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203930hR1 {
    public static final C1203930hR1 LIZ = new C1203930hR1();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(818));
    public static volatile NearbyRevampResponse LIZJ;
    public static volatile String LIZLLL;
    public static volatile boolean LJ;
    public static volatile boolean LJFF;

    public static NearbyRevampResponse LJ() {
        List<Aweme> list;
        List<Aweme> list2;
        List<Aweme> list3;
        if (LJIILLIIL()) {
            return LJII();
        }
        Object objLJJJLL = null;
        if (C0BXL.LIZ() && LIZJ != null) {
            NearbyRevampResponse nearbyRevampResponse = LIZJ;
            C1203880hQw.LIZ(nearbyRevampResponse != null ? nearbyRevampResponse.awemeList : null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Use prebuiltResponse isConsumed=");
            NearbyRevampResponse nearbyRevampResponse2 = LIZJ;
            sbLIZ.append(nearbyRevampResponse2 != null ? nearbyRevampResponse2.cacheHasBeenConsumed : null);
            sbLIZ.append(", Cache=");
            NearbyRevampResponse nearbyRevampResponse3 = LIZJ;
            if (nearbyRevampResponse3 != null && (list3 = nearbyRevampResponse3.awemeList) != null) {
                objLJJJLL = C13LP.LJJJLL(list3);
            }
            sbLIZ.append(objLJJJLL);
            C2188811AlT.LIZIZ(sbLIZ);
            return LIZJ;
        }
        try {
            if (!((Boolean) C0B94.LIZ.getValue()).booleanValue()) {
                LIZJ();
                return null;
            }
            String string = LJI().getString("key_cache_nearby_list_2column", "");
            if (string == null || string.length() == 0) {
                LIZJ();
                return null;
            }
            C1227904rF.LIZ.getClass();
            NearbyRevampResponse nearbyRevampResponse4 = (NearbyRevampResponse) C1227904rF.LIZIZ(string, NearbyRevampResponse.class);
            if (nearbyRevampResponse4 == null || (list = nearbyRevampResponse4.awemeList) == null || list.isEmpty()) {
                LIZJ();
                return null;
            }
            C1203880hQw.LIZ(nearbyRevampResponse4.awemeList);
            if (C0BXL.LIZ()) {
                LIZJ = nearbyRevampResponse4;
                NearbyRevampResponse nearbyRevampResponse5 = LIZJ;
                if (nearbyRevampResponse5 != null) {
                    nearbyRevampResponse5.cacheHasBeenConsumed = Boolean.valueOf(LJIIIZ());
                }
                NearbyRevampResponse nearbyRevampResponse6 = LIZJ;
                if (nearbyRevampResponse6 != null) {
                    nearbyRevampResponse6.cacheSaveTime = Long.valueOf(LJIIIIZZ());
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Miss Cache, write prebuiltResponse isConsumed=");
                NearbyRevampResponse nearbyRevampResponse7 = LIZJ;
                sbLIZ2.append(nearbyRevampResponse7 != null ? nearbyRevampResponse7.cacheHasBeenConsumed : null);
                sbLIZ2.append(", Cache=");
                NearbyRevampResponse nearbyRevampResponse8 = LIZJ;
                sbLIZ2.append((nearbyRevampResponse8 == null || (list2 = nearbyRevampResponse8.awemeList) == null) ? null : (Aweme) C13LP.LJJJLL(list2));
                C2188811AlT.LIZIZ(sbLIZ2);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Use old cache success, region=");
            sbLIZ3.append(LJI().getString("nearby_cache_last_region_2column", ""));
            sbLIZ3.append(", data=");
            sbLIZ3.append(nearbyRevampResponse4);
            C2188811AlT.LIZIZ(sbLIZ3);
            return nearbyRevampResponse4;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZJ();
            return null;
        }
    }

    public static String LJFF() {
        C1203730hQh.LIZ.getClass();
        RoamingLocationInfo roamingLocationInfoLIZ = C1203730hQh.LIZ();
        if (roamingLocationInfoLIZ != null) {
            return roamingLocationInfoLIZ.manualRegion;
        }
        return null;
    }

    public static Keva LJI() {
        return (Keva) LIZIZ.getValue();
    }

    public static boolean LJIILLIIL() {
        if (!((NearbyRegionCacheOptAB.NearbyRegionCacheOptConfig) NearbyRegionCacheOptAB.LIZIZ.getValue()).enableValue) {
            return false;
        }
        boolean zIsEmpty = LJIILJJIL().isEmpty();
        if (LJFF) {
            return true;
        }
        if (!zIsEmpty) {
            LJFF = true;
        }
        return !zIsEmpty;
    }

    public static void LIZJ() {
        LJI().storeString("nearby_cache_current_uid_2column", null);
        LJI().storeString("key_cache_nearby_list_2column", null);
        LJI().storeString("nearby_cache_last_region_2column", null);
        LJI().clear();
        if (C0BXL.LIZ()) {
            LIZJ = null;
            LIZLLL = null;
        }
        if (((NearbyRegionCacheOptAB.NearbyRegionCacheOptConfig) NearbyRegionCacheOptAB.LIZIZ.getValue()).enableValue) {
            LJFF = false;
        }
    }

    public static NearbyRevampResponse LJII() {
        List<Aweme> list;
        List<Aweme> list2;
        List<Aweme> list3;
        String strLJFF = LJFF();
        Object objLJJJLL = null;
        if (strLJFF == null) {
            return null;
        }
        String strLIZ = LIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), strLJFF);
        if (C0BXL.LIZ() && LIZJ != null && Intrinsics.LJFF(LIZLLL, strLIZ)) {
            NearbyRevampResponse nearbyRevampResponse = LIZJ;
            C1203880hQw.LIZ(nearbyRevampResponse != null ? nearbyRevampResponse.awemeList : null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Use prebuiltResponse isConsumed=");
            NearbyRevampResponse nearbyRevampResponse2 = LIZJ;
            sbLIZ.append(nearbyRevampResponse2 != null ? nearbyRevampResponse2.cacheHasBeenConsumed : null);
            sbLIZ.append(", Cache=");
            NearbyRevampResponse nearbyRevampResponse3 = LIZJ;
            if (nearbyRevampResponse3 != null && (list3 = nearbyRevampResponse3.awemeList) != null) {
                objLJJJLL = C13LP.LJJJLL(list3);
            }
            sbLIZ.append(objLJJJLL);
            C2188811AlT.LIZIZ(sbLIZ);
            return LIZJ;
        }
        try {
            Keva kevaLJI = LJI();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZ);
            sbLIZ2.append("_list");
            String string = kevaLJI.getString(C2188811AlT.LIZIZ(sbLIZ2), "");
            if (string == null || string.length() == 0) {
                return null;
            }
            C1227904rF.LIZ.getClass();
            NearbyRevampResponse nearbyRevampResponse4 = (NearbyRevampResponse) C1227904rF.LIZIZ(string, NearbyRevampResponse.class);
            if (nearbyRevampResponse4 == null || (list = nearbyRevampResponse4.awemeList) == null || list.isEmpty()) {
                return null;
            }
            List listLJIILJJIL = LJIILJJIL();
            listLJIILJJIL.remove(strLIZ);
            listLJIILJJIL.add(strLIZ);
            LJIILL(listLJIILJJIL);
            C1203880hQw.LIZ(nearbyRevampResponse4.awemeList);
            if (C0BXL.LIZ()) {
                LIZJ = nearbyRevampResponse4;
                LIZLLL = strLIZ;
                NearbyRevampResponse nearbyRevampResponse5 = LIZJ;
                if (nearbyRevampResponse5 != null) {
                    nearbyRevampResponse5.cacheHasBeenConsumed = Boolean.valueOf(LJIIIZ());
                }
                NearbyRevampResponse nearbyRevampResponse6 = LIZJ;
                if (nearbyRevampResponse6 != null) {
                    nearbyRevampResponse6.cacheSaveTime = Long.valueOf(LJIIIIZZ());
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Miss Cache, write prebuiltResponse isConsumed=");
                NearbyRevampResponse nearbyRevampResponse7 = LIZJ;
                sbLIZ3.append(nearbyRevampResponse7 != null ? nearbyRevampResponse7.cacheHasBeenConsumed : null);
                sbLIZ3.append(", Cache=");
                NearbyRevampResponse nearbyRevampResponse8 = LIZJ;
                sbLIZ3.append((nearbyRevampResponse8 == null || (list2 = nearbyRevampResponse8.awemeList) == null) ? null : (Aweme) C13LP.LJJJLL(list2));
                C2188811AlT.LIZIZ(sbLIZ3);
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Use LRU cached feed list key=");
            sbLIZ4.append(strLIZ);
            sbLIZ4.append(", consumed=");
            sbLIZ4.append(nearbyRevampResponse4.cacheHasBeenConsumed);
            sbLIZ4.append(", total cache num=");
            sbLIZ4.append(listLJIILJJIL.size());
            sbLIZ4.append(", data=");
            sbLIZ4.append(nearbyRevampResponse4);
            C2188811AlT.LIZIZ(sbLIZ4);
            int size = listLJIILJJIL.size();
            if (LJ) {
                return nearbyRevampResponse4;
            }
            LJ = true;
            C823050WQl.LIZLLL().execute(new ARunnableS5S0001000_18(size, 1));
            return nearbyRevampResponse4;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZLLL(strLIZ);
            return null;
        }
    }

    public static long LJIIIIZZ() {
        if (!LJIILLIIL()) {
            return LJI().getLong("nearby_cache_save_timestamp", 0L);
        }
        String strLJFF = LJFF();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (strLJFF == null) {
            strLJFF = "";
        }
        String strLIZ = LIZ(curUserId, strLJFF);
        Keva kevaLJI = LJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZ);
        sbLIZ.append("_save_timestamp");
        return kevaLJI.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
    }

    public static boolean LJIIIZ() {
        return LJIILLIIL() ? LJIIJ() : LJI().getBoolean("nearby_cache_has_been_consumed", true);
    }

    public static boolean LJIIJ() {
        String strLJFF = LJFF();
        if (strLJFF == null) {
            return false;
        }
        String strLIZ = LIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), strLJFF);
        Keva kevaLJI = LJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZ);
        sbLIZ.append("_has_been_consumed");
        return kevaLJI.getBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    public static boolean LJIIJJI() {
        String strLJFF = LJFF();
        if (strLJFF == null) {
            return false;
        }
        String strLIZ = LIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), strLJFF);
        Keva kevaLJI = LJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZ);
        sbLIZ.append("_save_timestamp");
        long j = kevaLJI.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
        if (j == 0) {
            return false;
        }
        return System.currentTimeMillis() - j <= ((NearbyDoubleColumnCacheOptExperiment.NearbyFirstLoadByCache) NearbyDoubleColumnCacheOptExperiment.LIZIZ.getValue()).validSeconds * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public static boolean LJIIL() {
        if (!LJIILLIIL()) {
            long j = LJI().getLong("nearby_cache_save_timestamp", 0L);
            boolean z = LJI().getBoolean("nearby_cache_has_been_consumed", true);
            C01GW c01gw = NearbyDoubleColumnCacheOptExperiment.LIZIZ;
            long j2 = ((NearbyDoubleColumnCacheOptExperiment.NearbyFirstLoadByCache) c01gw.getValue()).validSeconds;
            long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
            long j4 = j2 * j3;
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("result=");
            sbLIZ.append(jCurrentTimeMillis <= j4 + j && !z);
            sbLIZ.append(",cacheSaveTime=");
            sbLIZ.append(j);
            sbLIZ.append(", cacheHasBeenConsumed=");
            sbLIZ.append(z);
            sbLIZ.append(", cacheValidTime=");
            sbLIZ.append(j4);
            sbLIZ.append(", currentTime=");
            sbLIZ.append(jCurrentTimeMillis);
            C2188811AlT.LIZIZ(sbLIZ);
            if (!LJIILLIIL()) {
                if (System.currentTimeMillis() > (((NearbyDoubleColumnCacheOptExperiment.NearbyFirstLoadByCache) c01gw.getValue()).validSeconds * j3) + LJI().getLong("nearby_cache_save_timestamp", 0L)) {
                    return false;
                }
            } else if (!LJIIJJI()) {
                return false;
            }
            return !LJIIIZ();
        }
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        String strLJFF = LJFF();
        if (strLJFF == null) {
            return false;
        }
        String strLIZ = LIZ(curUserId, strLJFF);
        Keva kevaLJI = LJI();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZ);
        sbLIZ2.append("_save_timestamp");
        long j5 = kevaLJI.getLong(C2188811AlT.LIZIZ(sbLIZ2), 0L);
        Keva kevaLJI2 = LJI();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZ);
        sbLIZ3.append("_has_been_consumed");
        boolean z2 = kevaLJI2.getBoolean(C2188811AlT.LIZIZ(sbLIZ3), true);
        long j6 = ((NearbyDoubleColumnCacheOptExperiment.NearbyFirstLoadByCache) NearbyDoubleColumnCacheOptExperiment.LIZIZ.getValue()).validSeconds * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("V1 result=");
        sbLIZ4.append(jCurrentTimeMillis2 <= j6 + j5 && !z2);
        sbLIZ4.append(",key=");
        sbLIZ4.append(strLIZ);
        sbLIZ4.append(", cacheSaveTime=");
        sbLIZ4.append(j5);
        sbLIZ4.append(", cacheHasBeenConsumed=");
        sbLIZ4.append(z2);
        sbLIZ4.append(", cacheValidTime=");
        sbLIZ4.append(j6);
        sbLIZ4.append(", currentTime=");
        sbLIZ4.append(jCurrentTimeMillis2);
        C2188811AlT.LIZIZ(sbLIZ4);
        return LJIIJJI() && !LJIIJ();
    }

    public static List LJIILJJIL() {
        String[] stringArray = LJI().getStringArray("nearby_region_cache_order", null);
        return stringArray != null ? C13LQ.LJLI(stringArray) : new ArrayList();
    }

    public static void LIZLLL(String str) {
        Keva kevaLJI = LJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_list");
        kevaLJI.erase(C2188811AlT.LIZIZ(sbLIZ));
        Keva kevaLJI2 = LJI();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("_save_timestamp");
        kevaLJI2.erase(C2188811AlT.LIZIZ(sbLIZ2));
        Keva kevaLJI3 = LJI();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str);
        sbLIZ3.append("_has_been_consumed");
        kevaLJI3.erase(C2188811AlT.LIZIZ(sbLIZ3));
        List listLJIILJJIL = LJIILJJIL();
        if (listLJIILJJIL.remove(str)) {
            LJIILL(listLJIILJJIL);
        }
        if (listLJIILJJIL.isEmpty()) {
            LJFF = false;
        }
    }

    public static boolean LJIILIIL(String str) {
        if (LJIILLIIL()) {
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            if (curUserId == null) {
                return false;
            }
            List listLJIILJJIL = LJIILJJIL();
            if (str == null) {
                str = "";
            }
            return listLJIILJJIL.contains(LIZ(curUserId, str));
        }
        if (!Intrinsics.LJFF(LJI().getString("nearby_cache_current_uid_2column", ""), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) || !Intrinsics.LJFF(LJI().getString("nearby_cache_last_region_2column", ""), str)) {
            return false;
        }
        return true;
    }

    public static void LJIILL(List list) {
        LJI().storeStringArray("nearby_region_cache_order", (String[]) list.toArray(new String[0]));
    }

    public static String LIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("nearby_aweme_model_lru_cache_key_");
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZIZ(final NearbyRevampResponse nearbyRevampResponse, final String str, final boolean z) {
        List<Aweme> list;
        if (((NearbyRegionCacheOptAB.NearbyRegionCacheOptConfig) NearbyRegionCacheOptAB.LIZIZ.getValue()).enableValue) {
            if (str != null && (list = nearbyRevampResponse.awemeList) != null && !list.isEmpty()) {
                final String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                final String strLIZ = LIZ(curUserId, str);
                C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0hR2
                    public final void LIZ() {
                        List<Aweme> list2;
                        try {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            Aweme aweme = null;
                            NearbyRevampResponse nearbyRevampResponseLJ = NearbyRevampResponse.LJ(nearbyRevampResponse, null, Long.valueOf(jCurrentTimeMillis), Boolean.valueOf(z), 7999);
                            C1227904rF.LIZ.getClass();
                            String strLJI = C1227904rF.LJI(nearbyRevampResponseLJ);
                            C1203930hR1.LIZ.getClass();
                            Keva kevaLJI = C1203930hR1.LJI();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(strLIZ);
                            sbLIZ.append("_list");
                            kevaLJI.storeString(C2188811AlT.LIZIZ(sbLIZ), strLJI);
                            Keva kevaLJI2 = C1203930hR1.LJI();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(strLIZ);
                            sbLIZ2.append("_save_timestamp");
                            kevaLJI2.storeLong(C2188811AlT.LIZIZ(sbLIZ2), jCurrentTimeMillis);
                            Keva kevaLJI3 = C1203930hR1.LJI();
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(strLIZ);
                            sbLIZ3.append("_has_been_consumed");
                            kevaLJI3.storeBoolean(C2188811AlT.LIZIZ(sbLIZ3), z);
                            C20019113Un c20019113Un = C20019113Un.LIZ;
                            List<Aweme> list3 = nearbyRevampResponse.awemeList;
                            c20019113Un.getClass();
                            if (C20019113Un.LJI()) {
                                if (list3 != null) {
                                    list3.size();
                                }
                                C823050WQl.LJFF().execute(new ARunnableS130S0100000_30(list3, 56));
                            }
                            List listLJIILJJIL = C1203930hR1.LJIILJJIL();
                            listLJIILJJIL.remove(strLIZ);
                            listLJIILJJIL.add(strLIZ);
                            int i = ((NearbyRegionCacheOptAB.NearbyRegionCacheOptConfig) NearbyRegionCacheOptAB.LIZIZ.getValue()).cacheNum;
                            if (i > 0) {
                                while (listLJIILJJIL.size() > i) {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("LRU remove key=");
                                    sbLIZ4.append((String) listLJIILJJIL.get(0));
                                    C2188811AlT.LIZIZ(sbLIZ4);
                                    String str2 = (String) listLJIILJJIL.remove(0);
                                    C1203930hR1.LIZ.getClass();
                                    Keva kevaLJI4 = C1203930hR1.LJI();
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    sbLIZ5.append(str2);
                                    sbLIZ5.append("_list");
                                    kevaLJI4.erase(C2188811AlT.LIZIZ(sbLIZ5));
                                    Keva kevaLJI5 = C1203930hR1.LJI();
                                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                    sbLIZ6.append(str2);
                                    sbLIZ6.append("_save_timestamp");
                                    kevaLJI5.erase(C2188811AlT.LIZIZ(sbLIZ6));
                                    Keva kevaLJI6 = C1203930hR1.LJI();
                                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                    sbLIZ7.append(str2);
                                    sbLIZ7.append("_has_been_consumed");
                                    kevaLJI6.erase(C2188811AlT.LIZIZ(sbLIZ7));
                                }
                            }
                            C1203930hR1.LIZ.getClass();
                            C1203930hR1.LJIILL(listLJIILJJIL);
                            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                            sbLIZ8.append("cacheRegion success key=");
                            sbLIZ8.append(strLIZ);
                            sbLIZ8.append(", total cache num=");
                            sbLIZ8.append(listLJIILJJIL.size());
                            sbLIZ8.append(", isConsumed=");
                            sbLIZ8.append(z);
                            sbLIZ8.append(", data=");
                            sbLIZ8.append(nearbyRevampResponseLJ);
                            C2188811AlT.LIZIZ(sbLIZ8);
                            if (C0BXL.LIZ()) {
                                C1203930hR1.LIZJ = nearbyRevampResponse;
                                C1203930hR1.LIZLLL = strLIZ;
                                NearbyRevampResponse nearbyRevampResponse2 = C1203930hR1.LIZJ;
                                if (nearbyRevampResponse2 != null) {
                                    nearbyRevampResponse2.cacheSaveTime = Long.valueOf(C1203930hR1.LJIIIIZZ());
                                }
                                NearbyRevampResponse nearbyRevampResponse3 = C1203930hR1.LIZJ;
                                if (nearbyRevampResponse3 != null) {
                                    nearbyRevampResponse3.cacheHasBeenConsumed = Boolean.valueOf(z);
                                }
                                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                sbLIZ9.append("Write new prebuiltResponse isConsumed=");
                                sbLIZ9.append(z);
                                sbLIZ9.append(", Cache=");
                                NearbyRevampResponse nearbyRevampResponse4 = C1203930hR1.LIZJ;
                                if (nearbyRevampResponse4 != null && (list2 = nearbyRevampResponse4.awemeList) != null) {
                                    aweme = (Aweme) C13LP.LJJJLL(list2);
                                }
                                sbLIZ9.append(aweme);
                                C2188811AlT.LIZIZ(sbLIZ9);
                            }
                            C1203930hR1.LJI().storeString("nearby_cache_last_region_2column", str);
                            C1203930hR1.LJI().storeString("nearby_cache_current_uid_2column", curUserId);
                            C1203930hR1.LJI().storeString("key_cache_nearby_list_2column", strLJI);
                            C1203930hR1.LJI().storeLong("nearby_cache_save_timestamp", jCurrentTimeMillis);
                            C1203930hR1.LJI().storeBoolean("nearby_cache_has_been_consumed", z);
                            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                            sbLIZ10.append("Write old cache success city=");
                            sbLIZ10.append(str);
                            C2188811AlT.LIZIZ(sbLIZ10);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C1203930hR1 c1203930hR1 = C1203930hR1.LIZ;
                            String str3 = strLIZ;
                            c1203930hR1.getClass();
                            C1203930hR1.LIZLLL(str3);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("NearbyDoubleColumnFeedCacheManager@6e26.cacheRegionFeedList$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("NearbyDoubleColumnFeedCacheManager@6e26.cacheRegionFeedList$1");
                    }
                });
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cacheFeedList feedList=");
        sbLIZ.append(nearbyRevampResponse);
        C2188811AlT.LIZIZ(sbLIZ);
        List<Aweme> list2 = nearbyRevampResponse.awemeList;
        if (list2 == null || list2.isEmpty() || !((Boolean) C0B94.LIZ.getValue()).booleanValue()) {
            return;
        }
        C823050WQl.LIZLLL().execute(new ARunnableS4S1110000_18(nearbyRevampResponse, str, z, 2));
    }
}
