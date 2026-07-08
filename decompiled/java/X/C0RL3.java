package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RL3, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RL3 extends C09AY implements Function0<String> {
    public final /* synthetic */ C1DD7 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RL3(C1DD7 c1dd7) {
        super(0);
        this.LL = c1dd7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("calculate device info by root_view: ");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
