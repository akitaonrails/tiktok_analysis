package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ruf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710950Ruf extends C09AY implements Function1<C0RF0, C0SZ8> {
    public final /* synthetic */ Function1<C0RF0, C0RDR> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C710950Ruf(Function1<? super C0RF0, ? extends C0RDR> function1) {
        super(1);
        this.LL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0SZ8 invoke(C0RF0 c0rf0) {
        C0RF0 c0rf02 = c0rf0;
        C0RDR c0rdrInvoke = this.LL.invoke(c0rf02);
        C711750Rvx.LIZ(c0rdrInvoke, c0rf02.LJII, c0rf02.LJIIIIZZ);
        return c0rdrInvoke;
    }
}
