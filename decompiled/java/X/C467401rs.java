package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.minis.page.main.functions.notification.api.MinisNotificationSubscribeApi;
import com.ss.android.ugc.aweme.minis.page.main.functions.notification.page.MinisNotificationSettingFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01rs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.page.main.functions.notification.page.MinisNotificationSettingFragment$initView$1$2$1$1", f = "MinisNotificationSettingFragment.kt", l = {123, 130}, m = "invokeSuspend")
public final class C467401rs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MinisNotificationSettingFragment LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C127M LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C467401rs(MinisNotificationSettingFragment minisNotificationSettingFragment, int i, C127M c127m, InterfaceC1364105Vn<? super C467401rs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = minisNotificationSettingFragment;
        this.LLILLL = i;
        this.LLILZ = c127m;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C467401rs(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BaseResponse baseResponse;
        C1C7U.LIZ("MinisNotificationSettingFragment@e13.initView$1$2$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            baseResponse = null;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MinisNotificationSettingFragment@e13.initView$1$2$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            MinisNotificationSubscribeApi minisNotificationSubscribeApi = MinisNotificationSubscribeApi.LIZIZ;
            String str = this.LLILLJJLI.SR().schemaParserData.clientKey;
            if (str == null) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("MinisNotificationSettingFragment@e13.initView$1$2$1$1");
                return unit2;
            }
            int i2 = this.LLILLL;
            this.LL = 1;
            obj = minisNotificationSubscribeApi.updateInboxSubscription(str, i2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MinisNotificationSettingFragment@e13.initView$1$2$1$1");
                return objLJFF;
            }
        }
        baseResponse = (BaseResponse) obj;
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C467301rr c467301rr = new C467301rr(baseResponse, this.LLILZ, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c467301rr) == objLJFF) {
            C1C7U.LIZIZ("MinisNotificationSettingFragment@e13.initView$1$2$1$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("MinisNotificationSettingFragment@e13.initView$1$2$1$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
