package X;

import Y.ALAdapterS22S0100000_27;
import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.assem.OneStopFooterAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xTl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1820670xTl extends C09AY implements Function2<UIAssem, Boolean, Unit> {
    public final /* synthetic */ OneStopFooterAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1820670xTl(OneStopFooterAssem oneStopFooterAssem) {
        super(2);
        this.LL = oneStopFooterAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, Boolean bool) {
        C1820630xTh c1820630xThLIZ;
        UIAssem uIAssem2 = uIAssem;
        boolean zBooleanValue = bool.booleanValue();
        AbstractC1623806Xk<C1820630xTh> abstractC1623806Xk = this.LL.hp().getState().LL;
        if (!zBooleanValue || ((c1820630xThLIZ = abstractC1623806Xk.LIZ()) != null && c1820630xThLIZ.LIZ == 0)) {
            View viewLJJIJL = uIAssem2.LJJIJL();
            if (viewLJJIJL != null) {
                viewLJJIJL.animate().alpha(0.0f).setDuration(150L).setListener(new ALAdapterS22S0100000_27(viewLJJIJL, 1));
            }
        } else {
            C500260Jjc.LJFF(400L, uIAssem2.LJJIJL());
        }
        return Unit.LIZ;
    }
}
