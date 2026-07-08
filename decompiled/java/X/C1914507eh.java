package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07eh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1914507eh {
    public static final C1914507eh LJ;
    public final int LIZ;
    public final int LIZIZ;
    public final Float LIZJ;
    public final Float LIZLLL;

    public C1914507eh() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1914507eh)) {
            return false;
        }
        C1914507eh c1914507eh = (C1914507eh) obj;
        return this.LIZ == c1914507eh.LIZ && this.LIZIZ == c1914507eh.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1914507eh.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1914507eh.LIZLLL);
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        Float f = this.LIZJ;
        int iHashCode = (i + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.LIZLLL;
        return iHashCode + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NimbleVideoItemStyleConfig(itemWidthPx=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", itemHeightPx=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", containerRadiusPx=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", coverRadiusPx=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(136));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(182));
        Float fValueOf = Float.valueOf(12.0f);
        LJ = new C1914507eh(iLIZIZ, iLIZIZ2, Float.valueOf(C418440Gaw.LIZIZ(fValueOf)), Float.valueOf(C418440Gaw.LIZIZ(fValueOf)));
    }

    public /* synthetic */ C1914507eh(int i) {
        this(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)), null, null);
    }

    public C1914507eh(int i, int i2, Float f, Float f2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = f;
        this.LIZLLL = f2;
    }
}
