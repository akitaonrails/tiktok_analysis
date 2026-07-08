package X;

import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0K5g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511780K5g extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubscriptionSceneContext LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C511780K5g(SubscriptionSceneContext subscriptionSceneContext, String str, String str2, String str3, int i, String str4) {
        super(0);
        this.LL = subscriptionSceneContext;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = i;
        this.LLILZLL = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscription_change_price_sheet_not_now");
        C0K61.LIZ(c511970K5z, this.LL);
        c511970K5z.LIZIZ(this.LLILLJJLI, "show_entrance");
        c511970K5z.LIZIZ("notify_and_consent", "show_type");
        c511970K5z.LIZIZ(this.LLILLL, "old_price");
        c511970K5z.LIZIZ(this.LLILZ, "new_price");
        c511970K5z.LIZIZ(Integer.valueOf(this.LLILZIL), "subscribe_month");
        c511970K5z.LIZIZ("auto_sub", "subscribe_type");
        c511970K5z.LIZIZ(this.LLILZLL, "renewal_time");
        c511970K5z.LIZLLL();
        return Unit.LIZ;
    }
}
