package X;

import com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.settings.MinisTtmgConfigSettings;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.1Avi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2195161Avi {
    public static final ConcurrentHashMap<String, C2195171Avj> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, SchemaParserData> LIZIZ = new ConcurrentHashMap<>();
    public static final MinisTtmgConfigSettings.NativeRuntimeCacheConfig LIZJ;
    public static final int LIZLLL;
    public static final long LJ;
    public static final long LJFF;
    public static final Object LJI;

    static {
        MinisTtmgConfigSettings.NativeRuntimeCacheConfig nativeRuntimeCacheConfig = MinisTtmgConfigSettings.LIZ().nativeRuntimeCache;
        LIZJ = nativeRuntimeCacheConfig;
        LIZLLL = MinisTtmgConfigSettings.LIZ().maxHotStartupCacheCount;
        LJ = nativeRuntimeCacheConfig.cacheValidityPeriodMs;
        LJFF = nativeRuntimeCacheConfig.maxAbsoluteLifetimeMs;
        long j = nativeRuntimeCacheConfig.checkIntervalMs;
        PthreadTimer pthreadTimer = new PthreadTimer("MinisNativeRuntimeCacheManager");
        LJI = new Object();
        if (nativeRuntimeCacheConfig.enableTimerCleanup) {
            pthreadTimer.schedule(new C0W9W() { // from class: X.14hb
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("MinisNativeRuntimeCacheManager@d521.special$$inlined$schedule$1");
                    boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                    try {
                        ConcurrentHashMap<String, C2195171Avj> concurrentHashMap = C2195161Avi.LIZ;
                        synchronized (C2195161Avi.LJI) {
                            try {
                                C2195161Avi.LJIIIIZZ();
                            } finally {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    } finally {
                    }
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("MinisNativeRuntimeCacheManager@d521.special$$inlined$schedule$1");
                }
            }, 0L, j);
        }
    }

    public static void LJIIIIZZ() {
        Iterator<Map.Entry<String, C2195171Avj>> it2 = LIZ.entrySet().iterator();
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (it2.hasNext()) {
            Map.Entry<String, C2195171Avj> next = it2.next();
            MinisTtmgConfigSettings.NativeRuntimeCacheConfig nativeRuntimeCacheConfig = LIZJ;
            boolean z = false;
            boolean z2 = nativeRuntimeCacheConfig.respectBackgroundRenderExemption && next.getValue().LIZ.LIZJ != null;
            boolean z3 = !LJ(next.getValue());
            if (nativeRuntimeCacheConfig.enableAbsoluteLifetimeFallback && !z2 && jCurrentTimeMillis - next.getValue().LIZIZ > LJFF) {
                z = true;
            }
            if (z3 || z) {
                next.getValue().LIZ.LIZJ = null;
                IMiniGameRuntimeAPI iMiniGameRuntimeAPI = next.getValue().LIZ.LIZ;
                if (iMiniGameRuntimeAPI != null) {
                    IMiniGameRuntimeAPI.DefaultImpls.onExit$default(iMiniGameRuntimeAPI, null, 1, null);
                }
                next.getValue().LIZ.LIZ = null;
                it2.remove();
            }
        }
    }

    public static void LJIIIZ() {
        String str = null;
        long j = Long.MAX_VALUE;
        for (Map.Entry<String, C2195171Avj> entry : LIZ.entrySet()) {
            String key = entry.getKey();
            C2195171Avj value = entry.getValue();
            if (!LIZJ.respectBackgroundRenderExemption || value.LIZ.LIZJ == null) {
                long j2 = value.LIZIZ;
                if (j2 < j) {
                    str = key;
                    j = j2;
                }
            }
        }
        if (str != null) {
            LJII(str);
        }
    }

    public static final String LIZ(SchemaParserData schemaParserData) {
        if (schemaParserData == null) {
            return "";
        }
        String str = schemaParserData.clientKey;
        String str2 = schemaParserData.minisToken;
        if (str2 == null || str2.length() == 0) {
            if (str == null) {
                return "";
            }
            return str;
        }
        return str2;
    }

    public static void LIZJ(String str) {
        synchronized (LJI) {
            try {
                LIZ.remove(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static boolean LIZLLL(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        synchronized (LJI) {
            try {
                C2195171Avj c2195171Avj = LIZ.get(str);
                if (c2195171Avj == null) {
                    return false;
                }
                return LJ(c2195171Avj);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static boolean LJ(C2195171Avj c2195171Avj) {
        if (c2195171Avj.LIZJ == Long.MAX_VALUE || System.currentTimeMillis() - c2195171Avj.LIZIZ <= c2195171Avj.LIZJ) {
            return true;
        }
        return false;
    }

    public static C2195201Avm LJFF(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        C2195201Avm c2195201Avm = null;
        if (z) {
            return null;
        }
        synchronized (LJI) {
            try {
                C2195171Avj c2195171Avj = LIZ.get(str);
                if (c2195171Avj == null) {
                    return null;
                }
                if (LJ(c2195171Avj)) {
                    c2195201Avm = c2195171Avj.LIZ;
                }
                return c2195201Avm;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJI(String str) {
        synchronized (LJI) {
            try {
                LJII(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJII(String str) {
        C2195201Avm c2195201Avm;
        C2195201Avm c2195201Avm2;
        IMiniGameRuntimeAPI iMiniGameRuntimeAPI;
        ConcurrentHashMap<String, C2195171Avj> concurrentHashMap = LIZ;
        C2195171Avj c2195171Avj = concurrentHashMap.get(str);
        if (c2195171Avj != null && (c2195201Avm2 = c2195171Avj.LIZ) != null && (iMiniGameRuntimeAPI = c2195201Avm2.LIZ) != null) {
            IMiniGameRuntimeAPI.DefaultImpls.onExit$default(iMiniGameRuntimeAPI, null, 1, null);
        }
        C2195171Avj c2195171Avj2 = concurrentHashMap.get(str);
        if (c2195171Avj2 != null && (c2195201Avm = c2195171Avj2.LIZ) != null) {
            c2195201Avm.LIZ = null;
        }
        concurrentHashMap.remove(str);
    }

    public static void LIZIZ(String str, C2195201Avm c2195201Avm, long j) {
        if (str != null && str.length() != 0 && c2195201Avm != null) {
            synchronized (LJI) {
                try {
                    LJIIIIZZ();
                    ConcurrentHashMap<String, C2195171Avj> concurrentHashMap = LIZ;
                    if (!concurrentHashMap.containsKey(str) && concurrentHashMap.size() >= LIZLLL) {
                        LJIIIZ();
                    }
                    concurrentHashMap.put(str, new C2195171Avj(c2195201Avm, System.currentTimeMillis(), j));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
