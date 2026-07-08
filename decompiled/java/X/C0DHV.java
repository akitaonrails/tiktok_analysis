package X;

import android.view.inputmethod.InputMethodManager;
import com.ss.android.ugc.profile.business.ur.school.addschool.SelectSchoolPageAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DHV, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.addschool.SelectSchoolPageAssem$onPageResume$1", f = "SelectSchoolPageAssem.kt", l = {343}, m = "invokeSuspend")
public final class C0DHV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SelectSchoolPageAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DHV(SelectSchoolPageAssem selectSchoolPageAssem, InterfaceC1364105Vn<? super C0DHV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = selectSchoolPageAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DHV(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InputMethodManager inputMethodManager;
        C1C7U.LIZ("SelectSchoolPageAssem@2721.onPageResume$1");
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
                C1C7U.LIZIZ("SelectSchoolPageAssem@2721.onPageResume$1");
                return objLJFF;
            }
        }
        C1748440vbG c1748440vbG = this.LLILLJJLI.LLJJJIL;
        if (c1748440vbG != null && c1748440vbG.getVisibility() == 0) {
            C1748440vbG c1748440vbG2 = this.LLILLJJLI.LLJJJIL;
            if (c1748440vbG2 != null) {
                c1748440vbG2.LJIIIZ();
                Object objH2 = C786410Ut5.H2(c1748440vbG2.getContext(), "input_method");
                if (objH2 instanceof InputMethodManager) {
                    inputMethodManager = (InputMethodManager) objH2;
                } else {
                    inputMethodManager = null;
                }
                c1748440vbG2.LJIIJ(inputMethodManager, 1);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SelectSchoolPageAssem@2721.onPageResume$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SelectSchoolPageAssem@2721.onPageResume$1");
        return unit2;
    }
}
