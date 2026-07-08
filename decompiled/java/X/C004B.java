package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.004B, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C004B extends C09AY implements Function0<Object> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C004B(long j, int i) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixVoListModelStore: refreshFromStartTypeByOrder: check whitelist section type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" (Int=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
