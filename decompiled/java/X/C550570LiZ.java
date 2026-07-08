package X;

/* JADX INFO: renamed from: X.0LiZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C550570LiZ {
    public final boolean LIZ;
    public final int LIZIZ;

    public C550570LiZ() {
        this(false, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C550570LiZ)) {
            return false;
        }
        C550570LiZ c550570LiZ = (C550570LiZ) obj;
        return this.LIZ == c550570LiZ.LIZ && this.LIZIZ == c550570LiZ.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuotaPreloadOption(enabled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", check=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C550570LiZ(boolean z, int i) {
        this.LIZ = z;
        this.LIZIZ = i;
    }
}
