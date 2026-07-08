package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qZ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1554900qZ6 extends C09AY implements Function0<String> {
    public final /* synthetic */ C1554890qZ5 LL;
    public final /* synthetic */ C1554820qYy LLILLJJLI;
    public final /* synthetic */ InterfaceC2753014t LLILLL;
    public final /* synthetic */ Class LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1554900qZ6(C1554890qZ5 c1554890qZ5, C1554820qYy c1554820qYy, InterfaceC2753014t interfaceC2753014t, Class cls) {
        super(0);
        this.LL = c1554890qZ5;
        this.LLILLJJLI = c1554820qYy;
        this.LLILLL = interfaceC2753014t;
        this.LLILZ = cls;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start bind source: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", key: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", data: ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", clz: ");
        sbLIZ.append(this.LLILZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
