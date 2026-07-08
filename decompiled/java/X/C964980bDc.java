package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bDc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C964980bDc extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C964950bDZ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C964980bDc(C964950bDZ c964950bDZ) {
        super(0);
        this.LL = c964950bDZ;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("off linkmic timeout scene=CO_HOST timestamp=");
        sbLIZ.append(System.currentTimeMillis());
        C969080bKE.LIZIZ("CoAudienceSeiSubscriber", C2188811AlT.LIZIZ(sbLIZ));
        C964950bDZ c964950bDZ = this.LL;
        c964950bDZ.LJ = false;
        c964950bDZ.LIZ.LLFFF(C963530bBH.LIZJ);
        this.LL.LIZJ.invoke(Boolean.FALSE);
        return Unit.LIZ;
    }
}
