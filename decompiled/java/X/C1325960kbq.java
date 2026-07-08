package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kbq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1325960kbq extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1325960kbq(int i) {
        super(0);
        this.LL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("download interval time: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" seconds");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
