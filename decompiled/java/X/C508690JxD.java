package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.bytedance.android.livesdk.subscribe.model.SubLiveBanner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JxD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C508690JxD extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C509140Jxw LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C508690JxD(C509140Jxw c509140Jxw) {
        super(0);
        this.LL = c509140Jxw;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str;
        String string;
        String strLIZJ = C507390Jv7.LIZJ(this.LL.LLILZ);
        C509140Jxw c509140Jxw = this.LL;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = c509140Jxw.LLILZIL;
        String str2 = "";
        if (subscriptionPrivilegeDetailFragment == null || (str = subscriptionPrivilegeDetailFragment.LLILZIL) == null) {
            str = "";
        }
        SubLiveBanner subLiveBanner = c509140Jxw.LLILZ.banner;
        if (subLiveBanner != null && (string = Long.valueOf(subLiveBanner.id).toString()) != null) {
            str2 = string;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_operation_top_banner_click");
        c474500IjALIZ.LJJII(strLIZJ, "subscribe_state");
        c474500IjALIZ.LJJII(str, "show_entrance");
        c474500IjALIZ.LJJII(str2, "banner_id");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }
}
