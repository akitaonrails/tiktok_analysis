package X;

import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D8P, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.SignupViewModel$setupLoginItems$2$1$1$1", f = "SignupViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0D8P extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SignupViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D8P(SignupViewModel signupViewModel, InterfaceC1364105Vn<? super C0D8P> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = signupViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D8P(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SignupViewModel@1683.setupLoginItems$2$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SignupViewModel signupViewModel = this.LL;
        signupViewModel.LLIZLLLIL.setValue((List<C1687890u1b>) signupViewModel.LLILZLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SignupViewModel@1683.setupLoginItems$2$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
