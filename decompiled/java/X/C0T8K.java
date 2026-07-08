package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T8K, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T8K extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL = "ssm_pre_layout_end";
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0T8K(long j) {
        super(0);
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(": ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
