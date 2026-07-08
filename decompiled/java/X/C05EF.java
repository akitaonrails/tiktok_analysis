package X;

import com.ss.android.ugc.aweme.journey.step.slogan.QuickLoginViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05EF, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.journey.step.slogan.QuickLoginViewModel$startUnstuckTimer$1$1", f = "QuickLoginViewModel.kt", l = {}, m = "invokeSuspend")
public final class C05EF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ QuickLoginViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05EF(QuickLoginViewModel quickLoginViewModel, InterfaceC1364105Vn<? super C05EF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = quickLoginViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05EF(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QuickLoginViewModel@ec5a.startUnstuckTimer$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        QuickLoginViewModel quickLoginViewModel = this.LL;
        if (!quickLoginViewModel.LLILZIL && quickLoginViewModel.LLILZ) {
            quickLoginViewModel.LLILZ = false;
            Function0<Unit> function0 = quickLoginViewModel.LLILZLL;
            if (function0 != null) {
                function0.invoke();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("QuickLoginViewModel@ec5a.startUnstuckTimer$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
