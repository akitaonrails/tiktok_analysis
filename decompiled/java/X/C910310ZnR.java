package X;

import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.im.message.template.component.GreetingCardInfoComponent;
import com.ss.android.ugc.aweme.viewmodel.GreetingCardViewModel;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZnR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.views.GreetingCardPopupView$showAsViewer$3$1", f = "GreetingCardPopupView.kt", l = {}, m = "invokeSuspend")
public final class C910310ZnR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C910370ZnX LL;
    public final /* synthetic */ GreetingCardViewModel LLILLJJLI;
    public final /* synthetic */ GreetingCardInfoComponent LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C910310ZnR(C910370ZnX c910370ZnX, GreetingCardViewModel greetingCardViewModel, GreetingCardInfoComponent greetingCardInfoComponent, boolean z, InterfaceC1364105Vn<? super C910310ZnR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c910370ZnX;
        this.LLILLJJLI = greetingCardViewModel;
        this.LLILLL = greetingCardInfoComponent;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C910310ZnR(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GreetingCardPopupView@4419.showAsViewer$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1390410mHn c1390410mHn = this.LL.LLILZ;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        C1584506Ih.LIZ(this.LL.LLILZ);
        LinearLayout linearLayout = this.LL.LLILZIL;
        if (linearLayout != null) {
            C786410Ut5.W4(linearLayout, 1.0f);
        }
        Iterator<C909870Zmj> it2 = this.LL.getTransitionHideViewConfigs().iterator();
        while (it2.hasNext()) {
            for (View view : it2.next().LIZ) {
                if (view != null) {
                    C786410Ut5.T4(view, 1.0f);
                }
            }
        }
        this.LL.LJIIIIZZ(this.LLILLJJLI, this.LLILLL, this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GreetingCardPopupView@4419.showAsViewer$3$1");
        return unit;
    }
}
