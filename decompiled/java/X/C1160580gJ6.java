package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gJ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160580gJ6 extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1160580gJ6(int i, boolean z) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RavenDataProcessListenerManager.onComponentsResponse bodyComponentsSize=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" isSuccess=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" ts=");
        sbLIZ.append(System.currentTimeMillis());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
