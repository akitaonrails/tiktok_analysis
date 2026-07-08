package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0CHX, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CHX {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(6274));

    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (LIZIZ(videoPublishEditModel) > 0 && C1428470nHB.LJJZZI(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static int LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.creativeModel.editPostModel == null && C0CHQ.LIZ().getAccountService().isLogin()) {
            return ((Number) LIZ.getValue()).intValue();
        }
        return 0;
    }
}
