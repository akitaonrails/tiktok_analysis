package X;

import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS382S0200000_16;

/* JADX INFO: renamed from: X.0e1g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@InterfaceC20647615qs("main_social_user_recommend")
public final class C1072900e1g extends C10GR {
    public final C19EG LL;
    public final InterfaceC1072780e1U LLILLJJLI;
    public final String LLILLL;
    public final Function0<Unit> LLILZ;
    public final Function1<EnumC1073720e30, Unit> LLILZIL;
    public final int LLILZLL = 230;

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.AbstractC20656215sG
    public final String getPopupEnterFrom() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        this.LLILZ.invoke();
        C2277891EDz.LIZIZ.LJ(this.LLILLL);
        InterfaceC1072780e1U interfaceC1072780e1U = this.LLILLJJLI;
        FragmentManager supportFragmentManager = this.LL.getSupportFragmentManager();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLL);
        sbLIZ.append("_RecUserPopup");
        interfaceC1072780e1U.LJIIL(supportFragmentManager, C2188811AlT.LIZIZ(sbLIZ), new AwS382S0200000_16(this, c20656615sK, 71));
    }

    @Override // X.AbstractC20656215sG
    public final void showPopupFailed(int i, String str) {
        super.showPopupFailed(i, str);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "errorcode");
        c2344009Gk.LJIIIIZZ("errorMsg", str);
        C20684815ws.LJIILLIIL("social_pop_fail_reason", c2344009Gk.LIZ);
    }

    public C1072900e1g(C19EG c19eg, InterfaceC1072780e1U interfaceC1072780e1U, String str, Function0 function0, Function1 function1) {
        this.LL = c19eg;
        this.LLILLJJLI = interfaceC1072780e1U;
        this.LLILLL = str;
        this.LLILZ = function0;
        this.LLILZIL = function1;
    }
}
