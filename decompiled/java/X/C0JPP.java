package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyBookingDetailAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JPP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JPP extends C09AY implements Function1<PcsCalendlyBookingDetailAssem, C0JPV> {
    public final /* synthetic */ UISlotAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JPP(UISlotAssem uISlotAssem) {
        super(1);
        this.LL = uISlotAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ C0JPV invoke(PcsCalendlyBookingDetailAssem pcsCalendlyBookingDetailAssem) {
        View contentView = this.LL.getContentView();
        int i = R.id.d9d;
        FrameLayout frameLayout = (FrameLayout) C1616006Uk.LIZ(R.id.d9d, contentView);
        if (frameLayout != null) {
            i = R.id.u1g;
            FrameLayout frameLayout2 = (FrameLayout) C1616006Uk.LIZ(R.id.u1g, contentView);
            if (frameLayout2 != null) {
                return new C0JPV((ConstraintLayout) contentView, frameLayout, frameLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(contentView.getResources().getResourceName(i)));
    }
}
