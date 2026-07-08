package X;

import android.net.Uri;
import android.os.SystemClock;
import android.util.LruCache;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloadConfigItem;
import com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloadConfigModel;
import com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloadInfo;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AwS138S1200000_23;
import kotlin.jvm.internal.AwS637S0100000_23;
import kotlin.jvm.internal.AwS73S1000000_23;

/* JADX INFO: renamed from: X.0pkt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1523770pkt {
    public static final C1523770pkt LIZ = new C1523770pkt();
    public static final ConcurrentHashMap<String, AtomicInteger> LIZIZ = new ConcurrentHashMap<>();
    public static final CopyOnWriteArraySet<String> LIZJ = new CopyOnWriteArraySet<>();
    public static final C054G LIZLLL = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public static final CopyOnWriteArraySet<String> LJ = new CopyOnWriteArraySet<>();
    public static final AtomicBoolean LJFF = new AtomicBoolean(false);
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(153));

    public final synchronized void LIZ(ECSparkPreloadConfigItem eCSparkPreloadConfigItem, C1523780pku c1523780pku) {
        long jLongValue;
        ECSparkPreloadConfigModel eCSparkPreloadConfigModelLIZIZ = C1523760pks.LIZIZ();
        if (eCSparkPreloadConfigModelLIZIZ.enable && eCSparkPreloadConfigModelLIZIZ.cleanWhenLowMemory) {
            AtomicBoolean atomicBoolean = LJFF;
            if (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                C2188561Al4 c2188561Al4 = C476250Ilz.LIZ;
                C1611606Ss c1611606Ss = new InterfaceC2188711AlJ() { // from class: X.06Ss
                    @Override // X.InterfaceC2188711AlJ
                    public final void LIZ(C1768270w7F c1768270w7F) {
                        C09QO c09qo = c1768270w7F.LIZIZ;
                        if (c09qo != null) {
                            int i = C09QN.LIZ[c09qo.ordinal()];
                            if (i != 1) {
                                if (i == 2 && !C1523770pkt.LJ.isEmpty()) {
                                    C23250099c.LIZLLL(C1523770pkt.LIZLLL, null, null, new C1343205Nm("clean_when_physical_low", null), 3);
                                    return;
                                }
                                return;
                            }
                            int i2 = c1768270w7F.LIZLLL;
                            if ((i2 != 8 && i2 != 9) || C1523770pkt.LJ.isEmpty()) {
                                return;
                            }
                            C23250099c.LIZLLL(C1523770pkt.LIZLLL, null, null, new C1343205Nm("clean_when_java_low", null), 3);
                        }
                    }
                };
                c2188561Al4.getClass();
                C2188561Al4.LJII(c1611606Ss);
            }
        }
        Float f = eCSparkPreloadConfigItem.maxMemoryUsagePercent;
        if (f != null) {
            float fFloatValue = f.floatValue();
            Runtime runtime = Runtime.getRuntime();
            if ((runtime.totalMemory() - runtime.freeMemory()) / runtime.maxMemory() > fFloatValue) {
                getClass();
                LIZJ(c1523780pku, "", 0, "memory_usage_exceeded", 0L);
                return;
            }
        }
        List<ECSparkPreloadInfo> list = eCSparkPreloadConfigItem.preloadInfo;
        if (list != null) {
            for (ECSparkPreloadInfo eCSparkPreloadInfo : list) {
                String str = eCSparkPreloadInfo.channel;
                if (str == null) {
                    str = "";
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ConcurrentHashMap<String, Long> concurrentHashMap = C1123904aT.LIZ;
                Long l = concurrentHashMap.get(str);
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                if (jElapsedRealtime - jLongValue >= Mp4ScreenVideoLoadTimeout.CONTROL) {
                    LIZ.getClass();
                    LIZIZ(eCSparkPreloadConfigItem, eCSparkPreloadInfo, c1523780pku);
                    concurrentHashMap.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [X.0pkx] */
    public static void LIZIZ(final ECSparkPreloadConfigItem eCSparkPreloadConfigItem, ECSparkPreloadInfo eCSparkPreloadInfo, final C1523780pku c1523780pku) {
        String string;
        Integer numValueOf;
        int iIntValue;
        AtomicInteger atomicIntegerPutIfAbsent;
        AtomicInteger atomicIntegerPutIfAbsent2;
        LruCache<String, CopyOnWriteArrayList<SoftReference<InterfaceC1540940qCa>>> lruCache;
        Map<String, CopyOnWriteArrayList<SoftReference<InterfaceC1540940qCa>>> mapSnapshot;
        CopyOnWriteArrayList<SoftReference<InterfaceC1540940qCa>> copyOnWriteArrayList;
        Uri uriLIZJ;
        Uri.Builder builderBuildUpon;
        Uri.Builder builderAppendQueryParameter;
        Uri uriLIZJ2;
        Uri.Builder builderBuildUpon2;
        Uri.Builder builderAppendQueryParameter2;
        String str = eCSparkPreloadInfo.sparkPerfBiz;
        if (str == null) {
            str = "";
        }
        final String str2 = eCSparkPreloadInfo.channel;
        if (str2 == null) {
            str2 = "";
        }
        int i = eCSparkPreloadConfigItem.maxCount;
        String string2 = eCSparkPreloadInfo.schema;
        if (string2 == null || ((eCSparkPreloadConfigItem.preloadType == 2 && ((uriLIZJ2 = C1943307jL.LIZJ(string2)) == null || (builderBuildUpon2 = uriLIZJ2.buildUpon()) == null || (builderAppendQueryParameter2 = builderBuildUpon2.appendQueryParameter("enable_pending_js_task", "1")) == null || (string2 = builderAppendQueryParameter2.toString()) == null)) || (uriLIZJ = C1943307jL.LIZJ(string2)) == null || (builderBuildUpon = uriLIZJ.buildUpon()) == null || (builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("ECSparkPreload", "1")) == null || (string = builderAppendQueryParameter.toString()) == null)) {
            string = "";
        }
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1051630dTN c1051630dTNLJI = C1537060q6K.LJI(str);
        if (c1051630dTNLJI != null && (lruCache = c1051630dTNLJI.LJIIJ) != null && (mapSnapshot = lruCache.snapshot()) != null && (copyOnWriteArrayList = mapSnapshot.get(string)) != null) {
            numValueOf = Integer.valueOf(copyOnWriteArrayList.size());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 0;
        }
        if (iIntValue >= i) {
            return;
        }
        ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = LIZIZ;
        AtomicInteger atomicInteger = concurrentHashMap.get(str2);
        if (atomicInteger == null && (atomicIntegerPutIfAbsent2 = concurrentHashMap.putIfAbsent(str2, (atomicInteger = new AtomicInteger(0)))) != null) {
            atomicInteger = atomicIntegerPutIfAbsent2;
        }
        if (atomicInteger.get() >= i) {
            return;
        }
        final C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = SystemClock.elapsedRealtime();
        ?? r15 = new C1537070q6L() { // from class: X.0pkx
            @Override // X.C1537070q6L
            public final void LIZIZ(String str3, String str4, InterfaceC1105930esx interfaceC1105930esx) {
                C054G c054g = C1342805Ni.LIZ;
                C1342805Ni.LIZ(interfaceC1105930esx, new AwS138S1200000_23(c1523780pku, str2, eCSparkPreloadConfigItem, 3));
                C1523770pkt.LJ.remove(str4);
                C1523770pkt c1523770pkt = C1523770pkt.LIZ;
                C1523780pku c1523780pku2 = c1523780pku;
                String str5 = str2;
                int i2 = eCSparkPreloadConfigItem.preloadType;
                c1523770pkt.getClass();
                c1523770pkt.getClass();
                C1523770pkt.LIZJ(c1523780pku2, str5, i2, "hit", 0L);
                C1523770pkt.LIZJ.remove(str2);
            }

            @Override // X.C1537070q6L
            public final void LIZJ(String str3, String str4, C1537080q6M c1537080q6M) {
                C1523770pkt c1523770pkt = C1523770pkt.LIZ;
                C1523780pku c1523780pku2 = c1523780pku;
                String str5 = str2;
                int i2 = eCSparkPreloadConfigItem.preloadType;
                c1523770pkt.getClass();
                c1523770pkt.getClass();
                C1523770pkt.LIZJ(c1523780pku2, str5, i2, "failed", 0L);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ECSparkPreloader, onPreloadFailed: ");
                sbLIZ.append(c1537080q6M.LIZ);
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.C1537070q6L
            public final void LIZLLL(String str3, String str4, InterfaceC1105930esx interfaceC1105930esx) {
                if (interfaceC1105930esx != null) {
                    ECSparkPreloadConfigItem eCSparkPreloadConfigItem2 = eCSparkPreloadConfigItem;
                    String str5 = str2;
                    C1523780pku c1523780pku2 = c1523780pku;
                    int i2 = eCSparkPreloadConfigItem2.expiredTimeInSecond;
                    if (i2 > 0 && eCSparkPreloadConfigItem2.needCleanup) {
                        C054G c054g = C1342805Ni.LIZ;
                        C1342805Ni.LIZIZ.put(String.valueOf(interfaceC1105930esx.hashCode()), C23250099c.LIZLLL(C1342805Ni.LIZ, null, null, new C1342905Nj(i2, str3, new C1523800pkw(str5, str4, c1523780pku2, eCSparkPreloadConfigItem2), str4, interfaceC1105930esx, null), 3));
                    }
                }
                C1523770pkt.LJ.add(str4);
                C1523770pkt.LIZ.getClass();
                C1523770pkt.LIZJ.add(str2);
                C1523770pkt.LIZJ(c1523780pku, str2, eCSparkPreloadConfigItem.preloadType, "end", SystemClock.elapsedRealtime() - c238400w2.element);
            }
        };
        SparkContext sparkContext = new SparkContext();
        sparkContext.usePreload = true;
        sparkContext.LJJ(AbstractC1537120q6Q.class, new C1523820pky(r15));
        if (C1537060q6K.LJI(str) == null) {
            C1097680efe c1097680efe = new C1097680efe();
            c1097680efe.LJIIZILJ = true;
            c1097680efe.LIZ = str;
            c1097680efe.LJIJ = i;
            c1097680efe.LJIJJLI = Collections.singletonList(str2);
            c1097680efe.LJIJI = eCSparkPreloadConfigItem.expiredTimeInSecond;
            int i2 = eCSparkPreloadConfigItem.preloadType;
            if (i2 == 1) {
                c1097680efe.LJ = true;
                c1097680efe.LJFF = true;
            }
            c1097680efe.LJJ = true;
            if (i2 == 2) {
                c1097680efe.LJIIL = true;
            }
            c1097680efe.LJIIIIZZ = new AwS637S0100000_23(eCSparkPreloadInfo, 3);
            c1097680efe.LJIJJ = new C1537560q78(r15, eCSparkPreloadInfo, str2);
            C1537060q6K.LJIIL(c1097680efe, Boolean.FALSE);
        }
        AtomicInteger atomicInteger2 = concurrentHashMap.get(str2);
        if (atomicInteger2 == null && (atomicIntegerPutIfAbsent = concurrentHashMap.putIfAbsent(str2, (atomicInteger2 = new AtomicInteger(0)))) != null) {
            atomicInteger2 = atomicIntegerPutIfAbsent;
        }
        atomicInteger2.incrementAndGet();
        C23250099c.LIZLLL(LIZLLL, null, null, new C1508290pLv(eCSparkPreloadInfo, c1523780pku, str2, eCSparkPreloadConfigItem, c238400w2, string, str, sparkContext, r15, null), 3).LJII(new AwS73S1000000_23(str2, 10));
    }

    public static void LIZJ(C1523780pku c1523780pku, String str, int i, String str2, long j) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str3 = c1523780pku.LIZ;
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("page_name", str3);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("channel", str);
        linkedHashMap.put("preload_type", String.valueOf(i));
        linkedHashMap.put("stage", str2);
        linkedHashMap.put("cost_time", String.valueOf(j));
        linkedHashMap.put("trigger_name", c1523780pku.LIZIZ);
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZJ("rd_tiktokec_common_spark_preload", linkedHashMap);
    }
}
