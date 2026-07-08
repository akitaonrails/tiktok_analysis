package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pYV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516090pYV extends C09AY implements Function0<String> {
    public final /* synthetic */ C1515820pY4<byte[]> LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1516090pYV(C1515820pY4<byte[]> c1515820pY4, long j, long j2, long j3) {
        super(0);
        this.LL = c1515820pY4;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = j3;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" [chunk_trace_route] stage=timeout_tick requestId=");
        sbLIZ.append(this.LL.LLILLL);
        sbLIZ.append(" token=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" expectedTimeoutAt=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" now=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(" thread=");
        sbLIZ.append(C786410Ut5.u3().getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
