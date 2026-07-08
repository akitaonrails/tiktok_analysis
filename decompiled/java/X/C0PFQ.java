package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0PFQ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PFQ extends C09AY implements Function0<String> {
    public static final /* synthetic */ int LL = 0;

    static {
        new C0PFQ();
    }

    public C0PFQ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("size = ");
        C0PKD.LIZIZ.getClass();
        sbLIZ.append(C0PKD.LIZ().size());
        sbLIZ.append(" protocols = ");
        sbLIZ.append(C0PKD.LIZ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
