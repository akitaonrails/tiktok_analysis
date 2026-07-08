package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.bytedance.android.livesdk.subscribe.model.SubLiveBanner;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0JxB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C508670JxB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubscriptionPrivilegeDetailFragment LL;
    public final /* synthetic */ GetSubPrivilegeDetailResponse.Data LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C508670JxB(SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment, GetSubPrivilegeDetailResponse.Data data) {
        super(0);
        this.LL = subscriptionPrivilegeDetailFragment;
        this.LLILLJJLI = data;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        String string;
        View view;
        View viewFindViewById;
        String strCS = this.LL.cS();
        String str = this.LL.LLILZIL;
        SubLiveBanner subLiveBanner = this.LLILLJJLI.banner;
        if (subLiveBanner == null || (string = Long.valueOf(subLiveBanner.id).toString()) == null) {
            string = "";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_operation_top_banner_show");
        if (strCS != null) {
            c474500IjALIZ.LJJII(strCS, "subscribe_state");
        }
        c474500IjALIZ.LJJII(str, "show_entrance");
        c474500IjALIZ.LJJII(string, "banner_id");
        c474500IjALIZ.LIZ();
        C16G0 c16g0YS = this.LL.yS();
        if (c16g0YS != null) {
            ViewGroup.LayoutParams layoutParams = c16g0YS.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = (int) C497740JfY.LIZIZ(50.0f);
            C786410Ut5.W5(c16g0YS, marginLayoutParams);
        }
        Fragment parentFragment = this.LL.getParentFragment();
        if (parentFragment != null && (view = parentFragment.getView()) != null && (viewFindViewById = view.findViewById(R.id.es1)) != null) {
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.topMargin = (int) C497740JfY.LIZIZ(50.0f);
            C786410Ut5.W5(viewFindViewById, marginLayoutParams2);
        }
        return Unit.LIZ;
    }
}
