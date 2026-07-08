package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HOW, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem$clickOnElement$1$1", f = "MixStudioHomePageAssem.kt", l = {}, m = "invokeSuspend")
public final class C0HOW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MixStudioHomePageAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HOW(MixStudioHomePageAssem mixStudioHomePageAssem, InterfaceC1364105Vn<? super C0HOW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mixStudioHomePageAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HOW(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioHomePageAssem@94b0.clickOnElement$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Fragment fragmentLJI = C724240Sb0.LJI(this.LL);
        if (fragmentLJI != null) {
            MixStudioHomePageAssem mixStudioHomePageAssem = this.LL;
            C440370HOp c440370HOp = C440370HOp.LIZ;
            EnumC441640HTm enumC441640HTmVQ2 = mixStudioHomePageAssem.hp().vQ2();
            c440370HOp.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", C441660HTo.LIZIZ(enumC441640HTmVQ2).getParam());
            C20684815ws.LJIILLIIL("imagine_studio_show_tap_item_toast", c2344009Gk.LIZ);
            C1389880mGw c1389880mGw = new C1389880mGw(fragmentLJI);
            c1389880mGw.LJIIIIZZ(2131835862);
            c1389880mGw.LJIIJ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixStudioHomePageAssem@94b0.clickOnElement$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
