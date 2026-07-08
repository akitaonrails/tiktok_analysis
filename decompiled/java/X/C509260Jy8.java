package X;

import com.bytedance.android.livesdk.subscribe.model.SubLiveBanner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Jy8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509260Jy8 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubLiveBanner LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C509260Jy8(SubLiveBanner subLiveBanner) {
        super(0);
        this.LL = subLiveBanner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EnumC509250Jy7 enumC509250Jy7 = EnumC509250Jy7.HOST_SUBSCRIPTION_PANEL;
        String str = this.LL.activityName;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_campaign_container_click");
        c474500IjALIZ.LJJII(enumC509250Jy7.getValue(), "event_page");
        c474500IjALIZ.LJJII("anchor", "user_type");
        c474500IjALIZ.LJJII(str, "activity_name");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }
}
