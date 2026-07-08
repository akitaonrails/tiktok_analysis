package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qZB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1554950qZB extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1554950qZB(String str, String str2, boolean z) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("session changed from ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" -> ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isForegroundSession: ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" ...");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
