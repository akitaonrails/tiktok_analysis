package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyBookingBottomAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JP1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JP1 extends C09AY implements Function2<UIAssem, EnumC2273991DzZ, Unit> {
    public final /* synthetic */ PcsCalendlyBookingBottomAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JP1(PcsCalendlyBookingBottomAssem pcsCalendlyBookingBottomAssem) {
        super(2);
        this.LL = pcsCalendlyBookingBottomAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, EnumC2273991DzZ enumC2273991DzZ) {
        UIAssem uIAssem2 = uIAssem;
        switch (C2274001Dza.LIZ[enumC2273991DzZ.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                C500260Jjc.LJIILIIL(uIAssem2.LJJIJL());
                break;
            case 6:
            case 7:
                PcsCalendlyBookingBottomAssem pcsCalendlyBookingBottomAssem = this.LL;
                pcsCalendlyBookingBottomAssem.ip(pcsCalendlyBookingBottomAssem.hp().getState().LLILLL, this.LL.hp().getState().LLILZ, this.LL.hp().getState().LLILZIL);
                break;
            default:
                throw new C1954807lC();
        }
        return Unit.LIZ;
    }
}
