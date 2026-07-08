package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DDH, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DDH extends C09AY implements Function0<String> {
    public final /* synthetic */ InterfaceC20673915v7<C1DDI> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1DDH(C20673615v4 c20673615v4) {
        super(0);
        this.LL = c20673615v4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("normal: ");
        sbLIZ.append(this.LL.context().LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
