package X;

/* JADX INFO: renamed from: X.0jT4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1282080jT4 {
    public final C1CN2 LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final String LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicRtcAudioMixStreamInfo(codec=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", streamAudioChannels=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", streamAudioSampleRate=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", streamAudioBitrate=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", streamAudioAacProfile=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1282080jT4(C1CN2 c1cn2, long j, long j2, long j3, String str) {
        this.LIZ = c1cn2;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = str;
    }
}
