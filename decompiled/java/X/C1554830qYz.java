package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qYz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1554830qYz extends C09AY implements Function0<String> {
    public final /* synthetic */ C1554890qZ5 LL;
    public final /* synthetic */ C1554820qYy<T> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1554830qYz(C1554820qYy c1554820qYy, C1554890qZ5 c1554890qZ5) {
        super(0);
        this.LL = c1554890qZ5;
        this.LLILLJJLI = c1554820qYy;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(", already existed in tree find provider key: ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
