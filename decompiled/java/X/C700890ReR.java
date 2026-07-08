package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ReR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700890ReR extends C09AY implements Function0<String> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C700790ReH LLILLJJLI;
    public final /* synthetic */ C238400w2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C700890ReR(long j, C700790ReH c700790ReH, C238400w2 c238400w2) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = c700790ReH;
        this.LLILLL = c238400w2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" --- ");
        C700970ReZ c700970ReZ = this.LLILLJJLI.node;
        sbLIZ.append(c700970ReZ != null ? c700970ReZ.LIZJ : null);
        sbLIZ.append(" --- FcpPolicyTask#compute end, duration: ");
        sbLIZ.append(this.LL - this.LLILLL.element);
        sbLIZ.append(" --- ");
        sbLIZ.append(C786410Ut5.u3().getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
