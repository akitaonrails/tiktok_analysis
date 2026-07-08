package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;

/* JADX INFO: renamed from: X.0WnA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C833700WnA implements InterfaceC20148313sX {
    public final /* synthetic */ SignInHubActivity LIZ;

    public /* synthetic */ C833700WnA(SignInHubActivity signInHubActivity) {
        this.LIZ = signInHubActivity;
    }

    @Override // X.InterfaceC20148313sX
    public final void LIZJ() {
    }

    @Override // X.InterfaceC20148313sX
    public final /* bridge */ /* synthetic */ void LIZ(Object obj) throws Throwable {
        SignInHubActivity signInHubActivity = this.LIZ;
        C2204961BRm.LLLLLL(signInHubActivity.LLILZ, signInHubActivity.LLILZIL, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz9a0JDwFVcOPHkJnRLuRy+92M1tOuHW/snlVnI", new String[]{"016a9"}), signInHubActivity);
        this.LIZ.finish();
    }

    @Override // X.InterfaceC20148313sX
    public final C20147913sT LIZIZ(Bundle bundle) {
        SignInHubActivity signInHubActivity = this.LIZ;
        Set<AbstractC831960WkM> set = AbstractC831960WkM.LIZ;
        synchronized (set) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return new C833720WnC(signInHubActivity, set);
    }
}
