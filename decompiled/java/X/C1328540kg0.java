package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0kg0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328540kg0 {
    public static volatile Class LIZ;
    public static final Class LIZIZ;
    public static C1330000kiM LIZJ;
    public static C1330000kiM LIZLLL;
    public static C1330000kiM LJ;
    public static Method LJFF;
    public static Method LJI;
    public static boolean LJII;

    static {
        try {
            LIZIZ = Class.forName("com.bytedance.fresco.heif.HeifDecoder");
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            C1328570kg3.LJI("HeifFormatUtil", "Heif init ", e);
        }
    }

    public static synchronized Class LIZ() {
        if (LIZ == null) {
            try {
                LIZ = Class.forName("com.bytedance.fresco.nativeheif.Heif");
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                C1328570kg3.LJI("HeifFormatUtil", "Heif init ", e);
            }
        }
        return LIZ;
    }

    public static C1330000kiM LIZIZ() {
        C1330000kiM c1330000kiM = LIZJ;
        if (c1330000kiM != null) {
            return c1330000kiM;
        }
        Class cls = LIZIZ;
        if (cls == null) {
            return null;
        }
        try {
            LIZJ = (C1330000kiM) cls.getDeclaredField("HEIF_FORMAT").get(null);
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            C1328570kg3.LJI("HeifFormatUtil", "HeifFormat init ", e);
        } catch (NoSuchFieldException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1328570kg3.LJI("HeifFormatUtil", "HeifFormat init ", e2);
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        return LIZJ;
    }

    public static C1330000kiM LIZJ() {
        C1330000kiM c1330000kiM = LJ;
        if (c1330000kiM != null) {
            return c1330000kiM;
        }
        Class cls = LIZIZ;
        if (cls == null) {
            return null;
        }
        try {
            LJ = (C1330000kiM) cls.getDeclaredField("HEIF_FORMAT_ANIMATED").get(null);
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            C1328570kg3.LJI("HeifFormatUtil", "HEIF_FORMAT_ANIMATED init ", e);
        } catch (NoSuchFieldException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1328570kg3.LJI("HeifFormatUtil", "HEIF_FORMAT_ANIMATED init ", e2);
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        return LJ;
    }

    public static C1330000kiM LIZLLL() {
        C1330000kiM c1330000kiM = LIZLLL;
        if (c1330000kiM != null) {
            return c1330000kiM;
        }
        Class cls = LIZIZ;
        if (cls == null) {
            return null;
        }
        try {
            LIZLLL = (C1330000kiM) cls.getDeclaredField("VVIC_FORMAT").get(null);
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            C1328570kg3.LJI("HeifFormatUtil", "VvifFormat init ", e);
        } catch (NoSuchFieldException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1328570kg3.LJI("HeifFormatUtil", "VvifFormat init ", e2);
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        return LIZLLL;
    }

    public static int[] LJ(InputStream inputStream) {
        Class clsLIZ;
        int iAvailable = inputStream.available();
        byte[] bArr = new byte[iAvailable];
        inputStream.reset();
        if (inputStream.read(bArr, 0, iAvailable) != -1 && (clsLIZ = LIZ()) != null) {
            try {
                if (LJFF == null) {
                    LJFF = clsLIZ.getDeclaredMethod("parseSimpleMeta", byte[].class, Integer.TYPE, Boolean.TYPE);
                }
                Method method = LJFF;
                if (method != null) {
                    method.setAccessible(true);
                    return (int[]) LJFF.invoke(null, bArr, Integer.valueOf(iAvailable), Boolean.valueOf(LJII));
                }
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            } catch (NoSuchMethodException e2) {
                TryCatchGuardChecker.doCheck(e2);
            } catch (InvocationTargetException e3) {
                TryCatchGuardChecker.doCheck(e3);
                return null;
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
                return null;
            }
        }
        return null;
    }

    public static int[] LJFF(InputStream inputStream) throws IOException {
        Class clsLIZ;
        if (inputStream == null) {
            return null;
        }
        int iAvailable = inputStream.available();
        byte[] bArr = new byte[iAvailable];
        inputStream.reset();
        if (inputStream.read(bArr, 0, iAvailable) != -1 && (clsLIZ = LIZ()) != null) {
            try {
                if (LJI == null) {
                    LJI = clsLIZ.getDeclaredMethod("parseThumbMeta", byte[].class, Integer.TYPE);
                }
                Method method = LJI;
                if (method != null) {
                    method.setAccessible(true);
                    return (int[]) LJI.invoke(null, bArr, Integer.valueOf(iAvailable));
                }
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            } catch (NoSuchMethodException e2) {
                TryCatchGuardChecker.doCheck(e2);
            } catch (InvocationTargetException e3) {
                TryCatchGuardChecker.doCheck(e3);
                return null;
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
                return null;
            }
        }
        return null;
    }
}
