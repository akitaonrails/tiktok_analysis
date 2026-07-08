package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ENY, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ENY extends AbstractC363520ENa {
    public final C0ENU LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ENY)) {
            return false;
        }
        C0ENY c0eny = (C0ENY) obj;
        return Intrinsics.LJFF(this.LIZ, c0eny.LIZ) && Float.compare(this.LIZIZ, c0eny.LIZIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MirrorMask(baseData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mirrorHeight=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    @Override // X.AbstractC363520ENa
    public final C0ENU LIZ() {
        return this.LIZ;
    }

    public C0ENY(C0ENU c0enu, float f) {
        this.LIZ = c0enu;
        this.LIZIZ = f;
    }
}
