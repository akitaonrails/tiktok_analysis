package X;

/* JADX INFO: renamed from: X.0Dj6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347060Dj6 {
    public float LIZ;
    public final Double LIZIZ;
    public final boolean LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Params(volume=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", dbRange=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C347060Dj6(float f) {
        this.LIZ = f;
        this.LIZJ = true;
    }

    public C347060Dj6(float f, Double d, boolean z) {
        this(f);
        this.LIZIZ = d;
        this.LIZJ = z;
    }
}
