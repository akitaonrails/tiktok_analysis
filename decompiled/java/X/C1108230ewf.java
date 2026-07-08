package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.pincard.SubscriptionCommonGuidanceLiveCardWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ewf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1108230ewf extends C09AY implements Function1<C1108330ewp, Unit> {
    public final /* synthetic */ SubscriptionCommonGuidanceLiveCardWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1108230ewf(SubscriptionCommonGuidanceLiveCardWidget subscriptionCommonGuidanceLiveCardWidget) {
        super(1);
        this.LL = subscriptionCommonGuidanceLiveCardWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C1108330ewp c1108330ewp) {
        final C1108330ewp c1108330ewp2 = c1108330ewp;
        C16FS c16fs = this.LL.LLILZIL;
        if (c16fs != null) {
            c16fs.setText(c1108330ewp2.LIZJ);
        }
        C16F5 c16f5 = this.LL.LLILLL;
        if (c16f5 != null) {
            c16f5.setText(c1108330ewp2.LIZIZ);
        }
        C16F5 c16f52 = this.LL.LLILZ;
        if (c16f52 != null) {
            c16f52.setText(c1108330ewp2.LIZ);
        }
        final SubscriptionCommonGuidanceLiveCardWidget subscriptionCommonGuidanceLiveCardWidget = this.LL;
        C16FS c16fs2 = subscriptionCommonGuidanceLiveCardWidget.LLILZIL;
        if (c16fs2 != null) {
            C786410Ut5.h8(c16fs2, new View.OnClickListener() { // from class: X.0ewk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c1108330ewp2.LJ.invoke();
                    subscriptionCommonGuidanceLiveCardWidget.hide();
                }
            });
        }
        C1143680frq.LIZLLL(this.LL.LLILLJJLI, "tiktok_live_subscription_demand_1", c1108330ewp2.LIZLLL);
        this.LL.show();
        return Unit.LIZ;
    }
}
