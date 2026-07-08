package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ReQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700880ReQ extends C09AY implements Function0<String> {
    public final /* synthetic */ C238400w2 LL;
    public final /* synthetic */ C700790ReH LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C700880ReQ(C238400w2 c238400w2, C700790ReH c700790ReH) {
        super(0);
        this.LL = c238400w2;
        this.LLILLJJLI = c700790ReH;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(this.LL.element);
        sbLIZ.append(" --- ");
        C700970ReZ c700970ReZ = this.LLILLJJLI.node;
        sbLIZ.append(c700970ReZ != null ? c700970ReZ.LIZJ : null);
        sbLIZ.append(" --- FcpPolicyTask#compute start --- ");
        sbLIZ.append(C786410Ut5.u3().getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
