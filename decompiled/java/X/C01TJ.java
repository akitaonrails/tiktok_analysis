package X;

import com.bytedance.scene.Scene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01TJ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.base.statistics.ProfilePlatformStatistics$reportNavbarShowComponent$1", f = "ProfilePlatformStatistics.kt", l = {}, m = "invokeSuspend")
public final class C01TJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01TJ(String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super C01TJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01TJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfilePlatformStatistics@1051.reportNavbarShowComponent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, this.LL);
        c2344009Gk.LJIIIIZZ("enter_from", "others_homepage");
        c2344009Gk.LJIIIIZZ("previous_page", this.LLILLJJLI);
        c2344009Gk.LJIIIIZZ("to_user_id", this.LLILLL);
        c2344009Gk.LJIIIIZZ("tab_name", this.LLILZ);
        c2344009Gk.LIZLLL(C1256070in7.LIZ, "profile_entrance_id");
        C20684815ws.LJIILLIIL("profile_navbar_show", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfilePlatformStatistics@1051.reportNavbarShowComponent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
