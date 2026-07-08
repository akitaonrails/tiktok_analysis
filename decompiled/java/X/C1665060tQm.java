package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tQm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1665060tQm implements InterfaceC1665140tQu {
    public final String LIZ;
    public final float LIZIZ;
    public final C19457311Al LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1665060tQm)) {
            return false;
        }
        C1665060tQm c1665060tQm = (C1665060tQm) obj;
        return Intrinsics.LJFF(this.LIZ, c1665060tQm.LIZ) && Float.compare(this.LIZIZ, c1665060tQm.LIZIZ) == 0 && Intrinsics.LJFF(this.LIZJ, c1665060tQm.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Selected(positionText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", percent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public C1665060tQm(String str, float f, C19457311Al c19457311Al) {
        this.LIZ = str;
        this.LIZIZ = f;
        this.LIZJ = c19457311Al;
    }
}
