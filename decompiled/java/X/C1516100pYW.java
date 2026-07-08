package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pYW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516100pYW extends C09AY implements Function0<String> {
    public final /* synthetic */ C1515820pY4<byte[]> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C1516060pYS LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1516100pYW(C1515820pY4<byte[]> c1515820pY4, int i, C1516060pYS c1516060pYS, boolean z) {
        super(0);
        this.LL = c1515820pY4;
        this.LLILLJJLI = i;
        this.LLILLL = c1516060pYS;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" [chunk_trace_route] stage=prefer_delivered requestId=");
        sbLIZ.append(this.LL.LLILLL);
        sbLIZ.append(" seq=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" ruleKey=");
        sbLIZ.append(this.LLILLL.LIZJ);
        sbLIZ.append(" firstDeliver=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(" thread=");
        sbLIZ.append(C786410Ut5.u3().getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
