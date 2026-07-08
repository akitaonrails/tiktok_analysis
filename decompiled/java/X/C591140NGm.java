package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NGm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C591140NGm extends C09AY implements Function0<String> {
    public final /* synthetic */ C591100NGi LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C591140NGm(C591100NGi c591100NGi) {
        super(0);
        this.LL = c591100NGi;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loader: All cache loaded, remain count: ");
        sbLIZ.append(this.LL.LIZLLL);
        sbLIZ.append(", check ");
        sbLIZ.append(this.LL.LJFF);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
