package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aVb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937690aVb extends C09AY implements Function0<C937670aVZ> {
    public final /* synthetic */ C948340amm LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C937690aVb(C948340amm c948340amm) {
        super(0);
        this.LL = c948340amm;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0aVZ] */
    @Override // kotlin.jvm.functions.Function0
    public final C937670aVZ invoke() {
        final C948340amm c948340amm = this.LL;
        return new InterfaceC941900acO() { // from class: X.0aVZ
            @Override // X.InterfaceC941900acO
            public final void LIZJ(C01EL c01el, String str) {
                boolean z;
                C941180abE c941180abE = c948340amm.LLJ;
                if (c01el == C01EL.START) {
                    z = true;
                } else {
                    z = false;
                }
                c941180abE.LIZIZ(new C937660aVY(str, z));
            }
        };
    }
}
