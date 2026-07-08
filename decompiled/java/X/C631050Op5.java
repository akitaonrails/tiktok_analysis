package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Op5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631050Op5 extends C09AY implements Function2<VideoMusicTitleAssem, C486890J7n, Unit> {
    public C631050Op5() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoMusicTitleAssem videoMusicTitleAssem, C486890J7n c486890J7n) {
        Object obj;
        String aid;
        User user;
        VideoMusicTitleAssem videoMusicTitleAssem2 = videoMusicTitleAssem;
        C486890J7n c486890J7n2 = c486890J7n;
        VideoMusicBaseVM videoMusicBaseVMVp = videoMusicTitleAssem2.Vp();
        C724270Sb3 c724270Sb3 = videoMusicTitleAssem2.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        List<MusicOwnerInfo> listJp = videoMusicTitleAssem2.Jp(aid);
        videoMusicBaseVMVp.getClass();
        if (c486890J7n2 != null && (user = c486890J7n2.LIZ) != null) {
            for (MusicOwnerInfo musicOwnerInfo : listJp) {
                if (Intrinsics.LJFF(musicOwnerInfo.getUid(), user.getUid())) {
                    musicOwnerInfo.setFollowStatus(Integer.valueOf(user.getFollowStatus()));
                    musicOwnerInfo.setFollowerStatus(Integer.valueOf(user.getFollowerStatus()));
                    musicOwnerInfo.setBlock(user.isBlock);
                    musicOwnerInfo.setBlocked(user.isBlocked());
                }
            }
        }
        return Unit.LIZ;
    }
}
