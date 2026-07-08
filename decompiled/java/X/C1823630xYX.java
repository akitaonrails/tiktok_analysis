package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.assem.PcsServicePlusOptinFailureAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xYX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1823630xYX extends C09AY implements Function2<UIAssem, EnumC1823680xYc, Unit> {
    public final /* synthetic */ PcsServicePlusOptinFailureAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1823630xYX(PcsServicePlusOptinFailureAssem pcsServicePlusOptinFailureAssem) {
        super(2);
        this.LL = pcsServicePlusOptinFailureAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, EnumC1823680xYc enumC1823680xYc) {
        if (enumC1823680xYc == EnumC1823680xYc.LOAD_FAIL) {
            View view = this.LL.LLJJI;
            if (view != null) {
                C500260Jjc.LLFFF(view);
            }
            InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
            if (interfaceC517590KRpLIZJ != null) {
                int i = this.LL.kp().LLILZIL;
                Throwable th = this.LL.kp().getState().LLILLL;
                if (th == null) {
                    th = new Throwable();
                }
                interfaceC517590KRpLIZJ.LJIIIZ(new C0JOM(i, "", th));
            }
        } else {
            View view2 = this.LL.LLJJI;
            if (view2 != null) {
                C500260Jjc.LJIILIIL(view2);
            }
        }
        return Unit.LIZ;
    }
}
