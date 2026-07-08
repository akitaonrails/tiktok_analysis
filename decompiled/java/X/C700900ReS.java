package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ReS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700900ReS extends C09AY implements Function0<String> {
    public final /* synthetic */ C238400w2 LL;
    public final /* synthetic */ C700790ReH LLILLJJLI;
    public final /* synthetic */ C700950ReX LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C700900ReS(C238400w2 c238400w2, C700790ReH c700790ReH, C700950ReX c700950ReX) {
        super(0);
        this.LL = c238400w2;
        this.LLILLJJLI = c700790ReH;
        this.LLILLL = c700950ReX;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(this.LL.element);
        sbLIZ.append(" --- ");
        C700970ReZ c700970ReZ = this.LLILLJJLI.node;
        sbLIZ.append(c700970ReZ != null ? c700970ReZ.LIZJ : null);
        sbLIZ.append(" --- FcpPolicyTask#compute result: ");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
