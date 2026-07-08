package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RiE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703240RiE {
    public final boolean LIZ;
    public final String LIZIZ;
    public final EnumC699470Rc9 LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C703240RiE)) {
            return false;
        }
        C703240RiE c703240RiE = (C703240RiE) obj;
        return this.LIZ == c703240RiE.LIZ && Intrinsics.LJFF(this.LIZIZ, c703240RiE.LIZIZ) && this.LIZJ == c703240RiE.LIZJ && this.LIZLLL == c703240RiE.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RuleEvaluationResult(canApply=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", availabilityState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", usedDefaultAvailability=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C703240RiE(boolean z, String str, EnumC699470Rc9 enumC699470Rc9, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = enumC699470Rc9;
        this.LIZLLL = z2;
    }
}
