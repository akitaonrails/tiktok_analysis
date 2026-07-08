package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dqW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1065980dqW extends C09AY implements Function0<Object> {
    public final /* synthetic */ InterfaceC1065950dqT LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1065980dqW(InterfaceC1065950dqT interfaceC1065950dqT) {
        super(0);
        this.LL = interfaceC1065950dqT;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("schedule schedulerId= ");
        sbLIZ.append(this.LL.LJ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
