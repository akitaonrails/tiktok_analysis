package X;

import android.view.inputmethod.InputMethodManager;
import com.ss.android.ugc.profile.business.ur.school.verifyschool.EnterEmailPageAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DHe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.verifyschool.EnterEmailPageAssem$onPageResume$1", f = "EnterEmailPageAssem.kt", l = {411}, m = "invokeSuspend")
public final class C336520DHe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EnterEmailPageAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C336520DHe(EnterEmailPageAssem enterEmailPageAssem, InterfaceC1364105Vn<? super C336520DHe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enterEmailPageAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C336520DHe(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InputMethodManager inputMethodManager;
        C1C7U.LIZ("EnterEmailPageAssem@8a50.onPageResume$1");
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
                C1C7U.LIZIZ("EnterEmailPageAssem@8a50.onPageResume$1");
                return objLJFF;
            }
        }
        C1748440vbG c1748440vbG = this.LLILLJJLI.LLJJJJJIL;
        if (c1748440vbG != null && c1748440vbG.getVisibility() == 0) {
            C1748440vbG c1748440vbG2 = this.LLILLJJLI.LLJJJJJIL;
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
            C1C7U.LIZIZ("EnterEmailPageAssem@8a50.onPageResume$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EnterEmailPageAssem@8a50.onPageResume$1");
        return unit2;
    }
}
