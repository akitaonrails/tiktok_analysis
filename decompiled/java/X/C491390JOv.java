package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyBookingStatusAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JOv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C491390JOv extends C09AY implements Function1<PcsCalendlyBookingStatusAssem, C491400JOw> {
    public final /* synthetic */ UISlotAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C491390JOv(UISlotAssem uISlotAssem) {
        super(1);
        this.LL = uISlotAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ C491400JOw invoke(PcsCalendlyBookingStatusAssem pcsCalendlyBookingStatusAssem) {
        View contentView = this.LL.getContentView();
        int i = R.id.u1h;
        LiveIconView liveIconView = (LiveIconView) C1616006Uk.LIZ(R.id.u1h, contentView);
        if (liveIconView != null) {
            i = R.id.wmy;
            if (C1616006Uk.LIZ(R.id.wmy, contentView) != null) {
                i = R.id.y3j;
                if (C1616006Uk.LIZ(R.id.y3j, contentView) != null) {
                    return new C491400JOw((ConstraintLayout) contentView, liveIconView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(contentView.getResources().getResourceName(i)));
    }
}
