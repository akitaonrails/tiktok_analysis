package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RQa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695540RQa extends C09AY implements Function0<String> {
    public final /* synthetic */ C13IQ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C695540RQa(C13IQ c13iq) {
        super(0);
        this.LL = c13iq;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ(this.LL).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
