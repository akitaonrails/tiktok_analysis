package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18Aj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21240718Aj extends C09AY implements Function0<Object> {
    public final /* synthetic */ C18A3 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21240718Aj(C18A3 c18a3) {
        super(0);
        this.LL = c18a3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch gecko resource, depend: ");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
