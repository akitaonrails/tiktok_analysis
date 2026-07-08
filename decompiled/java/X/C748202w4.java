package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.02w4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C748202w4 extends C09AY implements Function0<String> {
    public final /* synthetic */ C740102ul LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C748202w4(C740102ul c740102ul, long j) {
        super(0);
        this.LL = c740102ul;
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComponentPriorityMaker --- bindSlotStrategy accepted, revision=");
        sbLIZ.append(this.LL.LIZJ);
        sbLIZ.append(", generation=");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
