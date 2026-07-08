package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qc4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556740qc4 extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1556740qc4(int i, boolean z) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageSelected ----> position ---> ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", updateIndicator ---> ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
