package X;

import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.helios.network.api.config.AgControlConfig;
import com.bytedance.helios.network.api.config.NetworkCondition;
import com.bytedance.helios.network.api.config.NetworkConfig;
import com.bytedance.helios.network.api.config.ShutdownConfig;
import com.bytedance.helios.network.api.config.ValueCondition;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Wxc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840180Wxc {
    public static final ConcurrentHashMap<String, Boolean> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LIZLLL = new ConcurrentHashMap<>();
    public static final C840280Wxm LJ = new C840280Wxm(0);

    public static boolean LIZ(String str, Set set) {
        for (int length = str.length() - 1; -1 < length; length--) {
            if (str.charAt(length) == '.' && set.contains(str.substring(length + 1, str.length()))) {
                return true;
            }
        }
        return set.contains(str);
    }

    public static boolean LIZJ(String str, String str2) {
        NetworkCondition networkCondition;
        AgControlConfig agControlConfig;
        NetworkConfig networkConfigNetworkConfigOrNull = NetworkComponent.INSTANCE.networkConfigOrNull();
        if (networkConfigNetworkConfigOrNull != null && (agControlConfig = networkConfigNetworkConfigOrNull.agControlConfig) != null) {
            networkCondition = agControlConfig.agControlList;
        } else {
            networkCondition = null;
        }
        return LIZLLL(str, str2, networkCondition);
    }

    public static boolean LIZIZ(String str, Map map, Set set) {
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

    public static boolean LIZLLL(String str, String str2, NetworkCondition networkCondition) {
        ValueCondition next;
        if (networkCondition != null) {
            Iterator<ValueCondition> it2 = networkCondition.domainCondition.iterator();
            do {
                next = null;
                if (!it2.hasNext()) {
                    break;
                }
                next = it2.next();
            } while (!next.LIZ(str));
            if (next != null) {
                return true;
            }
            Iterator<ValueCondition> it3 = networkCondition.pathCondition.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                ValueCondition next2 = it3.next();
                if (next2.LIZ(str2)) {
                    if (next2 != null) {
                        return true;
                    }
                }
            }
            for (ValueCondition valueCondition : networkCondition.urlCondition) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                if (valueCondition.LIZ(C2188811AlT.LIZIZ(sbLIZ))) {
                    if (valueCondition != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }
}
