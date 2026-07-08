package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyBookingTitleAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JOs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C491360JOs extends C09AY implements Function2<UIAssem, EnumC2273991DzZ, Unit> {
    public final /* synthetic */ PcsCalendlyBookingTitleAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C491360JOs(PcsCalendlyBookingTitleAssem pcsCalendlyBookingTitleAssem) {
        super(2);
        this.LL = pcsCalendlyBookingTitleAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, EnumC2273991DzZ enumC2273991DzZ) {
        UIAssem uIAssem2 = uIAssem;
        switch (C2274011Dzb.LIZ[enumC2273991DzZ.ordinal()]) {
            case 1:
            case 2:
            case 3:
                C500260Jjc.LJIILIIL(uIAssem2.LJJIJL());
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                C500260Jjc.LLFFF(uIAssem2.LJJIJL());
                this.LL.ip();
                break;
            default:
                throw new C1954807lC();
        }
        return Unit.LIZ;
    }
}
