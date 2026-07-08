package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyBookingFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JOQ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JOQ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsCalendlyBookingFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JOQ(PcsCalendlyBookingFragment pcsCalendlyBookingFragment) {
        super(0);
        this.LL = pcsCalendlyBookingFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PcsCalendlyBookingFragment pcsCalendlyBookingFragment = this.LL;
        pcsCalendlyBookingFragment.getClass();
        InterfaceC517590KRp interfaceC517590KRpLIZ = C1826730xdX.LIZ();
        if (interfaceC517590KRpLIZ != null) {
            interfaceC517590KRpLIZ.LJFF(new C517550KRl(pcsCalendlyBookingFragment.OR().LL));
        }
        this.LL.OR().vQ2();
        return Unit.LIZ;
    }
}
