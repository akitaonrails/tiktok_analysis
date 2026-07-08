package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyBookingBottomAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0JP3, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JP3 extends C09AY implements InterfaceC1631630sYr<UIAssem, Integer, Integer, Integer, Unit> {
    public final /* synthetic */ PcsCalendlyBookingBottomAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JP3(PcsCalendlyBookingBottomAssem pcsCalendlyBookingBottomAssem) {
        super(4);
        this.LL = pcsCalendlyBookingBottomAssem;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(UIAssem uIAssem, Integer num, Integer num2, Integer num3) {
        this.LL.ip(num.intValue(), num2.intValue(), num3.intValue());
        return Unit.LIZ;
    }
}
