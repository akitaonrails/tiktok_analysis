package X;

import com.bytedance.android.livesdk.comp.api.pcs.ui.loading.IPcsLoadingAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.OneStopMainAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0vFW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1734960vFW extends C09AY implements Function2<UIAssem, AbstractC1623806Xk<? extends C1820630xTh>, Unit> {
    public final /* synthetic */ IPcsLoadingAbility LL;
    public final /* synthetic */ OneStopMainAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1734960vFW(IPcsLoadingAbility iPcsLoadingAbility, OneStopMainAssem oneStopMainAssem) {
        super(2);
        this.LL = iPcsLoadingAbility;
        this.LLILLJJLI = oneStopMainAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, AbstractC1623806Xk<? extends C1820630xTh> abstractC1623806Xk) {
        if (abstractC1623806Xk instanceof C1623706Xj) {
            IPcsLoadingAbility iPcsLoadingAbility = this.LL;
            if (iPcsLoadingAbility != null) {
                iPcsLoadingAbility.LJLJLJ();
            }
        } else if (abstractC1623806Xk instanceof C491001vg) {
            IPcsLoadingAbility iPcsLoadingAbility2 = this.LL;
            if (iPcsLoadingAbility2 != null) {
                iPcsLoadingAbility2.Ly2(C1734970vFX.LIZ(new C1821030xUL(this.LLILLJJLI)), null, null);
            }
        } else {
            IPcsLoadingAbility iPcsLoadingAbility3 = this.LL;
            if (iPcsLoadingAbility3 != null) {
                iPcsLoadingAbility3.LJJJJL();
            }
        }
        return Unit.LIZ;
    }
}
