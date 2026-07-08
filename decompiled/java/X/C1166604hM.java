package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04hM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1166604hM extends C09AY implements Function0<String> {
    public final /* synthetic */ C1231704rr LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1166604hM(C1231704rr c1231704rr) {
        super(0);
        this.LL = c1231704rr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String str = this.LL.LIZIZ;
        if (str == null || str.length() == 0) {
            return this.LL.LIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.LIZIZ);
        sbLIZ.append('_');
        sbLIZ.append(this.LL.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
