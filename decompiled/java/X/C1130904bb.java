package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04bb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1130904bb extends C09AY implements Function0<String> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1130904bb(long j, String str, boolean z) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert launch failed, id = ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sessionId = ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isForeground = ");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
