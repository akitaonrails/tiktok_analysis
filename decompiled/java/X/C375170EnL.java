package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EnL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C375170EnL {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final int LJ;

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaterialRect(width=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", centerX=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", centerY=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", rotate=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C375170EnL.class, cls)) {
            return false;
        }
        C375170EnL c375170EnL = (C375170EnL) obj;
        if (this.LIZ == c375170EnL.LIZ && this.LIZIZ == c375170EnL.LIZIZ && this.LIZJ == c375170EnL.LIZJ && this.LIZLLL == c375170EnL.LIZLLL && this.LJ == c375170EnL.LJ) {
            return true;
        }
        return false;
    }

    public C375170EnL(float f, float f2, float f3, float f4, int i) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJ = i;
    }
}
