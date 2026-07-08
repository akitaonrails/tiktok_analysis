package X;

/* JADX INFO: renamed from: X.08o8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2227808o8 {
    public final int LIZ;
    public final int LIZIZ;

    public C2227808o8() {
        this(0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2227808o8)) {
            return false;
        }
        C2227808o8 c2227808o8 = (C2227808o8) obj;
        return this.LIZ == c2227808o8.LIZ && this.LIZIZ == c2227808o8.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybackProgress(positionMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2227808o8(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
