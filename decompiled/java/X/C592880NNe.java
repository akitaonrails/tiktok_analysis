package X;

import com.bytedance.lighten.loader.SmartImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NNe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.views.GreetingCardPopupView$playAlphaPlayer$1$2$1", f = "GreetingCardPopupView.kt", l = {}, m = "invokeSuspend")
public final class C592880NNe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C910370ZnX LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592880NNe(C910370ZnX c910370ZnX, InterfaceC1364105Vn<? super C592880NNe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c910370ZnX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C592880NNe(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GreetingCardPopupView@4419.playAlphaPlayer$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SmartImageView smartImageView = this.LL.LLJILJILJ;
        if (smartImageView != null) {
            C786410Ut5.u5(smartImageView, 0.0f);
        }
        SmartImageView smartImageView2 = this.LL.LLIZ;
        if (smartImageView2 != null) {
            C786410Ut5.u5(smartImageView2, 0.0f);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GreetingCardPopupView@4419.playAlphaPlayer$1$2$1");
        return unit;
    }
}
