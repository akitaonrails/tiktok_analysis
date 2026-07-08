package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pYX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516110pYX extends C09AY implements Function0<String> {
    public final /* synthetic */ C1515820pY4<byte[]> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C1516040pYQ<Object> LLILZ;
    public final /* synthetic */ C1516060pYS LLILZIL;
    public final /* synthetic */ EnumC1516190pYf LLILZLL;
    public final /* synthetic */ long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1516110pYX(C1515820pY4<byte[]> c1515820pY4, int i, long j, C1516040pYQ<Object> c1516040pYQ, C1516060pYS c1516060pYS, EnumC1516190pYf enumC1516190pYf, long j2) {
        super(0);
        this.LL = c1515820pY4;
        this.LLILLJJLI = i;
        this.LLILLL = j;
        this.LLILZ = c1516040pYQ;
        this.LLILZIL = c1516060pYS;
        this.LLILZLL = enumC1516190pYf;
        this.LLIZ = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" [chunk_trace_route] stage=parse_done requestId=");
        sbLIZ.append(this.LL.LLILLL);
        sbLIZ.append(" seq=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" parsedAt=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" match=");
        C1516040pYQ<Object> c1516040pYQ = this.LLILZ;
        C1516060pYS c1516060pYS = this.LLILZIL;
        c1516040pYQ.getClass();
        sbLIZ.append(C1516040pYQ.LIZIZ(c1516060pYS));
        sbLIZ.append(" deferState=");
        C1516040pYQ<Object> c1516040pYQ2 = this.LLILZ;
        EnumC1516190pYf enumC1516190pYf = this.LLILZLL;
        c1516040pYQ2.getClass();
        sbLIZ.append(enumC1516190pYf.name());
        sbLIZ.append(" timeoutAt=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(" thread=");
        sbLIZ.append(C786410Ut5.u3().getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
