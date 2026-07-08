package X;

import com.ss.android.ugc.aweme.account.security.SecurityCheckUpInfoApiResponse;
import com.ss.android.ugc.aweme.account.security.SecurityCheckUpViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS385S0200000_19;
import njp.a;

/* JADX INFO: renamed from: X.0iFp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.security.SecurityCheckUpViewModel$getSecurityCheckUpData$2$3", f = "SecurityCheckUpViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1235430iFp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SecurityCheckUpViewModel LL;
    public final /* synthetic */ List<C0TN4> LLILLJJLI;
    public final /* synthetic */ SecurityCheckUpInfoApiResponse LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1235430iFp(SecurityCheckUpViewModel securityCheckUpViewModel, List<C0TN4> list, SecurityCheckUpInfoApiResponse securityCheckUpInfoApiResponse, InterfaceC1364105Vn<? super C1235430iFp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = securityCheckUpViewModel;
        this.LLILLJJLI = list;
        this.LLILLL = securityCheckUpInfoApiResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1235430iFp(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SecurityCheckUpViewModel@3dc2.getSecurityCheckUpData$2$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(new AwS385S0200000_19((List) this.LLILLJJLI, (List<C0TN4>) this.LLILLL, (SecurityCheckUpInfoApiResponse) 95));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SecurityCheckUpViewModel@3dc2.getSecurityCheckUpData$2$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
