package X;

import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mbm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402800mbm {
    public static final C1402800mbm LIZ = new C1402800mbm();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(180));

    public static String LIZ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        if (u4.LJLL(videoPublishEditModel)) {
            CommonMobParamModel commonMobParamModel = videoPublishEditModel.creativeModel.commonMobModel;
            if (commonMobParamModel.storyMusicDefaultType == null) {
                if (C1402890mbv.LIZ(videoPublishEditModel) && !Intrinsics.LJFF("slideshow_rec", videoPublishEditModel.getMusicOrigin())) {
                    str = "shoot_page_selected";
                } else if (C1456980o1A.LJFF(videoPublishEditModel) == 1) {
                    str = "with_default_music";
                } else {
                    str = "no_default_music";
                }
                commonMobParamModel.storyMusicDefaultType = str;
            }
            return videoPublishEditModel.creativeModel.commonMobModel.storyMusicDefaultType;
        }
        return null;
    }
}
