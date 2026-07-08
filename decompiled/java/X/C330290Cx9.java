package X;

import android.os.SystemClock;
import com.ss.android.ugc.profile.business.ur.school.addschool.SelectSchoolPageAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cx9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.addschool.SelectSchoolPageAssem$onViewCreated$2$5$1", f = "SelectSchoolPageAssem.kt", l = {320}, m = "invokeSuspend")
public final class C330290Cx9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SelectSchoolPageAssem LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330290Cx9(SelectSchoolPageAssem selectSchoolPageAssem, String str, InterfaceC1364105Vn<? super C330290Cx9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = selectSchoolPageAssem;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C330290Cx9(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SelectSchoolPageAssem@2721.onViewCreated$2$5$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("SelectSchoolPageAssem@2721.onViewCreated$2$5$1");
                return objLJFF;
            }
        }
        C0DOO c0doo = C0DOO.LIZ;
        C1245860iWe enterFrom = this.LLILLJJLI.hp().getEnterFrom();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        SelectSchoolPageAssem selectSchoolPageAssem = this.LLILLJJLI;
        long j = jElapsedRealtime - selectSchoolPageAssem.LLLIL;
        String str = this.LLILLL;
        int i2 = !selectSchoolPageAssem.hp().bt0() ? 1 : 0;
        c0doo.getClass();
        C1245880iWg c1245880iWg = C1245880iWg.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c1245880iWg.getClass();
        C1245880iWg.LIZ(c2344009Gk, enterFrom);
        c2344009Gk.LIZLLL(j, "time_spent");
        c2344009Gk.LJIIIIZZ("text_input", str);
        c2344009Gk.LIZJ(i2, "is_new_user");
        C20684815ws.LJIILLIIL("show_empty_school_search_result", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SelectSchoolPageAssem@2721.onViewCreated$2$5$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
