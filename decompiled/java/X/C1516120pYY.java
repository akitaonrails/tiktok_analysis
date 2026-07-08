package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pYY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516120pYY extends C09AY implements Function0<String> {
    public final /* synthetic */ C1515820pY4<byte[]> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1516040pYQ<Object> LLILZ;
    public final /* synthetic */ C1516130pYZ<Object> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1516120pYY(C1515820pY4<byte[]> c1515820pY4, int i, String str, C1516040pYQ<Object> c1516040pYQ, C1516130pYZ<Object> c1516130pYZ) {
        super(0);
        this.LL = c1515820pY4;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = c1516040pYQ;
        this.LLILZIL = c1516130pYZ;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" [chunk_trace_route] stage=deliver requestId=");
        sbLIZ.append(this.LL.LLILLL);
        sbLIZ.append(" seq=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" reason=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" match=");
        C1516040pYQ<Object> c1516040pYQ = this.LLILZ;
        C1516060pYS c1516060pYS = this.LLILZIL.LIZLLL;
        c1516040pYQ.getClass();
        sbLIZ.append(C1516040pYQ.LIZIZ(c1516060pYS));
        sbLIZ.append(" deferState=");
        C1516040pYQ<Object> c1516040pYQ2 = this.LLILZ;
        EnumC1516190pYf enumC1516190pYf = this.LLILZIL.LJFF;
        c1516040pYQ2.getClass();
        sbLIZ.append(enumC1516190pYf.name());
        sbLIZ.append(" parsedAt=");
        sbLIZ.append(this.LLILZIL.LIZJ);
        sbLIZ.append(" thread=");
        sbLIZ.append(C786410Ut5.u3().getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
