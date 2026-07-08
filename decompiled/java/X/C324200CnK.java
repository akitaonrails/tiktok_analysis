package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CnK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C324200CnK extends C09AY implements Function0<String> {
    public final /* synthetic */ InterfaceC665370Q7z LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324200CnK(InterfaceC665370Q7z interfaceC665370Q7z) {
        super(0);
        this.LL = interfaceC665370Q7z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try new scope, result: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", resultKey: ");
        sbLIZ.append(this.LL.getKey());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
