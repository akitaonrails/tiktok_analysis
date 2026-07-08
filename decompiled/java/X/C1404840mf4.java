package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mf4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404840mf4 extends C09AY implements Function0<String> {
    public final /* synthetic */ C1404830mf3 LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ float LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1404840mf4(C1404830mf3 c1404830mf3, int i, float f) {
        super(0);
        this.LL = c1404830mf3;
        this.LLILLJJLI = i;
        this.LLILLL = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("source video duration: ");
        sbLIZ.append(this.LL.LJIIJ);
        sbLIZ.append("ms, compile cost time: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append("ms, compile speed: ");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
