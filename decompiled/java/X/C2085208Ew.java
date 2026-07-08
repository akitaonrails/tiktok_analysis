package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.crash.launchguard.ServerGuardConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: X.08Ew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2085208Ew {
    public static String LIZ(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(th.getClass().getName());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (stackTraceElement.toString().startsWith("com.ss.android.ugc.aweme.app.crash.launchguard.LaunchCrashGuard.doGuardForMainThread") || stackTraceElement.toString().startsWith("android.app.ActivityThread.main")) {
                break;
            }
            sb.append(stackTraceElement.toString());
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(sb.toString().getBytes());
            StringBuilder sb2 = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb2.append('0');
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("Hash algorithm not available", e);
        }
    }

    public static boolean LIZIZ(Throwable th, ServerGuardConfig.ExceptionInfo exceptionInfo) {
        boolean z;
        boolean z2;
        if (th != null && exceptionInfo != null) {
            boolean zStartsWith = th.getClass().getName().startsWith(exceptionInfo.exceptionName);
            if (th.getMessage() != null && !th.getMessage().startsWith(exceptionInfo.exceptionMessage)) {
                z = false;
            } else {
                z = true;
            }
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                sb.append(stackTraceElement.toString());
                sb.append("\n");
            }
            if (!sb.toString().contains(exceptionInfo.exceptionStack) && !"EMERGENCY_GUARD_CONFIG".equals(exceptionInfo.exceptionStack)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (zStartsWith && z && z2) {
                return true;
            }
        }
        return false;
    }
}
