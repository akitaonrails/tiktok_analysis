package X;

import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.ies.abmock.datacenter.plugin.BaseConfigPlugin;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0C5Q, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C5Q {
    public static n LIZ;
    public static InterfaceC308030C5p LIZIZ;
    public static final CopyOnWriteArraySet<String> LIZJ = new CopyOnWriteArraySet<>();

    public static void LIZ(String str) {
        C307730C4l.LIZLLL.LJIIIIZZ(str);
    }

    public static Map LIZIZ(n nVar) {
        Map<String, ConfigItem> configMap;
        List<String> listEmptyList;
        if (C308050C5r.LIZ) {
            LIZ = nVar;
        }
        System.currentTimeMillis();
        Map<String, ConfigItem> map = C2502809rO.LIZ;
        ArrayList<Map.Entry> arrayList = new ArrayList();
        if (LIZIZ != null) {
            if (C343780Ddo.LIZIZ()) {
                listEmptyList = C288270BRp.LIZ;
            } else {
                listEmptyList = Collections.emptyList();
            }
            if (listEmptyList != null && !listEmptyList.isEmpty()) {
                LIZJ.addAll(listEmptyList);
            }
        }
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            String str = (String) entry.getKey();
            if (LIZJ.contains(str)) {
                arrayList.add(entry);
            } else {
                LJIIIIZZ((ConfigItem) entry.getValue(), nVar, str);
            }
        }
        for (Map.Entry entry2 : arrayList) {
            LJIIIIZZ((ConfigItem) entry2.getValue(), nVar, (String) entry2.getKey());
        }
        System.currentTimeMillis();
        Map<BaseConfigPlugin, Boolean> map2 = C307630C4b.LIZ().LIZ;
        Map<String, ConfigItem> map3 = C2502809rO.LIZ;
        for (Map.Entry entry3 : ((ConcurrentHashMap) map2).entrySet()) {
            if (!((Boolean) entry3.getValue()).booleanValue() && (configMap = ((BaseConfigPlugin) entry3.getKey()).getConfigMap()) != null) {
                for (Map.Entry<String, ConfigItem> entry4 : configMap.entrySet()) {
                    String key = entry4.getKey();
                    if (map3 == null || !((HashMap) map3).containsKey(key)) {
                        switch (C0C4Q.LIZ[entry4.getValue().type.ordinal()]) {
                            case 1:
                                LIZJ(nVar, key);
                                break;
                            case 2:
                                LJI(nVar, key);
                                break;
                            case 3:
                                LJII(nVar, key);
                                break;
                            case 4:
                                LJ(nVar, key);
                                break;
                            case 5:
                                LJFF(nVar, key);
                                break;
                            case 6:
                                LJIIJ(nVar, key);
                                break;
                            case 7:
                                LJIIIZ(nVar, key);
                                break;
                            default:
                                LIZLLL(nVar, key);
                                break;
                        }
                        if (entry4.getValue().isLaunch) {
                            C307730C4l.LIZLLL.LJIILJJIL(key, entry4.getValue().type);
                        }
                    }
                }
            }
        }
        System.currentTimeMillis();
        n nVarLIZJ = nVar.LIZJ();
        Iterator<String> it2 = nVarLIZJ.LJJIJIL().iterator();
        Map<String, ConfigItem> map4 = C2502809rO.LIZ;
        while (it2.hasNext()) {
            String next = it2.next();
            if (map4 != null && ((HashMap) map4).containsKey(next)) {
                it2.remove();
            }
        }
        C0C54 c0c54 = C0C54.LIZJ;
        synchronized (c0c54) {
            boolean z = C307990C5l.LIZ;
            System.currentTimeMillis();
            c0c54.LIZIZ.LIZIZ(nVarLIZJ);
            boolean z2 = C307990C5l.LIZIZ;
            boolean z3 = C307990C5l.LIZJ;
            boolean z4 = C307920C5e.LIZ;
            Keva repoSync = KevaImpl.getRepoSync("repo_unregistered_opt_libra_config", 0);
            repoSync.storeBoolean("key_opt_open", z);
            repoSync.storeBoolean("key_keva_single_mode", z2);
            repoSync.storeBoolean("key_using_skip_lock", z3);
        }
        HashMap map5 = new HashMap();
        try {
            C307730C4l.LIZLLL.LJIIJ("libra_config_center_saved", true);
            return map5;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return map5;
        }
    }

    public static void LIZJ(n nVar, String str) {
        q qVarLJJIJIIJI;
        boolean z;
        try {
            n nVarLJJIJ = nVar.LJJIJ(str);
            if (nVarLJJIJ != null && (qVarLJJIJIIJI = nVarLJJIJ.LJJIJIIJI("val")) != null) {
                if (qVarLJJIJIIJI.LL instanceof Number) {
                    C307730C4l c307730C4l = C307730C4l.LIZLLL;
                    if (qVarLJJIJIIJI.LJIIJJI() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c307730C4l.LJIIJ(str, z);
                    return;
                }
                C307730C4l.LIZLLL.LJIIJ(str, qVarLJJIJIIJI.LJ());
                return;
            }
            LIZ(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th);
            sbLIZ.append("  , key: ");
            sbLIZ.append(str);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZLLL(n nVar, String str) {
        k kVarLJJIIZ;
        try {
            n nVarLJJIJ = nVar.LJJIJ(str);
            if (nVarLJJIJ != null && (kVarLJJIIZ = nVarLJJIJ.LJJIIZ("val")) != null && !(kVarLJJIIZ instanceof m)) {
                C307730C4l.LIZLLL.LJIIZILJ(str, kVarLJJIIZ.toString());
            } else if (nVar.LJJIJIIJIL(str)) {
                C307730C4l.LIZLLL.LJIIZILJ(str, null);
            } else {
                LIZ(str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th);
            sbLIZ.append("  , key: ");
            sbLIZ.append(str);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LJ(n nVar, String str) {
        k kVarLJJIIZ;
        try {
            n nVarLJJIJ = nVar.LJJIJ(str);
            if (nVarLJJIJ != null && (kVarLJJIIZ = nVarLJJIJ.LJJIIZ("val")) != null && !(kVarLJJIIZ instanceof m)) {
                C307730C4l.LIZLLL.LJIIJJI(str, kVarLJJIIZ.LJIIIZ());
            } else {
                LIZ(str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th);
            sbLIZ.append("  , key: ");
            sbLIZ.append(str);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LJFF(n nVar, String str) {
        k kVarLJJIIZ;
        try {
            n nVarLJJIJ = nVar.LJJIJ(str);
            if (nVarLJJIJ != null && (kVarLJJIIZ = nVarLJJIJ.LJJIIZ("val")) != null && !(kVarLJJIIZ instanceof m)) {
                C307730C4l.LIZLLL.LJIIL(str, kVarLJJIIZ.LJIIJ());
            } else {
                LIZ(str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th);
            sbLIZ.append("  , key: ");
            sbLIZ.append(str);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LJI(n nVar, String str) {
        q qVarLJJIJIIJI;
        int i;
        try {
            n nVarLJJIJ = nVar.LJJIJ(str);
            if (nVarLJJIJ != null && (qVarLJJIJIIJI = nVarLJJIJ.LJJIJIIJI("val")) != null) {
                if (qVarLJJIJIIJI.LL instanceof Boolean) {
                    C307730C4l c307730C4l = C307730C4l.LIZLLL;
                    if (qVarLJJIJIIJI.LJ()) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    c307730C4l.LJIILIIL(str, i);
                    return;
                }
                C307730C4l.LIZLLL.LJIILIIL(str, qVarLJJIJIIJI.LJIIJJI());
                return;
            }
            LIZ(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th);
            sbLIZ.append("  , key: ");
            sbLIZ.append(str);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LJII(n nVar, String str) {
        k kVarLJJIIZ;
        try {
            n nVarLJJIJ = nVar.LJJIJ(str);
            if (nVarLJJIJ != null && (kVarLJJIIZ = nVarLJJIJ.LJJIIZ("val")) != null && !(kVarLJJIIZ instanceof m)) {
                C307730C4l.LIZLLL.LJIILL(str, kVarLJJIIZ.LJIIZILJ());
            } else {
                LIZ(str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th);
            sbLIZ.append("  , key: ");
            sbLIZ.append(str);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LJIIIZ(n nVar, String str) {
        k kVarLJJIIZ;
        try {
            n nVarLJJIJ = nVar.LJJIJ(str);
            if (nVarLJJIJ != null && (kVarLJJIIZ = nVarLJJIJ.LJJIIZ("val")) != null && !(kVarLJJIIZ instanceof m)) {
                C307730C4l c307730C4l = C307730C4l.LIZLLL;
                c307730C4l.LJIILLIIL(str, (String[]) ((Gson) c307730C4l.LIZIZ.getValue()).LIZJ(kVarLJJIIZ, String[].class));
            } else if (nVar.LJJIJIIJIL(str)) {
                C307730C4l.LIZLLL.LJIILLIIL(str, null);
            } else {
                LIZ(str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th);
            sbLIZ.append("  , key: ");
            sbLIZ.append(str);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LJIIJ(n nVar, String str) {
        k kVarLJJIIZ;
        try {
            n nVarLJJIJ = nVar.LJJIJ(str);
            if (nVarLJJIJ != null && (kVarLJJIIZ = nVarLJJIJ.LJJIIZ("val")) != null && !(kVarLJJIIZ instanceof m)) {
                C307730C4l.LIZLLL.LJIIZILJ(str, kVarLJJIIZ.LJIL());
            } else if (nVar.LJJIJIIJIL(str)) {
                C307730C4l.LIZLLL.LJIIZILJ(str, null);
            } else {
                LIZ(str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th);
            sbLIZ.append("  , key: ");
            sbLIZ.append(str);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LJIIIIZZ(ConfigItem configItem, n nVar, String str) {
        switch (C0C4Q.LIZ[configItem.type.ordinal()]) {
            case 1:
                LIZJ(nVar, str);
                break;
            case 2:
                LJI(nVar, str);
                break;
            case 3:
                LJII(nVar, str);
                break;
            case 4:
                LJ(nVar, str);
                break;
            case 5:
                LJFF(nVar, str);
                break;
            case 6:
                LJIIJ(nVar, str);
                break;
            case 7:
                LJIIIZ(nVar, str);
                break;
            default:
                LIZLLL(nVar, str);
                break;
        }
        if (configItem.isLaunch) {
            C307730C4l.LIZLLL.LJIILJJIL(str, configItem.type);
        }
    }
}
