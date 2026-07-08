package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rrT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1604730rrT extends C09AY implements Function0<String> {
    public final /* synthetic */ C1601460rmC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1604730rrT(C1601460rmC c1601460rmC) {
        super(0);
        this.LL = c1601460rmC;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pull_type=");
        sbLIZ.append(this.LL.LIZIZ);
        sbLIZ.append(",aweme_id=");
        sbLIZ.append(this.LL.LIZLLL);
        sbLIZ.append(',');
        sbLIZ.append(this.LL.LJIIIIZZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
