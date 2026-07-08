package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JxL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C508770JxL extends C2217421BqW implements Function1<AbstractC509530JyZ, Unit> {
    public C508770JxL(Object obj) {
        super(1, obj, AbsPrivilegeDetailBaseFragment.class, "onSubscriptionStatusChanged", "onSubscriptionStatusChanged(Lcom/bytedance/android/livesdk/comp/api/subscription/status/SubscriptionStatus;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC509530JyZ abstractC509530JyZ) {
        ((AbsPrivilegeDetailBaseFragment) this.receiver).mS(abstractC509530JyZ);
        return Unit.LIZ;
    }
}
