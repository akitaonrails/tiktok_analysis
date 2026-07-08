package X;

import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.data.HybridABApi;
import defpackage.c2;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0COc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C312840COc {
    public static final C312840COc LIZ = new C312840COc();
    public static final C0C4V LIZIZ = new C0C4W() { // from class: X.0C4V
        @Override // X.C0C4W
        public final void LIZ(Map<String, ? extends Map<String, HybridABApi.HybridABConfig>> map, Map<String, HybridABApi.HybridABConfig> map2) {
            String strLIZIZ;
            n nVar;
            ConfigItem configItem;
            k kVarLJJIIZ;
            k kVarLJJIIZ2;
            k kVarLJJIIZ3;
            q qVarLJJIJIIJI;
            boolean z;
            q qVarLJJIJIIJI2;
            int i;
            k kVarLJJIIZ4;
            k kVarLJJIIZ5;
            k kVarLJJIIZ6;
            k kVarLJJIIZ7;
            if ((map == null || map.isEmpty()) && (map2 == null || map2.isEmpty())) {
                return;
            }
            HashMap map3 = new HashMap();
            if (map2 != null) {
                map3.putAll(map2);
            }
            if (map != null) {
                for (Map.Entry<String, ? extends Map<String, HybridABApi.HybridABConfig>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Map<String, HybridABApi.HybridABConfig> value = entry.getValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("parse and save ");
                    sbLIZ.append(key);
                    sbLIZ.append(" value");
                    C2188811AlT.LIZIZ(sbLIZ);
                    k jsonTree = GsonProtectorUtils.toJsonTree(C08JS.LIZIZ(), entry.getValue());
                    if (jsonTree instanceof n) {
                        nVar = (n) jsonTree;
                    } else {
                        nVar = null;
                    }
                    if (key != null) {
                        key.isEmpty();
                    }
                    for (Map.Entry entry2 : ((HashMap) C2503109rR.LIZ).entrySet()) {
                        String str = (String) entry2.getKey();
                        ConfigItem configItem2 = (ConfigItem) entry2.getValue();
                        if (configItem2.isHybrid) {
                            C0C5A c0c5aLIZJ = C0C5A.LIZJ();
                            if (str != null) {
                                ((ConcurrentHashMap) c0c5aLIZJ.LIZJ).remove(str);
                            } else {
                                c0c5aLIZJ.getClass();
                            }
                            try {
                                n nVarLJJIJ = nVar.LJJIJ(str);
                                if (nVarLJJIJ != null && (kVarLJJIIZ7 = nVarLJJIJ.LJJIIZ("vid")) != null && !(kVarLJJIIZ7 instanceof m)) {
                                    String strLJIL = kVarLJJIIZ7.LJIL();
                                    if (str != null) {
                                        String strLIZJ = C0C4S.LIZJ(str);
                                        C0C4X c0c4x = C0C4X.LIZJ;
                                        c0c4x.getClass();
                                        c0c4x.LIZ.LIZIZ(strLIZJ, strLJIL);
                                    }
                                } else if (nVar.LJJIJIIJIL(str) && str != null) {
                                    String strLIZJ2 = C0C4S.LIZJ(str);
                                    C0C4X c0c4x2 = C0C4X.LIZJ;
                                    c0c4x2.getClass();
                                    c0c4x2.LIZ.LIZIZ(strLIZJ2, null);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(th);
                                sbLIZ2.append("  , key: ");
                                sbLIZ2.append(str);
                                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                            }
                            switch (C0C4N.LIZ[configItem2.type.ordinal()]) {
                                case 1:
                                    try {
                                        n nVarLJJIJ2 = nVar.LJJIJ(str);
                                        if (nVarLJJIJ2 != null && (qVarLJJIJIIJI = nVarLJJIJ2.LJJIJIIJI("val")) != null) {
                                            if (qVarLJJIJIIJI.LL instanceof Number) {
                                                C0C4X c0c4x3 = C0C4X.LIZJ;
                                                c0c4x3.getClass();
                                                if (qVarLJJIJIIJI.LJIIJJI() != 0) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                c0c4x3.LIZ.LIZLLL(str, z);
                                            } else {
                                                C0C4X c0c4x4 = C0C4X.LIZJ;
                                                c0c4x4.getClass();
                                                c0c4x4.LIZ.LIZLLL(str, qVarLJJIJIIJI.LJ());
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        TryCatchGuardChecker.doCheck(th2);
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append(th2);
                                        sbLIZ3.append("  , key: ");
                                        sbLIZ3.append(str);
                                        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
                                    }
                                    break;
                                case 2:
                                    try {
                                        n nVarLJJIJ3 = nVar.LJJIJ(str);
                                        if (nVarLJJIJ3 != null && (qVarLJJIJIIJI2 = nVarLJJIJ3.LJJIJIIJI("val")) != null) {
                                            if (qVarLJJIJIIJI2.LL instanceof Boolean) {
                                                C0C4X c0c4x5 = C0C4X.LIZJ;
                                                c0c4x5.getClass();
                                                if (qVarLJJIJIIJI2.LJ()) {
                                                    i = 1;
                                                } else {
                                                    i = 0;
                                                }
                                                c0c4x5.LIZ.LIZJ(str, i);
                                            } else {
                                                C0C4X c0c4x6 = C0C4X.LIZJ;
                                                c0c4x6.getClass();
                                                c0c4x6.LIZ.LIZJ(str, qVarLJJIJIIJI2.LJIIJJI());
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        TryCatchGuardChecker.doCheck(th3);
                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                        sbLIZ4.append(th3);
                                        sbLIZ4.append("  , key: ");
                                        sbLIZ4.append(str);
                                        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ4));
                                    }
                                    break;
                                case 3:
                                    try {
                                        n nVarLJJIJ4 = nVar.LJJIJ(str);
                                        if (nVarLJJIJ4 != null && (kVarLJJIIZ4 = nVarLJJIJ4.LJJIIZ("val")) != null && !(kVarLJJIIZ4 instanceof m)) {
                                            C0C4X c0c4x7 = C0C4X.LIZJ;
                                            c0c4x7.getClass();
                                            c0c4x7.LIZ.LJIIIIZZ(str, kVarLJJIIZ4.LJIIZILJ());
                                        }
                                    } catch (Throwable th4) {
                                        TryCatchGuardChecker.doCheck(th4);
                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                        sbLIZ5.append(th4);
                                        sbLIZ5.append("  , key: ");
                                        sbLIZ5.append(str);
                                        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ5));
                                    }
                                    break;
                                case 4:
                                    try {
                                        n nVarLJJIJ5 = nVar.LJJIJ(str);
                                        if (nVarLJJIJ5 != null && (kVarLJJIIZ2 = nVarLJJIJ5.LJJIIZ("val")) != null && !(kVarLJJIIZ2 instanceof m)) {
                                            C0C4X c0c4x8 = C0C4X.LIZJ;
                                            c0c4x8.getClass();
                                            c0c4x8.LIZ.LJFF(str, kVarLJJIIZ2.LJIIIZ());
                                        }
                                    } catch (Throwable th5) {
                                        TryCatchGuardChecker.doCheck(th5);
                                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                        sbLIZ6.append(th5);
                                        sbLIZ6.append("  , key: ");
                                        sbLIZ6.append(str);
                                        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ6));
                                    }
                                    break;
                                case 5:
                                    try {
                                        n nVarLJJIJ6 = nVar.LJJIJ(str);
                                        if (nVarLJJIJ6 != null && (kVarLJJIIZ6 = nVarLJJIJ6.LJJIIZ("val")) != null && !(kVarLJJIIZ6 instanceof m)) {
                                            C0C4X c0c4x9 = C0C4X.LIZJ;
                                            c0c4x9.getClass();
                                            c0c4x9.LIZ.LJIIJ(str, kVarLJJIIZ6.LJIIJ());
                                        }
                                    } catch (Throwable th6) {
                                        TryCatchGuardChecker.doCheck(th6);
                                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                        sbLIZ7.append(th6);
                                        sbLIZ7.append("  , key: ");
                                        sbLIZ7.append(str);
                                        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ7));
                                    }
                                    break;
                                case 6:
                                    try {
                                        n nVarLJJIJ7 = nVar.LJJIJ(str);
                                        if (nVarLJJIJ7 != null && (kVarLJJIIZ3 = nVarLJJIJ7.LJJIIZ("val")) != null && !(kVarLJJIIZ3 instanceof m)) {
                                            C0C4X c0c4x10 = C0C4X.LIZJ;
                                            c0c4x10.getClass();
                                            c0c4x10.LIZ.LIZIZ(str, kVarLJJIIZ3.LJIL());
                                        } else if (nVar.LJJIJIIJIL(str)) {
                                            C0C4X c0c4x11 = C0C4X.LIZJ;
                                            c0c4x11.getClass();
                                            c0c4x11.LIZ.LIZIZ(str, null);
                                        }
                                    } catch (Throwable th7) {
                                        TryCatchGuardChecker.doCheck(th7);
                                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                        sbLIZ8.append(th7);
                                        sbLIZ8.append("  , key: ");
                                        sbLIZ8.append(str);
                                        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ8));
                                    }
                                    break;
                                case 7:
                                    try {
                                        n nVarLJJIJ8 = nVar.LJJIJ(str);
                                        if (nVarLJJIJ8 != null && (kVarLJJIIZ = nVarLJJIJ8.LJJIIZ("val")) != null && !(kVarLJJIIZ instanceof m)) {
                                            C0C4X c0c4x12 = C0C4X.LIZJ;
                                            if (c0c4x12.LIZIZ == null) {
                                                c0c4x12.LIZIZ = new Gson();
                                            }
                                            c0c4x12.LIZ.LJII(str, (String[]) c0c4x12.LIZIZ.LIZJ(kVarLJJIIZ, String[].class));
                                        } else if (nVar.LJJIJIIJIL(str)) {
                                            C0C4X c0c4x13 = C0C4X.LIZJ;
                                            c0c4x13.getClass();
                                            c0c4x13.LIZ.LJII(str, null);
                                        }
                                    } catch (Throwable th8) {
                                        TryCatchGuardChecker.doCheck(th8);
                                        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                        sbLIZ9.append(th8);
                                        sbLIZ9.append("  , key: ");
                                        sbLIZ9.append(str);
                                        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ9));
                                    }
                                    break;
                                default:
                                    try {
                                        n nVarLJJIJ9 = nVar.LJJIJ(str);
                                        if (nVarLJJIJ9 != null && (kVarLJJIIZ5 = nVarLJJIJ9.LJJIIZ("val")) != null && !(kVarLJJIIZ5 instanceof m)) {
                                            C0C4X c0c4x14 = C0C4X.LIZJ;
                                            c0c4x14.getClass();
                                            c0c4x14.LIZ.LIZIZ(str, kVarLJJIIZ5.toString());
                                        } else if (nVar.LJJIJIIJIL(str)) {
                                            C0C4X c0c4x15 = C0C4X.LIZJ;
                                            c0c4x15.getClass();
                                            c0c4x15.LIZ.LIZIZ(str, null);
                                        }
                                    } catch (Throwable th9) {
                                        TryCatchGuardChecker.doCheck(th9);
                                        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                        sbLIZ10.append(th9);
                                        sbLIZ10.append("  , key: ");
                                        sbLIZ10.append(str);
                                        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ10));
                                    }
                                    break;
                            }
                        }
                    }
                    for (Map.Entry<String, HybridABApi.HybridABConfig> entry3 : value.entrySet()) {
                        HybridABApi.HybridABConfig hybridABConfig = (HybridABApi.HybridABConfig) map3.get(entry3.getKey());
                        if (hybridABConfig != null && Intrinsics.LJFF(hybridABConfig.vid, entry3.getValue().vid)) {
                            map3.remove(entry3.getKey());
                        }
                    }
                    Map<String, ConfigItem> map4 = C2503109rR.LIZIZ;
                    Map<String, ConfigItem> map5 = C2503109rR.LIZ;
                    for (Map.Entry<String, HybridABApi.HybridABConfig> entry4 : value.entrySet()) {
                        String key2 = entry4.getKey();
                        HybridABApi.HybridABConfig value2 = entry4.getValue();
                        C0CR3.LIZ.getClass();
                        Set<String> set = C0CR3.LIZLLL;
                        String str2 = value2.vid;
                        String str3 = "";
                        if (str2 == null) {
                            str2 = "";
                        }
                        set.add(str2);
                        HashMap map6 = (HashMap) map4;
                        if (!map6.containsKey(key2)) {
                            Set<String> set2 = C0CR3.LJ;
                            String str4 = value2.vid;
                            if (str4 == null) {
                                str4 = "";
                            }
                            set2.add(str4);
                        }
                        if (!map6.containsKey(key2) && (configItem = (ConfigItem) ((HashMap) map5).get(key2)) != null && configItem.isHybrid && !C306900C1g.LIZ(key2)) {
                            C293180BeO c293180BeO = C0C4U.LIZ;
                            C0C4U.LIZ.LIZ(value2.vid, false);
                            StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                            sbLIZ11.append("full expose ");
                            sbLIZ11.append(key2);
                            sbLIZ11.append(" vid:");
                            sbLIZ11.append(value2.vid);
                            C2188811AlT.LIZIZ(sbLIZ11);
                            Set<String> set3 = C0CR3.LJFF;
                            String str5 = value2.vid;
                            if (str5 != null) {
                                str3 = str5;
                            }
                            set3.add(str3);
                        } else if (!map6.containsKey(key2)) {
                            Set<String> set4 = C0CR3.LJI;
                            String str6 = value2.vid;
                            if (str6 != null) {
                                str3 = str6;
                            }
                            set4.add(str3);
                        }
                    }
                }
            }
            for (Map.Entry entry5 : map3.entrySet()) {
                StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                sbLIZ12.append("close experiment ");
                sbLIZ12.append((String) entry5.getKey());
                sbLIZ12.append(" : ");
                sbLIZ12.append(((HybridABApi.HybridABConfig) entry5.getValue()).vid);
                C2188811AlT.LIZIZ(sbLIZ12);
                String str7 = (String) entry5.getKey();
                String str8 = ((HybridABApi.HybridABConfig) entry5.getValue()).vid;
                if (str8 != null) {
                    if (str7 == null) {
                        strLIZIZ = null;
                    } else {
                        strLIZIZ = C0C4X.LIZJ.LIZIZ(C0C4S.LIZJ(str7), null);
                    }
                    if (str8.equals(strLIZIZ)) {
                        C0C4S.LIZ(str7);
                        if (str7 != null) {
                            C0C4S.LIZ(C0C4S.LIZJ(str7));
                        }
                        C0C5A.LIZJ().LJI(str7);
                    }
                }
                C293180BeO c293180BeO2 = C0C4U.LIZ;
                String str9 = ((HybridABApi.HybridABConfig) entry5.getValue()).vid;
                C293180BeO c293180BeO3 = C0C4U.LIZ;
                c293180BeO3.getClass();
                List<String> listLIZJ = C293180BeO.LIZJ(str9);
                if (listLIZJ != null) {
                    ((C293230BeT) c293180BeO3.LIZLLL.getValue()).LIZJ(listLIZJ);
                    C293230BeT c293230BeTLIZIZ = c293180BeO3.LIZIZ();
                    if (c293230BeTLIZIZ != null) {
                        c293230BeTLIZIZ.LIZJ(listLIZJ);
                    }
                    C292560BdO.LJ();
                }
            }
        }
    };
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C312850COd());
    public static Function0<Boolean> LIZLLL;

    public static boolean LIZIZ() {
        Function0<Boolean> function0 = LIZLLL;
        if (function0 != null) {
            return function0.invoke().booleanValue();
        }
        return false;
    }

    public static void LIZ(InterfaceC313560CQw interfaceC313560CQw, Function0 function0) {
        LIZLLL = function0;
        C0C5P.LIZJ().LJIIIIZZ = C0C4T.LIZ;
        C01GW c01gw = LIZJ;
        ((C313580CQy) c01gw.getValue()).LJI = interfaceC313560CQw;
        if (((Boolean) function0.invoke()).booleanValue()) {
            C313580CQy c313580CQy = (C313580CQy) c01gw.getValue();
            boolean zLJI = MethodIDManager.LJI(196612);
            c313580CQy.LIZIZ(false, false);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        long j = c2.LIZ().delayMs;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C11RO c11ro = C11S5.LIZIZ;
        C1701890uOB.LIZ(timeUnit, "unit is null");
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        new C19477411Ie(j, timeUnit, c11ro).LJIJI(new C09JN() { // from class: X.0CO6
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("HybridABManager@8d88.init$2");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("init delay error :");
                sbLIZ.append(obj);
                C2188811AlT.LIZIZ(sbLIZ);
                C312840COc.LIZ.getClass();
                C313580CQy c313580CQy2 = (C313580CQy) C312840COc.LIZJ.getValue();
                boolean zLJI2 = MethodIDManager.LJI(196612);
                c313580CQy2.LIZIZ(false, false);
                if (zLJI2) {
                    MethodIDManager.LJ();
                }
                C1C7U.LIZIZ("HybridABManager@8d88.init$2");
            }
        }, new InterfaceC781210Ukh() { // from class: X.0CO7
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                C312840COc.LIZ.getClass();
                C313580CQy c313580CQy2 = (C313580CQy) C312840COc.LIZJ.getValue();
                boolean zLJI2 = MethodIDManager.LJI(196612);
                c313580CQy2.LIZIZ(false, false);
                if (zLJI2) {
                    MethodIDManager.LJ();
                }
            }
        });
    }
}
