package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gMU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1162680gMU extends C09AY implements Function0<String> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ float LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1162680gMU(float f, float f2, float f3) {
        super(0);
        this.LL = f;
        this.LLILLJJLI = f2;
        this.LLILLL = f3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getMynaDisplayMetricsBaseOnWidth baseOnWidthDp(");
        sbLIZ.append(this.LL);
        sbLIZ.append(") viewScale(");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(") fontScale(");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
