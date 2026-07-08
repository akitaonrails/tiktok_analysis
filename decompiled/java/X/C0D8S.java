package X;

import com.bytedance.ies.foundation.activity.BaseActivity;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D8S, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.SignupViewModel$setupLoginItems$1$1", f = "SignupViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0D8S extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SignupViewModel LL;
    public final /* synthetic */ BaseActivity LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D8S(SignupViewModel signupViewModel, BaseActivity baseActivity, InterfaceC1364105Vn<? super C0D8S> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = signupViewModel;
        this.LLILLJJLI = baseActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D8S(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SignupViewModel@1683.setupLoginItems$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SignupViewModel signupViewModel = this.LL;
        signupViewModel.LLILZLL = signupViewModel.vQ2(this.LLILLJJLI);
        SignupViewModel signupViewModel2 = this.LL;
        signupViewModel2.LLIZ = signupViewModel2.wQ2(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SignupViewModel@1683.setupLoginItems$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
