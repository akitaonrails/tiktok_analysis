package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyBookingDetailAssem;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04cT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1136304cT extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ PcsCalendlyBookingDetailAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1136304cT(PcsCalendlyBookingDetailAssem pcsCalendlyBookingDetailAssem) {
        super(1);
        this.LL = pcsCalendlyBookingDetailAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C1136204cS());
        return Unit.LIZ;
    }
}
