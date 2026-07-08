package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08Zi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.passwordless.leaked.ConfirmationPageKt$ConfirmationPage$1$1", f = "ConfirmationPage.kt", l = {}, m = "invokeSuspend")
public final class C2138408Zi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2138408Zi(String str, boolean z, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2138408Zi(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ConfirmationPageKt@2c58.ConfirmationPage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            C1669720tYI c1669720tYI = C1669720tYI.LIZ;
            String str = this.LLILLJJLI;
            c1669720tYI.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str);
            c2344009Gk.LJIIIIZZ("page", "go_passwordless");
            C20684815ws.LJIILLIIL("password_remove_show", c2344009Gk.LIZ);
        } else {
            C1669720tYI c1669720tYI2 = C1669720tYI.LIZ;
            String str2 = this.LLILLJJLI;
            c1669720tYI2.getClass();
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("enter_from", str2);
            C20684815ws.LJIILLIIL("passkey_create_success_show", c2344009Gk2.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ConfirmationPageKt@2c58.ConfirmationPage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
