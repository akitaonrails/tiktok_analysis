package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1554650qYh extends C09AY implements Function0<String> {
    public final /* synthetic */ C1554890qZ5 LL;
    public final /* synthetic */ InterfaceC665370Q7z LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1554650qYh(C1554890qZ5 c1554890qZ5, InterfaceC665370Q7z interfaceC665370Q7z) {
        super(0);
        this.LL = c1554890qZ5;
        this.LLILLJJLI = interfaceC665370Q7z;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.LIZ.getHost());
        sbLIZ.append(" attach to ");
        sbLIZ.append(this.LLILLJJLI.getHost());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
