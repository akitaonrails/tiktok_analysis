package X;

/* JADX INFO: renamed from: X.0jT0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1282040jT0 {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final C1282090jT5 LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicRtcVideoMixStreamInfo(codec=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bFrame=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", profile=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fps=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", gop=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", layoutInfo=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1282040jT0(String str, long j, long j2, long j3, long j4, C1282090jT5 c1282090jT5) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = j4;
        this.LJFF = c1282090jT5;
    }
}
