package X;

import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;

/* JADX INFO: renamed from: X.0mfG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404960mfG {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public static final int LIZ(UploadVideoConfig uploadVideoConfig, String str) {
        ?? LIZIZ;
        if (!uploadVideoConfig.enableClientNetworkJudgement) {
            LIZIZ = -1;
        } else {
            LIZIZ = C790050Uyx.LIZIZ(C0CHQ.LIZ);
        }
        ?? LIZ = C2188811AlT.LIZ();
        LIZ.append("TTUploader ");
        LIZ.append(str);
        LIZ.append(" checkNetState: ");
        LIZ.append(LIZIZ);
        C201955140j.LIZ(C2188811AlT.LIZIZ(LIZ));
        return LIZIZ;
    }
}
