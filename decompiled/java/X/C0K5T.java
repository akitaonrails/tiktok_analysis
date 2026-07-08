package X;

import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0K5T, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0K5T extends C2217421BqW implements Function1<AbstractC511920K5u, Unit> {
    public C0K5T(Object obj) {
        super(1, obj, AbsPrivilegeDetailBaseFragment.class, "onSubscriptionStatusChanged", "onSubscriptionStatusChanged(Lcom/ss/android/ugc/aweme/subscription/pgc/api/status/SubscriptionStatus;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC511920K5u abstractC511920K5u) {
        ((AbsPrivilegeDetailBaseFragment) this.receiver).hS(abstractC511920K5u);
        return Unit.LIZ;
    }
}
