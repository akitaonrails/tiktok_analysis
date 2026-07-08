package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0DgJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345330DgJ extends C09AY implements Function0<String> {
    public final /* synthetic */ C345340DgK LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C345330DgJ(C345340DgK c345340DgK, long j) {
        super(0);
        this.LL = c345340DgK;
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.LL.getName());
        sbLIZ.append(" done, cost=");
        sbLIZ.append(System.currentTimeMillis() - this.LLILLJJLI);
        sbLIZ.append("ms");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
