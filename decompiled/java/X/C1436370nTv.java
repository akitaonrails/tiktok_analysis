package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0nTv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1436370nTv {
    public static final /* synthetic */ int LIZ = 0;

    public static Workspace LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.isFastImport()) {
            CreativeInfo creativeInfo = videoPublishEditModel.getCreativeInfo();
            String mMusicPath = videoPublishEditModel.getMMusicPath();
            videoPublishEditModel.reverseVideoPath();
            return C14D2.LIZIZ(creativeInfo, mMusicPath);
        }
        String str = videoPublishEditModel.mShootWay;
        if (str != null && u.LJJIIJZLJL(str, "miracle_game", false)) {
            CreativeInfo creativeInfo2 = videoPublishEditModel.getCreativeInfo();
            String mMusicPath2 = videoPublishEditModel.getMMusicPath();
            videoPublishEditModel.reverseVideoPath();
            return C14D2.LIZIZ(creativeInfo2, mMusicPath2);
        }
        CreativeInfo creativeInfo3 = videoPublishEditModel.getCreativeInfo();
        String mMusicPath3 = videoPublishEditModel.getMMusicPath();
        videoPublishEditModel.reverseVideoPath();
        return C14D2.LIZIZ(creativeInfo3, mMusicPath3);
    }
}
