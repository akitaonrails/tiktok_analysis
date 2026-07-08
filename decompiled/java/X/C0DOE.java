package X;

import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.EditCampusPageAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DOE, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.modifyschool.EditCampusPageAssem$onCreateView$navBar$1$1", f = "EditCampusPageAssem.kt", l = {105}, m = "invokeSuspend")
public final class C0DOE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EditCampusPageAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DOE(EditCampusPageAssem editCampusPageAssem, InterfaceC1364105Vn<? super C0DOE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = editCampusPageAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DOE(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditCampusPageAssem@5e09.onCreateView$navBar$1$1");
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
            C0DOO c0doo = C0DOO.LIZ;
            C1245860iWe enterFrom = this.LLILLJJLI.hp().getEnterFrom();
            C0DOF c0dof = C0DOF.CLICK_BACK;
            c0doo.getClass();
            C0DOO.LJFF(enterFrom, c0dof);
            CampusFlowViewModel campusFlowViewModelHp = this.LLILLJJLI.hp();
            this.LL = 1;
            if (campusFlowViewModelHp.DQ2(this) == objLJFF) {
                C1C7U.LIZIZ("EditCampusPageAssem@5e09.onCreateView$navBar$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditCampusPageAssem@5e09.onCreateView$navBar$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
