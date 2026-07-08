package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.spotlight.SubscriptionSpotlightFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JbU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C495220JbU extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ SubscriptionSpotlightFragment LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C495220JbU(SubscriptionSpotlightFragment subscriptionSpotlightFragment, int i) {
        super(1);
        this.LL = subscriptionSpotlightFragment;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        C0K8F c0k8f = C0K8F.LIZ;
        Context contextRequireContext = this.LL.requireContext();
        String string = this.LL.getString(2131844348);
        String string2 = this.LL.getString(2131844273);
        final C495200JbS c495200JbS = new C495200JbS(this.LL, this.LLILLJJLI);
        String string3 = this.LL.getString(2131844272);
        final C495390Jbl c495390Jbl = new C495390Jbl();
        c0k8f.getClass();
        C782110Um9 c782110Um9 = new C782110Um9(contextRequireContext);
        c782110Um9.LIZJ = string;
        C494720Jag c494720Jag = new C494720Jag();
        C755620TkW c755620TkW = new C755620TkW();
        c755620TkW.LIZ = string2;
        c755620TkW.LIZJ = new InterfaceC743640TFa() { // from class: X.0Jbe
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                c495200JbS.invoke();
                liveDialog.dismiss();
            }
        };
        c494720Jag.LIZ(new C0TZ2(c755620TkW));
        C755630TkX c755630TkX = new C755630TkX();
        c755630TkX.LIZ = string3;
        c755630TkX.LIZJ = new InterfaceC743640TFa() { // from class: X.0Jbf
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                c495390Jbl.invoke();
                liveDialog.dismiss();
            }
        };
        c494720Jag.LIZ(new C0TZ3(c755630TkX));
        c494720Jag.LIZIZ = 1;
        c782110Um9.LIZJ(new C494730Jah(c494720Jag));
        c782110Um9.LJIILLIIL = false;
        c782110Um9.LJIILL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
        SubscriptionSpotlightFragment subscriptionSpotlightFragment = this.LL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_subscription_highlight_delete_click");
        subscriptionSpotlightFragment.UR(c474500IjALIZ);
        c474500IjALIZ.LJJII(subscriptionSpotlightFragment.LLJ, "show_entrance");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }
}
