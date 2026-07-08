package X;

import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AdD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183691AdD extends C09AY implements Function1<C2183701AdE, Unit> {
    public final /* synthetic */ double LL;
    public final /* synthetic */ C2183681AdC LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2183691AdD(double d, C2183681AdC c2183681AdC) {
        super(1);
        this.LL = d;
        this.LLILLJJLI = c2183681AdC;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C2183701AdE c2183701AdE) {
        C2183701AdE c2183701AdE2;
        C2183701AdE c2183701AdE3 = c2183701AdE;
        c2183701AdE3.LIZIZ = this.LL;
        int i = c2183701AdE3.LIZ + 1;
        c2183701AdE3.LIZ = i;
        if (i == 2 && (c2183701AdE2 = (C2183701AdE) ((LinkedList) this.LLILLJJLI.LLIZLLLIL).poll()) != null) {
            C2183681AdC c2183681AdC = this.LLILLJJLI;
            C23250099c.LIZLLL(c2183681AdC.LLILZ, null, null, new C2183711AdF(c2183701AdE2, c2183681AdC, null), 3);
        }
        return Unit.LIZ;
    }
}
