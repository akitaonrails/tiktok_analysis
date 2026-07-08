package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18FV, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18FV extends C09AY implements Function0<Object> {
    public final /* synthetic */ C18E9 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18FV(C18E9 c18e9) {
        super(0);
        this.LL = c18e9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tree=");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
