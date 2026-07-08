package X;

import Y.AgS308S0100000_28;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.LoginSignupTabFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TiA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.ui.login.LoginSignupTabFragment$onViewCreated$3$1", f = "LoginSignupTabFragment.kt", l = {155}, m = "invokeSuspend")
public final class C754160TiA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LoginSignupTabFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C754160TiA(LoginSignupTabFragment loginSignupTabFragment, InterfaceC1364105Vn<? super C754160TiA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = loginSignupTabFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C754160TiA(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LoginSignupTabFragment@2c72.onViewCreated$3$1");
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
            InterfaceC346201Wa<C0D5P> interfaceC346201Wa = this.LLILLJJLI.MR().LLILZIL;
            AgS308S0100000_28 agS308S0100000_28 = new AgS308S0100000_28(this.LLILLJJLI, 1);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS308S0100000_28, this) == objLJFF) {
                C1C7U.LIZIZ("LoginSignupTabFragment@2c72.onViewCreated$3$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LoginSignupTabFragment@2c72.onViewCreated$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
