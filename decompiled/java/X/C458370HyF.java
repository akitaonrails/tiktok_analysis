package X;

import java.util.List;

/* JADX INFO: renamed from: X.0HyF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C458370HyF {
    public final String LIZ;
    public final long LIZIZ;
    public final List<Float> LIZJ;
    public final float LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMVoiceMessageRecorder.Result(filePath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", durationMillis=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", waveData.size=");
        sbLIZ.append(this.LIZJ.size());
        sbLIZ.append(", sampleRate=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C458370HyF(String str, long j, List<Float> list, float f) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = list;
        this.LIZLLL = f;
    }
}
