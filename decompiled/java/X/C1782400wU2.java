package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wU2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1782400wU2 implements C15A8 {
    public final float LIZ;
    public final Float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1782400wU2)) {
            return false;
        }
        C1782400wU2 c1782400wU2 = (C1782400wU2) obj;
        return Float.compare(this.LIZ, c1782400wU2.LIZ) == 0 && Intrinsics.LJFF(this.LIZIZ, c1782400wU2.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlphaAnimationConfig(targetAlpha=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startAlpha=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC20339014iC
    public final C15A8 LIZ() {
        return new C1782400wU2(this.LIZ, this.LIZIZ);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.LIZ) * 31;
        Float f = this.LIZIZ;
        return iFloatToIntBits + (f == null ? 0 : f.hashCode());
    }

    public C1782400wU2(float f, Float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }
}
