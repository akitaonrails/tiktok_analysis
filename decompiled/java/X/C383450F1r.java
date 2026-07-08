package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F1r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383450F1r extends C0F26 {
    public final EnumC383510F1x LIZ;
    public final float LIZIZ;
    public final C13LY<Float> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C383450F1r)) {
            return false;
        }
        C383450F1r c383450F1r = (C383450F1r) obj;
        return this.LIZ == c383450F1r.LIZ && Float.compare(this.LIZIZ, c383450F1r.LIZIZ) == 0 && Intrinsics.LJFF(this.LIZJ, c383450F1r.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SliderItem(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", valueRange=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    @Override // X.C0F26
    public final EnumC383510F1x LIZ() {
        return this.LIZ;
    }

    public static C383450F1r LIZIZ(C383450F1r c383450F1r, float f) {
        EnumC383510F1x enumC383510F1x = c383450F1r.LIZ;
        C13LY<Float> c13ly = c383450F1r.LIZJ;
        c383450F1r.getClass();
        return new C383450F1r(enumC383510F1x, f, c13ly);
    }

    public C383450F1r(EnumC383510F1x enumC383510F1x, float f, C13LY<Float> c13ly) {
        this.LIZ = enumC383510F1x;
        this.LIZIZ = f;
        this.LIZJ = c13ly;
    }
}
