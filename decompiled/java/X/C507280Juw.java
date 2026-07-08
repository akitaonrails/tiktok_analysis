package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0Juw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507280Juw extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C507650JvX LL;
    public final /* synthetic */ C499110Jhl LLILLJJLI;
    public final /* synthetic */ FragmentManager LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C507280Juw(C507650JvX c507650JvX, C499110Jhl c499110Jhl, FragmentManager fragmentManager, Function0<Unit> function0) {
        super(0);
        this.LL = c507650JvX;
        this.LLILLJJLI = c499110Jhl;
        this.LLILLL = fragmentManager;
        this.LLILZ = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        String str;
        C508400Jwk c508400Jwk;
        EnumC507490JvH enumC507490JvH;
        GetSubPrivilegeDetailResponse.Data data;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = this.LL.LLILZIL;
        if (subscriptionPrivilegeDetailFragment != null) {
            subscriptionPrivilegeDetailFragment.hS(this.LLILLJJLI.LIZ, C2097608Jq.LJ());
        }
        FragmentManager fragmentManager = this.LLILLL;
        Bundle bundle = new Bundle();
        C507650JvX c507650JvX = this.LL;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment2 = c507650JvX.LLILZIL;
        boolean zLIZ = false;
        bundle.putBoolean("ban_package_show", (subscriptionPrivilegeDetailFragment2 == null || (data = subscriptionPrivilegeDetailFragment2.LLILLJJLI) == null) ? false : C507390Jv7.LJFF(data));
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment3 = c507650JvX.LLILZIL;
        if ((subscriptionPrivilegeDetailFragment3 == null || (enumC507490JvH = subscriptionPrivilegeDetailFragment3.LLILLL) == null || enumC507490JvH.isFullScreen()) ? false : true) {
            SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment4 = c507650JvX.LLILZIL;
            C786410Ut5.LJJJI("back_url", subscriptionPrivilegeDetailFragment4 != null ? subscriptionPrivilegeDetailFragment4.wS() : null, bundle);
        }
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment5 = c507650JvX.LLILZIL;
        C786410Ut5.LJJJI("sec_anchor_id", subscriptionPrivilegeDetailFragment5 != null ? subscriptionPrivilegeDetailFragment5.LLJJI : null, bundle);
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment6 = c507650JvX.LLILZIL;
        if (subscriptionPrivilegeDetailFragment6 == null || (str = subscriptionPrivilegeDetailFragment6.LLLI) == null) {
            str = "";
        }
        C786410Ut5.LJJJI("package_id", str, bundle);
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment7 = c507650JvX.LLILZIL;
        if (subscriptionPrivilegeDetailFragment7 != null && (c508400Jwk = subscriptionPrivilegeDetailFragment7.LLJJIII) != null) {
            zLIZ = c508400Jwk.LIZ();
        }
        bundle.putBoolean("preview_mode", zLIZ);
        C505720JsQ.LIZJ(bundle, fragmentManager, "privilege_page");
        this.LLILZ.invoke();
        return Unit.LIZ;
    }
}
