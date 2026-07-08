package X;

import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioContentAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06pr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1728906pr extends C09AY implements Function2<UIAssem, Boolean, Unit> {
    public final /* synthetic */ PcsServiceBioContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728906pr(PcsServiceBioContentAssem pcsServiceBioContentAssem) {
        super(2);
        this.LL = pcsServiceBioContentAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, Boolean bool) {
        ViewGroup.LayoutParams layoutParams;
        if (bool.booleanValue()) {
            PcsServiceBioContentAssem pcsServiceBioContentAssem = this.LL;
            C16F5 c16f5 = pcsServiceBioContentAssem.LLJLILLLLZIIL;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJI(2131856022));
            }
            C16F5 c16f52 = pcsServiceBioContentAssem.LLJLILLLLZIIL;
            C19ME c19me = null;
            if (c16f52 != null) {
                layoutParams = c16f52.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                c19me.endToEnd = -1;
                c19me.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                ((ViewGroup.MarginLayoutParams) c19me).width = -2;
            }
            C16F5 c16f53 = pcsServiceBioContentAssem.LLJLILLLLZIIL;
            if (c16f53 != null) {
                C786410Ut5.y6(c16f53, c19me);
            }
        }
        return Unit.LIZ;
    }
}
