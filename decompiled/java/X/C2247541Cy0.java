package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;

/* JADX INFO: renamed from: X.1Cy0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247541Cy0 implements InterfaceC1141390fo9 {
    public boolean LIZ = true;

    @Override // X.InterfaceC1141390fo9
    public final void d(String str, String str2) {
        if (!this.LIZ) {
            return;
        }
        try {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(str, str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ = false;
        }
    }

    @Override // X.InterfaceC1141390fo9
    public final void e(String str, String str2) {
        if (!this.LIZ) {
            return;
        }
        try {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE(str, str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ = false;
        }
    }

    @Override // X.InterfaceC1141390fo9
    public final void i(String str, String str2) {
        if (!this.LIZ) {
            return;
        }
        try {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(str, str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ = false;
        }
    }

    @Override // X.InterfaceC1141390fo9
    public final void e(String str, String str2, Throwable th) {
        if (!this.LIZ) {
            return;
        }
        try {
            ALog.e(str, str2, th);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            this.LIZ = false;
        }
    }
}
