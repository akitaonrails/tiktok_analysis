package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyBookingTitleAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06Xq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1624406Xq extends C09AY implements Function1<PcsCalendlyBookingTitleAssem, C1624506Xr> {
    public final /* synthetic */ UISlotAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1624406Xq(UISlotAssem uISlotAssem) {
        super(1);
        this.LL = uISlotAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ C1624506Xr invoke(PcsCalendlyBookingTitleAssem pcsCalendlyBookingTitleAssem) {
        View contentView = this.LL.getContentView();
        int i = R.id.c8s;
        LiveIconView liveIconView = (LiveIconView) C1616006Uk.LIZ(R.id.c8s, contentView);
        if (liveIconView != null) {
            i = R.id.c8t;
            C16F5 c16f5 = (C16F5) C1616006Uk.LIZ(R.id.c8t, contentView);
            if (c16f5 != null) {
                i = R.id.c8u;
                C16F5 c16f52 = (C16F5) C1616006Uk.LIZ(R.id.c8u, contentView);
                if (c16f52 != null) {
                    i = R.id.g81;
                    if (C1616006Uk.LIZ(R.id.g81, contentView) != null) {
                        return new C1624506Xr((ConstraintLayout) contentView, liveIconView, c16f5, c16f52);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(contentView.getResources().getResourceName(i)));
    }
}
