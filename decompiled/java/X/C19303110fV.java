package X;

import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10fV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.SignupViewModel$createLoginItems$thirdPartyLoginList$1$1", f = "SignupViewModel.kt", l = {699}, m = "invokeSuspend")
public final class C19303110fV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SignupViewModel LLILLJJLI;
    public final /* synthetic */ C1239090iLj LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19303110fV(SignupViewModel signupViewModel, C1239090iLj c1239090iLj, InterfaceC1364105Vn<? super C19303110fV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = signupViewModel;
        this.LLILLL = c1239090iLj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19303110fV(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SignupViewModel@1683.createLoginItems$thirdPartyLoginList$1$1");
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
            C1DEK c1dek = this.LLILLJJLI.LLILZ;
            C1868530yix c1868530yix = new C1868530yix(false, LIZ(), "click_login", C19252910Tv.LIZIZ.LIZLLL().LJIJ().LIZ(), this.LLILLJJLI.zQ2());
            this.LL = 1;
            if (c1dek.LJIJI(c1868530yix, this) == objLJFF) {
                C1C7U.LIZIZ("SignupViewModel@1683.createLoginItems$thirdPartyLoginList$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SignupViewModel@1683.createLoginItems$thirdPartyLoginList$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
