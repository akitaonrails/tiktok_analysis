package X;

import com.ss.android.ugc.profile.business.ur.school.verifyschool.EnterPinPageAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DNy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.verifyschool.EnterPinPageAssem$onPageResume$1", f = "EnterPinPageAssem.kt", l = {359}, m = "invokeSuspend")
public final class C338280DNy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EnterPinPageAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C338280DNy(EnterPinPageAssem enterPinPageAssem, InterfaceC1364105Vn<? super C338280DNy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enterPinPageAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C338280DNy(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EnterPinPageAssem@83fb.onPageResume$1");
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
            if (AnonymousClass0958.LIZIZ(300L, this) == objLJFF) {
                C1C7U.LIZIZ("EnterPinPageAssem@83fb.onPageResume$1");
                return objLJFF;
            }
        }
        C1754640vlG c1754640vlG = this.LLILLJJLI.LLJJJJ;
        if (c1754640vlG != null && c1754640vlG.getVisibility() == 0) {
            C1754640vlG c1754640vlG2 = this.LLILLJJLI.LLJJJJ;
            if (c1754640vlG2 != null) {
                c1754640vlG2.setIsFocused(true);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EnterPinPageAssem@83fb.onPageResume$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EnterPinPageAssem@83fb.onPageResume$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
