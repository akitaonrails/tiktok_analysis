package X;

import com.ss.android.ugc.profile.business.ur.school.verifyschool.CorrectSchoolPageAssem;
import com.ss.android.ugc.profile.business.ur.school.verifyschool.VerifySchoolViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08pM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.verifyschool.CorrectSchoolPageAssem$onViewCreated$9$1$1$1$1$1", f = "CorrectSchoolPageAssem.kt", l = {331}, m = "invokeSuspend")
public final class C2235408pM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CorrectSchoolPageAssem LLILLJJLI;
    public final /* synthetic */ C331430Cyz LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2235408pM(CorrectSchoolPageAssem correctSchoolPageAssem, C331430Cyz c331430Cyz, InterfaceC1364105Vn<? super C2235408pM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = correctSchoolPageAssem;
        this.LLILLL = c331430Cyz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2235408pM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CorrectSchoolPageAssem@7e87.onViewCreated$9$1$1$1$1$1");
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
            VerifySchoolViewModel verifySchoolViewModelIp = this.LLILLJJLI.ip();
            C331430Cyz c331430Cyz = this.LLILLL;
            this.LL = 1;
            if (verifySchoolViewModelIp.vQ2(c331430Cyz, this) == objLJFF) {
                C1C7U.LIZIZ("CorrectSchoolPageAssem@7e87.onViewCreated$9$1$1$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CorrectSchoolPageAssem@7e87.onViewCreated$9$1$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
