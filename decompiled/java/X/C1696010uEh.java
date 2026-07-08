package X;

/* JADX INFO: renamed from: X.0uEh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696010uEh {
    public float LIZ = 0.0f;
    public float LIZIZ = 0.0f;
    public float LIZJ = 0.0f;
    public float LIZLLL = 0.0f;

    public final boolean LIZIZ() {
        return (this.LIZ >= this.LIZJ) | (this.LIZIZ >= this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MutableRect(");
        sbLIZ.append(C1297290jrb.LIZ(this.LIZ));
        sbLIZ.append(", ");
        sbLIZ.append(C1297290jrb.LIZ(this.LIZIZ));
        sbLIZ.append(", ");
        sbLIZ.append(C1297290jrb.LIZ(this.LIZJ));
        sbLIZ.append(", ");
        sbLIZ.append(C1297290jrb.LIZ(this.LIZLLL));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(float f, float f2, float f3, float f4) {
        this.LIZ = Math.max(f, this.LIZ);
        this.LIZIZ = Math.max(f2, this.LIZIZ);
        this.LIZJ = Math.min(f3, this.LIZJ);
        this.LIZLLL = Math.min(f4, this.LIZLLL);
    }
}
