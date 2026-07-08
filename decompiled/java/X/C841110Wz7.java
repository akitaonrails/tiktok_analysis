package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wz7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841110Wz7 extends C09AY implements Function0<String> {
    public final /* synthetic */ InterfaceC823460WSa LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C841110Wz7(InterfaceC823460WSa interfaceC823460WSa) {
        super(0);
        this.LL = interfaceC823460WSa;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" \n========================================================\nisSkipApi id: ");
        sbLIZ.append(this.LL.LIZ().LIZ.LIZ);
        sbLIZ.append(" uuid: ");
        sbLIZ.append(this.LL.LIZ().LJJIII);
        sbLIZ.append("\n========================================================");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
