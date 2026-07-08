package X;

/* JADX INFO: renamed from: X.0Uw3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788250Uw3 {
    public final boolean LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C788250Uw3)) {
            return false;
        }
        C788250Uw3 c788250Uw3 = (C788250Uw3) obj;
        return this.LIZ == c788250Uw3.LIZ && this.LIZIZ == c788250Uw3.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OverrideDedupConfig(enable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", windowMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C788250Uw3(boolean z, long j) {
        this.LIZ = z;
        this.LIZIZ = j;
    }
}
