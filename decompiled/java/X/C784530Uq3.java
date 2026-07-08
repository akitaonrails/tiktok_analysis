package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Uq3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C784530Uq3 extends C09AY implements Function0<String> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C784530Uq3(boolean z, long j, long j2) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("need report: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", timestamp: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", reportedTimestamp: ");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
