package X;

import com.ss.android.ugc.profile.business.ur.school.addschool.GraduationYearPageAssem;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cwv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.addschool.GraduationYearPageAssem$onCreateView$6$1$1", f = "GraduationYearPageAssem.kt", l = {121}, m = "invokeSuspend")
public final class C330150Cwv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GraduationYearPageAssem LLILLJJLI;
    public final /* synthetic */ C197039127h LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330150Cwv(GraduationYearPageAssem graduationYearPageAssem, C197039127h c197039127h, InterfaceC1364105Vn<? super C330150Cwv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = graduationYearPageAssem;
        this.LLILLL = c197039127h;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C330150Cwv(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GraduationYearPageAssem@c6ff.onCreateView$6$1$1");
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
            CampusFlowViewModel campusFlowViewModelHp = this.LLILLJJLI.hp();
            this.LL = 1;
            if (campusFlowViewModelHp.zQ2(this) == objLJFF) {
                C1C7U.LIZIZ("GraduationYearPageAssem@c6ff.onCreateView$6$1$1");
                return objLJFF;
            }
        }
        this.LLILLL.setLoading(false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GraduationYearPageAssem@c6ff.onCreateView$6$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
