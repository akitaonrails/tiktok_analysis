package X;

import android.text.TextUtils;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.sandbox.api.experiment.ExceptionInfo;
import com.ss.android.ugc.aweme.compliance.sandbox.api.experiment.PnSSandboxProtectEnhanceModel;
import com.ss.android.ugc.aweme.compliance.sandbox.init.SandboxProtectEnhanceThrowable;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.performanceopt.api.IPnSSandboxOptApi;
import java.lang.Thread;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0XKV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XKV implements Thread.UncaughtExceptionHandler {
    public static Thread.UncaughtExceptionHandler LIZIZ;
    public static final C0XKV LIZ = new C0XKV();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(282));

    public static boolean LIZ(Throwable th) {
        StackTraceElement[] stackTrace;
        if (th == null || (stackTrace = th.getStackTrace()) == null) {
            return false;
        }
        PnSSandboxProtectEnhanceModel pnSSandboxProtectEnhanceModel = (PnSSandboxProtectEnhanceModel) C0XKW.LIZ.getValue();
        if (!(!pnSSandboxProtectEnhanceModel.ignoreList.isEmpty())) {
            return false;
        }
        for (ExceptionInfo exceptionInfo : pnSSandboxProtectEnhanceModel.ignoreList) {
            if (!TextUtils.isEmpty(exceptionInfo.exceptionType) && !TextUtils.isEmpty(exceptionInfo.stackClassName) && Intrinsics.LJFF(th.getClass().getName(), exceptionInfo.exceptionType)) {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (a0.LJJIIZI(stackTraceElement.getClassName(), exceptionInfo.stackClassName, false) && a0.LJJIIZI(stackTraceElement.getMethodName(), exceptionInfo.stackMethodName, false)) {
                        LIZIZ(th);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void LIZIZ(Throwable th) {
        Npth.reportBizException("sandbox_runtime_error", (Throwable) new SandboxProtectEnhanceThrowable("SANDBOX_PROTECT_ENHANCE_SUCCESS", th), "SANDBOX_PROTECT_ENHANCE_SUCCESS", (Map<String, String>) null, true);
        ((IPnSSandboxOptApi) ServiceManager.get().getService(IPnSSandboxOptApi.class)).LIZJ();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (th != null) {
            Throwable cause = th;
            int i = 0;
            while (!(cause instanceof OutOfMemoryError)) {
                try {
                    if (i <= 20) {
                        i++;
                        cause = cause.getCause();
                        if (cause == null) {
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
                if (!Intrinsics.LJFF(thread.getName(), "main") && LIZ(th)) {
                    return;
                }
            }
        } else if (!Intrinsics.LJFF(thread.getName(), "main")) {
            return;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = LIZIZ;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
