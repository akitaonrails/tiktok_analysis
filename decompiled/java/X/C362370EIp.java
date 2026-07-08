package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0EIp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362370EIp {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(int i) {
        if (i != C0FPS.LONG_VIDEO.getScene()) {
            if (C0EGM.LIZ() && i == C0FPS.SHORT_VIDEO.getScene()) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C362370EIp.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }

    public static boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        String musicId = videoPublishEditModel.getMusicId();
        if (musicId != null && musicId.length() != 0 && videoPublishEditModel.getMusicVolume() != 0.0f) {
            return false;
        }
        return true;
    }
}
