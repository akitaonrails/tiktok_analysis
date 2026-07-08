package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0k7v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1307410k7v extends C09AY implements Function0<String> {
    public final /* synthetic */ C1307480k82 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307410k7v(C1307480k82 c1307480k82) {
        super(0);
        this.LL = c1307480k82;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Edge ");
        sbLIZ.append(this.LL.LIZIZ);
        sbLIZ.append(" -> ");
        sbLIZ.append(this.LL.LIZJ);
        sbLIZ.append(" connected");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
