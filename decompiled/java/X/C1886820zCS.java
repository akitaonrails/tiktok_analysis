package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zCS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1886820zCS extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1886820zCS(int i, long j, long j2) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Reconcile] still pending strategy=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" elapsed=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append("ms timeout=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append("ms");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
