package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;

/* JADX INFO: renamed from: X.0zz6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("global_private_account_prompt")
public final class C1916980zz6 extends C10GR {
    public final C19EG LL;
    public final String LLILLJJLI;
    public final C0X54 LLILLL;
    public final int LLILZ;

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZ;
    }

    public /* synthetic */ C1916980zz6(C19EG c19eg) {
        this(c19eg, "profile", null);
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
        if (c19egLIZIZ != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19egLIZIZ, "//private_account_prompt");
            smartRouteBuildRoute.withParam("enter_position", this.LLILLJJLI);
            smartRouteBuildRoute.open();
        }
    }

    @Override // X.AbstractC20656215sG
    public final void onPopupStateChanged(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
        C0X54 c0x54;
        super.onPopupStateChanged(enumC20657015sO, enumC20657015sO2);
        if (enumC20657015sO2 == EnumC20657015sO.SHOWED) {
            C0X54 c0x542 = this.LLILLL;
            if (c0x542 != null) {
                c0x542.LIZIZ();
                return;
            }
            return;
        }
        if (enumC20657015sO2 != EnumC20657015sO.DISMISSED || (c0x54 = this.LLILLL) == null) {
            return;
        }
        c0x54.LIZ();
    }

    public C1916980zz6(C19EG c19eg, String str, C0X54 c0x54) {
        this.LL = c19eg;
        this.LLILLJJLI = str;
        this.LLILLL = c0x54;
        this.LLILZ = 120;
    }
}
