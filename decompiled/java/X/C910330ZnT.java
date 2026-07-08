package X;

import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.viewmodel.GreetingCardViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZnT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.views.GreetingCardPopupView$prepareAndLoadFestiveTheme$1", f = "GreetingCardPopupView.kt", l = {314, 322}, m = "invokeSuspend")
public final class C910330ZnT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GreetingCardViewModel LLILLJJLI;
    public final /* synthetic */ C910370ZnX LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C910330ZnT(GreetingCardViewModel greetingCardViewModel, C910370ZnX c910370ZnX, InterfaceC1364105Vn<? super C910330ZnT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = greetingCardViewModel;
        this.LLILLL = c910370ZnX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C910330ZnT(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SmartImageView smartImageView;
        String str;
        SmartImageView smartImageView2;
        C1C7U.LIZ("GreetingCardPopupView@4419.prepareAndLoadFestiveTheme$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    str = (String) obj;
                    if (str != null && (smartImageView2 = this.LLILLL.LLJILJILJ) != null) {
                        C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(str));
                        c1331670kl3LJII.LJJ = EnumC1338240kve.FIT_XY;
                        c1331670kl3LJII.LJJ(smartImageView2);
                        C786410Ut5.h3(c1331670kl3LJII);
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("GreetingCardPopupView@4419.prepareAndLoadFestiveTheme$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            GreetingCardViewModel greetingCardViewModel = this.LLILLJJLI;
            String str2 = this.LLILLL.LLJJIJI;
            String value = EnumC910400Zna.CARD_BACKGROUND_IMAGE_PATH.getValue();
            this.LL = 1;
            obj = greetingCardViewModel.vQ2(str2, value, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GreetingCardPopupView@4419.prepareAndLoadFestiveTheme$1");
                return objLJFF;
            }
        }
        String str3 = (String) obj;
        if (str3 != null && (smartImageView = this.LLILLL.LLIZ) != null) {
            C1331670kl3 c1331670kl3LJII2 = C1331660kl2.LJII(new C0VSJ(str3));
            c1331670kl3LJII2.LJJ = EnumC1338240kve.FIT_END;
            c1331670kl3LJII2.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJII2);
        }
        GreetingCardViewModel greetingCardViewModel2 = this.LLILLJJLI;
        String str4 = this.LLILLL.LLJJIJI;
        String value2 = EnumC910400Zna.CARD_SKIN_TEXT_OVERLAY_IMAGE_PATH.getValue();
        this.LL = 2;
        obj = greetingCardViewModel2.vQ2(str4, value2, this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("GreetingCardPopupView@4419.prepareAndLoadFestiveTheme$1");
            return objLJFF;
        }
        str = (String) obj;
        if (str != null) {
            C1331670kl3 c1331670kl3LJII3 = C1331660kl2.LJII(new C0VSJ(str));
            c1331670kl3LJII3.LJJ = EnumC1338240kve.FIT_XY;
            c1331670kl3LJII3.LJJ(smartImageView2);
            C786410Ut5.h3(c1331670kl3LJII3);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GreetingCardPopupView@4419.prepareAndLoadFestiveTheme$1");
        return unit2;
    }
}
