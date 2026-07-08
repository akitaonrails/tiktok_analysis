package X;

import com.bytedance.ies.foundation.activity.BaseActivity;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D8R, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.SignupViewModel$setupLoginItems$1", f = "SignupViewModel.kt", l = {190}, m = "invokeSuspend")
public final class C0D8R extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SignupViewModel LLILLJJLI;
    public final /* synthetic */ BaseActivity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D8R(SignupViewModel signupViewModel, BaseActivity baseActivity, InterfaceC1364105Vn<? super C0D8R> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = signupViewModel;
        this.LLILLL = baseActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D8R(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SignupViewModel@1683.setupLoginItems$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C0D8S c0d8s = new C0D8S(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c0d8s) == objLJFF) {
                C1C7U.LIZIZ("SignupViewModel@1683.setupLoginItems$1");
                return objLJFF;
            }
        }
        SignupViewModel signupViewModel = this.LLILLJJLI;
        signupViewModel.LLIZLLLIL.setValue((List<C1687890u1b>) signupViewModel.LLILZLL);
        SignupViewModel signupViewModel2 = this.LLILLJJLI;
        signupViewModel2.LLJI.setValue((List<C1687890u1b>) signupViewModel2.LLIZ);
        this.LLILLJJLI.LLJILJIL.setValue(true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SignupViewModel@1683.setupLoginItems$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
