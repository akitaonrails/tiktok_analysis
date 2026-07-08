package X;

import com.ss.android.ugc.profile.business.ur.school.verifyschool.EnterPinPageAssem;
import com.ss.android.ugc.profile.business.ur.school.verifyschool.VerifySchoolViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DNx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.verifyschool.EnterPinPageAssem$onViewCreated$8$2$2$1$1", f = "EnterPinPageAssem.kt", l = {319}, m = "invokeSuspend")
public final class C338270DNx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EnterPinPageAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C338270DNx(EnterPinPageAssem enterPinPageAssem, InterfaceC1364105Vn<? super C338270DNx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enterPinPageAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C338270DNx(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EnterPinPageAssem@83fb.onViewCreated$8$2$2$1$1");
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
            VerifySchoolViewModel verifySchoolViewModelLp = this.LLILLJJLI.lp();
            EnterPinPageAssem enterPinPageAssem = this.LLILLJJLI;
            String str = enterPinPageAssem.LLLII;
            if (str == null) {
                str = enterPinPageAssem.LLLI;
            }
            this.LL = 1;
            if (verifySchoolViewModelLp.yQ2(str, this) == objLJFF) {
                C1C7U.LIZIZ("EnterPinPageAssem@83fb.onViewCreated$8$2$2$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EnterPinPageAssem@83fb.onViewCreated$8$2$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
