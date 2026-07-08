package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.188Y, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C188Y extends C09AY implements Function0<String> {
    public final /* synthetic */ C13IQ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C188Y(C13IQ c13iq) {
        super(0);
        this.LL = c13iq;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widget_");
        sbLIZ.append(C09R7.LIZ(this.LL).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
