package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0k7r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1307370k7r extends C09AY implements Function0<String> {
    public final /* synthetic */ InterfaceC1307210k7b LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307370k7r(InterfaceC1307210k7b interfaceC1307210k7b) {
        super(0);
        this.LL = interfaceC1307210k7b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Node ");
        sbLIZ.append(this.LL.getId());
        sbLIZ.append(' ');
        sbLIZ.append(this.LL.getConfig().name);
        sbLIZ.append(" loaded");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
