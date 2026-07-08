package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyBookingFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JOg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C491240JOg extends C09AY implements Function2<C03H5, EnumC491290JOl, Unit> {
    public final /* synthetic */ PcsCalendlyBookingFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C491240JOg(PcsCalendlyBookingFragment pcsCalendlyBookingFragment) {
        super(2);
        this.LL = pcsCalendlyBookingFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, EnumC491290JOl enumC491290JOl) {
        C491270JOj.LIZ(this.LL.OR(), EnumC491250JOh.SHOW, "");
        return Unit.LIZ;
    }
}
