package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wz1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841050Wz1 extends C09AY implements Function0<String> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ InterfaceC823460WSa LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C841050Wz1(boolean z, int i, InterfaceC823460WSa interfaceC823460WSa, String str, String str2) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = i;
        this.LLILLL = interfaceC823460WSa;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" \n========================================================(NetworkPipeline)\n");
        sbLIZ.append(this.LL ? "filterAllowNetworkEvent: true" : "");
        sbLIZ.append(" id: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" uuid: ");
        sbLIZ.append(this.LLILLL.LIZ().LJJIII);
        sbLIZ.append("\ntype: ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(" subType: ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append("\n========================================================");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
