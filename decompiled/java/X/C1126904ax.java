package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04ax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1126904ax extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1126904ax(int i, long j, long j2, boolean z) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Portrait] isInactiveOverNMinutes(");
        sbLIZ.append(this.LL);
        sbLIZ.append(") diff=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append("ms threshold=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append("ms => ");
        sbLIZ.append(this.LLILZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
