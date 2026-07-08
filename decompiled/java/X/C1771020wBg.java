package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0wBg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.tools.MallNetUtils$prefetchWithDefaultParams$mainDataSsResponse$1", f = "MallNetUtils.kt", l = {49}, m = "invokeSuspend")
public final class C1771020wBg extends C09AX implements Function1<InterfaceC1364105Vn<? super C0X52<Response<n>>>, Object> {
    public int LL;
    public final /* synthetic */ List<C080U> LLILLJJLI;
    public final /* synthetic */ n LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1771020wBg(List<C080U> list, n nVar, InterfaceC1364105Vn<? super C1771020wBg> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = nVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1771020wBg(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C0X52<Response<n>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MallNetUtils@40ff.prefetchWithDefaultParams$mainDataSsResponse$1");
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
            C1771050wBj c1771050wBj = new C1771040wBi().LL;
            List<C080U> list = this.LLILLJJLI;
            n nVar = this.LLILLL;
            this.LL = 1;
            obj = c1771050wBj.LLLLILI(list, nVar, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MallNetUtils@40ff.prefetchWithDefaultParams$mainDataSsResponse$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MallNetUtils@40ff.prefetchWithDefaultParams$mainDataSsResponse$1");
        return obj;
    }
}
