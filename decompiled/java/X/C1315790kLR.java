package X;

import android.graphics.Bitmap;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.service.ILynxImageService;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: X.0kLR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315790kLR {
    public static final Method LIZ;
    public static final Method LIZIZ;
    public static Method LIZJ = null;
    public static final Method LIZLLL;
    public static final Method LJ;
    public static Method LJFF = null;
    public static boolean LJI = true;
    public static boolean LJII = true;

    static {
        try {
            LIZ = ImageDecodeOptionsBuilder.class.getDeclaredMethod("LIZIZ", Integer.TYPE);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LynxLog.e("Fresco", Log.getStackTraceString(th));
        }
        try {
            LIZIZ = AnimatedDrawable2.class.getDeclaredMethod("setPrivateFrameScheduler", InterfaceC1330990kjx.class);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            LynxLog.e("Fresco", Log.getStackTraceString(th2));
        }
        try {
            LIZLLL = C1325700kbQ.class.getDeclaredMethod("LJI", Boolean.TYPE);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            LynxLog.e("Fresco", Log.getStackTraceString(th3));
        }
        try {
            LJ = C1325700kbQ.class.getDeclaredMethod("LJII", Boolean.TYPE);
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            LynxLog.e("Fresco", Log.getStackTraceString(th4));
        }
    }

    public static void LIZ(C1325700kbQ c1325700kbQ) {
        LIZIZ(c1325700kbQ, Bitmap.Config.ARGB_8888, false);
    }

    public static void LIZJ(AnimatedDrawable2 animatedDrawable2) {
        Method method = LIZIZ;
        if (method == null) {
            return;
        }
        try {
            C2204961BRm.a0(method, animatedDrawable2, new Object[]{new C1330040kiQ(animatedDrawable2.LLILLL)}, new C0WZX("dzBzEg4jUdKSQVYySFyRb1ZfUZ4WkTRiNcNLPQz5e3Pvxz6WbaRX2H6OOs8x5dJHhMg=", null));
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            LynxLog.e("Fresco", Log.getStackTraceString(e));
        } catch (InvocationTargetException e2) {
            TryCatchGuardChecker.doCheck(e2);
            LynxLog.e("Fresco", Log.getStackTraceString(e2));
        }
    }

    public static boolean LIZLLL(AnimatedDrawable2 animatedDrawable2) {
        if (!LJI) {
            return false;
        }
        if (LIZJ == null) {
            try {
                LIZJ = AnimatedDrawable2.class.getDeclaredMethod("LJFF", new Class[0]);
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
                LJI = false;
                LynxLog.e("Fresco", Log.getStackTraceString(e));
                return false;
            }
        }
        try {
            LIZJ.invoke(animatedDrawable2, new Object[0]);
            return true;
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
            LJI = false;
            LynxLog.e("Fresco", Log.getStackTraceString(e2));
            return false;
        } catch (InvocationTargetException e3) {
            TryCatchGuardChecker.doCheck(e3);
            LJI = false;
            LynxLog.e("Fresco", Log.getStackTraceString(e3));
            return false;
        }
    }

    public static void LJ(C1325700kbQ c1325700kbQ, Map<String, String> map) {
        if (!LJII) {
            return;
        }
        if (LJFF == null) {
            try {
                LJFF = C1325700kbQ.class.getDeclaredMethod("LJ", Map.class);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LynxLog.e("Fresco", Log.getStackTraceString(th));
                LJII = false;
                return;
            }
        }
        try {
            LJFF.invoke(c1325700kbQ, map);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            LynxLog.e("Fresco", Log.getStackTraceString(th2));
        }
    }

    public static void LIZIZ(C1325700kbQ c1325700kbQ, Bitmap.Config config, boolean z) {
        ILynxImageService iLynxImageService;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(config);
        Method method = LIZ;
        if (method != null) {
            try {
                C2204961BRm.a0(method, imageDecodeOptionsBuilder, new Object[]{0}, new C0WZX("dzBzEg4jUdKSQVYySFyRb1ZfUZ4WkTRiNcNLPQz5e3Pvxz6WbaRX2H6OOs8x5dJHhMg=", null));
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                LynxLog.e("Fresco", Log.getStackTraceString(e));
            } catch (InvocationTargetException e2) {
                TryCatchGuardChecker.doCheck(e2);
                LynxLog.e("Fresco", Log.getStackTraceString(e2));
            }
        }
        if (z && (iLynxImageService = (ILynxImageService) C1285920jZG.LIZJ().LIZ(ILynxImageService.class)) != null) {
            iLynxImageService.setCustomImageDecoder(imageDecodeOptionsBuilder);
        }
        imageDecodeOptionsBuilder.getClass();
        c1325700kbQ.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
    }
}
