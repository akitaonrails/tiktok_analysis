package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.006I, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C006I extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C006I(String str, int i, int i2, long j) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[ActiveHourStats] computed result=[");
        sbLIZ.append(this.LL);
        sbLIZ.append("] minDays=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" topN=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" today=");
        sbLIZ.append(this.LLILZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
