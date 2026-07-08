package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Wyv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840990Wyv {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final C1910407e2 LIZLLL;

    public C840990Wyv() {
        this(15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C840990Wyv)) {
            return false;
        }
        C840990Wyv c840990Wyv = (C840990Wyv) obj;
        return this.LIZ == c840990Wyv.LIZ && this.LIZIZ == c840990Wyv.LIZIZ && this.LIZJ == c840990Wyv.LIZJ && Intrinsics.LJFF(this.LIZLLL, c840990Wyv.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
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
        int i2 = (((i + r02) * 31) + (this.LIZJ ? 1 : 0)) * 31;
        C1910407e2 c1910407e2 = this.LIZLLL;
        return i2 + (c1910407e2 == null ? 0 : c1910407e2.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DefaultSampleRateModel(guardNormal=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", guardError=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fuseError=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", config=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C840990Wyv(int i) {
        this(false, false, false, null);
    }

    public C840990Wyv(boolean z, boolean z2, boolean z3, C1910407e2 c1910407e2) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = c1910407e2;
    }
}
