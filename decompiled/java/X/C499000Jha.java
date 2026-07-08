package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Jha, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C499000Jha extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubscriptionPrivilegeDetailFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C499000Jha(SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment) {
        super(0);
        this.LL = subscriptionPrivilegeDetailFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = this.LL;
        if (subscriptionPrivilegeDetailFragment != null) {
            subscriptionPrivilegeDetailFragment.hS(C507380Jv6.LIZ(5).LIZ, C2097908Jt.LIZJ(new Pair("is_perks_rare", "1")));
        }
        return Unit.LIZ;
    }
}
