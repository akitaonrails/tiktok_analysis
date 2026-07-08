package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.im.message.template.component.GreetingCardInfoComponent;
import com.ss.android.ugc.aweme.viewmodel.GreetingCardViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZnS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.views.GreetingCardPopupView$showAsViewer$3", f = "GreetingCardPopupView.kt", l = {262, 274}, m = "invokeSuspend")
public final class C910320ZnS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GreetingCardViewModel LLILLJJLI;
    public final /* synthetic */ C910370ZnX LLILLL;
    public final /* synthetic */ LifecycleCoroutineScope LLILZ;
    public final /* synthetic */ GreetingCardInfoComponent LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C910320ZnS(GreetingCardViewModel greetingCardViewModel, C910370ZnX c910370ZnX, LifecycleCoroutineScope lifecycleCoroutineScope, GreetingCardInfoComponent greetingCardInfoComponent, boolean z, InterfaceC1364105Vn<? super C910320ZnS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = greetingCardViewModel;
        this.LLILLL = c910370ZnX;
        this.LLILZ = lifecycleCoroutineScope;
        this.LLILZIL = greetingCardInfoComponent;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C910320ZnS(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GreetingCardPopupView@4419.showAsViewer$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    this.LLILLJJLI.yQ2();
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("GreetingCardPopupView@4419.showAsViewer$3");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            GreetingCardViewModel greetingCardViewModel = this.LLILLJJLI;
            String str = this.LLILLL.LLJJIJI;
            String value = EnumC910400Zna.CARD_BACKGROUND_IMAGE_PATH.getValue();
            this.LL = 1;
            obj = greetingCardViewModel.vQ2(str, value, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GreetingCardPopupView@4419.showAsViewer$3");
                return objLJFF;
            }
        }
        if (obj != null && C2296808zG.LJI(this.LLILZ)) {
            LifecycleCoroutineScope lifecycleCoroutineScope = this.LLILZ;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleCoroutineScope, C2107308Nj.LIZ, null, new C910310ZnR(this.LLILLL, this.LLILLJJLI, this.LLILZIL, this.LLILZLL, null), 2);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("GreetingCardPopupView@4419.showAsViewer$3");
            return unit2;
        }
        this.LL = 2;
        if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
            C1C7U.LIZIZ("GreetingCardPopupView@4419.showAsViewer$3");
            return objLJFF;
        }
        this.LLILLJJLI.yQ2();
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("GreetingCardPopupView@4419.showAsViewer$3");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
