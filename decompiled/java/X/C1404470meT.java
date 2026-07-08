package X;

import com.ss.android.ugc.aweme.publish.model.VideoCreation;

/* JADX INFO: renamed from: X.0meT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404470meT {
    public final VideoCreation LIZ;
    public final C1404850mf5 LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadResult(result=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", processData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1404470meT(VideoCreation videoCreation, C1404850mf5 c1404850mf5) {
        this.LIZ = videoCreation;
        this.LIZIZ = c1404850mf5;
    }
}
