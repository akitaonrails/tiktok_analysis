package Y;

import X.C1913610ztf;
import X.EnumC1913590ztd;
import X.InterfaceC1913620ztg;
import android.view.View;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;

/* JADX INFO: loaded from: classes29.dex */
public class ACListenerS11S0010000_28 implements View.OnClickListener {
    public final int $t;
    public boolean z0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
        }
    }

    public ACListenerS11S0010000_28(boolean z, int i) {
        this.$t = i;
        this.z0 = z;
    }

    public static final void onClick$0(ACListenerS11S0010000_28 aCListenerS11S0010000_28, View view) {
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            iCompliancePolicyServiceLJIIIIZZ.LIZ(new C1913610ztf(EnumC1913590ztd.NUJ_CONSENT.getValue(), "terms-of-service", false, true, true, null, aCListenerS11S0010000_28.z0, 36), new InterfaceC1913620ztg() { // from class: X.0zu2
                @Override // X.InterfaceC1913620ztg
                public final void onComplete() {
                }
            });
        }
    }

    public static final void onClick$1(ACListenerS11S0010000_28 aCListenerS11S0010000_28, View view) {
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            iCompliancePolicyServiceLJIIIIZZ.LIZ(new C1913610ztf(EnumC1913590ztd.NUJ_CONSENT.getValue(), "privacy-policy", false, true, true, null, aCListenerS11S0010000_28.z0, 36), new InterfaceC1913620ztg() { // from class: X.0zu3
                @Override // X.InterfaceC1913620ztg
                public final void onComplete() {
                }
            });
        }
    }

    public static final void onClick$2(ACListenerS11S0010000_28 aCListenerS11S0010000_28, View view) {
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            iCompliancePolicyServiceLJIIIIZZ.LIZ(new C1913610ztf(EnumC1913590ztd.NUJ_CONSENT.getValue(), "summary-of-terms-and-conditions-eea", false, true, true, null, aCListenerS11S0010000_28.z0, 36), new InterfaceC1913620ztg() { // from class: X.0zty
                @Override // X.InterfaceC1913620ztg
                public final void onComplete() {
                }
            });
        }
    }

    public static final void onClick$3(ACListenerS11S0010000_28 aCListenerS11S0010000_28, View view) {
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            iCompliancePolicyServiceLJIIIIZZ.LIZ(new C1913610ztf(EnumC1913590ztd.NUJ_CONSENT.getValue(), "privacy-highlights", false, true, true, null, aCListenerS11S0010000_28.z0, 36), new InterfaceC1913620ztg() { // from class: X.0ztz
                @Override // X.InterfaceC1913620ztg
                public final void onComplete() {
                }
            });
        }
    }
}
