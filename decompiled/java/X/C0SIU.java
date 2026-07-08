package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SIU, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SIU extends C09AY implements Function1<C0SJL<C719000SIg>, C0SJL<C719000SIg>> {
    public final /* synthetic */ StringBuilder LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SIU(StringBuilder sb) {
        super(1);
        this.LL = sb;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0SJL<C719000SIg> invoke(C0SJL<C719000SIg> c0sjl) {
        C0SJL<C719000SIg> c0sjl2 = c0sjl;
        this.LL.append(c0sjl2.LIZ());
        return c0sjl2;
    }
}
