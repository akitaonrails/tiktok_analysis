package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.0zz5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("recover_account")
public final class C1916970zz5 extends C10GR {
    public final C19EG LL;
    public final C0X54 LLILLJJLI;
    public final int LLILLL;

    public C1916970zz5() {
        this(null, null);
    }

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        return C0XQ7.LJFF().getCurUser().isUserCancelled();
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        Context contextLJFF = C2214201BlK.LJFF();
        if (contextLJFF == null) {
            contextLJFF = this.LL;
        }
        if (contextLJFF instanceof C19EG) {
            return new C688120Qyw(contextLJFF, (LifecycleOwner) contextLJFF, null);
        }
        return null;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILLL;
    }

    public C1916970zz5(C19EG c19eg, C0X54 c0x54) {
        this.LL = c19eg;
        this.LLILLJJLI = c0x54;
        this.LLILLL = 80;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        if (!C0XQ7.LIZJ().toRecoverDeletedAccount(null)) {
            c20656615sK.LIZ();
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
