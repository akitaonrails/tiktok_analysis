package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rgd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C702250Rgd extends C09AY implements Function0<String> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C700170RdH LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C702250Rgd(long j, C700170RdH c700170RdH, String str, long j2) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = c700170RdH;
        this.LLILLL = str;
        this.LLILZ = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" --- ");
        C700170RdH c700170RdH = this.LLILLJJLI;
        sbLIZ.append(c700170RdH != null ? c700170RdH.LIZLLL : null);
        sbLIZ.append(" --- reduce ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" end, duration: ");
        sbLIZ.append(this.LL - this.LLILZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
