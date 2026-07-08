package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gC6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156240gC6 extends C09AY implements Function0<String> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int[] LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1156240gC6(long j, int i, int i2, int[] iArr) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = iArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[ActiveHourStats] record epochDay=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" hour=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" slot=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" count=");
        sbLIZ.append(this.LLILZ[this.LLILLJJLI]);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
