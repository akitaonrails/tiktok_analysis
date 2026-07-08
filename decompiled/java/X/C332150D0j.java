package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.components.waterfall.WaterfallRecommendationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0D0j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.components.waterfall.WaterfallRecommendationViewModel$loadProducts$1", f = "WaterfallRecommendationViewModel.kt", l = {77}, m = "invokeSuspend")
public final class C332150D0j extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ WaterfallRecommendationViewModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C332150D0j(WaterfallRecommendationViewModel waterfallRecommendationViewModel, boolean z, InterfaceC1364105Vn<? super C332150D0j> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = waterfallRecommendationViewModel;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C332150D0j(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("WaterfallRecommendationViewModel@cc92.loadProducts$1");
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
            WaterfallRecommendationViewModel waterfallRecommendationViewModel = this.LLILLJJLI;
            C0D0R c0d0r = new C0D0R(waterfallRecommendationViewModel.LLILLJJLI, waterfallRecommendationViewModel.LLILLL, waterfallRecommendationViewModel.LLILZ, waterfallRecommendationViewModel.LLIZ, waterfallRecommendationViewModel.LLILZIL);
            if (this.LLILLL) {
                C0D0O.LIZ(waterfallRecommendationViewModel.LL, c0d0r);
            }
            C0D0O c0d0o = C0D0O.LIZ;
            WaterfallRecommendationViewModel waterfallRecommendationViewModel2 = this.LLILLJJLI;
            C0D0E c0d0e = waterfallRecommendationViewModel2.LL;
            C332160D0k c332160D0k = new C332160D0k(waterfallRecommendationViewModel2, null);
            this.LL = 1;
            obj = c0d0o.LIZJ(c0d0e, c0d0r, c332160D0k, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("WaterfallRecommendationViewModel@cc92.loadProducts$1");
                return objLJFF;
            }
        }
        C0D0T c0d0t = (C0D0T) obj;
        if (c0d0t instanceof C0D0S) {
            this.LLILLJJLI.LLIZLLLIL.setValue(new C0D0Z(((C0D0S) c0d0t).LIZ));
        } else if (Intrinsics.LJFF(c0d0t, C0D0U.LIZ)) {
            this.LLILLJJLI.LLIZLLLIL.setValue(C332110D0f.INSTANCE);
        } else if (Intrinsics.LJFF(c0d0t, C0D0V.LIZ)) {
            C2252321DDq c2252321DDq = this.LLILLJJLI.LLIZLLLIL;
            C844470XAv.LIZ.getClass();
            c2252321DDq.setValue(new C332100D0e(C844470XAv.LIZ().getString(2131857630)));
        } else {
            throw new C1954807lC();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WaterfallRecommendationViewModel@cc92.loadProducts$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
