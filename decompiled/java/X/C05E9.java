package X;

import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationBaseViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.05E9, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationBaseViewModel$1", f = "EffectRecommendationBaseViewModel.kt", l = {}, m = "invokeSuspend")
public final class C05E9<T> extends C09AX implements Function2<T, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ EffectRecommendationBaseViewModel<T, S> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05E9(EffectRecommendationBaseViewModel<T, S> effectRecommendationBaseViewModel, InterfaceC1364105Vn<? super C05E9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effectRecommendationBaseViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05E9 c05e9 = new C05E9(this.LLILLJJLI, interfaceC1364105Vn);
        c05e9.LL = obj;
        return c05e9;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectRecommendationBaseViewModel@2d35.<init>$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.xQ2((T) this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectRecommendationBaseViewModel@2d35.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
