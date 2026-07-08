package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Nqc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C606520Nqc extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL = 0;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C606500Nqa LLILLL;
    public final /* synthetic */ C606540Nqe LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C606520Nqc(int i, C606500Nqa c606500Nqa, C606540Nqe c606540Nqe) {
        super(0);
        this.LLILLJJLI = i;
        this.LLILLL = c606500Nqa;
        this.LLILZ = c606540Nqe;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("delete at ");
        sbLIZ.append(this.LL);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" by ");
        sbLIZ.append(this.LLILLL.LIZ);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LLILZ.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
