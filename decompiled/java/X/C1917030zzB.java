package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;

/* JADX INFO: renamed from: X.0zzB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("global_compliance_subscription")
public final class C1917030zzB extends C10GR {
    public final C19EG LL;
    public final C0X54 LLILLJJLI;
    public final int LLILLL = 133;

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILLL;
    }

    public C1917030zzB(C19EG c19eg, C0X54 c0x54) {
        this.LL = c19eg;
        this.LLILLJJLI = c0x54;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0zzG] */
    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, final C20656615sK c20656615sK) {
        C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
        if (c19egLIZIZ != null) {
            IComplianceService iComplianceServiceLJIILIIL = ComplianceServiceProvider.LJIILIIL();
            if (!iComplianceServiceLJIILIIL.LJJIIZ(null, 2)) {
                c20656615sK.LIZ();
            } else {
                iComplianceServiceLJIILIIL.LJJI(c19egLIZIZ, new C0TNG() { // from class: X.0zzG
                    @Override // X.C0TNG
                    public final void LIZ() {
                        c20656615sK.LIZ();
                    }
                });
            }
        }
    }

    @Override // X.AbstractC20656215sG
    public final void onPopupStateChanged(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
        C0X54 c0x54;
        super.onPopupStateChanged(enumC20657015sO, enumC20657015sO2);
        if (enumC20657015sO2 == EnumC20657015sO.SHOWED) {
            C0X54 c0x542 = this.LLILLJJLI;
            if (c0x542 != null) {
                c0x542.LIZIZ();
                return;
            }
            return;
        }
        if (enumC20657015sO2 != EnumC20657015sO.DISMISSED || (c0x54 = this.LLILLJJLI) == null) {
            return;
        }
        c0x54.LIZ();
    }
}
