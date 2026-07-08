package X;

import Y.ARunnableS123S0100000_23;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.geckox.AppSettingsManager;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.policy.meta.ChannelMetaDataItem;
import com.bytedance.geckox.policy.meta.MetaDataItemNew;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AwS37S0000100_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qTL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551330qTL {
    public static final C1551330qTL LIZ = new C1551330qTL();
    public static final Map<String, ConcurrentHashMap<String, MetaDataItemNew>> LIZIZ;
    public static final Map<String, UpdatePackage> LIZJ;
    public static final List<String> LIZLLL;
    public static final String[] LJ;
    public static final ReentrantLock LJFF;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("fake_value_for_expiredDataStorageOptimize", new MetaDataItemNew(0L, false));
        linkedHashMap.put("key", concurrentHashMap);
        LIZIZ = linkedHashMap;
        LIZJ = new ConcurrentHashMap();
        LIZLLL = new ArrayList();
        new AtomicBoolean(false);
        LJ = new String[]{"lv_1", "lv_2", "lv_3"};
        LJFF = new ReentrantLock();
    }

    public static Set LIZJ() {
        AppSettingsManager appSettingsManager = C1957007lY.LIZ;
        Map<String, String> map = appSettingsManager.LIZJ;
        Set<String> setKeySet = map != null ? map.keySet() : null;
        Map<String, List<String>> map2 = appSettingsManager.LJ;
        Set<String> setKeySet2 = map2 != null ? map2.keySet() : null;
        return (setKeySet == null || setKeySet.isEmpty()) ? setKeySet2 : (setKeySet2 == null || setKeySet2.isEmpty()) ? setKeySet : C15442062u.LJIIIZ(setKeySet2, setKeySet);
    }

    public static String LIZLLL(String str) {
        boolean z;
        ConcurrentHashMap concurrentHashMapLJII;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || (concurrentHashMapLJII = LJII(str)) == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : concurrentHashMapLJII.entrySet()) {
            String str2 = (String) entry.getKey();
            if (!((MetaDataItemNew) entry.getValue()).getAllowUpdate()) {
                sb.append(",");
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            sb.append(",");
        }
        return sb.toString();
    }

    public static int LJ(String str) {
        ConcurrentHashMap concurrentHashMapLJII;
        if (str == null || str.length() == 0 || (concurrentHashMapLJII = LJII(str)) == null) {
            return 0;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMapLJII.entrySet()) {
            if (!((MetaDataItemNew) entry.getValue()).getAllowUpdate()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.size();
    }

    public static SharedPreferences LJI(String str) {
        Context contextLJ = C797990VSb.LIZ.LJ();
        if (contextLJ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("gecko_expire_info_");
            sbLIZ.append(str);
            return C810670Vr7.LIZJ(contextLJ, 0, C2188811AlT.LIZIZ(sbLIZ));
        }
        return null;
    }

    public static ConcurrentHashMap LJII(String str) {
        boolean z;
        Object c098200Yq;
        Set<String> setKeySet;
        Set<String> setKeySet2;
        AppSettingsManager appSettingsManager = C1957007lY.LIZ;
        Map<String, String> map = appSettingsManager.LIZJ;
        Map<String, List<String>> map2 = appSettingsManager.LJ;
        boolean z2 = true;
        if (map != null && (setKeySet2 = map.keySet()) != null && setKeySet2.contains(str)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (map2 == null || (setKeySet = map2.keySet()) == null || !setKeySet.contains(str)) {
                z2 = false;
            }
            if (!z2) {
                return null;
            }
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        SharedPreferences sharedPreferencesLJI = LJI(str);
        if (sharedPreferencesLJI == null) {
            return null;
        }
        for (Map.Entry<String, ?> entry : sharedPreferencesLJI.getAll().entrySet()) {
            String key = entry.getKey();
            try {
                c098200Yq = (MetaDataItemNew) C1551400qTS.LIZIZ.LIZ.LJII((String) entry.getValue(), MetaDataItemNew.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            if (c098200Yq != null) {
                concurrentHashMap.put(key, c098200Yq);
            }
        }
        return concurrentHashMap;
    }

    public static MetaDataItemNew LJFF(String str, String str2) {
        String string;
        Object c098200Yq;
        SharedPreferences sharedPreferencesLJI = LJI(str);
        Object obj = null;
        if (sharedPreferencesLJI == null || (string = sharedPreferencesLJI.getString(str2, null)) == null) {
            return null;
        }
        try {
            c098200Yq = (MetaDataItemNew) C1551400qTS.LIZIZ.LIZ.LJII(string, MetaDataItemNew.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (MetaDataItemNew) obj;
    }

    public static boolean LJIIIIZZ(String str, String str2) {
        MetaDataItemNew metaDataItemNewLJFF;
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0 && (metaDataItemNewLJFF = LJFF(str, str2)) != null && !metaDataItemNewLJFF.getAllowUpdate()) {
            return true;
        }
        return false;
    }

    public static List LIZIZ(List list, boolean z, boolean z2) {
        boolean z3;
        String str;
        Map<String, List<String>> map = C1957007lY.LIZ.LJ;
        if (map != null && !map.isEmpty()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ListIterator listIterator = list.listIterator();
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasNext()) {
                UpdatePackage updatePackage = (UpdatePackage) listIterator.next();
                String accessKey = updatePackage.getAccessKey();
                String channel = updatePackage.getChannel();
                Map<String, List<String>> map2 = C1957007lY.LIZ.LJ;
                List<String> list2 = map2.get(accessKey);
                if (map2.keySet().contains(accessKey)) {
                    MetaDataItemNew metaDataItemNewLJFF = LJFF(accessKey, channel);
                    if (metaDataItemNewLJFF == null) {
                        LJIIJ(accessKey, channel, new MetaDataItemNew(jCurrentTimeMillis, true));
                        List<String> list3 = LIZLLL;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(accessKey);
                        sbLIZ.append('-');
                        sbLIZ.append(channel);
                        ((ArrayList) list3).add(C2188811AlT.LIZIZ(sbLIZ));
                    } else if (metaDataItemNewLJFF.getAllowUpdate()) {
                        List<String> list4 = LIZLLL;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(accessKey);
                        sbLIZ2.append('-');
                        sbLIZ2.append(channel);
                        ((ArrayList) list4).add(C2188811AlT.LIZIZ(sbLIZ2));
                    } else if (list2 == null || !list2.contains(channel)) {
                        if (z) {
                            C1551780qU4.LJII(4, 48, accessKey, channel);
                        }
                        arrayList.add(updatePackage);
                        Map<String, UpdatePackage> map3 = LIZJ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(accessKey);
                        sbLIZ3.append('-');
                        sbLIZ3.append(channel);
                        ((ConcurrentHashMap) map3).put(C2188811AlT.LIZIZ(sbLIZ3), updatePackage);
                        listIterator.remove();
                    }
                }
            }
            return arrayList;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        ListIterator listIterator2 = list.listIterator();
        while (listIterator2.hasNext()) {
            UpdatePackage updatePackage2 = (UpdatePackage) listIterator2.next();
            String accessKey2 = updatePackage2.getAccessKey();
            Map<String, String> map4 = C1957007lY.LIZ.LIZJ;
            if (map4 != null && (str = map4.get(accessKey2)) != null) {
                LIZ.getClass();
                ConcurrentHashMap concurrentHashMapLJII = LJII(accessKey2);
                if (concurrentHashMapLJII != null) {
                    String channel2 = updatePackage2.getChannel();
                    if (!Intrinsics.LJFF(str, updatePackage2.getGroupName()) && !z2) {
                        if (concurrentHashMapLJII.get(channel2) != null) {
                            if (C13LQ.LJIILLIIL(updatePackage2.getGroupName(), LJ) && !((MetaDataItemNew) concurrentHashMapLJII.get(channel2)).getAllowUpdate()) {
                                Map<String, UpdatePackage> map5 = LIZJ;
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append(accessKey2);
                                sbLIZ4.append('-');
                                sbLIZ4.append(channel2);
                                ((ConcurrentHashMap) map5).put(C2188811AlT.LIZIZ(sbLIZ4), updatePackage2);
                                listIterator2.remove();
                            } else {
                                List<String> list5 = LIZLLL;
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append(accessKey2);
                                sbLIZ5.append('-');
                                sbLIZ5.append(channel2);
                                if (!((ArrayList) list5).contains(C2188811AlT.LIZIZ(sbLIZ5))) {
                                    concurrentHashMapLJII.remove(channel2);
                                }
                            }
                        }
                    } else if (concurrentHashMapLJII.get(channel2) == null) {
                        concurrentHashMapLJII.put(channel2, new MetaDataItemNew(jCurrentTimeMillis2, true));
                        List<String> list6 = LIZLLL;
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append(accessKey2);
                        sbLIZ6.append('-');
                        sbLIZ6.append(channel2);
                        ((ArrayList) list6).add(C2188811AlT.LIZIZ(sbLIZ6));
                    } else {
                        MetaDataItemNew metaDataItemNew = (MetaDataItemNew) concurrentHashMapLJII.get(channel2);
                        if (metaDataItemNew != null && metaDataItemNew.getAllowUpdate()) {
                            List<String> list7 = LIZLLL;
                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                            sbLIZ7.append(accessKey2);
                            sbLIZ7.append('-');
                            sbLIZ7.append(channel2);
                            ((ArrayList) list7).add(C2188811AlT.LIZIZ(sbLIZ7));
                        } else {
                            if (z) {
                                C1551780qU4.LJII(4, 48, accessKey2, channel2);
                            }
                            Map<String, UpdatePackage> map6 = LIZJ;
                            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                            sbLIZ8.append(accessKey2);
                            sbLIZ8.append('-');
                            sbLIZ8.append(channel2);
                            ((ConcurrentHashMap) map6).put(C2188811AlT.LIZIZ(sbLIZ8), updatePackage2);
                            listIterator2.remove();
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void LJIIJ(String str, String str2, MetaDataItemNew metaDataItemNew) {
        Object c098200Yq;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        try {
            c098200Yq = C1551400qTS.LIZIZ.LIZ.LJIILL(metaDataItemNew);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str3 = (String) c098200Yq;
        if (str3 != null) {
            LIZ.getClass();
            SharedPreferences sharedPreferencesLJI = LJI(str);
            if (sharedPreferencesLJI != null && (editorEdit = sharedPreferencesLJI.edit()) != null && (editorPutString = editorEdit.putString(str2, str3)) != null) {
                editorPutString.apply();
            }
        }
    }

    public static long LIZ(C1551330qTL c1551330qTL, boolean z, long j, int i, int i2) {
        c1551330qTL.getClass();
        C1551190qT7 c1551190qT7 = new C1551190qT7(j, z, i, i2);
        ReentrantLock reentrantLock = LJFF;
        reentrantLock.lock();
        try {
            Object objInvoke = c1551190qT7.invoke();
            reentrantLock.unlock();
            return ((Number) objInvoke).longValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJFF.unlock();
            throw th;
        }
    }

    public static void LJIIIZ(final String str, final String str2, long j, final EnumC797980VSa enumC797980VSa, final boolean z, long j2, final boolean z2) {
        ChannelMetaDataItem channelMetaDataItemLIZ;
        Map<String, UpdatePackage> map = LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('-');
        sbLIZ.append(str2);
        UpdatePackage updatePackage = (UpdatePackage) ((ConcurrentHashMap) map).get(C2188811AlT.LIZIZ(sbLIZ));
        if (updatePackage != null) {
            C1551510qTd.LIZ.LIZ().execute(new ARunnableS123S0100000_23(updatePackage, 121));
        }
        MetaDataItemNew metaDataItemNewLJFF = LJFF(str, str2);
        if (metaDataItemNewLJFF == null) {
            C1551780qU4 c1551780qU4 = C1551780qU4.LIZ;
            final Long lValueOf = Long.valueOf(j);
            final boolean z3 = false;
            c1551780qU4.getClass();
            C1551500qTc.LIZIZ(new Runnable() { // from class: X.0qTR
                public final void LIZ() {
                    try {
                        C1551780qU4.LIZ.getClass();
                        InterfaceC1551450qTX interfaceC1551450qTXLIZJ = C1551780qU4.LIZJ();
                        if (interfaceC1551450qTXLIZJ == null) {
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        C1551780qU4.LIZ(jSONObject);
                        jSONObject.put("access_key", str);
                        jSONObject.put("channel", str2);
                        jSONObject.put("package_id", lValueOf);
                        jSONObject.put("access_type", enumC797980VSa.getNumber());
                        jSONObject.put("file_exist", z ? 1 : 0);
                        jSONObject.put("is_expire_cleaned", z3 ? 1 : 0);
                        jSONObject.put("is_from_decompress", z2 ? 1 : 0);
                        interfaceC1551450qTXLIZJ.LIZ("geckosdk_resource_access", jSONObject);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1553130qWF.LJ("gecko-debug-tag", "UploadStatistic.uploadResourceAccess", th);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("UploadStatistic@6c5e.uploadResourceAccess$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("UploadStatistic@6c5e.uploadResourceAccess$1");
                }
            });
        } else {
            C1551780qU4 c1551780qU42 = C1551780qU4.LIZ;
            final Long lValueOf2 = Long.valueOf(j);
            final boolean z4 = !metaDataItemNewLJFF.getAllowUpdate();
            c1551780qU42.getClass();
            C1551500qTc.LIZIZ(new Runnable() { // from class: X.0qTR
                public final void LIZ() {
                    try {
                        C1551780qU4.LIZ.getClass();
                        InterfaceC1551450qTX interfaceC1551450qTXLIZJ = C1551780qU4.LIZJ();
                        if (interfaceC1551450qTXLIZJ == null) {
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        C1551780qU4.LIZ(jSONObject);
                        jSONObject.put("access_key", str);
                        jSONObject.put("channel", str2);
                        jSONObject.put("package_id", lValueOf2);
                        jSONObject.put("access_type", enumC797980VSa.getNumber());
                        jSONObject.put("file_exist", z ? 1 : 0);
                        jSONObject.put("is_expire_cleaned", z4 ? 1 : 0);
                        jSONObject.put("is_from_decompress", z2 ? 1 : 0);
                        interfaceC1551450qTXLIZJ.LIZ("geckosdk_resource_access", jSONObject);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1553130qWF.LJ("gecko-debug-tag", "UploadStatistic.uploadResourceAccess", th);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("UploadStatistic@6c5e.uploadResourceAccess$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("UploadStatistic@6c5e.uploadResourceAccess$1");
                }
            });
            C1551330qTL c1551330qTL = LIZ;
            metaDataItemNewLJFF.setAllowUpdate(true);
            metaDataItemNewLJFF.setLastReadTimeStamp(j2);
            c1551330qTL.getClass();
            LJIIJ(str, str2, metaDataItemNewLJFF);
        }
        C1551350qTN c1551350qTN = C1551350qTN.LIZ;
        c1551350qTN.getClass();
        SharedPreferences sharedPreferencesLIZIZ = C1551350qTN.LIZIZ(str);
        if (sharedPreferencesLIZIZ != null) {
            c1551350qTN.getClass();
            String string = sharedPreferencesLIZIZ.getString(str2, null);
            if (string != null && (channelMetaDataItemLIZ = C1551350qTN.LIZ(string)) != null) {
                channelMetaDataItemLIZ.setLastAccessType(enumC797980VSa);
                channelMetaDataItemLIZ.setLastAccessTime(j2);
                if (C1697810uHb.LJIIJJI(EnumC797980VSa.GET_PATH, EnumC797980VSa.GET_INPUT_STREAM).contains(enumC797980VSa)) {
                    if (!channelMetaDataItemLIZ.isLoaded()) {
                        channelMetaDataItemLIZ.setLoaded(true);
                    }
                    channelMetaDataItemLIZ.setLastLoadTime(j2);
                }
                SharedPreferences sharedPreferencesLIZIZ2 = C1551350qTN.LIZIZ(str);
                if (sharedPreferencesLIZIZ2 != null) {
                    c1551350qTN.getClass();
                    C1551350qTN.LJI(sharedPreferencesLIZIZ2, str2, channelMetaDataItemLIZ);
                }
            }
        }
        C1550730qSN.LJI(str, str2, new AwS37S0000100_23(j2, 2));
    }
}
