package X;

import com.ss.android.ugc.aweme.ecommerce.search.suggest.model.MiddleCouponModel;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchSuggestViewModelNew;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS589S0100000_10;
import njp.a;

/* JADX INFO: renamed from: X.0Qaz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchSuggestViewModelNew$fetchCouponData$1$1", f = "EcSearchSuggestViewModelNew.kt", l = {}, m = "invokeSuspend")
public final class C673270Qaz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EcSearchSuggestViewModelNew LL;
    public final /* synthetic */ MiddleCouponModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C673270Qaz(EcSearchSuggestViewModelNew ecSearchSuggestViewModelNew, MiddleCouponModel middleCouponModel, InterfaceC1364105Vn<? super C673270Qaz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = ecSearchSuggestViewModelNew;
        this.LLILLJJLI = middleCouponModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C673270Qaz(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcSearchSuggestViewModelNew@29c4.fetchCouponData$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(new AwS589S0100000_10(this.LLILLJJLI, 84));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchSuggestViewModelNew@29c4.fetchCouponData$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
