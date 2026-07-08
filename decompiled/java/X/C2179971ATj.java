package X;

import com.ss.android.ugc.aweme.settings.LooperProtectEnhanceSetting$ExceptionInfo;
import com.ss.android.ugc.aweme.settings.LooperProtectEnhanceSetting$LooperProtectEnhanceConfig;

/* JADX INFO: renamed from: X.1ATj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2179971ATj {
    public static boolean LIZ(final Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace == null) {
            return false;
        }
        LooperProtectEnhanceSetting$LooperProtectEnhanceConfig looperProtectEnhanceSetting$LooperProtectEnhanceConfigLIZ = C1865380yds.LIZ();
        if (!LooperProtectEnhanceSetting$LooperProtectEnhanceConfig.LIZ(looperProtectEnhanceSetting$LooperProtectEnhanceConfigLIZ)) {
            return false;
        }
        for (LooperProtectEnhanceSetting$ExceptionInfo looperProtectEnhanceSetting$ExceptionInfo : looperProtectEnhanceSetting$LooperProtectEnhanceConfigLIZ.ignoreList) {
            if (looperProtectEnhanceSetting$ExceptionInfo.LIZ() && th.getClass().getName().equals(looperProtectEnhanceSetting$ExceptionInfo.exceptionType) && th.getMessage() != null && th.getMessage().contains(looperProtectEnhanceSetting$ExceptionInfo.exceptionMessage)) {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (looperProtectEnhanceSetting$ExceptionInfo.stackClassName.equals(stackTraceElement.getClassName()) && looperProtectEnhanceSetting$ExceptionInfo.stackMethodName.equals(stackTraceElement.getMethodName())) {
                        final String str = "RunnableLancetGuard";
                        C1AF0.LJFF(new Throwable(str, th) { // from class: X.1ATk
                        }, "RunnableLancetGuard");
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
