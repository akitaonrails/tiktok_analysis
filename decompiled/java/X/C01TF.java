package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01TF, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.base.statistics.ProfilePlatformStatistics$sendChangeProfileTabEvent$1", f = "ProfilePlatformStatistics.kt", l = {}, m = "invokeSuspend")
public final class C01TF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01TF(String str, String str2, String str3, String str4, String str5, String str6, Long l, InterfaceC1364105Vn<? super C01TF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01TF(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfilePlatformStatistics@1051.sendChangeProfileTabEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LL);
        c2344009Gk.LJIIIIZZ("enter_method", this.LLILLJJLI);
        c2344009Gk.LJIIIIZZ("tab_name", this.LLILLL);
        c2344009Gk.LJIIIIZZ("to_user_id", this.LLILZ);
        c2344009Gk.LJIIIIZZ("from_tab_name", this.LLILZIL);
        c2344009Gk.LJIIIIZZ("previous_page", this.LLILZLL);
        c2344009Gk.LJ(this.LLIZ, "profile_entrance_id");
        C20684815ws.LJIILLIIL("profile_change_tab", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfilePlatformStatistics@1051.sendChangeProfileTabEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
