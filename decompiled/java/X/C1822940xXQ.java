package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xXQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822940xXQ extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C1822950xXR LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1822940xXQ(C1822950xXR c1822950xXR) {
        super(0);
        this.LL = c1822950xXR;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C1822330xWR c1822330xWR;
        C1822950xXR c1822950xXR = this.LL;
        boolean z = false;
        if (c1822950xXR.LIZJ != null && ((c1822330xWR = c1822950xXR.LJII) == null || !c1822330xWR.LLILZ)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
