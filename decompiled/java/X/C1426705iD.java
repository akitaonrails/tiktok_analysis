package X;

/* JADX INFO: renamed from: X.05iD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1426705iD {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public C1426705iD() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1426705iD)) {
            return false;
        }
        C1426705iD c1426705iD = (C1426705iD) obj;
        return Float.compare(this.LIZ, c1426705iD.LIZ) == 0 && Float.compare(this.LIZIZ, c1426705iD.LIZIZ) == 0 && Float.compare(this.LIZJ, c1426705iD.LIZJ) == 0 && Float.compare(this.LIZLLL, c1426705iD.LIZLLL) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyricEffectLoadConfig(downloadRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fetchMiniDraft=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", convertMiniDraftModel=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", applyEffect=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    public C1426705iD(int i) {
        this.LIZ = 0.4f;
        this.LIZIZ = 0.3f;
        this.LIZJ = 0.2f;
        this.LIZLLL = 0.1f;
    }
}
