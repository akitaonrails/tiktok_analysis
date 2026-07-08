package X;

import com.ss.android.ugc.aweme.minis.page.main.functions.notification.api.MinisInboxSubscriptionStatusResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01M0, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.page.main.functions.notification.page.MinisNotificationSettingFragment$refreshSubscriptionStatus$1$1", f = "MinisNotificationSettingFragment.kt", l = {}, m = "invokeSuspend")
public final class C01M0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C127A LL;
    public final /* synthetic */ MinisInboxSubscriptionStatusResponse LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01M0(C127A c127a, MinisInboxSubscriptionStatusResponse minisInboxSubscriptionStatusResponse, InterfaceC1364105Vn<? super C01M0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c127a;
        this.LLILLJJLI = minisInboxSubscriptionStatusResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01M0(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisNotificationSettingFragment@e13.refreshSubscriptionStatus$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIIJJI(false);
        MinisInboxSubscriptionStatusResponse minisInboxSubscriptionStatusResponse = this.LLILLJJLI;
        if (minisInboxSubscriptionStatusResponse != null && minisInboxSubscriptionStatusResponse.isSubscribed() != null) {
            this.LL.LJIILJJIL(this.LLILLJJLI.isSubscribed().booleanValue());
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MinisNotificationSettingFragment@e13.refreshSubscriptionStatus$1$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MinisNotificationSettingFragment@e13.refreshSubscriptionStatus$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
