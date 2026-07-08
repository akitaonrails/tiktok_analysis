package X;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: X.10XQ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10XQ implements InstallReferrerStateListener {
    public final /* synthetic */ C10XR LIZ;
    public final /* synthetic */ InstallReferrerClient LIZIZ;
    public final /* synthetic */ C10XK LIZJ;
    public final /* synthetic */ CountDownLatch LIZLLL;

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C10XP(this, i, null), 2);
    }

    public C10XQ(C10XR c10xr, InstallReferrerClient installReferrerClient, C10XK c10xk, CountDownLatch countDownLatch) {
        this.LIZ = c10xr;
        this.LIZIZ = installReferrerClient;
        this.LIZJ = c10xk;
        this.LIZLLL = countDownLatch;
    }
}
