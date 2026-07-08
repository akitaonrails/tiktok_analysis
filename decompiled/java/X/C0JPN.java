package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyBookingDetailAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JPN, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JPN extends C09AY implements Function2<UIAssem, Integer, Unit> {
    public final /* synthetic */ PcsCalendlyBookingDetailAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JPN(PcsCalendlyBookingDetailAssem pcsCalendlyBookingDetailAssem) {
        super(2);
        this.LL = pcsCalendlyBookingDetailAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, Integer num) {
        EnumC491290JOl enumC491290JOl;
        if (C491230JOf.LIZ(Integer.valueOf(num.intValue()))) {
            EnumC491290JOl enumC491290JOl2 = this.LL.ip().getState().LLIZ;
            if (enumC491290JOl2 != EnumC491290JOl.SCHEDULED_FIRSTTIME && enumC491290JOl2 != (enumC491290JOl = EnumC491290JOl.SCHEDULED_RETURN)) {
                this.LL.ip().DQ2(enumC491290JOl);
            }
            this.LL.kp("scheduled");
            C500260Jjc.LJIILIIL(this.LL.hp().LLILLJJLI);
            C500260Jjc.LLFFF(this.LL.hp().LLILLL);
        } else {
            C500260Jjc.LJIILIIL(this.LL.hp().LLILLL);
        }
        return Unit.LIZ;
    }
}
