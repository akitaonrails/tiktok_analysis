package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ICredentialManagerService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.0zrg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("google_one_tap_popup")
public final class C1912380zrg extends C10GR {
    public final C19EG LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Function0<Unit> LLILZ;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 202;
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        ICredentialManagerService iCredentialManagerService = (ICredentialManagerService) PluggableExtentionKt.pluggableSpi$default(ICredentialManagerService.class, false, false, false, 14, null);
        if (iCredentialManagerService != null) {
            iCredentialManagerService.LJIL(this.LL, C05X2.GOOGLE_ONETAP, new C1BV9(this.LLILLJJLI, this.LLILLL, "auto_pop", "google_onetap", "", new Bundle()), null);
        }
        Function0<Unit> function0 = this.LLILZ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public C1912380zrg(C19EG c19eg, String str, String str2, AFwS217S0000000_28 aFwS217S0000000_28) {
        this.LL = c19eg;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = aFwS217S0000000_28;
    }
}
