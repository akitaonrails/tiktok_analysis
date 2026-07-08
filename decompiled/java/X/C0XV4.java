package X;

import android.os.Bundle;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.IAccountSwitcherLogger;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.login.ILoginUtilsService;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0XV4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class C0XV4 implements C0XV9 {
    public final /* synthetic */ Bundle LIZ;
    public final /* synthetic */ boolean LIZIZ;

    public /* synthetic */ C0XV4(Bundle bundle, boolean z) {
        this.LIZ = bundle;
        this.LIZIZ = z;
    }

    @Override // X.C0XV9
    public final void LIZ(Bundle bundle) {
        IAccountSwitcherLogger iAccountSwitcherLogger;
        final Bundle bundle2 = this.LIZ;
        final boolean z = this.LIZIZ;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (bundle != null) {
            bundle2 = bundle;
        }
        if (C849820XVk.LIZ(bundle2).booleanValue()) {
            CopyOnWriteArrayList<C0XVA> copyOnWriteArrayList = C0NPK.LIZ;
            C0XV8.LIZJ(bundle2);
            return;
        }
        if (z && (iAccountSwitcherLogger = (IAccountSwitcherLogger) PluggableExtentionKt.pluggableSpi(IAccountSwitcherLogger.class)) != null) {
            iAccountSwitcherLogger.LIZIZ();
            if (C294010Bfj.LIZ()) {
                return;
            }
        }
        final ILoginUtilsService iLoginUtilsService = (ILoginUtilsService) PluggableExtentionKt.pluggableSpi(ILoginUtilsService.class);
        if (iLoginUtilsService == null) {
            return;
        }
        if (z && (C294010Bfj.LIZIZ() == 2 || C294010Bfj.LIZIZ() == 3)) {
            C0XVC.LIZ(Long.valueOf(jCurrentTimeMillis), "LoginRestartHook", "switch_account");
            iLoginUtilsService.LIZIZ(bundle2);
        } else {
            C786410Ut5.LJLIIL(500L, new BPEAHandler(), new Runnable() { // from class: X.0XV3
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z2 = z;
                    long j = jCurrentTimeMillis;
                    ILoginUtilsService iLoginUtilsService2 = iLoginUtilsService;
                    Bundle bundle3 = bundle2;
                    C1C7U.LIZ("AfterLoginActions@2557.lambda$addLoginRestartAction$6$1L");
                    C0XVC.LIZ(Long.valueOf(j), "LoginRestartHook", z2 ? "switch_account" : "login");
                    iLoginUtilsService2.LIZ(bundle3);
                    C1C7U.LIZIZ("AfterLoginActions@2557.lambda$addLoginRestartAction$6$1L");
                }
            });
        }
    }
}
