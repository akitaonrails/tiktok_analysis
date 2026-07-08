package X;

import android.app.Application;
import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.ies.abmock.SaveConfigType$ConfigType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0C59, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C59 {
    public static volatile C0C59 LIZLLL;
    public static final Float LJ = Float.valueOf(0.74347335f);
    public static final Double LJFF = Double.valueOf(0.7434733377752801d);
    public static final Integer LJI = 2690237;
    public static final Long LJII = 992354881878L;
    public static final Boolean LJIIIIZZ = Boolean.FALSE;
    public volatile boolean LIZ;
    public volatile InterfaceC292790Bdl LIZIZ;
    public volatile Application LIZJ;

    public static C0C59 LJ() {
        if (LIZLLL == null) {
            synchronized (C0C59.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new C0C59();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public final Object LJIIJJI(String str, boolean z) {
        boolean z2;
        LJIILJJIL(0, false);
        if (!z ? !C307990C5l.LIZLLL : !C307990C5l.LJ) {
            z2 = false;
        } else {
            z2 = true;
        }
        return LJIIL(str, z, z2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0015 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:11:0x0011, B:21:0x005b, B:13:0x0015, B:15:0x0019, B:17:0x0045, B:19:0x0049, B:20:0x0058), top: B:27:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(int r4, boolean r5) {
        /*
            r3 = this;
            boolean r0 = X.C0C5K.LIZ(r4)
            if (r0 == 0) goto L7
            return
        L7:
            if (r5 != 0) goto Le
            boolean r0 = r3.LIZ
            if (r0 == 0) goto Le
            return
        Le:
            monitor-enter(r3)
            if (r5 != 0) goto L15
            boolean r0 = r3.LIZ     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L5b
        L15:
            X.0Bdl r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L5b
            X.0C5A r2 = X.C0C5A.LIZJ()     // Catch: java.lang.Throwable -> L5d
            X.0Bdl r1 = r3.LIZIZ     // Catch: java.lang.Throwable -> L5d
            X.0C5P r0 = X.C0C5P.LIZJ()     // Catch: java.lang.Throwable -> L5d
            X.0C5j r0 = r0.LIZIZ     // Catch: java.lang.Throwable -> L5d
            X.0C5H r0 = r0.LIZ()     // Catch: java.lang.Throwable -> L5d
            r2.LJ = r1     // Catch: java.lang.Throwable -> L5d
            r2.LIZLLL = r0     // Catch: java.lang.Throwable -> L5d
            r0 = 2000(0x7d0, double:9.88E-321)
            X.15O7 r1 = X.C15O7.LJIIIIZZ(r0)     // Catch: java.lang.Throwable -> L5d
            X.0C5E r0 = new X.0C5E     // Catch: java.lang.Throwable -> L5d
            r0.<init>()     // Catch: java.lang.Throwable -> L5d
            r1.LIZLLL(r0)     // Catch: java.lang.Throwable -> L5d
            X.0C5P r0 = X.C0C5P.LIZJ()     // Catch: java.lang.Throwable -> L5d
            boolean r0 = r0.LJFF()     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L58
            android.app.Application r0 = r3.LIZJ     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L58
            X.0C5P r0 = X.C0C5P.LIZJ()     // Catch: java.lang.Throwable -> L5d
            X.0C5j r0 = r0.LIZIZ     // Catch: java.lang.Throwable -> L5d
            X.0C5H r1 = r0.LIZ()     // Catch: java.lang.Throwable -> L5d
            android.app.Application r0 = r3.LIZJ     // Catch: java.lang.Throwable -> L5d
            r1.init(r0)     // Catch: java.lang.Throwable -> L5d
        L58:
            r0 = 1
            r3.LIZ = r0     // Catch: java.lang.Throwable -> L5d
        L5b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5d
            return
        L5d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0C59.LJIILJJIL(int, boolean):void");
    }

    public final boolean LIZIZ(String str, boolean z, boolean z2) {
        LJIILJJIL(0, false);
        return LIZ(0, str, z, z2);
    }

    public final int LJI(String str, int i, boolean z) {
        LJIILJJIL(0, false);
        return LJFF(i, 0, str, z);
    }

    public final Object LJIIIZ(int i, String str, boolean z) {
        LJIILJJIL(i, false);
        C0C5A c0c5aLIZJ = C0C5A.LIZJ();
        c0c5aLIZJ.getClass();
        if (C0C5K.LIZ(i)) {
            return C307760C4o.LIZJ.LJFF(str);
        }
        Object objLJFF = c0c5aLIZJ.LJFF(str, SaveConfigType$ConfigType.STRING_ARRAY, String[].class);
        Object obj = C0C5A.LJIIJ;
        if (objLJFF == obj) {
            if (c0c5aLIZJ.LJIIIIZZ) {
                return null;
            }
            c0c5aLIZJ.LJI(str);
        } else if (objLJFF != null) {
            return objLJFF;
        }
        if (c0c5aLIZJ.LJI) {
            return c0c5aLIZJ.LIZIZ(str, null, i, z, false, false, null, C0C7M.STRING_ARRAY);
        }
        String[] strArrLJFF = C0C5A.LJIIIZ(i, str, false).LJFF(str);
        if (strArrLJFF == null && c0c5aLIZJ.LJIIIIZZ) {
            c0c5aLIZJ.LJIIIIZZ(obj, str, z, false);
            return strArrLJFF;
        }
        c0c5aLIZJ.LJIIIIZZ(strArrLJFF, str, z, false);
        return strArrLJFF;
    }

    public final boolean LIZ(int i, String str, boolean z, boolean z2) {
        LJIILJJIL(i, false);
        C0C5A c0c5aLIZJ = C0C5A.LIZJ();
        c0c5aLIZJ.getClass();
        if (C0C5K.LIZ(i)) {
            return C307760C4o.LIZJ.LIZJ(str, z);
        }
        Object objLJFF = c0c5aLIZJ.LJFF(str, SaveConfigType$ConfigType.BOOLEAN, null);
        if (objLJFF != null) {
            return ((Boolean) objLJFF).booleanValue();
        }
        if (c0c5aLIZJ.LJI) {
            return ((Boolean) c0c5aLIZJ.LIZIZ(str, Boolean.valueOf(z), i, z2, false, false, null, C0C7M.BOOLEAN)).booleanValue();
        }
        Boolean boolValueOf = Boolean.valueOf(C0C5A.LJIIIZ(i, str, false).LIZJ(str, z));
        c0c5aLIZJ.LJIIIIZZ(boolValueOf, str, z2, false);
        return boolValueOf.booleanValue();
    }

    public final double LIZJ(double d, int i, String str, boolean z) {
        LJIILJJIL(i, false);
        C0C5A c0c5aLIZJ = C0C5A.LIZJ();
        c0c5aLIZJ.getClass();
        if (C0C5K.LIZ(i)) {
            return C307760C4o.LIZJ.LJI(str, d);
        }
        Object objLJFF = c0c5aLIZJ.LJFF(str, SaveConfigType$ConfigType.DOUBLE, null);
        if (objLJFF != null) {
            return ((Double) objLJFF).doubleValue();
        }
        if (c0c5aLIZJ.LJI) {
            return ((Double) c0c5aLIZJ.LIZIZ(str, Double.valueOf(d), i, z, false, false, null, C0C7M.DOUBLE)).doubleValue();
        }
        Double dValueOf = Double.valueOf(C0C5A.LJIIIZ(i, str, false).LJI(str, d));
        c0c5aLIZJ.LJIIIIZZ(dValueOf, str, z, false);
        return dValueOf.doubleValue();
    }

    public final float LIZLLL(int i, String str, boolean z, float f) {
        LJIILJJIL(i, false);
        C0C5A c0c5aLIZJ = C0C5A.LIZJ();
        c0c5aLIZJ.getClass();
        if (C0C5K.LIZ(i)) {
            return C307760C4o.LIZJ.LIZLLL(str, f);
        }
        Object objLJFF = c0c5aLIZJ.LJFF(str, SaveConfigType$ConfigType.FLOAT, null);
        if (objLJFF != null) {
            return ((Float) objLJFF).floatValue();
        }
        if (c0c5aLIZJ.LJI) {
            return ((Float) c0c5aLIZJ.LIZIZ(str, Float.valueOf(f), i, z, false, false, null, C0C7M.FLOAT)).floatValue();
        }
        Float fValueOf = Float.valueOf(C0C5A.LJIIIZ(i, str, false).LIZLLL(str, f));
        c0c5aLIZJ.LJIIIIZZ(fValueOf, str, z, false);
        return fValueOf.floatValue();
    }

    public final int LJFF(int i, int i2, String str, boolean z) {
        LJIILJJIL(i2, false);
        C0C5A c0c5aLIZJ = C0C5A.LIZJ();
        c0c5aLIZJ.getClass();
        if (C0C5K.LIZ(i2)) {
            return C307760C4o.LIZJ.LIZ(str, i);
        }
        Object objLJFF = c0c5aLIZJ.LJFF(str, SaveConfigType$ConfigType.INT, null);
        if (objLJFF != null) {
            return ((Integer) objLJFF).intValue();
        }
        if (c0c5aLIZJ.LJI) {
            return ((Integer) c0c5aLIZJ.LIZIZ(str, Integer.valueOf(i), i2, z, false, false, null, C0C7M.INT)).intValue();
        }
        Integer numValueOf = Integer.valueOf(C0C5A.LJIIIZ(i2, str, false).LIZ(str, i));
        c0c5aLIZJ.LJIIIIZZ(numValueOf, str, z, false);
        return numValueOf.intValue();
    }

    public final long LJII(int i, long j, String str, boolean z) {
        LJIILJJIL(i, false);
        C0C5A c0c5aLIZJ = C0C5A.LIZJ();
        c0c5aLIZJ.getClass();
        if (C0C5K.LIZ(i)) {
            return C307760C4o.LIZJ.LJ(str, j);
        }
        Object objLJFF = c0c5aLIZJ.LJFF(str, SaveConfigType$ConfigType.LONG, null);
        if (objLJFF != null) {
            return ((Long) objLJFF).longValue();
        }
        if (c0c5aLIZJ.LJI) {
            return ((Long) c0c5aLIZJ.LIZIZ(str, Long.valueOf(j), i, z, false, false, null, C0C7M.LONG)).longValue();
        }
        Long lValueOf = Long.valueOf(C0C5A.LJIIIZ(i, str, false).LJ(str, j));
        c0c5aLIZJ.LJIIIIZZ(lValueOf, str, z, false);
        return lValueOf.longValue();
    }

    public final String LJIIIIZZ(int i, String str, String str2, boolean z) {
        LJIILJJIL(i, false);
        C0C5A c0c5aLIZJ = C0C5A.LIZJ();
        c0c5aLIZJ.getClass();
        if (C0C5K.LIZ(i)) {
            return C307760C4o.LIZJ.LIZIZ(str, str2);
        }
        Object objLJFF = c0c5aLIZJ.LJFF(str, SaveConfigType$ConfigType.STRING, null);
        if (objLJFF != null) {
            return (String) objLJFF;
        }
        if (c0c5aLIZJ.LJI) {
            return (String) c0c5aLIZJ.LIZIZ(str, str2, i, z, false, true, null, C0C7M.STRING);
        }
        C0C5C c0c5cLJIIIZ = C0C5A.LJIIIZ(i, str, true);
        if (c0c5cLJIIIZ instanceof C307870C4z) {
            Long lValueOf = (Long) ((ConcurrentHashMap) c0c5aLIZJ.LIZIZ).get(str);
            if (lValueOf == null) {
                lValueOf = Long.valueOf(c0c5cLJIIIZ.LJ(str, -1L));
            }
            if (lValueOf.longValue() == -1) {
                return str2;
            }
            c0c5aLIZJ.LJII(lValueOf.longValue(), str, z);
            C307860C4y c307860C4y = C307860C4y.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(lValueOf);
            sbLIZ.append("");
            return c307860C4y.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), null);
        }
        String strLIZIZ = c0c5cLJIIIZ.LIZIZ(str, str2);
        c0c5aLIZJ.LJIIIIZZ(strLIZIZ, str, z, false);
        return strLIZIZ;
    }

    public final Object LJIIL(String str, boolean z, boolean z2, boolean z3) {
        boolean zContainsKey;
        ConfigItem configItem;
        int i;
        Map<String, Object> map;
        LJIILJJIL(0, false);
        try {
            C292560BdO.LJFF.put(Integer.valueOf(Thread.currentThread().hashCode()), Boolean.TRUE);
            LJ().LJIILJJIL(0, false);
            if (str != null && !str.isEmpty() && (map = C2281541ESa.LIZ) != null && !((HashMap) map).isEmpty()) {
                zContainsKey = ((HashMap) map).containsKey(str);
            } else {
                zContainsKey = false;
            }
            if (zContainsKey) {
                Object obj = ((HashMap) C2281541ESa.LIZ).get(str);
                C0C5P c0c5pLIZJ = C0C5P.LIZJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isClientExpValue, value = ");
                sbLIZ.append(obj);
                C2188811AlT.LIZIZ(sbLIZ);
                c0c5pLIZJ.LJIIZILJ();
                C292560BdO.LIZIZ();
                return obj;
            }
            Map<String, ConfigItem> map2 = C2502809rO.LIZ;
            if (z3) {
                if (map2 != null) {
                    HashMap map3 = (HashMap) map2;
                    if (!map3.isEmpty()) {
                        configItem = (ConfigItem) map3.get(str);
                    }
                }
                C0C5P.LIZJ().LJIIZILJ();
                C292560BdO.LIZIZ();
                return null;
            }
            configItem = null;
            if (configItem == null) {
                C0C54 c0c54 = C0C54.LIZJ;
                C0C5R c0c5r = c0c54.LIZIZ;
                c0c5r.LIZ();
                if (c0c5r.LIZ.contains(str)) {
                    Object objLIZLLL = c0c54.LIZLLL(str, z2);
                    if (z) {
                        String strLJIILL = C00S4.LIZ().LJIILL(objLIZLLL);
                        C0C5P c0c5pLIZJ2 = C0C5P.LIZJ();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("UnregisteredConfigCenterRepo, returnStringForObject = true, value = ");
                        sbLIZ2.append(strLJIILL);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        c0c5pLIZJ2.LJIIZILJ();
                        C292560BdO.LIZIZ();
                        return strLJIILL;
                    }
                    C0C5P c0c5pLIZJ3 = C0C5P.LIZJ();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("UnregisteredConfigCenterRepo, returnStringForObject = false, value = ");
                    sbLIZ3.append(objLIZLLL);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    c0c5pLIZJ3.LJIIZILJ();
                    C292560BdO.LIZIZ();
                    return objLIZLLL;
                }
                if (z3) {
                    C292560BdO.LIZIZ();
                    return null;
                }
            }
            if (!z3) {
                if (map2 != null) {
                    HashMap map4 = (HashMap) map2;
                    if (!map4.isEmpty()) {
                        C0C5P.LIZJ().LJIIZILJ();
                        configItem = (ConfigItem) map4.get(str);
                    }
                }
                C0C5P.LIZJ().LJIIZILJ();
                C292560BdO.LIZIZ();
                return null;
            }
            if (configItem != null) {
                if (configItem.isLaunch) {
                    i = 2;
                } else {
                    i = 0;
                }
                try {
                    switch (C0C4K.LIZ[configItem.type.ordinal()]) {
                        case 1:
                            int iIntValue = LJI.intValue();
                            Object obj2 = configItem.defaultValue;
                            if (obj2 != null) {
                                iIntValue = ((Integer) obj2).intValue();
                            }
                            Integer numValueOf = Integer.valueOf(LJ().LJFF(iIntValue, i, str, false));
                            C292560BdO.LIZIZ();
                            return numValueOf;
                        case 2:
                            boolean zBooleanValue = LJIIIIZZ.booleanValue();
                            Object obj3 = configItem.defaultValue;
                            if (obj3 != null) {
                                zBooleanValue = ((Boolean) obj3).booleanValue();
                            }
                            Boolean boolValueOf = Boolean.valueOf(LJ().LIZ(i, str, zBooleanValue, false));
                            C292560BdO.LIZIZ();
                            return boolValueOf;
                        case 3:
                            long jLongValue = LJII.longValue();
                            Object obj4 = configItem.defaultValue;
                            if (obj4 != null) {
                                jLongValue = ((Long) obj4).longValue();
                            }
                            Long lValueOf = Long.valueOf(LJ().LJII(i, jLongValue, str, false));
                            C292560BdO.LIZIZ();
                            return lValueOf;
                        case 4:
                            double dDoubleValue = LJFF.doubleValue();
                            Object obj5 = configItem.defaultValue;
                            if (obj5 != null) {
                                dDoubleValue = ((Double) obj5).doubleValue();
                            }
                            Double dValueOf = Double.valueOf(LJ().LIZJ(dDoubleValue, i, str, false));
                            C292560BdO.LIZIZ();
                            return dValueOf;
                        case 5:
                            float fFloatValue = LJ.floatValue();
                            Object obj6 = configItem.defaultValue;
                            if (obj6 != null) {
                                fFloatValue = ((Float) obj6).floatValue();
                            }
                            Float fValueOf = Float.valueOf(LJ().LIZLLL(i, str, false, fFloatValue));
                            C292560BdO.LIZIZ();
                            return fValueOf;
                        case 6:
                            String strLJIIIIZZ = LJ().LJIIIIZZ(i, str, (String) configItem.defaultValue, false);
                            C292560BdO.LIZIZ();
                            return strLJIIIIZZ;
                        case 7:
                            Object objLJIIIZ = LJ().LJIIIZ(i, str, false);
                            if (z) {
                                String strLJIILL2 = C00S4.LIZ().LJIILL(objLJIIIZ);
                                C292560BdO.LIZIZ();
                                return strLJIILL2;
                            }
                            C292560BdO.LIZIZ();
                            return objLJIIIZ;
                        case 8:
                            Object objLJIIJ = LJ().LJIIJ(str, false, true, k.class, i);
                            if (z) {
                                String strLJIILL3 = C00S4.LIZ().LJIILL(objLJIIJ);
                                C292560BdO.LIZIZ();
                                return strLJIILL3;
                            }
                            C292560BdO.LIZIZ();
                            return objLJIIJ;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C0C5P c0c5pLIZJ4 = C0C5P.LIZJ();
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("get registered key failed, e = ");
                    sbLIZ4.append(th.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ4);
                    c0c5pLIZJ4.LJIIZILJ();
                }
            }
            C0C5P.LIZJ().LJIIZILJ();
            C292560BdO.LIZIZ();
            return null;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C292560BdO.LIZIZ();
            throw th2;
        }
    }

    public final Object LJIILIIL(Class cls, Object obj, String str, boolean z) {
        LJIILJJIL(0, false);
        try {
            LJIILJJIL(0, false);
            LJIILJJIL(0, false);
            Object objLJIIJ = LJIIJ(str, z, false, cls, 0);
            if (objLJIIJ == null) {
                C0C5A.LIZJ().getClass();
                if (C0C4Y.LIZJ.LJIIIZ().LJIIIZ(str)) {
                    return obj;
                }
            }
            return objLJIIJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return obj;
        }
    }

    public final <T> T LJIIJ(String str, boolean z, boolean z2, Class cls, int i) {
        LJIILJJIL(i, false);
        C0C5A c0c5aLIZJ = C0C5A.LIZJ();
        c0c5aLIZJ.getClass();
        if (C0C5K.LIZ(i)) {
            return (T) C307760C4o.LIZJ.LJII(str, cls);
        }
        T t = (T) c0c5aLIZJ.LJFF(str, SaveConfigType$ConfigType.OBJECT, cls);
        Object obj = C0C5A.LJIIJ;
        if (t == obj) {
            if (c0c5aLIZJ.LJIIIIZZ) {
                return null;
            }
            c0c5aLIZJ.LJI(str);
        } else if (t != null) {
            return t;
        }
        if (c0c5aLIZJ.LJI) {
            return (T) c0c5aLIZJ.LIZIZ(str, null, i, z, z2, true, cls, C0C7M.OBJECT);
        }
        C0C5C c0c5cLJIIIZ = C0C5A.LJIIIZ(i, str, true);
        if (c0c5cLJIIIZ instanceof C307870C4z) {
            Long lValueOf = (Long) ((ConcurrentHashMap) c0c5aLIZJ.LIZIZ).get(str);
            if (lValueOf == null) {
                lValueOf = Long.valueOf(c0c5cLJIIIZ.LJ(str, -1L));
            }
            if (lValueOf.longValue() == -1) {
                return null;
            }
            c0c5aLIZJ.LJII(lValueOf.longValue(), str, z);
            C307860C4y c307860C4y = C307860C4y.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(lValueOf);
            sbLIZ.append("");
            return (T) c307860C4y.LJII(C2188811AlT.LIZIZ(sbLIZ), cls);
        }
        T t2 = (T) c0c5cLJIIIZ.LJII(str, cls);
        if (t2 == null && c0c5aLIZJ.LJIIIIZZ) {
            c0c5aLIZJ.LJIIIIZZ(obj, str, z, z2);
            return t2;
        }
        c0c5aLIZJ.LJIIIIZZ(t2, str, z, z2);
        return t2;
    }
}
