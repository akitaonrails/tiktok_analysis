package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wU3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1782410wU3 implements C15A8 {
    public final float LIZ;
    public final float LIZIZ;
    public final Float LIZJ;
    public final Float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1782410wU3)) {
            return false;
        }
        C1782410wU3 c1782410wU3 = (C1782410wU3) obj;
        return Float.compare(this.LIZ, c1782410wU3.LIZ) == 0 && Float.compare(this.LIZIZ, c1782410wU3.LIZIZ) == 0 && Intrinsics.LJFF(this.LIZJ, c1782410wU3.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1782410wU3.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TranslateAnimationConfig(targetTranslationX=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetTranslationY=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", startX=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", startY=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC20339014iC
    public final C15A8 LIZ() {
        return new C1782410wU3(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    public final int hashCode() {
        int iFloatToIntBits = ((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31;
        Float f = this.LIZJ;
        int iHashCode = (iFloatToIntBits + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.LIZLLL;
        return iHashCode + (f2 != null ? f2.hashCode() : 0);
    }

    public C1782410wU3(float f, float f2, Float f3, Float f4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
    }
}
