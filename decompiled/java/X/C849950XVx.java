package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;

/* JADX INFO: renamed from: X.0XVx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class C849950XVx implements C0XV9 {
    public final /* synthetic */ Bundle LIZ;
    public final /* synthetic */ boolean LIZIZ;

    public /* synthetic */ C849950XVx(Bundle bundle, boolean z) {
        this.LIZ = bundle;
        this.LIZIZ = z;
    }

    @Override // X.C0XV9
    public final void LIZ(final Bundle bundle) {
        Bundle bundle2 = this.LIZ;
        final boolean z = this.LIZIZ;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (bundle == null) {
            bundle = bundle2;
        }
        ComplianceServiceProvider.LJIJJ().LJJI("after_login");
        ComplianceServiceProvider.LJJI().LJIJJLI(new C100F() { // from class: X.0XVy
            @Override // X.C100F
            public final void LIZIZ(boolean z2) {
                String str;
                ComplianceServiceProvider.LJJI().LJIIJ();
                if (z) {
                    str = "switch_account";
                } else {
                    str = "login";
                }
                C0XVC.LIZ(Long.valueOf(jCurrentTimeMillis), "ComplianceHook", str);
                C0XV8.LIZJ(bundle);
            }
        }, C0XQ7.LJFF().isNewUser() ? 1 : 0);
    }
}
