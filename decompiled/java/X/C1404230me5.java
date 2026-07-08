package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0me5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404230me5 extends C09AY implements Function0<String> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1404230me5(long j, String str, String str2, long j2) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert page failed, id = ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sessionId = ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", pageName = ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", duration = ");
        sbLIZ.append(this.LLILZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
