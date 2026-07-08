package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zpF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1910870zpF extends C09AY implements Function0<String> {
    public final /* synthetic */ C1910890zpH LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1910870zpF(C1910890zpH c1910890zpH) {
        super(0);
        this.LL = c1910890zpH;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UR_");
        sbLIZ.append(this.LL.LIZ.getValue());
        sbLIZ.append('|');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
