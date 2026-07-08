package X;

/* JADX INFO: renamed from: X.0ELY, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ELY {
    public final boolean LIZ;
    public final float LIZIZ;
    public final boolean LIZJ;

    public C0ELY() {
        this(false, 0.0f, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ELY)) {
            return false;
        }
        C0ELY c0ely = (C0ELY) obj;
        return this.LIZ == c0ely.LIZ && Float.compare(this.LIZIZ, c0ely.LIZIZ) == 0 && this.LIZJ == c0ely.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RestoreGenerateTrackData(isImageUploaded=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", animate=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public /* synthetic */ C0ELY(boolean z, float f, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0.0f : f, false);
    }

    public C0ELY(boolean z, float f, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = f;
        this.LIZJ = z2;
    }
}
