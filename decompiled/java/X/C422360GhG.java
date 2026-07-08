package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GhG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422360GhG {
    public final InterfaceC422390GhJ LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public C422360GhG() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C422360GhG)) {
            return false;
        }
        C422360GhG c422360GhG = (C422360GhG) obj;
        return Intrinsics.LJFF(this.LIZ, c422360GhG.LIZ) && Float.compare(this.LIZIZ, c422360GhG.LIZIZ) == 0 && Float.compare(this.LIZJ, c422360GhG.LIZJ) == 0 && Float.compare(this.LIZLLL, c422360GhG.LIZLLL) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMBubbleStyle(lowerOutStyle=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", lowerInRadius=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", upperInRadius=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", upperOutRadius=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    public /* synthetic */ C422360GhG(int i) {
        this(new C422370GhH(0), 0.0f, 0.0f, 0.0f);
    }

    public C422360GhG(float f) {
        this(new C422380GhI(f), f, f, f);
    }

    public C422360GhG(InterfaceC422390GhJ interfaceC422390GhJ, float f, float f2, float f3) {
        this.LIZ = interfaceC422390GhJ;
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
    }
}
