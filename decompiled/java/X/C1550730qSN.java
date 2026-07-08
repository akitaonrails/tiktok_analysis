package X;

import com.bytedance.geckox.AppSettingsManager;
import com.bytedance.geckox.interceptors.zstd.compress.GeckoCompressConfig;
import com.bytedance.geckox.policy.meta.MetaDataItemNew;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qSN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550730qSN {
    public static final String LIZIZ;
    public static final HashSet<String> LIZLLL;
    public static final C1550730qSN LIZ = new C1550730qSN();
    public static final ConcurrentHashMap<String, ConcurrentHashMap<String, C1550720qSM>> LIZJ = new ConcurrentHashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:36:0x0148  */
    static {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1550730qSN.<clinit>():void");
    }

    public static Keva LIZJ(String str) {
        Keva repo;
        String str2 = LIZIZ;
        if (str2 == null) {
            return null;
        }
        if (C1549140qPo.LIZ().enabled && C1549140qPo.LIZ().aks.contains(str)) {
            HashSet<String> hashSet = LIZLLL;
            if (!hashSet.contains(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Found new accessKey: ");
                sbLIZ.append(str);
                sbLIZ.append(" and add into config");
                C1553130qWF.LIZ("gecko-debug-tag-record", C2188811AlT.LIZIZ(sbLIZ));
                if (!hashSet.contains(str) && (repo = Keva.getRepo("gecko_channel_access_record-compressed_ak_repo")) != null) {
                    Set<String> stringSet = repo.getStringSet("compressed_aks", new LinkedHashSet());
                    if (stringSet == null) {
                        stringSet = new LinkedHashSet<>();
                    }
                    stringSet.add(str);
                    repo.storeStringSet("compressed_aks", stringSet);
                    hashSet.add(str);
                }
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("gecko_channel_access_record-");
        sbLIZ2.append(str2);
        sbLIZ2.append('-');
        sbLIZ2.append(str);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static String LJFF(C1550720qSM c1550720qSM) {
        Object c098200Yq;
        try {
            c098200Yq = C1551400qTS.LIZIZ.LIZ.LJIILL(c1550720qSM);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (String) c098200Yq;
    }

    public static void LIZ(String str, List list) {
        Keva repo;
        Keva kevaLIZJ = LIZJ(str);
        if (kevaLIZJ != null) {
            ConcurrentHashMap<String, C1550720qSM> concurrentHashMap = LIZJ.get(str);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                kevaLIZJ.erase(str2);
                if (concurrentHashMap != null) {
                    concurrentHashMap.remove(str2);
                }
            }
            AppSettingsManager appSettingsManager = C1957007lY.LIZ;
            if (appSettingsManager.LJ != null && !appSettingsManager.LJ.containsKey(str) && concurrentHashMap != null && concurrentHashMap.isEmpty()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("No more channels for ");
                sbLIZ.append(str);
                sbLIZ.append(". Removing from compressed list.");
                C1553130qWF.LIZLLL("gecko-debug-tag-record", C2188811AlT.LIZIZ(sbLIZ));
                if (LIZLLL.remove(str)) {
                    LIZ.getClass();
                    if (LIZIZ != null && (repo = Keva.getRepo("gecko_channel_access_record-compressed_ak_repo")) != null) {
                        Set<String> stringSet = repo.getStringSet("compressed_aks", new LinkedHashSet());
                        if (stringSet == null) {
                            stringSet = new LinkedHashSet<>();
                        }
                        if (stringSet.remove(str)) {
                            repo.storeStringSet("compressed_aks", stringSet);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("No recorded found for ");
        sbLIZ2.append(str);
        sbLIZ2.append('.');
        C1553130qWF.LIZLLL("gecko-debug-tag-record", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static C1550720qSM LIZIZ(String str, String str2) {
        ConcurrentHashMap<String, C1550720qSM> concurrentHashMap = LIZJ.get(str);
        if (concurrentHashMap != null) {
            return concurrentHashMap.get(str2);
        }
        return null;
    }

    public static boolean LIZLLL(String str, String str2) {
        C1550720qSM c1550720qSMLIZIZ = LIZIZ(str, str2);
        if (c1550720qSMLIZIZ != null) {
            return c1550720qSMLIZIZ.LIZIZ;
        }
        return false;
    }

    public static void LJ(long j, String str, String str2) {
        long jCurrentTimeMillis;
        ConcurrentHashMap<String, C1550720qSM> concurrentHashMapPutIfAbsent;
        Long lValueOf;
        GeckoCompressConfig geckoCompressConfigLIZ = C1549140qPo.LIZ();
        if (geckoCompressConfigLIZ.enabled && geckoCompressConfigLIZ.aks.contains(str) && !geckoCompressConfigLIZ.skip_channel_list.contains(str2)) {
            if (LIZIZ(str, str2) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("recordLocalChannelIfAbsent: entry already exists for ");
                sbLIZ.append(str);
                sbLIZ.append('/');
                sbLIZ.append(str2);
                sbLIZ.append(", skip.");
                C1553130qWF.LIZ("gecko-debug-tag-record", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            C1551940qUK c1551940qUK = C797990VSb.LIZ;
            c1551940qUK.LIZIZ();
            File rootDirectory = c1551940qUK.LIZLLL.getRootDirectory();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(File.separator);
            sbLIZ2.append(str2);
            C0VSJ c0vsj = new C0VSJ(rootDirectory, C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(j);
            sbLIZ3.append("--compress");
            if (new C0VSJ(new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ3)), "res.zst").exists()) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("recordLocalChannelIfAbsent: ");
                sbLIZ4.append(str);
                sbLIZ4.append('/');
                sbLIZ4.append(str2);
                sbLIZ4.append(" is compressed, skip cold-start backfill (zipMd5 unrecoverable).");
                C1553130qWF.LIZ("gecko-debug-tag-record", C2188811AlT.LIZIZ(sbLIZ4));
                return;
            }
            Keva kevaLIZJ = LIZJ(str);
            if (kevaLIZJ == null) {
                return;
            }
            C1551330qTL.LIZ.getClass();
            MetaDataItemNew metaDataItemNewLJFF = C1551330qTL.LJFF(str, str2);
            if (metaDataItemNewLJFF != null && (lValueOf = Long.valueOf(metaDataItemNewLJFF.getLastReadTimeStamp())) != null) {
                jCurrentTimeMillis = lValueOf.longValue();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            C1550720qSM c1550720qSM = new C1550720qSM(jCurrentTimeMillis, String.valueOf(j), 54);
            ConcurrentHashMap<String, ConcurrentHashMap<String, C1550720qSM>> concurrentHashMap = LIZJ;
            ConcurrentHashMap<String, C1550720qSM> concurrentHashMap2 = concurrentHashMap.get(str);
            if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(str, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
                concurrentHashMap2 = concurrentHashMapPutIfAbsent;
            }
            concurrentHashMap2.put(str2, c1550720qSM);
            String strLJFF = LJFF(c1550720qSM);
            if (strLJFF != null) {
                kevaLIZJ.storeString(str2, strLJFF);
            }
            C1553130qWF.LIZ("gecko-debug-tag-record", "recordLocalChannelIfAbsent: created cold-start entry for " + str + '/' + str2 + ", version=" + j + ", lastAccessTime=" + jCurrentTimeMillis + '.');
        }
    }

    @InterfaceC1294060jmO
    public static final void LJI(String str, String str2, Function1<? super C1550720qSM, Unit> function1) {
        long jCurrentTimeMillis;
        ConcurrentHashMap<String, C1550720qSM> concurrentHashMapPutIfAbsent;
        Long lValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('/');
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LIZ.getClass();
        Keva kevaLIZJ = LIZJ(str);
        if (kevaLIZJ == null) {
            return;
        }
        C1550720qSM c1550720qSMLIZIZ = LIZIZ(str, str2);
        GeckoCompressConfig geckoCompressConfigLIZ = C1549140qPo.LIZ();
        if (c1550720qSMLIZIZ == null) {
            if (geckoCompressConfigLIZ.enabled && geckoCompressConfigLIZ.aks.contains(str) && !geckoCompressConfigLIZ.skip_channel_list.contains(str2)) {
                C1551330qTL.LIZ.getClass();
                MetaDataItemNew metaDataItemNewLJFF = C1551330qTL.LJFF(str, str2);
                if (metaDataItemNewLJFF != null && (lValueOf = Long.valueOf(metaDataItemNewLJFF.getLastReadTimeStamp())) != null) {
                    jCurrentTimeMillis = lValueOf.longValue();
                } else {
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
                C1550720qSM c1550720qSM = new C1550720qSM(jCurrentTimeMillis, null, 62);
                ConcurrentHashMap<String, ConcurrentHashMap<String, C1550720qSM>> concurrentHashMap = LIZJ;
                ConcurrentHashMap<String, C1550720qSM> concurrentHashMap2 = concurrentHashMap.get(str);
                if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(str, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
                    concurrentHashMap2 = concurrentHashMapPutIfAbsent;
                }
                concurrentHashMap2.put(str2, c1550720qSM);
                String strLJFF = LJFF(c1550720qSM);
                if (strLJFF != null) {
                    kevaLIZJ.storeString(str2, strLJFF);
                }
                C1553130qWF.LIZ("gecko-debug-tag-record", "No existing record for " + strLIZIZ + ':' + str2 + ". Creating a new one with initialAccessTime=" + jCurrentTimeMillis + '.');
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("no need to record for ");
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(':');
            sbLIZ2.append(str2);
            sbLIZ2.append('.');
            C1553130qWF.LIZLLL("gecko-debug-tag-record", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        boolean z = c1550720qSMLIZIZ.LIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Record for ");
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(" before update: compressState=");
        sbLIZ3.append(z);
        sbLIZ3.append(" , accessTime=");
        sbLIZ3.append(c1550720qSMLIZIZ.LIZ);
        sbLIZ3.append(", version=");
        sbLIZ3.append(c1550720qSMLIZIZ.LIZLLL);
        C1553130qWF.LIZLLL("gecko-debug-tag-record", C2188811AlT.LIZIZ(sbLIZ3));
        function1.invoke(c1550720qSMLIZIZ);
        boolean z2 = c1550720qSMLIZIZ.LIZIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Record for ");
        sbLIZ4.append(strLIZIZ);
        sbLIZ4.append(" after update: compressState=");
        sbLIZ4.append(z2);
        sbLIZ4.append(", accessTime=");
        sbLIZ4.append(c1550720qSMLIZIZ.LIZ);
        sbLIZ4.append(", version=");
        sbLIZ4.append(c1550720qSMLIZIZ.LIZLLL);
        C1553130qWF.LIZLLL("gecko-debug-tag-record", C2188811AlT.LIZIZ(sbLIZ4));
        if (!geckoCompressConfigLIZ.enabled || !geckoCompressConfigLIZ.aks.contains(str) || geckoCompressConfigLIZ.skip_channel_list.contains(str2)) {
            if (!c1550720qSMLIZIZ.LIZIZ) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("Existing record for ");
                sbLIZ5.append(strLIZIZ);
                sbLIZ5.append(" is marked for deletion. And resource is in file state, deleting now.");
                C1553130qWF.LIZLLL("gecko-debug-tag-record", C2188811AlT.LIZIZ(sbLIZ5));
                LIZ(str, Collections.singletonList(str2));
                return;
            }
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("Existing record for ");
            sbLIZ6.append(strLIZIZ);
            sbLIZ6.append(" is marked for deletion. But resource is in compress state, deleting later.");
            C1553130qWF.LIZLLL("gecko-debug-tag-record", C2188811AlT.LIZIZ(sbLIZ6));
        }
        String strLJFF2 = LJFF(c1550720qSMLIZIZ);
        if (strLJFF2 == null) {
            return;
        }
        kevaLIZJ.storeString(str2, strLJFF2);
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("Successfully stored updated record for ");
        sbLIZ7.append(strLIZIZ);
        sbLIZ7.append('.');
        C1553130qWF.LIZ("gecko-debug-tag-record", C2188811AlT.LIZIZ(sbLIZ7));
    }
}
