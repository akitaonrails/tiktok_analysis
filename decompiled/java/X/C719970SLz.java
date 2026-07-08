package X;

/* JADX INFO: renamed from: X.0SLz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C719970SLz {
    public boolean LIZ;
    public long LIZIZ;

    public C719970SLz() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C719970SLz)) {
            return false;
        }
        C719970SLz c719970SLz = (C719970SLz) obj;
        return this.LIZ == c719970SLz.LIZ && this.LIZIZ == c719970SLz.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicStickerPositionState(needsReapply=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", appliedDataVersion=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C719970SLz(int i) {
        this.LIZ = false;
        this.LIZIZ = 0L;
    }
}
