package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T6V, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T6V extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0T6V(int i, boolean z) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[moveViewPagerToIndex] ");
        sbLIZ.append(this.LL);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
