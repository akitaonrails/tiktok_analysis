package X;

/* JADX INFO: renamed from: X.0HsR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454770HsR {
    public final long LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixStudioMixInfo(remixerUid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", remixerNickname=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", remixeeUid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", remixeeNickname=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C454770HsR(long j, String str, long j2, String str2) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = j2;
        this.LIZLLL = str2;
    }
}
