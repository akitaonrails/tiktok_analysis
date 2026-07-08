package X;

import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.ies.abmock.datacenter.plugin.BaseConfigPlugin;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0C4Z, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C4Z {
    public static volatile n LIZ;

    public static void LJ(n nVar) {
        if (C0C4Y.LIZLLL) {
            return;
        }
        Map<String, ConfigItem> map = C2502809rO.LIZ;
        Map<String, ConfigItem> map2 = C2502809rO.LIZIZ;
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            String str = (String) entry.getKey();
            if (!((HashMap) map2).containsKey(str)) {
                switch (C0C4L.LIZ[((ConfigItem) entry.getValue()).type.ordinal()]) {
                    case 1:
                        LIZ(nVar, str);
                        break;
                    case 2:
                        LJI(nVar, str);
                        break;
                    case 3:
                        LJII(nVar, str);
                        break;
                    case 4:
                        LIZJ(nVar, str);
                        break;
                    case 5:
                        LIZLLL(nVar, str);
                        break;
                    case 6:
                        LJIIIZ(nVar, str);
                        break;
                    case 7:
                        LJIIIIZZ(nVar, str);
                        break;
                    default:
                        LIZIZ(nVar, str);
                        break;
                }
            }
        }
    }

    public static void LJFF(n nVar) {
        Map<String, ConfigItem> configMap;
        Map<BaseConfigPlugin, Boolean> map = C307630C4b.LIZ().LIZ;
        Map<String, ConfigItem> map2 = C2502809rO.LIZ;
        for (Map.Entry entry : ((ConcurrentHashMap) map).entrySet()) {
            if (!((Boolean) entry.getValue()).booleanValue() && (configMap = ((BaseConfigPlugin) entry.getKey()).getConfigMap()) != null) {
                for (Map.Entry<String, ConfigItem> entry2 : configMap.entrySet()) {
                    String key = entry2.getKey();
                    if (map2 == null || !((HashMap) map2).containsKey(key)) {
                        switch (C0C4L.LIZ[entry2.getValue().type.ordinal()]) {
                            case 1:
                                LIZ(nVar, key);
                                break;
                            case 2:
                                LJI(nVar, key);
                                break;
                            case 3:
                                LJII(nVar, key);
                                break;
                            case 4:
                                LIZJ(nVar, key);
                                break;
                            case 5:
                                LIZLLL(nVar, key);
                                break;
                            case 6:
                                LJIIIZ(nVar, key);
                                break;
                            case 7:
                                LJIIIIZZ(nVar, key);
                                break;
                            default:
                                LIZIZ(nVar, key);
                                break;
                        }
                    }
                }
            }
        }
    }

    public static void LJIIJ(n nVar) {
        if (!((Boolean) C259940AGq.LIZ.getValue()).booleanValue()) {
            Iterator<String> it2 = nVar.LIZJ().LJJIJIL().iterator();
            Map<String, ConfigItem> map = C2502809rO.LIZ;
            while (it2.hasNext()) {
                String next = it2.next();
                if (map != null && ((HashMap) map).containsKey(next)) {
                    it2.remove();
                }
            }
            C0C54 c0c54 = C0C54.LIZJ;
            synchronized (c0c54) {
                try {
                    c0c54.LIZ.LIZ("key_unregistered_config");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public static void LIZ(n nVar, String str) {
        boolean z;
        try {
            q qVarLJJIJIIJI = nVar.LJJIJIIJI(str);
            if (qVarLJJIJIIJI != null) {
                if (qVarLJJIJIIJI.LL instanceof Number) {
                    C0C4Y c0c4y = C0C4Y.LIZJ;
                    if (qVarLJJIJIIJI.LJIIJJI() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c0c4y.LJIIJJI(str, z);
                    return;
                }
                C0C4Y.LIZJ.LJIIJJI(str, qVarLJJIJIIJI.LJ());
                return;
            }
            C0C4Y.LIZJ.LJIIIIZZ(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th);
            sbLIZ.append(": key:");
            sbLIZ.append(str);
            C0C46.LIZIZ("SaveConfigValue", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
    }

    public static void LIZIZ(n nVar, String str) {
        try {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if (kVarLJJIIZ != null) {
                C0C4Y.LIZJ.LJIILJJIL(str, kVarLJJIIZ.toString());
            } else if (nVar.LJJIJIIJIL(str)) {
                C0C4Y.LIZJ.LJIILJJIL(str, null);
            } else {
                C0C4Y.LIZJ.LJIIIIZZ(str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th);
            sbLIZ.append(": key:");
            sbLIZ.append(str);
            C0C46.LIZIZ("SaveConfigValue", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
    }

    public static void LIZJ(n nVar, String str) {
        try {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if (kVarLJJIIZ != null) {
                C0C4Y c0c4y = C0C4Y.LIZJ;
                c0c4y.LJIIIZ().LJFF(str, kVarLJJIIZ.LJIIIZ());
                return;
            }
            C0C4Y.LIZJ.LJIIIIZZ(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th);
            sbLIZ.append(": key:");
            sbLIZ.append(str);
            C0C46.LIZIZ("SaveConfigValue", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
    }

    public static void LIZLLL(n nVar, String str) {
        try {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if (kVarLJJIIZ != null) {
                C0C4Y c0c4y = C0C4Y.LIZJ;
                c0c4y.LJIIIZ().LJIIJ(str, kVarLJJIIZ.LJIIJ());
                return;
            }
            C0C4Y.LIZJ.LJIIIIZZ(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th);
            sbLIZ.append(": key:");
            sbLIZ.append(str);
            C0C46.LIZIZ("SaveConfigValue", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
    }

    public static void LJI(n nVar, String str) {
        int i;
        try {
            q qVarLJJIJIIJI = nVar.LJJIJIIJI(str);
            if (qVarLJJIJIIJI != null) {
                if (qVarLJJIJIIJI.LL instanceof Boolean) {
                    C0C4Y c0c4y = C0C4Y.LIZJ;
                    if (qVarLJJIJIIJI.LJ()) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    c0c4y.LJIIL(str, i);
                    return;
                }
                C0C4Y.LIZJ.LJIIL(str, qVarLJJIJIIJI.LJIIJJI());
                return;
            }
            C0C4Y.LIZJ.LJIIIIZZ(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th);
            sbLIZ.append(": key:");
            sbLIZ.append(str);
            C0C46.LIZIZ("SaveConfigValue", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
    }

    public static void LJII(n nVar, String str) {
        try {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if (kVarLJJIIZ != null) {
                C0C4Y c0c4y = C0C4Y.LIZJ;
                c0c4y.LJIIIZ().LJIIIIZZ(str, kVarLJJIIZ.LJIIZILJ());
                return;
            }
            C0C4Y.LIZJ.LJIIIIZZ(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th);
            sbLIZ.append(": key:");
            sbLIZ.append(str);
            C0C46.LIZIZ("SaveConfigValue", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
    }

    public static void LJIIIIZZ(n nVar, String str) {
        try {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if (kVarLJJIIZ != null) {
                C0C4Y c0c4y = C0C4Y.LIZJ;
                c0c4y.LJIILIIL(str, (String[]) c0c4y.LJIIJ().LIZJ(kVarLJJIIZ, String[].class));
            } else if (nVar.LJJIJIIJIL(str)) {
                C0C4Y.LIZJ.LJIILIIL(str, null);
            } else {
                C0C4Y.LIZJ.LJIIIIZZ(str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th);
            sbLIZ.append(": key:");
            sbLIZ.append(str);
            C0C46.LIZIZ("SaveConfigValue", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
    }

    public static void LJIIIZ(n nVar, String str) {
        try {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if (kVarLJJIIZ != null) {
                C0C4Y.LIZJ.LJIILJJIL(str, kVarLJJIIZ.LJIL());
            } else if (nVar.LJJIJIIJIL(str)) {
                C0C4Y.LIZJ.LJIILJJIL(str, null);
            } else {
                C0C4Y.LIZJ.LJIIIIZZ(str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th);
            sbLIZ.append(": key:");
            sbLIZ.append(str);
            C0C46.LIZIZ("SaveConfigValue", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
    }
}
