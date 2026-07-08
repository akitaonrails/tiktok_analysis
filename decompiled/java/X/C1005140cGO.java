package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cGO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.info.identifier.sheet.AccountOrgIdentifierSheetHelper$showSheet$mob$1", f = "AccountOrgIdentifierSheetBuilder.kt", l = {}, m = "invokeSuspend")
public final class C1005140cGO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1005150cGP LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1005140cGO(String str, C1005150cGP c1005150cGP, InterfaceC1364105Vn<? super C1005140cGO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c1005150cGP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1005140cGO(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AccountOrgIdentifierSheetHelper@a015.showSheet$mob$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLILLJJLI.LIZIZ);
        c2344009Gk.LJIIIIZZ("tt_account_type", String.valueOf(this.LLILLJJLI.LIZ.getOrgAccountType()));
        c2344009Gk.LJIIIIZZ("business_category", this.LLILLJJLI.LIZ.getOrgAccountCategory());
        c2344009Gk.LJIIIIZZ("button", "identifier");
        c2344009Gk.LJIIIIZZ("to_user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AccountOrgIdentifierSheetHelper@a015.showSheet$mob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
