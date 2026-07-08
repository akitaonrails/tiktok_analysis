package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YLL, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YLL {
    public final C0YJ8 LIZ;
    public final Function0<Float> LIZIZ;
    public final Function0<Boolean> LIZJ;

    public static String LIZ(Throwable th) {
        if (th == null) {
            return "null exception";
        }
        String string = th.getClass().toString();
        if (string.length() == 0) {
            return th.getClass().getName();
        }
        return string;
    }

    public static String LIZIZ(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            StringBuilder sb = new StringBuilder();
            int length = stackTrace.length;
            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    sb.append("\n");
                }
                sb.append(stackTrace[i].getClassName());
                sb.append(":");
                sb.append(stackTrace[i].getMethodName());
                sb.append(":");
                sb.append(stackTrace[i].getLineNumber());
            }
            if (sb.length() > 1000) {
                return sb.substring(0, LSPassThroughRecordSizeConfig.DEFAULT);
            }
            return sb.toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public final boolean LIZJ(float f) {
        if (!this.LIZJ.invoke().booleanValue()) {
            return true;
        }
        if (f > 0.0f && ThreadLocalRandom.current().nextFloat() < f) {
            return true;
        }
        return false;
    }

    public final void LJ(Throwable th) {
        this.LIZ.LIZLLL(null, th);
    }

    public final void LIZLLL(String str, Throwable th) {
        this.LIZ.LIZLLL(str, th);
    }

    public C0YLL(C0YJ8 c0yj8, Function0<Float> function0, Function0<Boolean> function02) {
        this.LIZ = c0yj8;
        this.LIZIZ = function0;
        this.LIZJ = function02;
    }

    public final void LJFF(String str, Throwable th, Map<String, String> map) {
        this.LIZ.LJII(str, th, map);
    }
}
