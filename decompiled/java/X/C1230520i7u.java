package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i7u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1230520i7u {
    public final EnumC1230590i81 LIZ;
    public final C1230080i7C LIZIZ;
    public final C1230110i7F LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1230520i7u)) {
            return false;
        }
        C1230520i7u c1230520i7u = (C1230520i7u) obj;
        return this.LIZ == c1230520i7u.LIZ && Intrinsics.LJFF(this.LIZIZ, c1230520i7u.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1230520i7u.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JoinGroupFlowParams(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", joinGroupParams=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", inviteReflowParams=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1230520i7u(EnumC1230590i81 enumC1230590i81, C1230080i7C c1230080i7C, C1230110i7F c1230110i7F) {
        this.LIZ = enumC1230590i81;
        this.LIZIZ = c1230080i7C;
        this.LIZJ = c1230110i7F;
    }
}
