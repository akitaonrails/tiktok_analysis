package X;

import Y.ARunnableS24S0101000_13;
import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.helios.network.api.config.AutoSkipApiConfig;
import com.bytedance.helios.network.api.config.NetworkConfig;
import com.bytedance.pumbaa.utility.worker.PumbaaWorkerThread;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0Wzb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841410Wzb {
    public static final ConcurrentHashMap<Integer, CopyOnWriteArrayList<Long>> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, Boolean> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZ(int i, long j) {
        Map<Integer, AutoSkipApiConfig> map;
        AutoSkipApiConfig autoSkipApiConfig;
        NetworkConfig networkConfigNetworkConfigOrNull = NetworkComponent.INSTANCE.networkConfigOrNull();
        if (networkConfigNetworkConfigOrNull != null && (map = networkConfigNetworkConfigOrNull.autoSkipApiConfigs) != null && (autoSkipApiConfig = map.get(Integer.valueOf(i))) != null) {
            ConcurrentHashMap<Integer, Boolean> concurrentHashMap = LIZIZ;
            Boolean bool = concurrentHashMap.get(Integer.valueOf(i));
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            if (bool.booleanValue()) {
                return;
            }
            ConcurrentHashMap<Integer, CopyOnWriteArrayList<Long>> concurrentHashMap2 = LIZ;
            CopyOnWriteArrayList<Long> copyOnWriteArrayList = concurrentHashMap2.get(Integer.valueOf(i));
            if (copyOnWriteArrayList == null) {
                Integer numValueOf = Integer.valueOf(i);
                CopyOnWriteArrayList<Long> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                copyOnWriteArrayList2.add(Long.valueOf(j));
                concurrentHashMap2.put(numValueOf, copyOnWriteArrayList2);
                return;
            }
            copyOnWriteArrayList.add(Long.valueOf(j));
            if (copyOnWriteArrayList.size() < autoSkipApiConfig.count) {
                return;
            }
            double dLJJJI = C13LP.LJJJI(copyOnWriteArrayList);
            if (dLJJJI >= autoSkipApiConfig.averageCost) {
                concurrentHashMap.put(Integer.valueOf(i), Boolean.TRUE);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("skip_");
                sbLIZ.append(i);
                sbLIZ.append("_average");
                C841400Wza.LIZ((long) (((double) LSPassThroughRecordSizeConfig.DEFAULT) * dLJJJI), C2188811AlT.LIZIZ(sbLIZ));
                CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList3 = C0WSW.LIZ;
                C0WSW.LIZ("Helios:Network-Invoke", new C841420Wzc(i, dLJJJI, copyOnWriteArrayList, autoSkipApiConfig), 3, null);
                C786410Ut5.LJLIIL(autoSkipApiConfig.skipInterval, PumbaaWorkerThread.getHandler(), new ARunnableS24S0101000_13(i, autoSkipApiConfig, 4));
            }
            concurrentHashMap2.put(Integer.valueOf(i), new CopyOnWriteArrayList<>());
        }
    }
}
