package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qZ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1554840qZ0 extends C09AY implements Function0<String> {
    public final /* synthetic */ C1554890qZ5 LL;
    public final /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1554820qYy<T> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1554840qZ0(C1554890qZ5 c1554890qZ5, Object obj, C1554820qYy<T> c1554820qYy) {
        super(0);
        this.LL = c1554890qZ5;
        this.LLILLJJLI = obj;
        this.LLILLL = c1554820qYy;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(", intercepted due to ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" is a root container: ");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
