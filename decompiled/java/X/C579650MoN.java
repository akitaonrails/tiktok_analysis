package X;

/* JADX INFO: renamed from: X.0MoN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C579650MoN extends AbstractC579710MoT {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConcatFinishedEvent{videoPath='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", audioPath='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", metadata= ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C579650MoN(String str, String str2, String str3, int i) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZLLL = i;
        this.LIZJ = str3;
    }
}
