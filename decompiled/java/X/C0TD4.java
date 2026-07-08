package X;

import java.util.List;

/* JADX INFO: renamed from: X.0TD4, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TD4 {
    public final String LIZ;
    public final AbstractC1276470jK1 LIZIZ;
    public final List<String> LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixInfo(streamUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", streamMixer=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pushUrls=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0TD4(String str, C1276570jKB c1276570jKB, List list) {
        this.LIZ = str;
        this.LIZIZ = c1276570jKB;
        this.LIZJ = list;
    }
}
