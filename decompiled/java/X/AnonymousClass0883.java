package X;

import android.os.Handler;
import android.util.Log;
import android.view.ViewParent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0883, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0883 {
    public static final Class<?> LIZ;

    public static Handler LIZJ() {
        try {
            return (Handler) C1961107mD.LIZJ(C2204961BRm.a0(C1961107mD.LIZIZ(LIZ, "currentActivityThread", new Class[0]), null, new Object[0], new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOinbIuAySaPwIo21uiFiEsarLmotVq8Q2JJ", null)), "mH");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Log.getStackTraceString(th);
            return null;
        }
    }

    static {
        try {
            LIZ = Class.forName("android.app.ActivityThread");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Log.getStackTraceString(e);
        }
    }

    public static boolean LIZ(Handler handler) {
        try {
            Class<?> cls = LIZ;
            C1960207m4.LIZIZ(C1960207m4.LIZ(C1961107mD.LIZ(cls, "mH")), C2204961BRm.a0(C1961107mD.LIZIZ(cls, "currentActivityThread", new Class[0]), null, new Object[0], new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOinbIuAySaPwIo21uiFiEsarLmotVq8Q2JJ", null)), handler);
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Log.getStackTraceString(th);
            return false;
        }
    }

    public static Handler LIZLLL(ViewParent viewParent) {
        try {
            return (Handler) C1961107mD.LIZJ(viewParent, "mHandler");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Log.getStackTraceString(th);
            return null;
        }
    }

    public static boolean LIZIZ(Handler handler, Handler handler2) {
        try {
            Field fieldLIZ = C1961107mD.LIZ(Handler.class, "mCallback");
            C1960207m4.LIZIZ(C1960207m4.LIZ(fieldLIZ), handler2, (Handler.Callback) fieldLIZ.get(handler));
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Log.getStackTraceString(e);
            return false;
        }
    }
}
