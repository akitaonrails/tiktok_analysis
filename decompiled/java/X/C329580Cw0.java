package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchProsConsTabAssemViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS370S0200000_4;
import njp.a;

/* JADX INFO: renamed from: X.0Cw0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchProsConsTabAssemViewModel$requestData$1$1$1", f = "SearchProsConsTabAssemViewModel.kt", l = {}, m = "invokeSuspend")
public final class C329580Cw0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchProsConsTabAssemViewModel LL;
    public final /* synthetic */ EnumC329590Cw1 LLILLJJLI;
    public final /* synthetic */ List<C329910CwX> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329580Cw0(SearchProsConsTabAssemViewModel searchProsConsTabAssemViewModel, EnumC329590Cw1 enumC329590Cw1, List<C329910CwX> list, InterfaceC1364105Vn<? super C329580Cw0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchProsConsTabAssemViewModel;
        this.LLILLJJLI = enumC329590Cw1;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C329580Cw0(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchProsConsTabAssemViewModel@a84f.requestData$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(new AwS370S0200000_4(this.LLILLJJLI, (EnumC329590Cw1) this.LLILLL, (List<C329910CwX>) 28));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchProsConsTabAssemViewModel@a84f.requestData$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
