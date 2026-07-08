package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ENV, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ENV extends AbstractC363520ENa {
    public final C0ENU LIZ;
    public final float LIZIZ;
    public final float LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ENV)) {
            return false;
        }
        C0ENV c0env = (C0ENV) obj;
        return Intrinsics.LJFF(this.LIZ, c0env.LIZ) && Float.compare(this.LIZIZ, c0env.LIZIZ) == 0 && Float.compare(this.LIZJ, c0env.LIZJ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CircleMask(baseData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ);
    }

    @Override // X.AbstractC363520ENa
    public final C0ENU LIZ() {
        return this.LIZ;
    }

    public C0ENV(C0ENU c0enu, float f, float f2) {
        this.LIZ = c0enu;
        this.LIZIZ = f;
        this.LIZJ = f2;
    }
}
