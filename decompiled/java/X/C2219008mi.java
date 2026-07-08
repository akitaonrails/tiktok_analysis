package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08mi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2219008mi extends C09AY implements Function0<String> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2219008mi(boolean z, boolean z2, boolean z3) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gateFlow: enabled=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" started=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" -> allowed=");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
