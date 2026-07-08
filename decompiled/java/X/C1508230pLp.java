package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pLp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508230pLp extends C09AY implements Function0<String> {
    public final /* synthetic */ C1508220pLo LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1508230pLp(C1508220pLo c1508220pLo, boolean z, String str) {
        super(0);
        this.LL = c1508220pLo;
        this.LLILLJJLI = z;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive new runnable, config enable: ");
        sbLIZ.append(((Boolean) this.LL.LJFF.getValue()).booleanValue());
        sbLIZ.append(", tag enable: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", active: ");
        sbLIZ.append(this.LL.LJ);
        sbLIZ.append(", loadFinish: ");
        sbLIZ.append(this.LL.LIZJ);
        sbLIZ.append(", retreatState: ");
        sbLIZ.append(this.LL.LIZIZ);
        sbLIZ.append(", tag: ");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
