package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import lth.o;

/* JADX INFO: renamed from: X.0nkV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446650nkV {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZJ() {
        C19292410dm currentUser;
        return (C0CHQ.LIZ().getAccountService().LIZ() || (currentUser = o.LJIIZILJ.getCurrentUser()) == null || currentUser.LJIIIIZZ() <= 0) ? false : true;
    }

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        String musicId;
        if (videoPublishEditModel != null) {
            musicId = videoPublishEditModel.getMusicId();
        } else {
            musicId = null;
        }
        if (TextUtils.isEmpty(musicId) || videoPublishEditModel == null || !videoPublishEditModel.isCommerceMusic()) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        String musicId;
        if (videoPublishEditModel != null) {
            musicId = videoPublishEditModel.getMusicId();
        } else {
            musicId = null;
        }
        if (!TextUtils.isEmpty(musicId)) {
            if (videoPublishEditModel != null) {
                if (!videoPublishEditModel.isCommerceMusic() && !videoPublishEditModel.isOriginalSound()) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        MusicBuzModel musicBuzModel;
        CreativeModel creativeModel;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null) {
            musicBuzModel = creativeModel.musicBuzModel;
        } else {
            musicBuzModel = null;
        }
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
        if ((videoPublishEditModel == null || !videoPublishEditModel.realHasOriginalSound()) && aVMusicExtractAVMusic != null && !aVMusicExtractAVMusic.isOriginalSound()) {
            return false;
        }
        return true;
    }
}
