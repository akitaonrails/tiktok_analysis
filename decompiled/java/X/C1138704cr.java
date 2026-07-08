package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeetingdmdialog.dialog.CalendlyMeetingDmDialog;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04cr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1138704cr extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ CalendlyMeetingDmDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1138704cr(CalendlyMeetingDmDialog calendlyMeetingDmDialog) {
        super(1);
        this.LL = calendlyMeetingDmDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.RQ2(this.LL, new C1138804cs());
        assembler2.RQ2(this.LL, new C1137304cd());
        return Unit.LIZ;
    }
}
