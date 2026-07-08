package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DTL, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DTL extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1DTL(String str, boolean z, int i) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addFeedPlayerSource providerId: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", existed= ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", sourceSize= ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" -> ");
        sbLIZ.append(this.LLILLL + 1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
