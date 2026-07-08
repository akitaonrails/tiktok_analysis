package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04z9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1276904z9 extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ InterfaceC719640SKs LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1276904z9(InterfaceC719640SKs interfaceC719640SKs, String str) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = interfaceC719640SKs;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(this.LLILLJJLI.hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
