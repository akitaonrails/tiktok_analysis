package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qdS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557600qdS extends C09AY implements Function0<Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1557600qdS(boolean z, boolean z2) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MallMainActivityAssem - checkMallTabState: isLastStartMallEntranceShown:");
        sbLIZ.append(this.LL);
        sbLIZ.append(", shouldShowMall2TabOrTopTab:");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
