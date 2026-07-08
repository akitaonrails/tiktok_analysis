package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rbo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699260Rbo extends C09AY implements Function0<String> {
    public final /* synthetic */ C699060RbU LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C699260Rbo(C699060RbU c699060RbU) {
        super(0);
        this.LL = c699060RbU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComponentPriorityMaker --- makeDecision count: ");
        sbLIZ.append(this.LL.LLLIIIL.incrementAndGet());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
