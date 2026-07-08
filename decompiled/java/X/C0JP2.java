package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyBookingBottomAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JP2, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JP2 extends C09AY implements Function1<PcsCalendlyBookingBottomAssem, C0JP8> {
    public final /* synthetic */ UISlotAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JP2(UISlotAssem uISlotAssem) {
        super(1);
        this.LL = uISlotAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ C0JP8 invoke(PcsCalendlyBookingBottomAssem pcsCalendlyBookingBottomAssem) {
        View contentView = this.LL.getContentView();
        C197039127h c197039127h = (C197039127h) C1616006Uk.LIZ(R.id.eot, contentView);
        if (c197039127h != null) {
            return new C0JP8((ConstraintLayout) contentView, c197039127h);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(contentView.getResources().getResourceName(R.id.eot)));
    }
}
