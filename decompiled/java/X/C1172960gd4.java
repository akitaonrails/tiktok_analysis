package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gd4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1172960gd4 extends C09AY implements Function0<String> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1172960gd4(long j, long j2) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("end parse, parse time = ");
        sbLIZ.append(this.LL - this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
