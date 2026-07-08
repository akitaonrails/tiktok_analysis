package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Jun, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507190Jun extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C507650JvX LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C507190Jun(C507650JvX c507650JvX) {
        super(0);
        this.LL = c507650JvX;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function0<Unit> function0;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = this.LL.LLILZIL;
        if (subscriptionPrivilegeDetailFragment != null && (function0 = subscriptionPrivilegeDetailFragment.LLILZ) != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }
}
