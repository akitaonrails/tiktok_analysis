package X;

import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.assem.sku.PcsServiceSkuDMAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0I0S, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I0S extends C09AY implements Function2<C0I0L, Integer, Unit> {
    public final /* synthetic */ PcsServiceSkuDMAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0I0S(PcsServiceSkuDMAssem pcsServiceSkuDMAssem) {
        super(2);
        this.LL = pcsServiceSkuDMAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C0I0L c0i0l, Integer num) {
        int iIntValue = num.intValue();
        LiveSheetFragment liveSheetFragment = ((AbstractC1822440xWc) this.LL.LLJILJILJ.getValue()).LIZ;
        if (liveSheetFragment != null) {
            liveSheetFragment.OR(iIntValue, 0, false);
        }
        return Unit.LIZ;
    }
}
