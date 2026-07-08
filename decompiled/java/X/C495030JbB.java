package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.spotlight.SubscriptionSpotlightFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JbB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C495030JbB extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C495170JbP LL;
    public final /* synthetic */ SubscriptionSpotlightFragment LLILLJJLI;
    public final /* synthetic */ List<C495170JbP> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C495030JbB(C495170JbP c495170JbP, SubscriptionSpotlightFragment subscriptionSpotlightFragment, List<C495170JbP> list) {
        super(1);
        this.LL = c495170JbP;
        this.LLILLJJLI = subscriptionSpotlightFragment;
        this.LLILLL = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        Integer num;
        Integer num2 = this.LL.LIZIZ;
        if ((num2 != null && num2.intValue() == 3) || ((num = this.LL.LIZIZ) != null && num.intValue() == 2)) {
            C766270U4b.LIZLLL(2131844271);
        } else {
            List<C495170JbP> list = this.LLILLJJLI.LLJJJIL.LLILLJJLI;
            C495040JbC c495040JbC = new C495040JbC();
            if (((Number) C500260Jjc.LJI(list, c495040JbC).getSecond()).intValue() != -1) {
                ((C495170JbP) ListProtector.get(this.LLILLL, ((Number) C500260Jjc.LJI(this.LLILLJJLI.LLJJJIL.LLILLJJLI, c495040JbC).getSecond()).intValue())).LIZJ = false;
            }
            this.LL.LIZJ = true;
            this.LLILLJJLI.LLJJJIL.LLLI();
            this.LLILLJJLI.VR(true);
        }
        SubscriptionSpotlightFragment subscriptionSpotlightFragment = this.LLILLJJLI;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_subscription_highlight_pin_click");
        subscriptionSpotlightFragment.UR(c474500IjALIZ);
        c474500IjALIZ.LJJII(subscriptionSpotlightFragment.LLJ, "show_entrance");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }
}
