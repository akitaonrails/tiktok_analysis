package X;

/* JADX INFO: renamed from: X.0ZWk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901040ZWk {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C901040ZWk)) {
            return false;
        }
        C901040ZWk c901040ZWk = (C901040ZWk) obj;
        return this.LIZ == c901040ZWk.LIZ && this.LIZIZ == c901040ZWk.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExtraData(isSafetyMask=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isVideo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C901040ZWk(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
