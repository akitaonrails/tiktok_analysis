package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05yp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.utils.SchoolBadgeEventTracking$reportClickCreateGroup$1", f = "SchoolBadgeEventTracking.kt", l = {}, m = "invokeSuspend")
public final class C1529705yp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1529705yp(String str, int i, boolean z, InterfaceC1364105Vn<? super C1529705yp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1529705yp(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SchoolBadgeEventTracking@7bce.reportClickCreateGroup$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "school_group_page");
        c2344009Gk.LJIIIIZZ("enter_method", "click_profile_school");
        c2344009Gk.LJIIIIZZ("group_owner_account_type", C1528505yd.LIZ(C461720I8s.LIZIZ()));
        c2344009Gk.LJIIIIZZ("tab_name", this.LL);
        c2344009Gk.LIZJ(this.LLILLJJLI, "tab_num");
        c2344009Gk.LIZJ(this.LLILLL ? 1 : 0, "has_menu");
        C20684815ws.LJIILLIIL("click_create_group", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SchoolBadgeEventTracking@7bce.reportClickCreateGroup$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
