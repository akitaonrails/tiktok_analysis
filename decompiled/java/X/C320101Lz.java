package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.page.main.functions.notification.api.MinisInboxSubscriptionStatusResponse;
import com.ss.android.ugc.aweme.minis.page.main.functions.notification.api.MinisNotificationSubscribeApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Lz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.page.main.functions.notification.page.MinisNotificationSettingFragment$refreshSubscriptionStatus$1", f = "MinisNotificationSettingFragment.kt", l = {157, 163}, m = "invokeSuspend")
public final class C320101Lz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C127A LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320101Lz(String str, C127A c127a, InterfaceC1364105Vn<? super C320101Lz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c127a;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320101Lz(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        MinisInboxSubscriptionStatusResponse minisInboxSubscriptionStatusResponse;
        C1C7U.LIZ("MinisNotificationSettingFragment@e13.refreshSubscriptionStatus$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            minisInboxSubscriptionStatusResponse = null;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MinisNotificationSettingFragment@e13.refreshSubscriptionStatus$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            MinisNotificationSubscribeApi minisNotificationSubscribeApi = MinisNotificationSubscribeApi.LIZIZ;
            String str = this.LLILLJJLI;
            this.LL = 1;
            obj = minisNotificationSubscribeApi.queryInboxSubscriptionStatus(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MinisNotificationSettingFragment@e13.refreshSubscriptionStatus$1");
                return objLJFF;
            }
        }
        minisInboxSubscriptionStatusResponse = (MinisInboxSubscriptionStatusResponse) obj;
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C01M0 c01m0 = new C01M0(this.LLILLL, minisInboxSubscriptionStatusResponse, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c01m0) == objLJFF) {
            C1C7U.LIZIZ("MinisNotificationSettingFragment@e13.refreshSubscriptionStatus$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MinisNotificationSettingFragment@e13.refreshSubscriptionStatus$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
