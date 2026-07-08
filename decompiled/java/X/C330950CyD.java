package X;

import com.ss.android.ugc.profile.business.ur.school.verifyschool.EnterEmailPageAssem;
import com.ss.android.ugc.profile.business.ur.school.verifyschool.VerifySchoolViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CyD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.verifyschool.EnterEmailPageAssem$onViewCreated$2$1", f = "EnterEmailPageAssem.kt", l = {314}, m = "invokeSuspend")
public final class C330950CyD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EnterEmailPageAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330950CyD(EnterEmailPageAssem enterEmailPageAssem, InterfaceC1364105Vn<? super C330950CyD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enterEmailPageAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C330950CyD(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EnterEmailPageAssem@8a50.onViewCreated$2$1");
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
            this.LL = 1;
            if (verifySchoolViewModelKp.AQ2("", this) == objLJFF) {
                C1C7U.LIZIZ("EnterEmailPageAssem@8a50.onViewCreated$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EnterEmailPageAssem@8a50.onViewCreated$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
