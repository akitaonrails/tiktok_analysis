package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.SubscribeCombineSettingResponse;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08bL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.vm.UnsubscribeChannelSettingViewModel$fetchAndInit$1$response$1", f = "UnsubscribeChannelSettingViewModel.kt", l = {162}, m = "invokeSuspend")
public final class C2148508bL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super SubscribeCombineSettingResponse>, Object> {
    public int LL;
    public final /* synthetic */ Integer LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2148508bL(Integer num, InterfaceC1364105Vn<? super C2148508bL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2148508bL(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UnsubscribeChannelSettingViewModel@c014.fetchAndInit$1$response$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            NotificationApi.Api apiLIZ = NotificationApi.LIZ();
            int iIntValue = this.LLILLJJLI.intValue();
            this.LL = 1;
            obj = apiLIZ.LJJIJL(iIntValue, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("UnsubscribeChannelSettingViewModel@c014.fetchAndInit$1$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("UnsubscribeChannelSettingViewModel@c014.fetchAndInit$1$response$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super SubscribeCombineSettingResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
