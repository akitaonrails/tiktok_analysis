package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0k7s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1307380k7s extends C09AY implements Function0<String> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ InterfaceC1307210k7b LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307380k7s(long j, InterfaceC1307210k7b interfaceC1307210k7b) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = interfaceC1307210k7b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Node ");
        sbLIZ.append(this.LL);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILLJJLI.getConfig().name);
        sbLIZ.append(" unloaded");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
