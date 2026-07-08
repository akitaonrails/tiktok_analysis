package X;

/* JADX INFO: renamed from: X.0EO3, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EO3 {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C0EO3() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EO3)) {
            return false;
        }
        C0EO3 c0eo3 = (C0EO3) obj;
        return this.LIZ == c0eo3.LIZ && this.LIZIZ == c0eo3.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CenterLineState(isHorizontallyCentered=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isVerticallyCentered=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0EO3(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }

    public static C0EO3 LIZ(C0EO3 c0eo3, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = c0eo3.LIZ;
        }
        if ((i & 2) != 0) {
            z2 = c0eo3.LIZIZ;
        }
        c0eo3.getClass();
        return new C0EO3(z, z2);
    }
}
