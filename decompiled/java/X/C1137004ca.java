package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyBookingFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04ca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1137004ca extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ PcsCalendlyBookingFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1137004ca(PcsCalendlyBookingFragment pcsCalendlyBookingFragment) {
        super(1);
        this.LL = pcsCalendlyBookingFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.RQ2(this.LL, new C1137104cb());
        assembler2.RQ2(this.LL, new C1136404cU());
        assembler2.RQ2(this.LL, new C1137204cc());
        assembler2.RQ2(this.LL, new C1136904cZ());
        return Unit.LIZ;
    }
}
