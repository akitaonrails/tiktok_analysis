package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cvu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchProsConsTabAssemViewModel$InnerFlowModel$loadMoreList$1$2$1", f = "SearchProsConsTabAssemViewModel.kt", l = {}, m = "invokeSuspend")
public final class C329520Cvu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C329550Cvx LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329520Cvu(C329550Cvx c329550Cvx, InterfaceC1364105Vn<? super C329520Cvu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c329550Cvx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C329520Cvu(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchProsConsTabAssemViewModel$InnerFlowModel@2af5.loadMoreList$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C329550Cvx c329550Cvx = this.LL;
        c329550Cvx.mIsLoading = false;
        List<InterfaceC1526205yG> list = c329550Cvx.mNotifyListeners;
        if (list != null) {
            for (InterfaceC1526205yG interfaceC1526205yG : list) {
                interfaceC1526205yG.onFailed((Exception) interfaceC1526205yG);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchProsConsTabAssemViewModel$InnerFlowModel@2af5.loadMoreList$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
