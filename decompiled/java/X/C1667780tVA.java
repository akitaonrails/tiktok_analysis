package X;

import com.ss.android.ugc.aweme.account.passwordless.leaked.HasPasskeyPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tVA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.passwordless.leaked.HasPasskeyPageKt$HasPasskeyPage$1$1", f = "HasPasskeyPage.kt", l = {}, m = "invokeSuspend")
public final class C1667780tVA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ HasPasskeyPageViewModel LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1667780tVA(HasPasskeyPageViewModel hasPasskeyPageViewModel, String str, InterfaceC1364105Vn<? super C1667780tVA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = hasPasskeyPageViewModel;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1667780tVA(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HasPasskeyPageKt@c0cf.HasPasskeyPage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        HasPasskeyPageViewModel hasPasskeyPageViewModel = this.LL;
        String str = this.LLILLJJLI;
        hasPasskeyPageViewModel.LLILLL = str;
        C1669720tYI.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("page", "go_passwordless");
        C20684815ws.LJIILLIIL("remove_password_show", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HasPasskeyPageKt@c0cf.HasPasskeyPage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
