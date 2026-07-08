package X;

import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QiC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel$loadMore$1$1", f = "MixPageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C677740QiC extends C09AX implements Function2<InterfaceC346701Wf<? super AbstractC677910QiT<? extends C1422405hW>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MixPageViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C677740QiC(MixPageViewModel mixPageViewModel, InterfaceC1364105Vn<? super C677740QiC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mixPageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C677740QiC(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixPageViewModel@7afc.loadMore$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.xQ2(C677990Qib.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixPageViewModel@7afc.loadMore$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super AbstractC677910QiT<? extends C1422405hW>> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
