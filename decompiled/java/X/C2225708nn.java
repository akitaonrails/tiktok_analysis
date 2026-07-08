package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08nn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2225708nn extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C0NHJ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2225708nn(int i, C0NHJ c0nhj) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = c0nhj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("abort fetch unexpiredCount > supplyTiming:");
        sbLIZ.append(this.LL);
        sbLIZ.append(", reason: ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
