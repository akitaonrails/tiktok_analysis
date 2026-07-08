package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NWq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C595340NWq extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0NXU LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C595340NWq(C0NXU c0nxu, String str) {
        super(0);
        this.LL = c0nxu;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LIZIZ.remove(this.LLILLJJLI);
        C0NXU c0nxu = this.LL;
        C0NXT c0nxtLIZLLL = c0nxu.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActivityStatusClient(");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(") is destroyed, existing");
        sbLIZ.append(C13LP.LJJLIIIJ(this.LL.LIZIZ.keySet(), null, null, null, 0, null, null, 63));
        C0NXR.LIZLLL(c0nxu, c0nxtLIZLLL, C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }
}
