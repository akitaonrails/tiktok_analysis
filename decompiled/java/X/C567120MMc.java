package X;

import com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0MMc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C567120MMc {
    public static Pair LIZIZ(ForwardVideo forwardVideo) {
        String strLIZJ = C570490MZb.LIZJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.STREAM_EDIT_VIDEO, "", true).getAbsolutePath());
        String str = (String) C13LP.LJJJLL(forwardVideo.getPlayAddressList());
        if (str == null) {
            str = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C08HM.LIZJ(str));
        sbLIZ.append(".mp4");
        return new Pair(strLIZJ, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static ForwardMediaDownloader.DownloadConfig LIZ(ForwardVideo forwardVideo, boolean z, boolean z2, int i) {
        boolean z3 = z2;
        boolean z4 = z;
        if ((i & 2) != 0) {
            z4 = true;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        Pair pairLIZIZ = LIZIZ(forwardVideo);
        String str = (String) pairLIZIZ.getFirst();
        String str2 = (String) pairLIZIZ.getSecond();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        return new ForwardMediaDownloader.DownloadConfig(str, str2, C2188811AlT.LIZIZ(sbLIZ), z4, -1L, z3);
    }
}
