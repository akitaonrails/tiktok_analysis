package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.impl.subscription.status.SubscriptionStatusService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KAD, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KAD extends C09AY implements Function2<AbstractC509530JyZ, C0KAI, Unit> {
    public final /* synthetic */ SubscriptionStatusService LL;
    public final /* synthetic */ User LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KAD(SubscriptionStatusService subscriptionStatusService, User user) {
        super(2);
        this.LL = subscriptionStatusService;
        this.LLILLJJLI = user;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(AbstractC509530JyZ abstractC509530JyZ, C0KAI c0kai) {
        this.LL.LIZJ(this.LLILLJJLI, abstractC509530JyZ, c0kai);
        return Unit.LIZ;
    }
}
