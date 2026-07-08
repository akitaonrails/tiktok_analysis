package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.components.waterfall.WaterfallRecommendationViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D0k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.components.waterfall.WaterfallRecommendationViewModel$loadProducts$1$result$1", f = "WaterfallRecommendationViewModel.kt", l = {}, m = "invokeSuspend")
public final class C332160D0k extends C09AX implements Function2<List<? extends AbstractC331870Czh>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ WaterfallRecommendationViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C332160D0k(WaterfallRecommendationViewModel waterfallRecommendationViewModel, InterfaceC1364105Vn<? super C332160D0k> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = waterfallRecommendationViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C332160D0k c332160D0k = new C332160D0k(this.LLILLJJLI, interfaceC1364105Vn);
        c332160D0k.LL = obj;
        return c332160D0k;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WaterfallRecommendationViewModel@cc92.loadProducts$1$result$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.LLIZLLLIL.setValue(new C0D0Z((List) this.LL));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WaterfallRecommendationViewModel@cc92.loadProducts$1$result$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends AbstractC331870Czh> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(list, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
