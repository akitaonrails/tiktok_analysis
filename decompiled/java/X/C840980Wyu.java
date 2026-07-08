package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wyu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840980Wyu extends C09AY implements Function0<String> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ InterfaceC823460WSa LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C840980Wyu(boolean z, InterfaceC823460WSa interfaceC823460WSa) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = interfaceC823460WSa;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" \n========================================================(NetworkPipeline)\n");
        sbLIZ.append(this.LL ? "filterAllowNetworkEvent: true" : "");
        sbLIZ.append(" id: ");
        sbLIZ.append(this.LLILLJJLI.LIZ().LIZ.LIZ);
        sbLIZ.append(" uuid: ");
        sbLIZ.append(this.LLILLJJLI.LIZ().LJJIII);
        sbLIZ.append("\nurl: ");
        sbLIZ.append(((C840660WyO) this.LLILLJJLI).LJIILL());
        sbLIZ.append("\n========================================================");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
