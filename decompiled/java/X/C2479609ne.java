package X;

/* JADX INFO: renamed from: X.09ne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2479609ne {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageDetailInfo(rotation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mimeType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2479609ne(int i, int i2, int i3, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = str;
    }
}
