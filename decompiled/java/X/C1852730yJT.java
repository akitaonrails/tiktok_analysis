package X;

/* JADX INFO: renamed from: X.0yJT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852730yJT {
    public final String LIZ;
    public final long LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public C1852730yJT() {
        this(0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageInfo(mimeType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sizeInBytes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1852730yJT(int i) {
        this(0L, "", 0.0f, 0.0f);
    }

    public C1852730yJT(long j, String str, float f, float f2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = f;
        this.LIZLLL = f2;
    }
}
