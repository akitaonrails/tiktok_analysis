package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D1W, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D1W {
    public static final Map<String, InterfaceC332330D1b> LIZ = C2097608Jq.LJIIIIZZ(new Pair("abTestBool", new InterfaceC332330D1b() { // from class: X.0D1S
        @Override // X.InterfaceC332330D1b
        public final Object LIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
            Object objLJJJLZIJ;
            String str;
            Object objLJJJLZIJ2;
            Boolean bool;
            Boolean bool2;
            boolean zLJIIIZ;
            Boolean boolValueOf;
            boolean zBooleanValue = false;
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            } else {
                objLJJJLZIJ = null;
            }
            if (!(objLJJJLZIJ instanceof String) || (str = (String) objLJJJLZIJ) == null) {
                return null;
            }
            if (list != null) {
                objLJJJLZIJ2 = C13LP.LJJJLZIJ(1, list);
            } else {
                objLJJJLZIJ2 = null;
            }
            if (objLJJJLZIJ2 instanceof Boolean) {
                bool = (Boolean) objLJJJLZIJ2;
            } else {
                bool = null;
            }
            if (!C0D1W.LIZ(str)) {
                C0D1Q.LIZ.getClass();
                q qVarLIZ = C0D1Q.LIZ(str);
                if (qVarLIZ != null && (boolValueOf = Boolean.valueOf(qVarLIZ.LJ())) != null) {
                    zLJIIIZ = boolValueOf.booleanValue();
                } else {
                    zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(0, str, true, Intrinsics.LJFF(bool, Boolean.TRUE));
                }
                Boolean boolValueOf2 = Boolean.valueOf(zLJIIIZ);
                if (boolValueOf2 != null) {
                    zBooleanValue = boolValueOf2.booleanValue();
                }
            } else {
                Object objLIZIZ = C0D1W.LIZIZ(bool, str);
                if ((objLIZIZ instanceof Boolean) && (bool2 = (Boolean) objLIZIZ) != null) {
                    zBooleanValue = bool2.booleanValue();
                } else if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
            }
            return Boolean.valueOf(zBooleanValue);
        }
    }), new Pair("abTestInt", new InterfaceC332330D1b() { // from class: X.0D1V
        @Override // X.InterfaceC332330D1b
        public final Object LIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
            Object objLJJJLZIJ;
            String str;
            int iIntValue;
            int iLJIJ;
            Integer numValueOf;
            int iIntValue2 = 0;
            Object objLJJJLZIJ2 = null;
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            } else {
                objLJJJLZIJ = null;
            }
            if (!(objLJJJLZIJ instanceof String) || (str = (String) objLJJJLZIJ) == null) {
                return null;
            }
            if (list != null) {
                objLJJJLZIJ2 = C13LP.LJJJLZIJ(1, list);
            }
            Integer numLIZJ = C20252814Mk.LIZJ(objLJJJLZIJ2);
            if (!C0D1W.LIZ(str)) {
                C0D1Q.LIZ.getClass();
                q qVarLIZ = C0D1Q.LIZ(str);
                if (qVarLIZ != null && (numValueOf = Integer.valueOf(qVarLIZ.LJIIJJI())) != null) {
                    iLJIJ = numValueOf.intValue();
                } else {
                    C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    iLJIJ = c0c64LJIILLIIL.LJIJ(0, iIntValue, str, true);
                }
                Integer numValueOf2 = Integer.valueOf(iLJIJ);
                if (numValueOf2 != null) {
                    iIntValue2 = numValueOf2.intValue();
                }
            } else {
                Integer numLIZJ2 = C20252814Mk.LIZJ(C0D1W.LIZIZ(numLIZJ, str));
                if (numLIZJ2 != null) {
                    iIntValue2 = numLIZJ2.intValue();
                } else if (numLIZJ != null) {
                    iIntValue2 = numLIZJ.intValue();
                }
            }
            return Integer.valueOf(iIntValue2);
        }
    }), new Pair("abTestFloat", new InterfaceC332330D1b() { // from class: X.0D1U
        @Override // X.InterfaceC332330D1b
        public final Object LIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
            Object objLJJJLZIJ;
            String str;
            float fFloatValue;
            float fLJIILL;
            Float fValueOf;
            Object objLJJJLZIJ2 = null;
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            } else {
                objLJJJLZIJ = null;
            }
            if (!(objLJJJLZIJ instanceof String) || (str = (String) objLJJJLZIJ) == null) {
                return null;
            }
            if (list != null) {
                objLJJJLZIJ2 = C13LP.LJJJLZIJ(1, list);
            }
            Float fLIZIZ = C20252814Mk.LIZIZ(objLJJJLZIJ2);
            float fFloatValue2 = 0.0f;
            if (!C0D1W.LIZ(str)) {
                C0D1Q.LIZ.getClass();
                q qVarLIZ = C0D1Q.LIZ(str);
                if (qVarLIZ != null && (fValueOf = Float.valueOf(qVarLIZ.LJIIJ())) != null) {
                    fLJIILL = fValueOf.floatValue();
                } else {
                    C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                    if (fLIZIZ != null) {
                        fFloatValue = fLIZIZ.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    fLJIILL = c0c64LJIILLIIL.LJIILL(0, str, true, fFloatValue);
                }
                Float fValueOf2 = Float.valueOf(fLJIILL);
                if (fValueOf2 != null) {
                    fFloatValue2 = fValueOf2.floatValue();
                }
            } else {
                Float fLIZIZ2 = C20252814Mk.LIZIZ(C0D1W.LIZIZ(fLIZIZ, str));
                if (fLIZIZ2 != null) {
                    fFloatValue2 = fLIZIZ2.floatValue();
                } else if (fLIZIZ != null) {
                    fFloatValue2 = fLIZIZ.floatValue();
                }
            }
            return Float.valueOf(fFloatValue2);
        }
    }), new Pair("abTestString", new InterfaceC332330D1b() { // from class: X.0D1T
        @Override // X.InterfaceC332330D1b
        public final Object LIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
            Object objLJJJLZIJ;
            String str;
            Object objLJJJLZIJ2;
            String str2;
            String strValueOf;
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            } else {
                objLJJJLZIJ = null;
            }
            if (!(objLJJJLZIJ instanceof String) || (str = (String) objLJJJLZIJ) == null) {
                return null;
            }
            if (list != null) {
                objLJJJLZIJ2 = C13LP.LJJJLZIJ(1, list);
            } else {
                objLJJJLZIJ2 = null;
            }
            if (objLJJJLZIJ2 instanceof String) {
                str2 = (String) objLJJJLZIJ2;
            } else {
                str2 = null;
            }
            if (!C0D1W.LIZ(str)) {
                C0D1Q.LIZ.getClass();
                q qVarLIZ = C0D1Q.LIZ(str);
                if (qVarLIZ == null || (strValueOf = qVarLIZ.LJIL()) == null) {
                    return C0C64.LJIILLIIL().LJJ(0, str, str2, true);
                }
            } else {
                strValueOf = String.valueOf(C0D1W.LIZIZ(str2, str));
                if (strValueOf.length() == 0 || Intrinsics.LJFF(strValueOf, "null")) {
                    if (str2 != null) {
                        return str2;
                    }
                    return "";
                }
            }
            return strValueOf;
        }
    }), new Pair("abTestMap", new InterfaceC332330D1b() { // from class: X.0D1X
        @Override // X.InterfaceC332330D1b
        public final Object LIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
            Object objLJJJLZIJ;
            String str;
            Object objLJJJLZIJ2;
            Object objLIZIZ;
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            } else {
                objLJJJLZIJ = null;
            }
            if (!(objLJJJLZIJ instanceof String) || (str = (String) objLJJJLZIJ) == null) {
                return null;
            }
            if (list != null) {
                objLJJJLZIJ2 = C13LP.LJJJLZIJ(1, list);
            } else {
                objLJJJLZIJ2 = null;
            }
            if (!(objLJJJLZIJ2 instanceof Map)) {
                objLJJJLZIJ2 = null;
            }
            if (!C0D1W.LIZ(str)) {
                objLIZIZ = C0D1W.LIZJ(objLJJJLZIJ2, str);
                if (objLIZIZ == null) {
                    if (objLJJJLZIJ2 == null) {
                        return C2097608Jq.LJ();
                    }
                    return objLJJJLZIJ2;
                }
            } else {
                objLIZIZ = C0D1W.LIZIZ(objLJJJLZIJ2, str);
                if (!(objLIZIZ instanceof Map) || objLIZIZ == null) {
                    if (objLJJJLZIJ2 != null) {
                        return objLJJJLZIJ2;
                    }
                    return C2097608Jq.LJ();
                }
            }
            return objLIZIZ;
        }
    }), new Pair("abTestArray", new InterfaceC332330D1b() { // from class: X.0D1R
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        @Override // X.InterfaceC332330D1b
        public final Object LIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
            Object objLJJJLZIJ;
            String str;
            Object objLJJJLZIJ2;
            boolean z;
            Object objLJIIL;
            k kVar;
            Object objLIZIZ;
            ?? arrayList = 0;
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            } else {
                objLJJJLZIJ = null;
            }
            if (objLJJJLZIJ instanceof String) {
                str = (String) objLJJJLZIJ;
            } else {
                str = null;
            }
            if (str == null) {
                return null;
            }
            if (list != null) {
                objLJJJLZIJ2 = C13LP.LJJJLZIJ(1, list);
            } else {
                objLJJJLZIJ2 = null;
            }
            if (!(objLJJJLZIJ2 instanceof List)) {
                objLJJJLZIJ2 = null;
            }
            if (!C0D1W.LIZ(str)) {
                C0D1Q.LIZ.getClass();
                try {
                    C0C59 c0c59LJ = C0C59.LJ();
                    c0c59LJ.LJIILJJIL(0, false);
                    if (C307990C5l.LIZLLL) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objLJIIL = c0c59LJ.LJIIL(str, false, z, true);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                if (objLJIIL instanceof h) {
                    Iterable iterable = (Iterable) objLJIIL;
                    arrayList = new ArrayList(C15438062q.LJIJJ(iterable, 10));
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(C0D1Q.LIZIZ((k) it2.next()));
                    }
                    return arrayList;
                }
                if (objLJIIL instanceof List) {
                    Iterable iterable2 = (Iterable) objLJIIL;
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(iterable2, 10));
                    for (Object obj : iterable2) {
                        if (obj instanceof k) {
                            kVar = (k) obj;
                        } else {
                            kVar = null;
                        }
                        if (kVar != null && (objLIZIZ = C0D1Q.LIZIZ(kVar)) != null) {
                            obj = objLIZIZ;
                        }
                        arrayList2.add(obj);
                    }
                    return arrayList2;
                }
                return objLJJJLZIJ2;
            }
            Object objLIZIZ2 = C0D1W.LIZIZ(objLJJJLZIJ2, str);
            if (objLIZIZ2 instanceof List) {
                arrayList = objLIZIZ2;
            }
            if (arrayList == 0) {
                if (objLJJJLZIJ2 == null) {
                    return C13BV.INSTANCE;
                }
                return objLJJJLZIJ2;
            }
            return arrayList;
        }
    }));

    public static boolean LIZ(String str) {
        return a0.LJJIJ(str, '.');
    }

    public static Object LIZIZ(Object obj, String str) {
        Pair pair;
        try {
            int iLJJIZ = a0.LJJIZ(str, '.', 0, false, 6);
            if (iLJJIZ == -1) {
                pair = new Pair(str, "");
            } else {
                pair = new Pair(str.substring(0, iLJJIZ), str.substring(iLJJIZ + 1));
            }
            Map<String, ? extends Object> mapLIZJ = LIZJ(obj, (String) pair.getFirst());
            if (!(mapLIZJ instanceof Map)) {
                mapLIZJ = null;
            }
            if (mapLIZJ == null) {
                return null;
            }
            C14NH.LIZ.getClass();
            C21328418dO c21328418dOLJIIJJI = C14NH.LJIIJJI();
            String str2 = (String) pair.getSecond();
            if (!(mapLIZJ instanceof Map)) {
                mapLIZJ = null;
            }
            if (mapLIZJ == null) {
                mapLIZJ = C2097608Jq.LJ();
            }
            return c21328418dOLJIIJJI.LIZ(str2, mapLIZJ, null, C20252814Mk.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static Map LIZJ(Object obj, String str) {
        C0D1Q.LIZ.getClass();
        C0C5P.LIZJ();
        Map map = (Map) C0C4T.LIZ(obj, str, true);
        if (map != null) {
            return map;
        }
        try {
            C0C59 c0c59LJ = C0C59.LJ();
            c0c59LJ.LJIILJJIL(0, false);
            return (Map) c0c59LJ.LJIIJ(str, true, false, Map.class, 0);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return map;
        }
    }
}
