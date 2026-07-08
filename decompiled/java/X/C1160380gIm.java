package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gIm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160380gIm extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1160380gIm(int i, int i2, int i3) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RavenListAdapterDataObserver.syncFooterHandlerCoverage added/updated footerHandler count=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" bodyTotal=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" adapterCount=");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
