package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Op7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631070Op7 extends C09AY implements Function2<VideoMusicTitleAssem, FollowStatusEvent, Unit> {
    public C631070Op7() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoMusicTitleAssem videoMusicTitleAssem, FollowStatusEvent followStatusEvent) {
        Object obj;
        String aid;
        FollowStatus followStatus;
        VideoMusicTitleAssem videoMusicTitleAssem2 = videoMusicTitleAssem;
        FollowStatusEvent followStatusEvent2 = followStatusEvent;
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
        if (followStatusEvent2 != null && (followStatus = followStatusEvent2.status) != null) {
            for (MusicOwnerInfo musicOwnerInfo : listJp) {
                if (Intrinsics.LJFF(musicOwnerInfo.getUid(), followStatus.getUserId())) {
                    musicOwnerInfo.setFollowStatus(Integer.valueOf(followStatus.getFollowStatus()));
                    if (followStatusEvent2.status.getFollowStatus() != 0 && followStatusEvent2.status.getFollowStatus() != -1) {
                        musicOwnerInfo.setBlock(false);
                        musicOwnerInfo.setBlocked(false);
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
