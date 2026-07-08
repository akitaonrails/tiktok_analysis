package X;

import com.ss.android.ugc.profile.business.ur.school.verifyschool.EnterEmailPageAssem;
import com.ss.android.ugc.profile.business.ur.school.verifyschool.VerifySchoolViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CyE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.verifyschool.EnterEmailPageAssem$onViewCreated$5$1$1", f = "EnterEmailPageAssem.kt", l = {334}, m = "invokeSuspend")
public final class C330960CyE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EnterEmailPageAssem LLILLJJLI;
    public final /* synthetic */ C0DHZ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330960CyE(EnterEmailPageAssem enterEmailPageAssem, C0DHZ c0dhz, InterfaceC1364105Vn<? super C330960CyE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enterEmailPageAssem;
        this.LLILLL = c0dhz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C330960CyE(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EnterEmailPageAssem@8a50.onViewCreated$5$1$1");
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
            VerifySchoolViewModel verifySchoolViewModelKp = this.LLILLJJLI.kp();
            String str = this.LLILLL.LIZIZ;
            this.LL = 1;
            if (verifySchoolViewModelKp.AQ2(str, this) == objLJFF) {
                C1C7U.LIZIZ("EnterEmailPageAssem@8a50.onViewCreated$5$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EnterEmailPageAssem@8a50.onViewCreated$5$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
