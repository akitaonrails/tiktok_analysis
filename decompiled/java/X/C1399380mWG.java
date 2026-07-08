package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: renamed from: X.0mWG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1399380mWG {
    public static String LIZ(MusicDetail musicDetail) {
        boolean z;
        Music music;
        UrlModel playUrl;
        List<String> urlList;
        User currentUser;
        Music music2 = musicDetail.music;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null && currentUser.isHideShootButton()) {
            return "no_shoot_authority";
        }
        if (musicDetail.isFromCache && music2 != null && !music2.isShootingAllowed()) {
            return "music_unshelve";
        }
        Music music3 = musicDetail.music;
        if (music3 != null && music3.getMusicStatus() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (music = musicDetail.music) == null || (playUrl = music.getPlayUrl()) == null || (urlList = playUrl.getUrlList()) == null || !(!urlList.isEmpty())) {
            C629940OnI c629940OnI = C629940OnI.LIZ;
            Music music4 = musicDetail.music;
            c629940OnI.getClass();
            if (!C629940OnI.LIZ(music4)) {
                return "other";
            }
        }
        if (music2 != null && !music2.isCanNotReuse()) {
            if (!C142I.LIZ(music2.convertToMusicModel(), null, false)) {
                C629940OnI.LIZ.getClass();
                if (!C629940OnI.LIZ(music2)) {
                    return "other";
                }
            }
            if (C630880Ooo.LIZ(musicDetail).getShootAction() == EnumC1850200yFO.BANNED) {
                return "commerce_filter";
            }
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "hide_action_button_on_music_detail", true, false)) {
                return null;
            }
            return "ab_reason";
        }
        return "model_private";
    }

    public static String LIZIZ(MusicAwemeList musicAwemeList) {
        int i;
        List<String> list;
        if (musicAwemeList != null && (list = musicAwemeList.supplementItemIds) != null && !list.isEmpty()) {
            i = 0;
        } else {
            i = 1;
        }
        return String.valueOf(i ^ 1);
    }
}
