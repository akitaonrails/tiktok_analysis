package X;

import Y.ALAdapterS22S0100000_27;
import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.assem.OneStopTitleAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xTm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1820680xTm extends C09AY implements Function2<UIAssem, Boolean, Unit> {
    public final /* synthetic */ OneStopTitleAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1820680xTm(OneStopTitleAssem oneStopTitleAssem) {
        super(2);
        this.LL = oneStopTitleAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, Boolean bool) {
        if (bool.booleanValue()) {
            View view = this.LL.LLJJIII;
            if (view != null) {
                view.animate().alpha(0.0f).setDuration(150L).setListener(new ALAdapterS22S0100000_27(view, 1));
            }
        } else {
            View view2 = this.LL.LLJJIII;
            if (view2 != null) {
                C500260Jjc.LJFF(200L, view2);
            }
        }
        return Unit.LIZ;
    }
}
