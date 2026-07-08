package X;

/* JADX INFO: renamed from: X.0frh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1143590frh {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;

    public C1143590frh() {
        this(0.0f, 0.0f, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1143590frh)) {
            return false;
        }
        C1143590frh c1143590frh = (C1143590frh) obj;
        return Float.compare(this.LIZ, c1143590frh.LIZ) == 0 && Float.compare(this.LIZIZ, c1143590frh.LIZIZ) == 0 && Float.compare(this.LIZJ, c1143590frh.LIZJ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicGiftAudioSpectrum(bass=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", treble=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ);
    }

    public C1143590frh(float f, float f2, float f3) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
    }
}
