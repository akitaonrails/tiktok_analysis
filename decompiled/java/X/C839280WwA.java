package X;

import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.cache.config.CacheConfig;
import com.bytedance.helios.cache.config.CacheGroup;
import com.bytedance.helios.cache.config.FeatureRegisterConfig;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.reflect.TypeToken;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0WwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C839280WwA {
    public static void LIZ(SettingsModel settingsModel) {
        if (C825320WZe.LIZIZ()) {
            CacheConfig cacheConfig = (CacheConfig) GsonProtectorUtils.fromJson(new Gson(), (k) settingsModel.cacheConfig, CacheConfig.class);
            Map<Integer, C826010Wal> map = C826000Wak.LIZJ;
            synchronized (map) {
                try {
                    ((LinkedHashMap) map).clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (cacheConfig != null) {
                for (CacheGroup cacheGroup : cacheConfig.cacheGroups) {
                    C1091810eWB c1091810eWB = C839310WwD.LIZ;
                    InterfaceC826050Wap interfaceC826050Wap = (InterfaceC826050Wap) ((LinkedHashMap) C839310WwD.LIZIZ).get(cacheGroup.store);
                    if (interfaceC826050Wap == null) {
                        interfaceC826050Wap = C839310WwD.LIZ;
                    }
                    ConcurrentHashMap<String, InterfaceC839340WwG> concurrentHashMap = C839300WwC.LIZ;
                    String str = cacheGroup.strategy;
                    Map<String, String> map2 = cacheGroup.params;
                    ConcurrentHashMap<String, InterfaceC839340WwG> concurrentHashMap2 = C839300WwC.LIZ;
                    if (concurrentHashMap2.get(str) != null) {
                        InterfaceC826030Wan interfaceC826030WanLIZ = concurrentHashMap2.get(str).LIZ(map2);
                        Map<String, InterfaceC826040Wao> map3 = C826070War.LIZ;
                        InterfaceC826040Wao interfaceC826040Wao = (InterfaceC826040Wao) ((LinkedHashMap) C826070War.LIZ).get(cacheGroup.filter);
                        Iterator<Integer> it2 = cacheGroup.apiIds.iterator();
                        while (it2.hasNext()) {
                            C826000Wak.LIZ(it2.next().intValue(), interfaceC826050Wap, interfaceC826030WanLIZ, interfaceC826040Wao);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("register ");
                        sbLIZ.append(cacheGroup.apiIds);
                        sbLIZ.append(" cache group with ");
                        sbLIZ.append(interfaceC826050Wap);
                        sbLIZ.append("(store), ");
                        sbLIZ.append(interfaceC826030WanLIZ);
                        sbLIZ.append("(strategy)");
                        C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("unknown strategy: ");
                        sbLIZ2.append(str);
                        sbLIZ2.append(" !");
                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            }
            C840580WyG c840580WyG = C840580WyG.LIZ;
            C840580WyG.LIZIZ = (List) GsonProtectorUtils.fromJson(new Gson(), settingsModel.featureRegisterConfig, new TypeToken<List<? extends FeatureRegisterConfig>>() { // from class: X.0WwM
            }.getType());
            C826000Wak.LIZ = c840580WyG;
        }
    }
}
