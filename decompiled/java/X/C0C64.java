package X;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.otis.diagnosis.ab.PerfTimeUtilsNative;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0C64, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C64 {
    public static volatile C0C64 LIZIZ;
    public static volatile boolean LIZJ;
    public final Map<String, Object> LIZ = new ConcurrentHashMap();

    public static C0C64 LJIILLIIL() {
        if (LIZJ) {
            return C0C6I.LIZ;
        }
        if (LIZIZ == null) {
            synchronized (C0C64.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C0C64();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public static C0C4T LJII() {
        return C0C5P.LIZJ().LJIIIIZZ;
    }

    public final boolean LIZIZ(String str, boolean z) {
        Boolean bool = (Boolean) C0C46.LIZ().LIZ(str, Boolean.valueOf(z), true, 0, 0, null, new InterfaceC20718089s() { // from class: X.0C6G
            @Override // X.InterfaceC20718089s
            public final Object LIZ(String str2, Object obj, Boolean bool2, Integer num, Integer num2, Class cls) {
                C0C64 c0c64 = this.LIZ;
                c0c64.getClass();
                return c0c64.LJIIJJI(obj, str2, bool2.booleanValue());
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return z;
    }

    public final int LJFF(int i, String str) {
        Integer num = (Integer) C0C46.LIZ().LIZ(str, Integer.valueOf(i), true, 0, 0, null, new InterfaceC20718089s() { // from class: X.0C6F
            @Override // X.InterfaceC20718089s
            public final Object LIZ(String str2, Object obj, Boolean bool, Integer num2, Integer num3, Class cls) {
                C0C64 c0c64 = this.LIZ;
                c0c64.getClass();
                return c0c64.LJIIJJI(obj, str2, bool.booleanValue());
            }
        });
        if (num != null) {
            return num.intValue();
        }
        return i;
    }

    public final boolean LJIIJ(String str, boolean z) {
        Boolean boolLIZ;
        if (C0C5U.LIZIZ && (boolLIZ = C0C5U.LIZ(str)) != null) {
            return boolLIZ.booleanValue();
        }
        if (C0C6H.LJI && !C0C6H.LJFF && PerfTimeUtilsNative.LIZIZ) {
            long currentThreadCpuTimeNanos = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos();
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            boolean zLIZIZ = LIZIZ(str, z);
            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
            long currentThreadCpuTimeNanos2 = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos() - currentThreadCpuTimeNanos;
            C0C6H.LIZ += currentThreadCpuTimeNanos2;
            if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                C0C6H.LIZIZ += jElapsedRealtimeNanos2;
                C0C6H.LJ++;
            } else {
                C0C6H.LIZJ += currentThreadCpuTimeNanos2;
            }
            C0C6H.LIZLLL++;
            return zLIZIZ;
        }
        return LIZIZ(str, z);
    }

    public final int LJIJI(int i, String str) {
        Integer numLIZLLL;
        if (C0C5U.LIZIZ && (numLIZLLL = C0C5U.LIZLLL(str)) != null) {
            return numLIZLLL.intValue();
        }
        if (C0C6H.LJI && !C0C6H.LJFF && PerfTimeUtilsNative.LIZIZ) {
            long currentThreadCpuTimeNanos = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos();
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            int iLJFF = LJFF(i, str);
            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
            long currentThreadCpuTimeNanos2 = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos() - currentThreadCpuTimeNanos;
            C0C6H.LIZ += currentThreadCpuTimeNanos2;
            if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                C0C6H.LIZIZ += jElapsedRealtimeNanos2;
                C0C6H.LJ++;
            } else {
                C0C6H.LIZJ += currentThreadCpuTimeNanos2;
            }
            C0C6H.LIZLLL++;
            return iLJFF;
        }
        return LJFF(i, str);
    }

    public static Object LJJI(Class cls, String str, boolean z) {
        if (C302860Bu0.LIZIZ(str)) {
            Object objLIZ = C302860Bu0.LIZ(str);
            if (objLIZ == null) {
                return LJJIFFI(z, str, 31744, cls, 0);
            }
            return objLIZ;
        }
        if (!z && !C302860Bu0.LJIIIIZZ) {
            return LJJIFFI(z, str, 31744, cls, 0);
        }
        return LJJIFFI(z, str, 31744, cls, 0);
    }

    public final Object LJIIJJI(Object obj, String str, boolean z) {
        Object obj2;
        C307970C5j c307970C5j = C0C5P.LIZJ().LIZJ;
        if (c307970C5j == null || c307970C5j.LIZ() == null || !c307970C5j.LIZ().enable() || !c307970C5j.LIZIZ() || (obj2 = c307970C5j.LIZ().get(str)) == null) {
            if (z) {
                obj2 = ((ConcurrentHashMap) this.LIZ).get(str);
                if (obj2 == null) {
                    if (obj != null) {
                        ((ConcurrentHashMap) this.LIZ).put(str, obj);
                    }
                }
            }
            return obj;
        }
        return obj2;
    }

    public final Object LJJIII(String str, int i, Object obj) {
        if (C0C6H.LJI && !C0C6H.LJFF && PerfTimeUtilsNative.LIZIZ) {
            long currentThreadCpuTimeNanos = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos();
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            Object objLIZ = C0C46.LIZ().LIZ(str, obj, true, i, 31744, null, new InterfaceC20718089s() { // from class: X.0C65
                @Override // X.InterfaceC20718089s
                public final Object LIZ(String str2, Object obj2, Boolean bool, Integer num, Integer num2, Class cls) {
                    Object objLIZ2;
                    this.LIZ.getClass();
                    if (num.intValue() == 1 && C0C64.LJII() != null) {
                        C0C64.LJII();
                        Object objLIZ3 = C0C4T.LIZ(obj2, str2, bool.booleanValue());
                        if (objLIZ3 != null) {
                            return objLIZ3;
                        }
                    }
                    boolean zBooleanValue = bool.booleanValue();
                    int iIntValue = num2.intValue();
                    int iIntValue2 = num.intValue();
                    if (C0C6H.LJI && !C0C6H.LJFF && PerfTimeUtilsNative.LIZIZ) {
                        long currentThreadCpuTimeNanos2 = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos();
                        long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                        objLIZ2 = C0C46.LIZ().LIZ(str2, null, zBooleanValue, iIntValue2, iIntValue, null, new InterfaceC20718089s() { // from class: X.0C6D
                            @Override // X.InterfaceC20718089s
                            public final Object LIZ(String str3, Object obj3, Boolean bool2, Integer num3, Integer num4, Class cls2) {
                                return C0C59.LJ().LJIIIZ(num3.intValue(), str3, bool2.booleanValue());
                            }
                        });
                        long jElapsedRealtimeNanos3 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos2;
                        long currentThreadCpuTimeNanos3 = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos() - currentThreadCpuTimeNanos2;
                        C0C6H.LIZ += currentThreadCpuTimeNanos3;
                        if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                            C0C6H.LIZIZ += jElapsedRealtimeNanos3;
                            C0C6H.LJ++;
                        } else {
                            C0C6H.LIZJ += currentThreadCpuTimeNanos3;
                        }
                        C0C6H.LIZLLL++;
                    } else {
                        objLIZ2 = C0C46.LIZ().LIZ(str2, null, zBooleanValue, iIntValue2, iIntValue, null, new InterfaceC20718089s() { // from class: X.0C6D
                            @Override // X.InterfaceC20718089s
                            public final Object LIZ(String str3, Object obj3, Boolean bool2, Integer num3, Integer num4, Class cls2) {
                                return C0C59.LJ().LJIIIZ(num3.intValue(), str3, bool2.booleanValue());
                            }
                        });
                    }
                    if (objLIZ2 == null) {
                        C0C5A.LIZJ().getClass();
                        if (C0C4Y.LIZJ.LJIIIZ().LJIIIZ(str2)) {
                            return obj2;
                        }
                    }
                    return objLIZ2;
                }
            });
            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
            long currentThreadCpuTimeNanos2 = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos() - currentThreadCpuTimeNanos;
            C0C6H.LIZ += currentThreadCpuTimeNanos2;
            if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                C0C6H.LIZIZ += jElapsedRealtimeNanos2;
                C0C6H.LJ++;
            } else {
                C0C6H.LIZJ += currentThreadCpuTimeNanos2;
            }
            C0C6H.LIZLLL++;
            return objLIZ;
        }
        return C0C46.LIZ().LIZ(str, obj, true, i, 31744, null, new InterfaceC20718089s() { // from class: X.0C65
            @Override // X.InterfaceC20718089s
            public final Object LIZ(String str2, Object obj2, Boolean bool, Integer num, Integer num2, Class cls) {
                Object objLIZ2;
                this.LIZ.getClass();
                if (num.intValue() == 1 && C0C64.LJII() != null) {
                    C0C64.LJII();
                    Object objLIZ3 = C0C4T.LIZ(obj2, str2, bool.booleanValue());
                    if (objLIZ3 != null) {
                        return objLIZ3;
                    }
                }
                boolean zBooleanValue = bool.booleanValue();
                int iIntValue = num2.intValue();
                int iIntValue2 = num.intValue();
                if (C0C6H.LJI && !C0C6H.LJFF && PerfTimeUtilsNative.LIZIZ) {
                    long currentThreadCpuTimeNanos22 = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos();
                    long jElapsedRealtimeNanos22 = SystemClock.elapsedRealtimeNanos();
                    objLIZ2 = C0C46.LIZ().LIZ(str2, null, zBooleanValue, iIntValue2, iIntValue, null, new InterfaceC20718089s() { // from class: X.0C6D
                        @Override // X.InterfaceC20718089s
                        public final Object LIZ(String str3, Object obj3, Boolean bool2, Integer num3, Integer num4, Class cls2) {
                            return C0C59.LJ().LJIIIZ(num3.intValue(), str3, bool2.booleanValue());
                        }
                    });
                    long jElapsedRealtimeNanos3 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos22;
                    long currentThreadCpuTimeNanos3 = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos() - currentThreadCpuTimeNanos22;
                    C0C6H.LIZ += currentThreadCpuTimeNanos3;
                    if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                        C0C6H.LIZIZ += jElapsedRealtimeNanos3;
                        C0C6H.LJ++;
                    } else {
                        C0C6H.LIZJ += currentThreadCpuTimeNanos3;
                    }
                    C0C6H.LIZLLL++;
                } else {
                    objLIZ2 = C0C46.LIZ().LIZ(str2, null, zBooleanValue, iIntValue2, iIntValue, null, new InterfaceC20718089s() { // from class: X.0C6D
                        @Override // X.InterfaceC20718089s
                        public final Object LIZ(String str3, Object obj3, Boolean bool2, Integer num3, Integer num4, Class cls2) {
                            return C0C59.LJ().LJIIIZ(num3.intValue(), str3, bool2.booleanValue());
                        }
                    });
                }
                if (objLIZ2 == null) {
                    C0C5A.LIZJ().getClass();
                    if (C0C4Y.LIZJ.LJIIIZ().LJIIIZ(str2)) {
                        return obj2;
                    }
                }
                return objLIZ2;
            }
        });
    }

    public final boolean LJIIIZ(int i, String str, boolean z, boolean z2) {
        Boolean boolLIZ;
        if (C302860Bu0.LIZIZ(str)) {
            Object objLIZ = C302860Bu0.LIZ(str);
            if (objLIZ == null) {
                return LJIIIIZZ(i, 0, str, z, z2);
            }
            return ((Boolean) objLIZ).booleanValue();
        }
        if (C0C5U.LIZIZ && (boolLIZ = C0C5U.LIZ(str)) != null) {
            return boolLIZ.booleanValue();
        }
        C309220CAe.LIZ(Boolean.valueOf(z2), Boolean.FALSE, str, z);
        if (!z && !C302860Bu0.LJIIIIZZ) {
            return LJIIIIZZ(i, 0, str, false, z2);
        }
        if (TextUtils.equals("player_setting_enable_ab_cache", str)) {
            return LJIIIIZZ(i, 0, str, z, z2);
        }
        return LJIIIIZZ(i, 0, str, z, z2);
    }

    public final double LJIIL(double d, int i, String str, boolean z) {
        Double dLIZIZ;
        if (C302860Bu0.LIZIZ(str)) {
            Object objLIZ = C302860Bu0.LIZ(str);
            if (objLIZ == null) {
                return LJIILIIL(z, str, i, d, 0);
            }
            return ((Double) objLIZ).doubleValue();
        }
        if (C0C5U.LIZIZ && (dLIZIZ = C0C5U.LIZIZ(str)) != null) {
            return dLIZIZ.doubleValue();
        }
        C309220CAe.LIZ(Double.valueOf(d), Double.valueOf(0.0d), str, z);
        if (!z && !C302860Bu0.LJIIIIZZ) {
            return LJIILIIL(false, str, i, d, 0);
        }
        return LJIILIIL(z, str, i, d, 0);
    }

    public final float LJIILL(int i, String str, boolean z, float f) {
        Float fLIZJ;
        if (C302860Bu0.LIZIZ(str)) {
            Object objLIZ = C302860Bu0.LIZ(str);
            if (objLIZ == null) {
                return LJIILJJIL(f, i, 0, str, z);
            }
            return ((Float) objLIZ).floatValue();
        }
        if (C0C5U.LIZIZ && (fLIZJ = C0C5U.LIZJ(str)) != null) {
            return fLIZJ.floatValue();
        }
        C309220CAe.LIZ(Float.valueOf(f), Float.valueOf(0.0f), str, z);
        if (!z && !C302860Bu0.LJIIIIZZ) {
            return LJIILJJIL(f, i, 0, str, false);
        }
        return LJIILJJIL(f, i, 0, str, z);
    }

    public final int LJIJ(int i, int i2, String str, boolean z) {
        Integer numLIZLLL;
        if (C302860Bu0.LIZIZ(str)) {
            Object objLIZ = C302860Bu0.LIZ(str);
            if (objLIZ == null) {
                return LJIIZILJ(i, i2, 0, str, z);
            }
            return ((Integer) objLIZ).intValue();
        }
        if (C0C5U.LIZIZ && (numLIZLLL = C0C5U.LIZLLL(str)) != null) {
            return numLIZLLL.intValue();
        }
        C309220CAe.LIZ(Integer.valueOf(i2), 0, str, z);
        if (!z && !C302860Bu0.LJIIIIZZ) {
            return LJIIZILJ(i, i2, 0, str, false);
        }
        return LJIIZILJ(i, i2, 0, str, z);
    }

    public final long LJIJJLI(int i, long j, String str, boolean z) {
        Long lLJ;
        if (C302860Bu0.LIZIZ(str)) {
            Object objLIZ = C302860Bu0.LIZ(str);
            if (objLIZ == null) {
                return LJIJJ(i, 0, z, str, j);
            }
            return ((Long) objLIZ).longValue();
        }
        if (C0C5U.LIZIZ && (lLJ = C0C5U.LJ(str)) != null) {
            return lLJ.longValue();
        }
        C309220CAe.LIZ(Long.valueOf(j), 0L, str, z);
        if (!z && !C302860Bu0.LJIIIIZZ) {
            return LJIJJ(i, 0, false, str, j);
        }
        return LJIJJ(i, 0, z, str, j);
    }

    public final String LJJ(int i, String str, String str2, boolean z) {
        String strLJFF;
        if (C302860Bu0.LIZIZ(str)) {
            Object objLIZ = C302860Bu0.LIZ(str);
            if (objLIZ == null) {
                return LJIL(i, 0, str, str2, z);
            }
            return (String) objLIZ;
        }
        if (C0C5U.LIZIZ && (strLJFF = C0C5U.LJFF(str)) != null) {
            return strLJFF;
        }
        C309220CAe.LIZ(str2, "", str, z);
        if (!z && !C302860Bu0.LJIIIIZZ) {
            return LJIL(i, 0, str, str2, false);
        }
        return LJIL(i, 0, str, str2, z);
    }

    public final Object LJJII(Class cls, Object obj, String str, boolean z) {
        if (C302860Bu0.LIZIZ(str)) {
            Object objLIZ = C302860Bu0.LIZ(str);
            if (objLIZ == null) {
                return LJJIIJ(z, str, 31744, cls, obj, 0);
            }
            return objLIZ;
        }
        if (!z && !C302860Bu0.LJIIIIZZ) {
            return LJJIIJ(false, str, 31744, cls, obj, 0);
        }
        return LJJIIJ(z, str, 31744, cls, obj, 0);
    }

    public static Object LJJIFFI(boolean z, String str, int i, Class cls, int i2) {
        if (C0C6H.LJI && !C0C6H.LJFF && PerfTimeUtilsNative.LIZIZ) {
            long currentThreadCpuTimeNanos = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos();
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            C0C59 c0c59LJ = C0C59.LJ();
            c0c59LJ.LJIILJJIL(i2, false);
            Object objLJIIJ = c0c59LJ.LJIIJ(str, z, false, cls, i2);
            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
            long currentThreadCpuTimeNanos2 = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos() - currentThreadCpuTimeNanos;
            C0C6H.LIZ += currentThreadCpuTimeNanos2;
            if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                C0C6H.LIZIZ += jElapsedRealtimeNanos2;
                C0C6H.LJ++;
            } else {
                C0C6H.LIZJ += currentThreadCpuTimeNanos2;
            }
            C0C6H.LIZLLL++;
            return objLJIIJ;
        }
        C0C59 c0c59LJ2 = C0C59.LJ();
        c0c59LJ2.LJIILJJIL(i2, false);
        return c0c59LJ2.LJIIJ(str, z, false, cls, i2);
    }

    public final boolean LIZ(int i, int i2, String str, boolean z, boolean z2) {
        Boolean bool = (Boolean) C0C46.LIZ().LIZ(str, Boolean.valueOf(z2), z, i2, i, null, new InterfaceC20718089s() { // from class: X.0C6A
            @Override // X.InterfaceC20718089s
            public final Object LIZ(String str2, Object obj, Boolean bool2, Integer num, Integer num2, Class cls) {
                Boolean bool3 = (Boolean) obj;
                this.LIZ.getClass();
                if (num.intValue() == 1 && C0C64.LJII() != null) {
                    C0C4T c0c4tLJII = C0C64.LJII();
                    boolean zBooleanValue = bool2.booleanValue();
                    c0c4tLJII.getClass();
                    Object objLIZIZ = C0C4T.LIZIZ(str2, zBooleanValue);
                    if (objLIZIZ != null) {
                        return objLIZIZ;
                    }
                }
                return Boolean.valueOf(C0C59.LJ().LIZ(num.intValue(), str2, bool3.booleanValue(), bool2.booleanValue()));
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return z2;
    }

    public final double LIZJ(boolean z, String str, int i, double d, int i2) {
        Double d2 = (Double) C0C46.LIZ().LIZ(str, Double.valueOf(d), z, i2, i, null, new InterfaceC20718089s() { // from class: X.0C67
            @Override // X.InterfaceC20718089s
            public final Object LIZ(String str2, Object obj, Boolean bool, Integer num, Integer num2, Class cls) {
                Double d3 = (Double) obj;
                this.LIZ.getClass();
                if (num.intValue() == 1 && C0C64.LJII() != null) {
                    C0C4T c0c4tLJII = C0C64.LJII();
                    boolean zBooleanValue = bool.booleanValue();
                    c0c4tLJII.getClass();
                    Object objLIZIZ = C0C4T.LIZIZ(str2, zBooleanValue);
                    if (objLIZIZ != null) {
                        return objLIZIZ;
                    }
                }
                return Double.valueOf(C0C59.LJ().LIZJ(d3.doubleValue(), num.intValue(), str2, bool.booleanValue()));
            }
        });
        if (d2 != null) {
            return d2.doubleValue();
        }
        return d;
    }

    public final float LIZLLL(float f, int i, int i2, String str, boolean z) {
        Float f2 = (Float) C0C46.LIZ().LIZ(str, Float.valueOf(f), z, i2, i, null, new InterfaceC20718089s() { // from class: X.0C68
            @Override // X.InterfaceC20718089s
            public final Object LIZ(String str2, Object obj, Boolean bool, Integer num, Integer num2, Class cls) {
                Float f3 = (Float) obj;
                this.LIZ.getClass();
                if (num.intValue() == 1 && C0C64.LJII() != null) {
                    C0C4T c0c4tLJII = C0C64.LJII();
                    boolean zBooleanValue = bool.booleanValue();
                    c0c4tLJII.getClass();
                    Object objLIZIZ = C0C4T.LIZIZ(str2, zBooleanValue);
                    if (objLIZIZ != null) {
                        return objLIZIZ;
                    }
                }
                C0C59 c0c59LJ = C0C59.LJ();
                float fFloatValue = f3.floatValue();
                return Float.valueOf(c0c59LJ.LIZLLL(num.intValue(), str2, bool.booleanValue(), fFloatValue));
            }
        });
        if (f2 != null) {
            return f2.floatValue();
        }
        return f;
    }

    public final int LJ(int i, int i2, int i3, String str, boolean z) {
        Integer num = (Integer) C0C46.LIZ().LIZ(str, Integer.valueOf(i2), z, i3, i, null, new InterfaceC20718089s() { // from class: X.0C6B
            @Override // X.InterfaceC20718089s
            public final Object LIZ(String str2, Object obj, Boolean bool, Integer num2, Integer num3, Class cls) {
                Integer num4 = (Integer) obj;
                this.LIZ.getClass();
                if (num2.intValue() == 1 && C0C64.LJII() != null) {
                    C0C4T c0c4tLJII = C0C64.LJII();
                    boolean zBooleanValue = bool.booleanValue();
                    c0c4tLJII.getClass();
                    Object objLIZIZ = C0C4T.LIZIZ(str2, zBooleanValue);
                    if (objLIZIZ != null) {
                        return objLIZIZ;
                    }
                }
                return Integer.valueOf(C0C59.LJ().LJFF(num4.intValue(), num2.intValue(), str2, bool.booleanValue()));
            }
        });
        if (num != null) {
            return num.intValue();
        }
        return i2;
    }

    public final long LJI(int i, int i2, boolean z, String str, long j) {
        Long l = (Long) C0C46.LIZ().LIZ(str, Long.valueOf(j), z, i2, i, null, new InterfaceC20718089s() { // from class: X.0C69
            @Override // X.InterfaceC20718089s
            public final Object LIZ(String str2, Object obj, Boolean bool, Integer num, Integer num2, Class cls) {
                Long l2 = (Long) obj;
                this.LIZ.getClass();
                if (num.intValue() == 1 && C0C64.LJII() != null) {
                    C0C4T c0c4tLJII = C0C64.LJII();
                    boolean zBooleanValue = bool.booleanValue();
                    c0c4tLJII.getClass();
                    Object objLIZIZ = C0C4T.LIZIZ(str2, zBooleanValue);
                    if (objLIZIZ != null) {
                        return objLIZIZ;
                    }
                }
                return Long.valueOf(C0C59.LJ().LJII(num.intValue(), l2.longValue(), str2, bool.booleanValue()));
            }
        });
        if (l != null) {
            return l.longValue();
        }
        return j;
    }

    public final boolean LJIIIIZZ(int i, int i2, String str, boolean z, boolean z2) {
        Boolean boolLIZ;
        if (C0C5U.LIZIZ && (boolLIZ = C0C5U.LIZ(str)) != null) {
            return boolLIZ.booleanValue();
        }
        if (C0C6H.LJI && !C0C6H.LJFF && PerfTimeUtilsNative.LIZIZ) {
            long currentThreadCpuTimeNanos = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos();
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            boolean zLIZ = LIZ(i, i2, str, z, z2);
            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
            long currentThreadCpuTimeNanos2 = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos() - currentThreadCpuTimeNanos;
            C0C6H.LIZ += currentThreadCpuTimeNanos2;
            if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                C0C6H.LIZIZ += jElapsedRealtimeNanos2;
                C0C6H.LJ++;
            } else {
                C0C6H.LIZJ += currentThreadCpuTimeNanos2;
            }
            C0C6H.LIZLLL++;
            return zLIZ;
        }
        return LIZ(i, i2, str, z, z2);
    }

    public final double LJIILIIL(boolean z, String str, int i, double d, int i2) {
        Double dLIZIZ;
        if (C0C5U.LIZIZ && (dLIZIZ = C0C5U.LIZIZ(str)) != null) {
            return dLIZIZ.doubleValue();
        }
        if (C0C6H.LJI && !C0C6H.LJFF && PerfTimeUtilsNative.LIZIZ) {
            long currentThreadCpuTimeNanos = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos();
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            double dLIZJ = LIZJ(z, str, i, d, i2);
            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
            long currentThreadCpuTimeNanos2 = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos() - currentThreadCpuTimeNanos;
            C0C6H.LIZ += currentThreadCpuTimeNanos2;
            if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                C0C6H.LIZIZ += jElapsedRealtimeNanos2;
                C0C6H.LJ++;
            } else {
                C0C6H.LIZJ += currentThreadCpuTimeNanos2;
            }
            C0C6H.LIZLLL++;
            return dLIZJ;
        }
        return LIZJ(z, str, i, d, i2);
    }

    public final float LJIILJJIL(float f, int i, int i2, String str, boolean z) {
        Float fLIZJ;
        if (C0C5U.LIZIZ && (fLIZJ = C0C5U.LIZJ(str)) != null) {
            return fLIZJ.floatValue();
        }
        if (C0C6H.LJI && !C0C6H.LJFF && PerfTimeUtilsNative.LIZIZ) {
            long currentThreadCpuTimeNanos = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos();
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            float fLIZLLL = LIZLLL(f, i, i2, str, z);
            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
            long currentThreadCpuTimeNanos2 = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos() - currentThreadCpuTimeNanos;
            C0C6H.LIZ += currentThreadCpuTimeNanos2;
            if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                C0C6H.LIZIZ += jElapsedRealtimeNanos2;
                C0C6H.LJ++;
            } else {
                C0C6H.LIZJ += currentThreadCpuTimeNanos2;
            }
            C0C6H.LIZLLL++;
            return fLIZLLL;
        }
        return LIZLLL(f, i, i2, str, z);
    }

    public final int LJIIZILJ(int i, int i2, int i3, String str, boolean z) {
        Integer numLIZLLL;
        if (C0C5U.LIZIZ && (numLIZLLL = C0C5U.LIZLLL(str)) != null) {
            return numLIZLLL.intValue();
        }
        if (C0C6H.LJI && !C0C6H.LJFF && PerfTimeUtilsNative.LIZIZ) {
            long currentThreadCpuTimeNanos = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos();
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            int iLJ = LJ(i, i2, i3, str, z);
            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
            long currentThreadCpuTimeNanos2 = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos() - currentThreadCpuTimeNanos;
            C0C6H.LIZ += currentThreadCpuTimeNanos2;
            if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                C0C6H.LIZIZ += jElapsedRealtimeNanos2;
                C0C6H.LJ++;
            } else {
                C0C6H.LIZJ += currentThreadCpuTimeNanos2;
            }
            C0C6H.LIZLLL++;
            return iLJ;
        }
        return LJ(i, i2, i3, str, z);
    }

    public final long LJIJJ(int i, int i2, boolean z, String str, long j) {
        Long lLJ;
        if (C0C5U.LIZIZ && (lLJ = C0C5U.LJ(str)) != null) {
            return lLJ.longValue();
        }
        if (C0C6H.LJI && !C0C6H.LJFF && PerfTimeUtilsNative.LIZIZ) {
            long currentThreadCpuTimeNanos = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos();
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long jLJI = LJI(i, i2, z, str, j);
            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
            long currentThreadCpuTimeNanos2 = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos() - currentThreadCpuTimeNanos;
            C0C6H.LIZ += currentThreadCpuTimeNanos2;
            if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                C0C6H.LIZIZ += jElapsedRealtimeNanos2;
                C0C6H.LJ++;
            } else {
                C0C6H.LIZJ += currentThreadCpuTimeNanos2;
            }
            C0C6H.LIZLLL++;
            return jLJI;
        }
        return LJI(i, i2, z, str, j);
    }

    public final String LJIL(int i, int i2, String str, String str2, boolean z) {
        String strLJFF;
        if (!C0C5U.LIZIZ || (strLJFF = C0C5U.LJFF(str)) == null) {
            if (C0C6H.LJI && !C0C6H.LJFF && PerfTimeUtilsNative.LIZIZ) {
                long currentThreadCpuTimeNanos = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos();
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                String str3 = (String) C0C46.LIZ().LIZ(str, str2, z, i2, i, null, new InterfaceC20718089s() { // from class: X.0C6C
                    @Override // X.InterfaceC20718089s
                    public final Object LIZ(String str4, Object obj, Boolean bool, Integer num, Integer num2, Class cls) {
                        String str5 = (String) obj;
                        this.LIZ.getClass();
                        if (num.intValue() == 1 && C0C64.LJII() != null) {
                            C0C4T c0c4tLJII = C0C64.LJII();
                            boolean zBooleanValue = bool.booleanValue();
                            c0c4tLJII.getClass();
                            Object objLIZIZ = C0C4T.LIZIZ(str4, zBooleanValue);
                            if (objLIZIZ != null) {
                                return objLIZIZ;
                            }
                        }
                        return C0C59.LJ().LJIIIIZZ(num.intValue(), str4, str5, bool.booleanValue());
                    }
                });
                if (str3 == null) {
                    str3 = str2;
                }
                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                long currentThreadCpuTimeNanos2 = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos() - currentThreadCpuTimeNanos;
                C0C6H.LIZ += currentThreadCpuTimeNanos2;
                if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                    C0C6H.LIZIZ += jElapsedRealtimeNanos2;
                    C0C6H.LJ++;
                } else {
                    C0C6H.LIZJ += currentThreadCpuTimeNanos2;
                }
                C0C6H.LIZLLL++;
                return str3;
            }
            strLJFF = (String) C0C46.LIZ().LIZ(str, str2, z, i2, i, null, new InterfaceC20718089s() { // from class: X.0C6C
                @Override // X.InterfaceC20718089s
                public final Object LIZ(String str4, Object obj, Boolean bool, Integer num, Integer num2, Class cls) {
                    String str5 = (String) obj;
                    this.LIZ.getClass();
                    if (num.intValue() == 1 && C0C64.LJII() != null) {
                        C0C4T c0c4tLJII = C0C64.LJII();
                        boolean zBooleanValue = bool.booleanValue();
                        c0c4tLJII.getClass();
                        Object objLIZIZ = C0C4T.LIZIZ(str4, zBooleanValue);
                        if (objLIZIZ != null) {
                            return objLIZIZ;
                        }
                    }
                    return C0C59.LJ().LJIIIIZZ(num.intValue(), str4, str5, bool.booleanValue());
                }
            });
            if (strLJFF == null) {
                return str2;
            }
        }
        return strLJFF;
    }

    public final Object LJJIIJ(boolean z, String str, int i, Class cls, Object obj, int i2) {
        if (C0C6H.LJI && !C0C6H.LJFF && PerfTimeUtilsNative.LIZIZ) {
            long currentThreadCpuTimeNanos = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos();
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            Object objLIZ = C0C46.LIZ().LIZ(str, obj, z, i2, i, cls, new InterfaceC20718089s() { // from class: X.0C66
                @Override // X.InterfaceC20718089s
                public final Object LIZ(String str2, Object obj2, Boolean bool, Integer num, Integer num2, Class cls2) {
                    this.LIZ.getClass();
                    if (num.intValue() == 1 && C0C64.LJII() != null) {
                        C0C64.LJII();
                        Object objLIZ2 = C0C4T.LIZ(obj2, str2, bool.booleanValue());
                        if (objLIZ2 != null) {
                            return objLIZ2;
                        }
                    }
                    Object objLJJIFFI = C0C64.LJJIFFI(bool.booleanValue(), str2, num2.intValue(), cls2, num.intValue());
                    if (objLJJIFFI == null) {
                        C0C5A.LIZJ().getClass();
                        if (C0C4Y.LIZJ.LJIIIZ().LJIIIZ(str2)) {
                            return obj2;
                        }
                    }
                    return objLJJIFFI;
                }
            });
            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
            long currentThreadCpuTimeNanos2 = PerfTimeUtilsNative.getCurrentThreadCpuTimeNanos() - currentThreadCpuTimeNanos;
            C0C6H.LIZ += currentThreadCpuTimeNanos2;
            if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                C0C6H.LIZIZ += jElapsedRealtimeNanos2;
                C0C6H.LJ++;
            } else {
                C0C6H.LIZJ += currentThreadCpuTimeNanos2;
            }
            C0C6H.LIZLLL++;
            return objLIZ;
        }
        return C0C46.LIZ().LIZ(str, obj, z, i2, i, cls, new InterfaceC20718089s() { // from class: X.0C66
            @Override // X.InterfaceC20718089s
            public final Object LIZ(String str2, Object obj2, Boolean bool, Integer num, Integer num2, Class cls2) {
                this.LIZ.getClass();
                if (num.intValue() == 1 && C0C64.LJII() != null) {
                    C0C64.LJII();
                    Object objLIZ2 = C0C4T.LIZ(obj2, str2, bool.booleanValue());
                    if (objLIZ2 != null) {
                        return objLIZ2;
                    }
                }
                Object objLJJIFFI = C0C64.LJJIFFI(bool.booleanValue(), str2, num2.intValue(), cls2, num.intValue());
                if (objLJJIFFI == null) {
                    C0C5A.LIZJ().getClass();
                    if (C0C4Y.LIZJ.LJIIIZ().LJIIIZ(str2)) {
                        return obj2;
                    }
                }
                return objLJJIFFI;
            }
        });
    }
}
