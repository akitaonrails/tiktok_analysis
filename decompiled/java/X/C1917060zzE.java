package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;

/* JADX INFO: renamed from: X.0zzE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("global_personalized_ad")
public final class C1917060zzE extends C10GR {
    public final C19EG LL;
    public final C0X54 LLILLJJLI;
    public final int LLILLL = 140;

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILLL;
    }

    public C1917060zzE(C19EG c19eg, C0X54 c0x54) {
        this.LL = c19eg;
        this.LLILLJJLI = c0x54;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
        if (c19egLIZIZ != null) {
            ComplianceServiceProvider.LJIILIIL().LJJJJZ(c19egLIZIZ, c20656615sK);
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
