package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qYl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1554690qYl extends C09AY implements Function0<String> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ C1554890qZ5 LLILLJJLI;
    public final /* synthetic */ C1555410qZv LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1554690qYl(C19EG c19eg, C1554890qZ5 c1554890qZ5, C1555410qZv c1555410qZv) {
        super(0);
        this.LL = c19eg;
        this.LLILLJJLI = c1554890qZ5;
        this.LLILLL = c1555410qZv;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create tree for ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", tree: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", this: ");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
