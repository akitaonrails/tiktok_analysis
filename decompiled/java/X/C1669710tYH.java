package X;

import com.ss.android.ugc.aweme.account.passwordless.leaked.NoPasskeyPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tYH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.passwordless.leaked.NoPasskeyPageKt$NoPasskeyPage$1$1", f = "NoPasskeyPage.kt", l = {}, m = "invokeSuspend")
public final class C1669710tYH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ NoPasskeyPageViewModel LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1669710tYH(NoPasskeyPageViewModel noPasskeyPageViewModel, String str, InterfaceC1364105Vn<? super C1669710tYH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = noPasskeyPageViewModel;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1669710tYH(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NoPasskeyPageKt@bafd.NoPasskeyPage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        NoPasskeyPageViewModel noPasskeyPageViewModel = this.LL;
        String str = this.LLILLJJLI;
        noPasskeyPageViewModel.LLILLL.setValue(Boolean.TRUE);
        noPasskeyPageViewModel.LLILZIL = str;
        noPasskeyPageViewModel.LLILZLL = 0;
        C1669720tYI.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("page", "go_passwordless");
        C20684815ws.LJIILLIIL("passwordless_edu_show", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NoPasskeyPageKt@bafd.NoPasskeyPage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
