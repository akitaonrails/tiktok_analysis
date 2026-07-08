package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wyo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840920Wyo extends C09AY implements Function0<String> {
    public final /* synthetic */ InterfaceC823460WSa LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C840920Wyo(InterfaceC823460WSa interfaceC823460WSa) {
        super(0);
        this.LL = interfaceC823460WSa;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShutdownManager id:");
        sbLIZ.append(this.LL.LIZ().LIZ.LIZ);
        sbLIZ.append(" uuid:");
        sbLIZ.append(this.LL.LIZ().LJJIII);
        sbLIZ.append(" \nhandleResult:");
        sbLIZ.append(this.LL.LIZ().LJJIFFI);
        sbLIZ.append(" monitorScenes:");
        sbLIZ.append(this.LL.LIZ().LJIJ);
        sbLIZ.append(" operateHistory:");
        sbLIZ.append(this.LL.LIZ().LJJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
