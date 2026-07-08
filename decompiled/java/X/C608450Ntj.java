package X;

import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ntj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C608450Ntj {
    public static final C608450Ntj LIZ = new C608450Ntj();

    public static boolean LIZ(Aweme aweme) {
        User author;
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            return !C2105908Mv.LIZ(author.getUid());
        }
        return false;
    }

    public static boolean LIZIZ(Aweme aweme) {
        User author;
        UrlModel avatarThumb;
        if (aweme != null && (author = aweme.getAuthor()) != null && (avatarThumb = author.getAvatarThumb()) != null && !C438710HIf.LIZ(avatarThumb).isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(Aweme aweme) {
        if (aweme != null && aweme.getMusic() != null && !C2105908Mv.LIZ(aweme.getMusic().getIdStr())) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(Aweme aweme) {
        Music music;
        UrlModel coverThumb;
        if (aweme != null && (music = aweme.getMusic()) != null && (coverThumb = music.getCoverThumb()) != null && !C438710HIf.LIZ(coverThumb).isEmpty()) {
            return true;
        }
        return false;
    }

    public static int LJ(Aweme aweme, boolean z, VideoItemParams videoItemParams) {
        String uid;
        String nickname;
        if (!C0BAK.LIZ() && z) {
            return 0;
        }
        if (aweme != null) {
            if (aweme.getAuthor() == null) {
                return 2;
            }
            User author = aweme.getAuthor();
            String uniqueId = null;
            if (author != null) {
                uid = author.getUid();
            } else {
                uid = null;
            }
            if (C2105908Mv.LIZ(uid)) {
                return 3;
            }
            User author2 = aweme.getAuthor();
            if (author2 != null) {
                nickname = author2.getNickname();
            } else {
                nickname = null;
            }
            if (C2105908Mv.LIZ(nickname)) {
                return 4;
            }
            User author3 = aweme.getAuthor();
            if (author3 != null) {
                uniqueId = author3.getUniqueId();
            }
            if (C2105908Mv.LIZ(uniqueId)) {
                return 5;
            }
            if (C0BAK.LIZ()) {
                VideoAuthorInfoRelationAssem.LLLLLLLLL.getClass();
                if (Intrinsics.LJFF(C717700SDg.LIZIZ(C717700SDg.LIZ(videoItemParams)), Boolean.TRUE)) {
                    return 6;
                }
            }
            if (C0BAK.LIZ() && z) {
                return 0;
            }
            return 1;
        }
        return 1;
    }

    public static void LJFF(String str, boolean z, Aweme aweme, boolean z2, boolean z3) {
        ImageUrlModel imageUrlModelLIZ;
        int i;
        UrlModel coverThumb;
        String str2;
        if (aweme == null) {
            return;
        }
        C0NET c0net = C0NET.LIZ;
        String aid = aweme.getAid();
        c0net.getClass();
        boolean zLJIIIIZZ = C0NET.LJIIIIZZ(aid);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LIZJ(zLJIIIIZZ ? 1 : 0, "cache");
        String imprId = null;
        if (z) {
            i = 0;
        } else {
            Music music = aweme.getMusic();
            if (music != null && (coverThumb = music.getCoverThumb()) != null) {
                imageUrlModelLIZ = C438710HIf.LIZ(coverThumb);
            } else {
                imageUrlModelLIZ = null;
            }
            if (aweme.getMusic() != null && !C2105908Mv.LIZ(aweme.getMusic().getIdStr())) {
                if (aweme.getMusic().getCoverThumb() != null && imageUrlModelLIZ != null && !imageUrlModelLIZ.isEmpty()) {
                    if (z2) {
                        i = 4;
                    } else {
                        i = 1;
                    }
                } else {
                    i = 3;
                }
            } else {
                i = 2;
            }
        }
        c2344009Gk.LIZJ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LJIIIIZZ("aid", aweme.getAid());
        LogPbBean logPbBean = aweme.getLogPbBean();
        if (logPbBean != null) {
            imprId = logPbBean.getImprId();
        }
        c2344009Gk.LJIIIIZZ("log_id", imprId);
        c2344009Gk.LIZJ(aweme.getAwemeType(), "aweme_type");
        if (z3) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_show", str2);
        Map<String, String> map = c2344009Gk.LIZ;
        C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("music_turntable_show=");
        sbLIZ.append(map);
        c2276471E8n.LIZIZ("common_feed", "FeedFiledMobForServerUtil", C2188811AlT.LIZIZ(sbLIZ));
        C20684815ws.LJIILLIIL("music_turntable_show", map);
    }
}
