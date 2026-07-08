package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08bF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.vm.UnsubscribeChannelSettingViewModel$updateSubscribe$1$response$1", f = "UnsubscribeChannelSettingViewModel.kt", l = {123}, m = "invokeSuspend")
public final class C2147908bF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super BaseResponse>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2147908bF(int i, Integer num, boolean z, InterfaceC1364105Vn<? super C2147908bF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = num;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2147908bF(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UnsubscribeChannelSettingViewModel@c014.updateSubscribe$1$response$1");
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
            int i2 = this.LLILLJJLI;
            Integer num = this.LLILLL;
            Integer numLJ = C2286608xc.LJ(this.LLILZ ? 1 : 0);
            this.LL = 1;
            obj = apiLIZ.updateSubscribe(i2, num, numLJ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("UnsubscribeChannelSettingViewModel@c014.updateSubscribe$1$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("UnsubscribeChannelSettingViewModel@c014.updateSubscribe$1$response$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
