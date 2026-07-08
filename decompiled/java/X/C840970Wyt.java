package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Wyt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840970Wyt {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public transient Object LJ;

    public C840970Wyt() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C840970Wyt)) {
            return false;
        }
        C840970Wyt c840970Wyt = (C840970Wyt) obj;
        return this.LIZ == c840970Wyt.LIZ && this.LIZIZ == c840970Wyt.LIZIZ && this.LIZJ == c840970Wyt.LIZJ && this.LIZLLL == c840970Wyt.LIZLLL && Intrinsics.LJFF(this.LJ, c840970Wyt.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.LIZIZ;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i2 = (i + r02) * 31;
        boolean z3 = this.LIZJ;
        ?? r03 = z3;
        if (z3) {
            r03 = 1;
        }
        int i3 = (((i2 + r03) * 31) + (this.LIZLLL ? 1 : 0)) * 31;
        Object obj = this.LJ;
        return i3 + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HandleResult(isFilter=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isReport=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isModify=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isFuse=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", fuseResult=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C840970Wyt(int i) {
        this.LIZ = false;
        this.LIZIZ = false;
        this.LIZJ = false;
        this.LIZLLL = false;
        this.LJ = null;
    }
}
