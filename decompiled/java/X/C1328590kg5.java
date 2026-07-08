package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0kg5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328590kg5 {
    public static final Class LIZ;
    public static C1330000kiM LIZIZ;
    public static C1330000kiM LIZJ;
    public static Method LIZLLL;

    static {
        try {
            LIZ = Class.forName("com.bytedance.fresco.avif.AvifDecoder");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1328570kg3.LJFF("AvifFormatUtil", "No AvifDecoder class");
        }
    }

    public static int[] LIZ(InputStream inputStream) throws IOException {
        Class cls;
        int iAvailable = inputStream.available();
        byte[] bArr = new byte[iAvailable];
        inputStream.reset();
        if (inputStream.read(bArr, 0, iAvailable) != -1 && (cls = LIZ) != null) {
            try {
                if (LIZLLL == null) {
                    LIZLLL = cls.getDeclaredMethod("parseSimpleMeta", byte[].class, Integer.TYPE);
                }
                Method method = LIZLLL;
                if (method != null) {
                    method.setAccessible(true);
                    return (int[]) LIZLLL.invoke(null, bArr, Integer.valueOf(iAvailable));
                }
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                C1328570kg3.LJFF("AvifFormatUtil", "IllegalAccessException happened when invoke parseSimpleMeta");
                return null;
            } catch (NoSuchMethodException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1328570kg3.LJFF("AvifFormatUtil", "No parseSimpleMeta method AvifDecoder");
            } catch (InvocationTargetException e3) {
                TryCatchGuardChecker.doCheck(e3);
                C1328570kg3.LJFF("AvifFormatUtil", "InvocationTargetException happened when invoke parseSimpleMeta");
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1328570kg3.LJFF("AvifFormatUtil", "Exception happened when invoke parseSimpleMeta");
                return null;
            }
        }
        return null;
    }
}
