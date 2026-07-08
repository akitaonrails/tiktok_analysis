package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.01TP, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.base.statistics.ProfilePlatformStatistics$sendCenterSearchResultEvent$1", f = "ProfilePlatformStatistics.kt", l = {}, m = "invokeSuspend")
public final class C01TP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ List<?> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01TP(String str, int i, List<?> list, String str2, String str3, InterfaceC1364105Vn<? super C01TP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = list;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01TP(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfilePlatformStatistics@1051.sendCenterSearchResultEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("search_keyword", this.LL);
        c2344009Gk.LIZJ(this.LLILLJJLI, "result_cnt");
        c2344009Gk.LJIIIIZZ("result_list", u.LJJIFFI(a0.LJLJJI(a0.LJLJJLL(String.valueOf(this.LLILLL), '['), ']'), ", ", ",", false));
        c2344009Gk.LJIIIIZZ("search_id", this.LLILZ);
        c2344009Gk.LJIIIIZZ("pre_search_id", this.LLILZIL);
        C20684815ws.LJIILLIIL("profile_center_search", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfilePlatformStatistics@1051.sendCenterSearchResultEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
