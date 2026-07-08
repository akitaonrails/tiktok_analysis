package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioFailureAssem;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KUa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C518220KUa extends C09AY implements Function2<UIAssem, C0KUR, Unit> {
    public final /* synthetic */ PcsServiceBioFailureAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C518220KUa(PcsServiceBioFailureAssem pcsServiceBioFailureAssem) {
        super(2);
        this.LL = pcsServiceBioFailureAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C0KUR c0kur) {
        C1822300xWO c1822300xWO;
        Long lValueOf;
        if (c0kur == C0KUR.LOAD_FAIL) {
            View view = this.LL.LLJJI;
            if (view != null) {
                C500260Jjc.LLFFF(view);
            }
            PcsServiceBioFailureAssem pcsServiceBioFailureAssem = this.LL;
            C1784870wY1 c1784870wY1 = pcsServiceBioFailureAssem.kp().getState().LLILLJJLI;
            if (c1784870wY1 != null && (c1822300xWO = c1784870wY1.LIZIZ) != null && (lValueOf = Long.valueOf(c1822300xWO.LJII)) != null && lValueOf.longValue() == 0) {
                C197039127h c197039127h = pcsServiceBioFailureAssem.LLJJIJI;
                if (c197039127h != null) {
                    C500260Jjc.LJIILIIL(c197039127h);
                }
            } else {
                C197039127h c197039127h2 = pcsServiceBioFailureAssem.LLJJIJI;
                if (c197039127h2 != null) {
                    C500260Jjc.LLFFF(c197039127h2);
                }
            }
            InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
            if (interfaceC517590KRpLIZJ != null) {
                int i = this.LL.kp().LLIZ;
                Throwable th = this.LL.kp().getState().LLILZ;
                if (th == null) {
                    th = new Throwable();
                }
                interfaceC517590KRpLIZJ.LJI(new C0JOM(i, CardStruct.IStatusCode.DEFAULT, th));
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
