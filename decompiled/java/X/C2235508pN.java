package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel;
import com.ss.android.ugc.profile.business.ur.school.verifyschool.CorrectSchoolPageAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08pN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.verifyschool.CorrectSchoolPageAssem$onCreateView$navBar$1$1", f = "CorrectSchoolPageAssem.kt", l = {111}, m = "invokeSuspend")
public final class C2235508pN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CorrectSchoolPageAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2235508pN(CorrectSchoolPageAssem correctSchoolPageAssem, InterfaceC1364105Vn<? super C2235508pN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = correctSchoolPageAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2235508pN(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CorrectSchoolPageAssem@7e87.onCreateView$navBar$1$1");
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
            EnumC2235608pO enumC2235608pO = EnumC2235608pO.CLICK_BACK;
            int iHp = this.LLILLJJLI.hp();
            c0doo.getClass();
            C0DOO.LJIILIIL(enumC2235608pO, iHp);
            AssemVMLazy assemVMLazy = this.LLILLJJLI.LLJJIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CorrectSchoolPageAssem.LLLIILIL;
            CampusFlowViewModel campusFlowViewModel = (CampusFlowViewModel) assemVMLazy.getValue();
            this.LL = 1;
            if (campusFlowViewModel.DQ2(this) == objLJFF) {
                C1C7U.LIZIZ("CorrectSchoolPageAssem@7e87.onCreateView$navBar$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CorrectSchoolPageAssem@7e87.onCreateView$navBar$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
