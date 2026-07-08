package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0Jep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497290Jep extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ SubscriptionPrivilegeDetailFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C497290Jep(SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment) {
        super(1);
        this.LL = subscriptionPrivilegeDetailFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        User user;
        String str2 = str;
        GetSubPrivilegeDetailResponse.Data data = this.LL.LLILLJJLI;
        if (data != null) {
            user = data.anchorDetail;
        } else {
            user = null;
        }
        String strLIZ = C0KVU.LIZ(user);
        if (!TextUtils.isEmpty(str2)) {
            C766270U4b.LJIIJJI(str2);
        } else if (!TextUtils.isEmpty(strLIZ)) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131836582, strLIZ));
        }
        return Unit.LIZ;
    }
}
