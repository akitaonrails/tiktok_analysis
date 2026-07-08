package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS9S0020000_29;

/* JADX INFO: renamed from: X.0svE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1645500svE extends C09AY implements Function1<C12IL, Unit> {
    public final /* synthetic */ Function1<C12IL, Unit> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Function0<String> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1645500svE(Function1<? super C12IL, Unit> function1, boolean z, Function0<String> function0, boolean z2, boolean z3, boolean z4) {
        super(1);
        this.LL = function1;
        this.LLILLJJLI = z;
        this.LLILLL = function0;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = z4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C12IL c12il) {
        Function1 function1 = this.LL;
        if (function1 == null) {
            final boolean z = this.LLILLJJLI;
            Function0<String> function0 = this.LLILLL;
            final boolean z2 = this.LLILZ;
            final boolean z3 = this.LLILZIL;
            final boolean z4 = this.LLILZLL;
            final String strInvoke = function0.invoke();
            function1 = new C12IK(z, strInvoke, z2, z3, z4) { // from class: X.12IM
                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(C12IL c12il2) {
                    C12IL c12il3 = c12il2;
                    super.LIZ(c12il3);
                    boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "default_beauty_off", true, false);
                    boolean zIsLogin = C0CHQ.LIZ().getAccountService().isLogin();
                    if (zLJIIIZ && zIsLogin) {
                        c12il3.LJIJ = new C19731612Hy(C0CHQ.LIZ().getAccountService().getCurrentUserID());
                    }
                    C1651050t4B.LIZ = false;
                    c12il3.LJIL = new AwS9S0020000_29(zLJIIIZ, zIsLogin, 3);
                    return Unit.LIZ;
                }
            };
        }
        function1.invoke(c12il);
        return Unit.LIZ;
    }
}
