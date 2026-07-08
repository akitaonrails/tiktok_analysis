package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.relation.ffp.nearby.network.ConnectNowApiService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.08gT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.nearby.network.ConnectNowNetworkAPI$exitPage$2", f = "ConnectNowNetworkAPI.kt", l = {76}, m = "invokeSuspend")
public final class C2180308gT extends C09AX implements Function1<InterfaceC1364105Vn<? super BaseResponse>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2180308gT(boolean z, InterfaceC1364105Vn<? super C2180308gT> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2180308gT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ConnectNowNetworkAPI@7c9b.exitPage$2");
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
            AbstractC19484711Kz<BaseResponse> abstractC19484711KzExitPage = ConnectNowApiService.LIZIZ.exitPage(this.LLILLJJLI);
            this.LL = 1;
            obj = C11UD.LIZIZ(abstractC19484711KzExitPage, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ConnectNowNetworkAPI@7c9b.exitPage$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ConnectNowNetworkAPI@7c9b.exitPage$2");
        return obj;
    }
}
