package X;

import com.bytedance.amg.minigameruntime.api.IClientLogger;

/* JADX INFO: renamed from: X.0k2b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1304110k2b implements IClientLogger {
    @Override // com.bytedance.amg.minigameruntime.api.IClientLogger
    public final void d(String str, String str2) {
    }

    @Override // com.bytedance.amg.minigameruntime.api.IClientLogger
    public final void e(String str, String str2) {
    }

    @Override // com.bytedance.amg.minigameruntime.api.IClientLogger
    public final void i(String str, String str2) {
    }

    @Override // com.bytedance.amg.minigameruntime.api.IClientLogger
    public final void v(String str, String str2) {
    }

    @Override // com.bytedance.amg.minigameruntime.api.IClientLogger
    public final void w(String str, String str2) {
    }

    public static void LIZ(String str, Throwable th) {
        String string;
        StackTraceElement stackTraceElement = (StackTraceElement) C13LQ.LJIL(th.getStackTrace());
        if (stackTraceElement == null || (string = stackTraceElement.toString()) == null) {
            string = "";
        }
        C09AZ.LIZJ("\n                " + str + " exception: " + th + " \n                            on [ " + string + " ]\"\n            ");
    }
}
