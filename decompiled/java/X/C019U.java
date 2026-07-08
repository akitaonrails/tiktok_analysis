package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.019U, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C019U extends C09AY implements Function0<String> {
    public final /* synthetic */ C13IQ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C019U(C13IQ c13iq) {
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
