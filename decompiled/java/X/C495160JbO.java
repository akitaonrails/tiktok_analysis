package X;

import android.graphics.Bitmap;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.spotlight.SubscriptionSpotlightFragment;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JbO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C495160JbO extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C495170JbP LL;
    public final /* synthetic */ FragmentManager LLILLJJLI;
    public final /* synthetic */ SubscriptionSpotlightFragment LLILLL;
    public final /* synthetic */ List<C495170JbP> LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C495160JbO(C495170JbP c495170JbP, FragmentManager fragmentManager, SubscriptionSpotlightFragment subscriptionSpotlightFragment, List<C495170JbP> list, int i) {
        super(1);
        this.LL = c495170JbP;
        this.LLILLJJLI = fragmentManager;
        this.LLILLL = subscriptionSpotlightFragment;
        this.LLILZ = list;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        Bitmap bitmapLIZ = this.LL.LIZ();
        if (bitmapLIZ != null) {
            C0K8F c0k8f = C0K8F.LIZ;
            FragmentManager fragmentManager = this.LLILLJJLI;
            final SubscriptionSpotlightFragment subscriptionSpotlightFragment = this.LLILLL;
            String str = subscriptionSpotlightFragment.LLJ;
            final List<C495170JbP> list = this.LLILZ;
            final int i = this.LLILZIL;
            AnonymousClass1676 anonymousClass1676 = new AnonymousClass1676() { // from class: X.0JbN
                @Override // X.AnonymousClass1676
                public final void LIZ() {
                }

                @Override // X.AnonymousClass1676
                public final void LIZJ(C207221166x c207221166x) {
                    Bitmap bitmap = c207221166x.LIZIZ;
                    if (bitmap == null) {
                        return;
                    }
                    ((C495170JbP) ListProtector.get(list, i)).LIZIZ(bitmap);
                    ((C495170JbP) ListProtector.get(list, i)).LIZ = null;
                    ((C495170JbP) ListProtector.get(list, i)).LIZIZ = 0;
                    ((C495170JbP) ListProtector.get(list, i)).LIZJ = false;
                    ((C495170JbP) ListProtector.get(list, i)).LJ = null;
                    ((C495170JbP) ListProtector.get(list, i)).LIZLLL = null;
                    subscriptionSpotlightFragment.LLJJJIL.LLLI();
                    subscriptionSpotlightFragment.VR(true);
                }
            };
            c0k8f.getClass();
            IHostSubscription iHostSubscription = (IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class);
            EnumC1782750wUb enumC1782750wUb = EnumC1782750wUb.NO_CHANGE;
            EnumC207219166v enumC207219166v = EnumC207219166v.BITMAP;
            Map mapLJ = C2097608Jq.LJ();
            C0L0G.Companion.getClass();
            iHostSubscription.P51(new AnonymousClass1677(fragmentManager, enumC1782750wUb, enumC207219166v, 2, mapLJ, false, bitmapLIZ, null, null, anonymousClass1676, 1856), str);
            SubscriptionSpotlightFragment subscriptionSpotlightFragment2 = this.LLILLL;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_subscription_highlight_edit_click");
            subscriptionSpotlightFragment2.UR(c474500IjALIZ);
            c474500IjALIZ.LJJII(subscriptionSpotlightFragment2.LLJ, "show_entrance");
            c474500IjALIZ.LIZ();
            SubscriptionSpotlightFragment subscriptionSpotlightFragment3 = this.LLILLL;
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_anchor_subscription_highlight_edit_page_show");
            subscriptionSpotlightFragment3.UR(c474500IjALIZ2);
            c474500IjALIZ2.LJJII(subscriptionSpotlightFragment3.LLJ, "show_entrance");
            c474500IjALIZ2.LJJII("highlight_manage", "click_position");
            c474500IjALIZ2.LJJII(Integer.valueOf(this.LLILLL.LLJJJIL.LLILLJJLI.size()), "picture_quantity");
            c474500IjALIZ2.LIZ();
        }
        return Unit.LIZ;
    }
}
