package X;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoListActivity;
import com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoPreviewActivity;
import com.ss.android.ugc.profile.platform.base.data.ProfileBgInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileBgVideoInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0iVj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1245290iVj implements InterfaceC1245310iVl {
    public static final void LIZ(Activity activity, Fragment fragment) {
        if (fragment != null) {
            String str = ProfileBgVideoListActivity._pnsPageId;
            C455810Hu7.LIZ(2004, fragment);
        }
    }

    @Override // X.InterfaceC1245310iVl
    public final void LIZJ(Fragment fragment, ProfileBgInfo profileBgInfo, boolean z, View view) {
        ProfileBgVideoInfo videoInfo;
        Aweme awemeInfo;
        Video video;
        VideoUrlModel h264PlayAddr;
        List<String> urlList;
        String str;
        String str2;
        int i;
        List<String> urlList2;
        List<String> urlList3;
        C19EG activity = fragment.getActivity();
        if (activity == null || profileBgInfo == null || (videoInfo = profileBgInfo.getVideoInfo()) == null || (awemeInfo = videoInfo.getAwemeInfo()) == null || (video = awemeInfo.getVideo()) == null) {
            return;
        }
        VideoUrlModel playAddr = video.getPlayAddr();
        if ((playAddr == null || (urlList3 = playAddr.getUrlList()) == null || (str = (String) C13LP.LJJJLL(urlList3)) == null) && ((h264PlayAddr = video.getH264PlayAddr()) == null || (urlList = h264PlayAddr.getUrlList()) == null || (str = (String) C13LP.LJJJLL(urlList)) == null)) {
            return;
        }
        UrlModel cover = video.getCover();
        if (cover != null && (urlList2 = cover.getUrlList()) != null) {
            str2 = (String) C13LP.LJJJLL(urlList2);
        } else {
            str2 = null;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        Intent intent = new Intent(activity, (Class<?>) ProfileBgVideoPreviewActivity.class);
        String aid = awemeInfo.getAid();
        if (aid != null) {
            str3 = aid;
        }
        intent.putExtra("extra_video_id", str3);
        intent.putExtra("extra_video_play_url", str);
        intent.putExtra("extra_video_cover_url", str2);
        intent.putExtra("extra_video_width", video.getWidth());
        intent.putExtra("extra_video_height", video.getHeight());
        if (z) {
            i = 3;
        } else {
            i = 2;
        }
        intent.putExtra("extra_video_preview_mode", i);
        C1701330uNH.LIZ(intent, fragment);
        C2204961BRm.LLJL(fragment, intent, 2003, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mc5PPyDR0YS/W5tRD6dbMEWdMYHJRyKay/33zUukwnlz8Tr36138427tN/1+FMEzobUfpa3e0mKkwMAc=", null));
    }
}
