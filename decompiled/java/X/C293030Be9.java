package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.nonlaunch.NonLaunchABConfigs;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Be9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C293030Be9 {
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static final C293030Be9 LIZ = new C293030Be9();
    public static Map<String, Integer> LIZLLL = new LinkedHashMap();
    public static Map<String, Long> LJ = new LinkedHashMap();
    public static Map<String, Boolean> LJFF = new LinkedHashMap();
    public static Map<String, Float> LJI = new LinkedHashMap();
    public static Map<String, Double> LJII = new LinkedHashMap();
    public static Map<String, String> LJIIIIZZ = new LinkedHashMap();

    public static void LIZ() {
        NonLaunchABConfigs.Companion companion = NonLaunchABConfigs.Companion;
        companion.fill();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NonLaunchABConfigs ----> map size = ");
        sbLIZ.append(companion.getMap().size());
        C2188811AlT.LIZIZ(sbLIZ);
        for (String str : companion.getMap().keySet()) {
            NonLaunchABConfigs.Companion companion2 = NonLaunchABConfigs.Companion;
            C443120HZe<Boolean, Integer, Object> c443120HZe = companion2.getMap().get(str);
            Integer second = c443120HZe != null ? c443120HZe.getSecond() : null;
            int type_boolean = companion2.getTYPE_BOOLEAN();
            if (second == null || second.intValue() != type_boolean) {
                int type_int = companion2.getTYPE_INT();
                if (second == null || second.intValue() != type_int) {
                    int type_long = companion2.getTYPE_LONG();
                    if (second == null || second.intValue() != type_long) {
                        int type_float = companion2.getTYPE_FLOAT();
                        if (second == null || second.intValue() != type_float) {
                            int type_double = companion2.getTYPE_DOUBLE();
                            if (second == null || second.intValue() != type_double) {
                                int type_string = companion2.getTYPE_STRING();
                                if (second != null && second.intValue() == type_string) {
                                    linkedHashMap6.put(str, C0C59.LJ().LJIIIIZZ(0, str, (String) c443120HZe.getThird(), c443120HZe.getFirst().booleanValue()));
                                }
                            } else {
                                linkedHashMap5.put(str, Double.valueOf(C0C59.LJ().LIZJ(((Double) c443120HZe.getThird()).doubleValue(), 0, str, c443120HZe.getFirst().booleanValue())));
                            }
                        } else {
                            linkedHashMap4.put(str, Float.valueOf(C0C59.LJ().LIZLLL(0, str, c443120HZe.getFirst().booleanValue(), ((Float) c443120HZe.getThird()).floatValue())));
                        }
                    } else {
                        linkedHashMap2.put(str, Long.valueOf(C0C59.LJ().LJII(0, ((Long) c443120HZe.getThird()).longValue(), str, c443120HZe.getFirst().booleanValue())));
                    }
                } else {
                    linkedHashMap.put(str, Integer.valueOf(C0C59.LJ().LJFF(((Integer) c443120HZe.getThird()).intValue(), 0, str, c443120HZe.getFirst().booleanValue())));
                }
            } else {
                linkedHashMap3.put(str, Boolean.valueOf(C0C59.LJ().LIZ(0, str, ((Boolean) c443120HZe.getThird()).booleanValue(), c443120HZe.getFirst().booleanValue())));
            }
        }
        LIZLLL = linkedHashMap;
        LJ = linkedHashMap2;
        LJFF = linkedHashMap3;
        LJI = linkedHashMap4;
        LJII = linkedHashMap5;
        LJIIIIZZ = linkedHashMap6;
    }

    public static void LIZIZ() {
        if (LIZIZ) {
            return;
        }
        synchronized (C293030Be9.class) {
            try {
                if (!LIZIZ) {
                    System.nanoTime();
                    try {
                        LIZ.getClass();
                        LIZ();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    LIZIZ = true;
                    System.nanoTime();
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public static void LIZJ() {
        if (LIZJ) {
            return;
        }
        synchronized (C293030Be9.class) {
            try {
                if (!LIZJ) {
                    ((LinkedHashMap) LIZLLL).clear();
                    ((LinkedHashMap) LJ).clear();
                    ((LinkedHashMap) LJFF).clear();
                    ((LinkedHashMap) LJI).clear();
                    ((LinkedHashMap) LJII).clear();
                    ((LinkedHashMap) LJIIIIZZ).clear();
                    LIZJ = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
