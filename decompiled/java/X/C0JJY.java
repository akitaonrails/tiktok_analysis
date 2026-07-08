package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeetingdmdialog.dialog.CalendlyMeetingDmDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JJY, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JJY extends C09AY implements Function0<Unit> {
    public final /* synthetic */ CalendlyMeetingDmDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JJY(CalendlyMeetingDmDialog calendlyMeetingDmDialog) {
        super(0);
        this.LL = calendlyMeetingDmDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.wS().setState(new C489920JJe());
        return Unit.LIZ;
    }
}
