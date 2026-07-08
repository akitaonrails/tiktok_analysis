package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05lB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1445105lB extends AbstractC1445505lF {
    public final AbstractC1443905kz LIZ;
    public final boolean LIZIZ;
    public final Function0<Unit> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1445105lB)) {
            return false;
        }
        C1445105lB c1445105lB = (C1445105lB) obj;
        return Intrinsics.LJFF(this.LIZ, c1445105lB.LIZ) && this.LIZIZ == c1445105lB.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1445105lB.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        Function0<Unit> function0 = this.LIZJ;
        return iHashCode + (function0 == null ? 0 : function0.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TriggerDecision(behavior=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isAsync=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onComplete=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1445105lB(AbstractC1443905kz abstractC1443905kz, boolean z, C1446605lQ c1446605lQ) {
        this.LIZ = abstractC1443905kz;
        this.LIZIZ = z;
        this.LIZJ = c1446605lQ;
    }
}
