package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01Sx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C338101Sx extends C09AY implements Function0<InterfaceC497601wk> {
    public final /* synthetic */ C1537910q7h LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C338101Sx(C1537910q7h c1537910q7h) {
        super(0);
        this.LL = c1537910q7h;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC497601wk invoke() {
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        CoroutineContext coroutineContextLIZLLL = C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII());
        this.LL.LJIIJJI = coroutineContextLIZLLL;
        return C2296808zG.LIZ(coroutineContextLIZLLL);
    }
}
