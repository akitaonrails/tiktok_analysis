package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yjO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868800yjO extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1868800yjO(int i, String str, long j, String str2) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = j;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[S1] schedule reason=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" signalType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" deltaMs=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" windowSec=");
        sbLIZ.append(this.LLILZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
