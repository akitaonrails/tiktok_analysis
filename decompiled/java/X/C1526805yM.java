package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05yM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.LiveVerticalViewModel$fetchLoadMoreData$response$1", f = "LiveVerticalViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1526805yM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super n>, Object> {
    public final /* synthetic */ C674800QdS LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1526805yM(C674800QdS c674800QdS, InterfaceC1364105Vn<? super C1526805yM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c674800QdS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1526805yM(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveVerticalViewModel@b55d.fetchLoadMoreData$response$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EcSearchApi ecSearchApi = EcSearchApi.LIZ;
        n nVarLIZLLL = EcSearchApi.LIZLLL(this.LL);
        C1C7U.LIZIZ("LiveVerticalViewModel@b55d.fetchLoadMoreData$response$1");
        return nVarLIZLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super n> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
