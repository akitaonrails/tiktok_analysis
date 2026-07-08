package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0oph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1488310oph {
    public static final boolean LJIIJ(Object obj) {
        if (obj == null || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof String)) {
            return true;
        }
        return false;
    }

    public static final Number LJIILJJIL(Object obj) {
        double d;
        if (obj instanceof Long) {
            return Long.valueOf(-((Number) obj).longValue());
        }
        if (obj instanceof Double) {
            return Double.valueOf(-((Number) obj).doubleValue());
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(-((Number) obj).intValue());
        }
        if (obj instanceof Float) {
            return Float.valueOf(-((Number) obj).floatValue());
        }
        try {
            d = -LJIJ(obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            d = Double.NaN;
        }
        return Double.valueOf(d);
    }

    public static final int LJIILLIIL(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Number) {
                    return ((Number) obj).intValue();
                }
                if (obj instanceof String) {
                    return CastIntegerProtector.parseInt((String) obj);
                }
                return -1;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return -1;
            }
        }
        return -1;
    }

    public static final long LJIIZILJ(Object obj) {
        try {
            return (long) LJIJ(obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0L;
        }
    }

    public static final double LJIJ(Object obj) {
        Object c098200Yq;
        if (obj == null) {
            return 0.0d;
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof String) {
            if (a0.LJJJIL((CharSequence) obj)) {
                return 0.0d;
            }
            try {
                c098200Yq = Double.valueOf(CastDoubleProtector.parseDouble((String) obj));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                c098200Yq = Double.valueOf(0.0d);
            }
            return ((Number) c098200Yq).doubleValue();
        }
        if (obj instanceof Boolean) {
            if (!((Boolean) obj).booleanValue()) {
                return 0.0d;
            }
            return 1.0d;
        }
        throw new IllegalArgumentException();
    }

    public static final String LJIJI(Object obj) {
        if (obj == null) {
            return "null";
        }
        String strLIZ = C1904607d6.LIZ(obj);
        if (strLIZ == null) {
            return "";
        }
        return strLIZ;
    }

    public static final Object LIZ(Object obj, Object obj2) {
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(((Number) obj).doubleValue() + ((Number) obj2).doubleValue());
            }
            if (obj2 instanceof String) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C1904607d6.LIZ(obj));
                sbLIZ.append((String) obj2);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            if (obj2 == null) {
                return obj;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C1904607d6.LIZ(obj));
            sbLIZ2.append(LJIJI(obj2));
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (obj instanceof String) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append((String) obj);
            sbLIZ3.append(LJIJI(obj2));
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (obj == null) {
            if (obj2 instanceof String) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(obj);
                sbLIZ4.append((String) obj2);
                return C2188811AlT.LIZIZ(sbLIZ4);
            }
            if (obj2 == null) {
                return 0;
            }
            if (obj2 instanceof Number) {
                return obj2;
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("null");
            sbLIZ5.append(LJIJI(obj2));
            return C2188811AlT.LIZIZ(sbLIZ5);
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(LJIJI(obj));
        sbLIZ6.append(LJIJI(obj2));
        return C2188811AlT.LIZIZ(sbLIZ6);
    }

    public static final long LIZIZ(Object obj, Object obj2) {
        return LJIIZILJ(obj2) | LJIIZILJ(obj);
    }

    public static final long LIZJ(Object obj, Object obj2) {
        return LJIIZILJ(obj2) ^ LJIIZILJ(obj);
    }

    public static final Object LIZLLL(Object obj, Object obj2) {
        boolean z;
        double d;
        try {
            double dLJIJ = LJIJ(obj);
            double dLJIJ2 = LJIJ(obj2);
            boolean z2 = true;
            if (dLJIJ2 != 0.0d) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                d = dLJIJ / dLJIJ2;
            } else {
                if (dLJIJ != 0.0d) {
                    z2 = false;
                }
                if (z2) {
                    d = Double.NaN;
                } else if (dLJIJ > 0.0d) {
                    d = Double.POSITIVE_INFINITY;
                } else {
                    d = Double.NEGATIVE_INFINITY;
                }
            }
            return Double.valueOf(d);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return Double.valueOf(Double.NaN);
        }
    }

    public static final boolean LJ(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof String)) {
            if (((String) obj).compareTo((String) obj2) > 0) {
                return true;
            }
            return false;
        }
        if (LJIJ(obj) > LJIJ(obj2)) {
            return true;
        }
        return false;
    }

    public static final boolean LJFF(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof String)) {
            if (((String) obj).compareTo((String) obj2) < 0) {
                return true;
            }
            return false;
        }
        if (LJIJ(obj) < LJIJ(obj2)) {
            return true;
        }
        return false;
    }

    public static final boolean LJI(Object obj, Object obj2) {
        try {
            boolean zLJIIJ = LJIIJ(obj);
            boolean zLJIIJ2 = LJIIJ(obj2);
            if (zLJIIJ && zLJIIJ2) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof String) && (obj2 instanceof String)) {
                        return ((String) obj).equals(obj2);
                    }
                    if (LJIJ(obj) != LJIJ(obj2)) {
                        return false;
                    }
                    return true;
                }
                return Intrinsics.LJFF(obj, obj2);
            }
            return Intrinsics.LJFF(obj, obj2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static final boolean LJII(Object obj, Object obj2) {
        try {
            boolean zLJIIJ = LJIIJ(obj);
            boolean zLJIIJ2 = LJIIJ(obj2);
            if (!zLJIIJ || !zLJIIJ2) {
                return false;
            }
            return LJ(obj, obj2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static final boolean LJIIIIZZ(Object obj, Object obj2) {
        try {
            boolean zLJIIJ = LJIIJ(obj);
            boolean zLJIIJ2 = LJIIJ(obj2);
            if (!zLJIIJ || !zLJIIJ2) {
                return false;
            }
            return !LJFF(obj, obj2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static final Object LJIIIZ(Object obj, Object obj2) {
        int iIntValue;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Collection) {
            return C13LP.LJJJJL((Iterable) obj, LJIILLIIL(obj2));
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(obj2);
        }
        if (obj instanceof String) {
            if (obj2 instanceof Number) {
                iIntValue = ((Number) obj2).intValue();
            } else {
                iIntValue = -1;
            }
            Character chLJLLJ = C13LN.LJLLJ(iIntValue, (CharSequence) obj);
            if (chLJLLJ == null) {
                return null;
            }
            return chLJLLJ.toString();
        }
        if (!(obj instanceof Object[])) {
            return null;
        }
        return C13LQ.LJJIIZ(LJIILLIIL(obj2), (Object[]) obj);
    }

    public static final boolean LJIIJJI(Object obj, Object obj2) {
        try {
            boolean zLJIIJ = LJIIJ(obj);
            boolean zLJIIJ2 = LJIIJ(obj2);
            if (!zLJIIJ || !zLJIIJ2) {
                return false;
            }
            return LJFF(obj, obj2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static final boolean LJIIL(Object obj, Object obj2) {
        try {
            boolean zLJIIJ = LJIIJ(obj);
            boolean zLJIIJ2 = LJIIJ(obj2);
            if (!zLJIIJ || !zLJIIJ2) {
                return false;
            }
            return !LJ(obj, obj2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static final Object LJIILIIL(Object obj, Object obj2) {
        boolean z;
        try {
            double dLJIJ = LJIJ(obj);
            double dLJIJ2 = LJIJ(obj2);
            if (dLJIJ2 != 0.0d) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return Double.valueOf(Double.NaN);
            }
            return Double.valueOf(dLJIJ % dLJIJ2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return Double.valueOf(Double.NaN);
        }
    }

    public static final Object LJIILL(Object obj, Object obj2) {
        double dPow;
        try {
            dPow = Math.pow(LJIJ(obj), LJIJ(obj2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            dPow = Double.NaN;
        }
        return Double.valueOf(dPow);
    }
}
