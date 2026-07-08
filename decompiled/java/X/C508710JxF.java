package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.bytedance.android.livesdk.subscribe.model.SubLiveBanner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0JxF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C508710JxF extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubscriptionPrivilegeDetailFragment LL;
    public final /* synthetic */ GetSubPrivilegeDetailResponse.Data LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C508710JxF(SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment, GetSubPrivilegeDetailResponse.Data data) {
        super(0);
        this.LL = subscriptionPrivilegeDetailFragment;
        this.LLILLJJLI = data;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String string;
        String strCS = this.LL.cS();
        String str = this.LL.LLILZIL;
        SubLiveBanner subLiveBanner = this.LLILLJJLI.banner;
        if (subLiveBanner == null || (string = Long.valueOf(subLiveBanner.id).toString()) == null) {
            string = "";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_operation_top_banner_click");
        if (strCS != null) {
            c474500IjALIZ.LJJII(strCS, "subscribe_state");
        }
        c474500IjALIZ.LJJII(str, "show_entrance");
        c474500IjALIZ.LJJII(string, "banner_id");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }
}
