package X;

import com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchSuggestViewModelNew;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qb9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchSuggestViewModelNew$fetchFirstScreenData$1", f = "EcSearchSuggestViewModelNew.kt", l = {}, m = "invokeSuspend")
public final class C673370Qb9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EcSearchSuggestViewModelNew LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C673430QbF LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C673370Qb9(EcSearchSuggestViewModelNew ecSearchSuggestViewModelNew, long j, C673430QbF c673430QbF, InterfaceC1364105Vn<? super C673370Qb9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = ecSearchSuggestViewModelNew;
        this.LLILLJJLI = j;
        this.LLILLL = c673430QbF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C673370Qb9(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcSearchSuggestViewModelNew@29c4.fetchFirstScreenData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C673420QbE c673420QbEVQ2 = this.LL.vQ2(true, this.LLILLJJLI, this.LLILLL);
        if (c673420QbEVQ2 != null) {
            this.LL.LLILLJJLI = c673420QbEVQ2;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchSuggestViewModelNew@29c4.fetchFirstScreenData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
