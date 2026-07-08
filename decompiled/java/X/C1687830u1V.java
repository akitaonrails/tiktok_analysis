package X;

import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: renamed from: X.0u1V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1687830u1V extends C09AY implements Function1<C0MAE, Unit> {
    public final /* synthetic */ InterfaceC1665500tRU<C1687890u1b> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ SignupViewModel LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C05P0<C1668650tWZ> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1687830u1V(InterfaceC1665500tRU<? extends C1687890u1b> interfaceC1665500tRU, boolean z, SignupViewModel signupViewModel, boolean z2, boolean z3, C05P0<C1668650tWZ> c05p0) {
        super(1);
        this.LL = interfaceC1665500tRU;
        this.LLILLJJLI = z;
        this.LLILLL = signupViewModel;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = c05p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0MAE c0mae) {
        InterfaceC1665500tRU<C1687890u1b> interfaceC1665500tRU = this.LL;
        boolean z = this.LLILLJJLI;
        SignupViewModel signupViewModel = this.LLILLL;
        boolean z2 = this.LLILZ;
        boolean z3 = this.LLILZIL;
        C05P0<C1668650tWZ> c05p0 = this.LLILZLL;
        c0mae.LIZJ(interfaceC1665500tRU.size(), null, new C020W(AFwS266S0000000_25.get$arr$(614), interfaceC1665500tRU, 104), new C19719212De(-632812321, new C1687880u1a(interfaceC1665500tRU, z, signupViewModel, z2, z3, c05p0), true));
        return Unit.LIZ;
    }
}
