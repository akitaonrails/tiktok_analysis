package X;

/* JADX INFO: renamed from: X.0jLG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1277240jLG {
    public final boolean LIZ;
    public final String LIZIZ;
    public final C1282040jT0 LIZJ;
    public final C1282080jT4 LIZLLL;
    public final C1277010jKt LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicRtcMixStreamConfig(shouldSyncIndependentConfig=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", serverMixTaskId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mixVideoStreamConfig=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mixAudioStreamConfig=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", resolutionInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1277240jLG(boolean z, String str, C1282040jT0 c1282040jT0, C1282080jT4 c1282080jT4, C1277010jKt c1277010jKt) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = c1282040jT0;
        this.LIZLLL = c1282080jT4;
        this.LJ = c1277010jKt;
    }
}
