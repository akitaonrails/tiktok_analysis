package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wyz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841030Wyz extends C09AY implements Function0<String> {
    public final /* synthetic */ InterfaceC823460WSa LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C841030Wyz(InterfaceC823460WSa interfaceC823460WSa, long j, long j2, long j3) {
        super(0);
        this.LL = interfaceC823460WSa;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = j3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" \n========================================================\ndelayInterval id: ");
        sbLIZ.append(this.LL.LIZ().LIZ.LIZ);
        sbLIZ.append(" interval: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" beforeDelayInterval: ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" afterDelayInterval: ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(" uuid: ");
        sbLIZ.append(this.LL.LIZ().LJJIII);
        sbLIZ.append("\n========================================================");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
