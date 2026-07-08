package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.160J, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C160J extends C09AY implements Function1<C160B, Unit> {
    public final /* synthetic */ C160A LL;
    public final /* synthetic */ Function1<C160B, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C160J(C160A c160a, C160I c160i) {
        super(1);
        this.LL = c160a;
        this.LLILLJJLI = c160i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C160B c160b) {
        if (c160b == C160B.EXPANDED) {
            this.LL.LIZ(null, false);
        }
        this.LLILLJJLI.invoke(c160b);
        return Unit.LIZ;
    }
}
