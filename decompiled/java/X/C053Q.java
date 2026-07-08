package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.053Q, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C053Q extends C09AY implements Function0<String> {
    public final /* synthetic */ C053W LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C053Q(C053W c053w) {
        super(0);
        this.LL = c053w;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        C053W c053w = this.LL;
        c053w.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c053w.LIZ);
        sbLIZ.append('&');
        sbLIZ.append(c053w.LIZIZ.LIZ());
        sbLIZ.append('&');
        sbLIZ.append(c053w.LIZJ.getTag());
        sbLIZ.append('&');
        sbLIZ.append(c053w.LIZLLL.getTag());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
