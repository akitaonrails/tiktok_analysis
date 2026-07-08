package X;

import Y.ARunnableS11S2100000_23;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.bytedance.geckox.policy.meta.file.ChannelFileAccessRecord;
import com.bytedance.geckox.policy.meta.file.ChannelFileAggregateStatus;
import com.bytedance.geckox.policy.meta.file.ChannelFileRecordSettings;
import com.bytedance.geckox.policy.meta.file.FileMetaDataItem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0qTO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551360qTO {
    public static String LIZIZ;
    public static volatile String LIZJ;
    public static final Set<String> LIZLLL;
    public static final C1551360qTO LIZ = new C1551360qTO();
    public static final ConcurrentHashMap<String, ConcurrentHashMap<String, ChannelFileAccessRecord>> LJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Long> LJFF = new ConcurrentHashMap<>();
    public static final ConcurrentLinkedQueue<String> LJI = new ConcurrentLinkedQueue<>();
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(187));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(186));
    public static final ConcurrentHashMap.KeySetView<String, Boolean> LJIIIZ = ConcurrentHashMap.newKeySet();
    public static final RunnableC1529560puE LJIIJ = RunnableC1529560puE.LL;
    public static final Object LJIIJJI = new Object();
    public static final ConcurrentHashMap<String, AtomicInteger> LJIIL = new ConcurrentHashMap<>();

    static {
        Set<String> setLIZ;
        LIZLLL = new LinkedHashSet();
        C1551940qUK c1551940qUK = C797990VSb.LIZ;
        c1551940qUK.LIZIZ();
        LIZJ = c1551940qUK.LIZLLL.getRootDirectory().getAbsolutePath();
        c1551940qUK.LIZIZ();
        LIZIZ = c1551940qUK.LIZLLL.getRootDirectory().getName();
        Context contextLJ = c1551940qUK.LJ();
        if (contextLJ != null && (setLIZ = C1551440qTW.LIZ.LIZ(contextLJ, "gecko_file_kv_names")) != null) {
            LIZLLL = setLIZ;
        }
        while (true) {
            String strPoll = LJI.poll();
            if (strPoll == null) {
                return;
            } else {
                LJII(strPoll);
            }
        }
    }

    public static void LJIIIZ() {
        Set<String> setLIZ;
        SharedPreferences sharedPreferencesLIZJ;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorClear;
        Context contextLJ = C797990VSb.LIZ.LJ();
        if (contextLJ == null || (setLIZ = C1551440qTW.LIZ.LIZ(contextLJ, "gecko_file_kv_names")) == null) {
            return;
        }
        for (String str : setLIZ) {
            Context contextLJ2 = C797990VSb.LIZ.LJ();
            if (contextLJ2 != null && (sharedPreferencesLIZJ = C810670Vr7.LIZJ(contextLJ2, 0, str)) != null && (editorEdit = sharedPreferencesLIZJ.edit()) != null && (editorClear = editorEdit.clear()) != null) {
                editorClear.apply();
            }
        }
    }

    public static SharedPreferences LIZLLL(String str) {
        String name = LIZIZ;
        if (name == null) {
            C1551940qUK c1551940qUK = C797990VSb.LIZ;
            c1551940qUK.LIZIZ();
            name = c1551940qUK.LIZLLL.getRootDirectory().getName();
            LIZIZ = name;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gecko_file_info_-");
        sbLIZ.append(name);
        sbLIZ.append('-');
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Set<String> set = LIZLLL;
        if (!set.contains(strLIZIZ)) {
            set.add(strLIZIZ);
            Context contextLJ = C797990VSb.LIZ.LJ();
            if (contextLJ != null) {
                C1551440qTW.LIZ.LIZLLL(contextLJ, "gecko_file_kv_names", set);
            }
        }
        Context contextLJ2 = C797990VSb.LIZ.LJ();
        if (contextLJ2 != null) {
            return C810670Vr7.LIZJ(contextLJ2, 0, strLIZIZ);
        }
        return null;
    }

    public static boolean LJFF(String str) {
        if (C1957007lY.LIZ.LIZ().getExcludeAks().contains(str)) {
            return true;
        }
        return false;
    }

    public static final void LJII(String str) {
        ChannelFileRecordSettings channelFileRecordSettingsLIZ = C1957007lY.LIZ.LIZ();
        if (!channelFileRecordSettingsLIZ.getEnabled()) {
            return;
        }
        String str2 = LIZJ;
        if (str2 == null) {
            LJI.offer(str);
            return;
        }
        if (!a0.LJJIIZI(str, str2, false)) {
            return;
        }
        C08DL c08dlLIZ = C08DK.LIZ(str, str2);
        if (c08dlLIZ != null) {
            C1551360qTO c1551360qTO = LIZ;
            String str3 = c08dlLIZ.LIZ;
            String str4 = c08dlLIZ.LIZIZ;
            c1551360qTO.getClass();
            AtomicInteger atomicInteger = LJIIL.get(LIZJ(str3, str4));
            if (atomicInteger != null && atomicInteger.get() > 0) {
                return;
            }
        }
        LIZ.getClass();
        C786410Ut5.LJJZZIII((Handler) LJIIIIZZ.getValue(), new ARunnableS11S2100000_23(channelFileRecordSettingsLIZ, str, str2, 7));
    }

    public static String LIZJ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append((char) 30);
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static ChannelFileAccessRecord LJ(String str, String str2) {
        ChannelFileAccessRecord channelFileAccessRecord;
        ChannelFileAccessRecord channelFileAccessRecord2;
        ConcurrentHashMap<String, ConcurrentHashMap<String, ChannelFileAccessRecord>> concurrentHashMap = LJ;
        ConcurrentHashMap<String, ChannelFileAccessRecord> concurrentHashMap2 = concurrentHashMap.get(str);
        if (concurrentHashMap2 != null && (channelFileAccessRecord2 = concurrentHashMap2.get(str2)) != null) {
            return channelFileAccessRecord2;
        }
        synchronized (LJIIJJI) {
            try {
                ConcurrentHashMap<String, ChannelFileAccessRecord> concurrentHashMap3 = concurrentHashMap.get(str);
                if (concurrentHashMap3 != null && (channelFileAccessRecord = concurrentHashMap3.get(str2)) != null) {
                    return channelFileAccessRecord;
                }
                LIZ.getClass();
                ChannelFileAccessRecord channelFileAccessRecordLJI = LJI(str, str2);
                if (channelFileAccessRecordLJI == null) {
                    return null;
                }
                LJIIIIZZ(str, str2, channelFileAccessRecordLJI);
                return channelFileAccessRecordLJI;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static ChannelFileAccessRecord LJI(String str, String str2) {
        String string;
        Object c098200Yq;
        SharedPreferences sharedPreferencesLIZLLL = LIZLLL(str);
        Object obj = null;
        if (sharedPreferencesLIZLLL == null || (string = sharedPreferencesLIZLLL.getString(str2, null)) == null) {
            return null;
        }
        LIZ.getClass();
        try {
            c098200Yq = (ChannelFileAccessRecord) C1551400qTS.LIZIZ.LIZ.LJII(string, ChannelFileAccessRecord.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (ChannelFileAccessRecord) obj;
    }

    public static void LJIIIIZZ(String str, String str2, ChannelFileAccessRecord channelFileAccessRecord) {
        ConcurrentHashMap<String, ChannelFileAccessRecord> concurrentHashMapPutIfAbsent;
        ConcurrentHashMap<String, ConcurrentHashMap<String, ChannelFileAccessRecord>> concurrentHashMap = LJ;
        ConcurrentHashMap<String, ChannelFileAccessRecord> concurrentHashMap2 = concurrentHashMap.get(str);
        if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(str, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap2 = concurrentHashMapPutIfAbsent;
        }
        concurrentHashMap2.put(str2, channelFileAccessRecord);
    }

    public static void LJIIJ(ChannelFileRecordSettings channelFileRecordSettings, String str, String str2) {
        LJIIIZ.add(LIZJ(str, str2));
        long fileRecordPersistDebounceMs = channelFileRecordSettings.getFileRecordPersistDebounceMs();
        if (fileRecordPersistDebounceMs < 0) {
            fileRecordPersistDebounceMs = 0;
        }
        C01GW c01gw = LJIIIIZZ;
        Handler handler = (Handler) c01gw.getValue();
        RunnableC1529560puE runnableC1529560puE = LJIIJ;
        handler.removeCallbacks(runnableC1529560puE);
        C786410Ut5.LJLIIL(fileRecordPersistDebounceMs, (Handler) c01gw.getValue(), runnableC1529560puE);
    }

    public static final ChannelFileAggregateStatus LIZ(long j, long j2, String str, String str2) {
        Integer numValueOf;
        String str3;
        String str4;
        String str5 = null;
        if (C1957007lY.LIZ.LIZ().getEnabled()) {
            LIZ.getClass();
            if (!LJFF(str)) {
                ChannelFileAccessRecord channelFileAccessRecordLJ = LJ(str, str2);
                if (channelFileAccessRecordLJ == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("AggregateFileStatus Failed for No-Record.AccessKey=");
                    sbLIZ.append(str);
                    sbLIZ.append("Channel=");
                    sbLIZ.append(str2);
                    sbLIZ.append('\n');
                    C1553130qWF.LIZLLL("gecko-debug-tag-ChannelFileRecord", C2188811AlT.LIZIZ(sbLIZ));
                    return null;
                }
                ChannelFileAggregateStatus channelFileAggregateStatusAggregateFileStatus = channelFileAccessRecordLJ.aggregateFileStatus(j, j2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("AggregateFileStatus Success.AccessKey=");
                sbLIZ2.append(str);
                sbLIZ2.append("Channel=");
                sbLIZ2.append(str2);
                sbLIZ2.append("\nCount=");
                if (channelFileAggregateStatusAggregateFileStatus != null) {
                    numValueOf = Integer.valueOf(channelFileAggregateStatusAggregateFileStatus.totalFileCount);
                } else {
                    numValueOf = null;
                }
                sbLIZ2.append(numValueOf);
                sbLIZ2.append("Exist=");
                if (channelFileAggregateStatusAggregateFileStatus != null) {
                    str3 = channelFileAggregateStatusAggregateFileStatus.existStateBase64;
                } else {
                    str3 = null;
                }
                sbLIZ2.append(str3);
                sbLIZ2.append("Access=");
                if (channelFileAggregateStatusAggregateFileStatus != null) {
                    str4 = channelFileAggregateStatusAggregateFileStatus.accessStateBase64;
                } else {
                    str4 = null;
                }
                sbLIZ2.append(str4);
                sbLIZ2.append("Fresh=");
                if (channelFileAggregateStatusAggregateFileStatus != null) {
                    str5 = channelFileAggregateStatusAggregateFileStatus.fileFreshMergeBase64;
                }
                sbLIZ2.append(str5);
                C1553130qWF.LIZLLL("gecko-debug-tag-ChannelFileRecord", C2188811AlT.LIZIZ(sbLIZ2));
                return channelFileAggregateStatusAggregateFileStatus;
            }
        }
        return null;
    }

    public static void LIZIZ(String str, String str2, long j, List list, ChannelFileRecordSettings channelFileRecordSettings) {
        ChannelFileAccessRecord channelFileAccessRecord;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Start applyChannelUpdate: ak=");
        sbLIZ.append(str);
        sbLIZ.append("\n channel=");
        sbLIZ.append(str2);
        sbLIZ.append("\n version=");
        sbLIZ.append(j);
        sbLIZ.append("\n bundleCount=");
        sbLIZ.append(list.size());
        C1553130qWF.LIZ("gecko-debug-tag-ChannelFileRecord", C2188811AlT.LIZIZ(sbLIZ));
        boolean zLJFF = LJFF(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (zLJFF) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("applyChannelUpdate: excluded ak, remove file record: ");
            sbLIZ2.append(str);
            sbLIZ2.append(", ");
            sbLIZ2.append(str2);
            C1553130qWF.LIZ("gecko-debug-tag-ChannelFileRecord", C2188811AlT.LIZIZ(sbLIZ2));
            SharedPreferences sharedPreferencesLIZLLL = LIZLLL(str);
            if (sharedPreferencesLIZLLL != null) {
                sharedPreferencesLIZLLL.edit().remove(str2).apply();
            }
            ConcurrentHashMap<String, ConcurrentHashMap<String, ChannelFileAccessRecord>> concurrentHashMap = LJ;
            ConcurrentHashMap<String, ChannelFileAccessRecord> concurrentHashMap2 = concurrentHashMap.get(str);
            if (concurrentHashMap2 != null) {
                concurrentHashMap2.remove(str2);
            }
            ConcurrentHashMap<String, ChannelFileAccessRecord> concurrentHashMap3 = concurrentHashMap.get(str);
            if (concurrentHashMap3 != null && concurrentHashMap3.isEmpty()) {
                concurrentHashMap.remove(str);
                return;
            }
            return;
        }
        List<String> listLJLLLL = C13LP.LJLLLL(C1286870jan.LIZ, list);
        ChannelFileAccessRecord channelFileAccessRecordLJ = LJ(str, str2);
        if (channelFileAccessRecordLJ == null) {
            channelFileAccessRecord = channelFileAccessRecordLJ;
            channelFileAccessRecordLJ = channelFileAccessRecord;
            ChannelFileAccessRecord channelFileAccessRecord2 = new ChannelFileAccessRecord(jCurrentTimeMillis, str, str2, j, new LinkedHashMap());
            LIZ.getClass();
            LJIIIIZZ(str, str2, channelFileAccessRecordLJ);
        } else {
            channelFileAccessRecord = channelFileAccessRecordLJ;
        }
        Map<String, FileMetaDataItem> mapLJIIZILJ = C2097608Jq.LJIIZILJ(channelFileAccessRecordLJ.getFileRecords());
        channelFileAccessRecordLJ.setPackageID(j);
        channelFileAccessRecordLJ.replaceFileRecordsFromSortedBundles(listLJLLLL, mapLJIIZILJ);
        LJIIIIZZ(str, str2, channelFileAccessRecordLJ);
        LJIIJ(channelFileRecordSettings, str, str2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("applyChannelUpdate End, schedulePersist: \n ak: ");
        sbLIZ3.append(str);
        sbLIZ3.append("\n channel: ");
        sbLIZ3.append(str2);
        sbLIZ3.append("\n version: ");
        sbLIZ3.append(j);
        sbLIZ3.append("\n bundleCount: ");
        sbLIZ3.append(list.size());
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(" FileAccessRecord: ");
        sbLIZ4.append(channelFileAccessRecord);
        C1553130qWF.LIZ("gecko-debug-tag-ChannelFileRecord", C2188811AlT.LIZIZ(sbLIZ3), C2188811AlT.LIZIZ(sbLIZ4));
    }
}
