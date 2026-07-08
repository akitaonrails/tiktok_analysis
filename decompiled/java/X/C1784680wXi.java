package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.PcsIndustrySelectFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.viewmodel.PcsIndustrySelectVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0wXi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1784680wXi extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsIndustrySelectFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784680wXi(PcsIndustrySelectFragment pcsIndustrySelectFragment) {
        super(0);
        this.LL = pcsIndustrySelectFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1784900wY4 c1784900wY4 = this.LL.LLJI;
        if (c1784900wY4 != null) {
            c1784900wY4.LIZJ("confirm");
        }
        PcsIndustrySelectVM pcsIndustrySelectVMNR = this.LL.NR();
        long j = pcsIndustrySelectVMNR.getState().LLILLL;
        if (j != 0) {
            pcsIndustrySelectVMNR.setState(new C1784700wXk());
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(pcsIndustrySelectVMNR), null, null, new C1784520wXS(pcsIndustrySelectVMNR, j, null), 3);
        }
        return Unit.LIZ;
    }
}
