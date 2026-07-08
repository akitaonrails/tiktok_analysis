package X;

import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.helios.network.api.config.NetworkConfig;
import com.bytedance.helios.network.api.config.ShutdownConfig;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ranges.IntRange;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Wy7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840490Wy7 {
    public static HashSet<String> LIZ = new HashSet<>();
    public static HashSet<String> LIZIZ = new HashSet<>();
    public static final ConcurrentHashMap<String, Boolean> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LIZLLL = new ConcurrentHashMap<>();
    public static final AtomicBoolean LJ = new AtomicBoolean(false);

    public static boolean LIZJ(String str) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() != 4) {
            return false;
        }
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) it2.next());
            if (numLJIIJJI == null || !new IntRange(0, 255).LJLJL(numLJIIJJI.intValue())) {
                return false;
            }
        }
        return true;
    }

    public static boolean LIZ(String str, Set set) {
        int length = str.length() - 1;
        int i = 0;
        while (true) {
            if (-1 >= length) {
                break;
            }
            if (str.charAt(length) == '.') {
                i++;
                if (i == 2) {
                    if (((HashSet) set).contains(str.substring(length + 1, str.length()))) {
                        return true;
                    }
                } else if (i == 3) {
                    if (((HashSet) set).contains(str.substring(length + 1, str.length()))) {
                        return true;
                    }
                }
            }
            length--;
        }
        return ((HashSet) set).contains(str);
    }

    public static void LIZIZ(Set set, Set set2, ShutdownConfig shutdownConfig) {
        HashSet<String> hashSet = new HashSet<>(64);
        hashSet.addAll(set);
        if (!shutdownConfig.onePartyDomains.isEmpty()) {
            hashSet.addAll(shutdownConfig.onePartyDomains);
        }
        HashSet<String> hashSet2 = new HashSet<>(1024);
        hashSet2.addAll(hashSet);
        hashSet2.addAll(set2);
        if (!shutdownConfig.thirdPartyDomains.isEmpty()) {
            hashSet2.addAll(shutdownConfig.thirdPartyDomains);
        }
        if (NetworkComponent.INSTANCE.isRegressionTestEnv() && (!shutdownConfig.regressionDomains.isEmpty())) {
            hashSet2.addAll(shutdownConfig.regressionDomains);
        }
        LIZ = hashSet;
        LIZIZ = hashSet2;
        LIZJ.clear();
        LIZLLL.clear();
    }

    public static boolean LIZLLL(String str, Map map, Set set) {
        ShutdownConfig shutdownConfig;
        NetworkConfig networkConfigNetworkConfigOrNull = NetworkComponent.INSTANCE.networkConfigOrNull();
        if (networkConfigNetworkConfigOrNull != null && (shutdownConfig = networkConfigNetworkConfigOrNull.shutdownConfig) != null && shutdownConfig.enableDomainCache) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
            Boolean bool = (Boolean) concurrentHashMap.get(str);
            if (bool != null) {
                return bool.booleanValue();
            }
            boolean zLIZ = LIZ(str, set);
            concurrentHashMap.put(str, Boolean.valueOf(zLIZ));
            return zLIZ;
        }
        return LIZ(str, set);
    }
}
