package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JvP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507570JvP extends C09AY implements Function0<String> {
    public final /* synthetic */ C507580JvQ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C507570JvP(C507580JvQ c507580JvQ) {
        super(0);
        this.LL = c507580JvQ;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.LJJJ());
        sbLIZ.append('_');
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = this.LL.LLILZIL;
        sbLIZ.append(subscriptionPrivilegeDetailFragment != null ? subscriptionPrivilegeDetailFragment.LLLI : null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
