package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yjP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868810yjP extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1868810yjP(String str, long j, int i) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[S2] schedule reason=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" deltaMs=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" windowSec=");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
