package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.model.MusicStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.music.MusicStickerModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ng9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1443950ng9 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(CreativeModel creativeModel) {
        if (!Intrinsics.LJFF(creativeModel.stickerModel.musicStickerEnterMethod, "music_tab") && !Intrinsics.LJFF(creativeModel.stickerModel.musicStickerEnterMethod, "top_switch")) {
            return creativeModel.stickerModel.musicStickerEnterMethod;
        }
        return "add_sound";
    }

    public static MusicStickerModel LIZ(CreativeModel creativeModel, int i, AVMusic aVMusic) {
        List<String> urlList;
        List<String> urlList2;
        List<String> urlList3;
        if (aVMusic == null) {
            aVMusic = MusicBeanUtilKt.extractAVMusic(creativeModel.musicBuzModel);
        }
        UrlModel urlModel = null;
        if (aVMusic == null || aVMusic.isLocalMusic() || aVMusic.isMemeSong()) {
            return null;
        }
        String musicId = aVMusic.getMusicId();
        String str = aVMusic.musicName;
        String str2 = aVMusic.authorName;
        UrlModel urlModel2 = aVMusic.coverLarge;
        if (urlModel2 != null && (urlList3 = urlModel2.getUrlList()) != null && C13LP.LJJJLL(urlList3) != null) {
            urlModel = aVMusic.coverLarge;
        } else {
            UrlModel urlModel3 = aVMusic.coverMedium;
            if (urlModel3 != null && (urlList2 = urlModel3.getUrlList()) != null && C13LP.LJJJLL(urlList2) != null) {
                urlModel = aVMusic.coverMedium;
            } else {
                UrlModel urlModel4 = aVMusic.coverThumb;
                if (urlModel4 != null && (urlList = urlModel4.getUrlList()) != null && C13LP.LJJJLL(urlList) != null) {
                    urlModel = aVMusic.coverThumb;
                }
            }
        }
        return C1443600nfa.LIZ(new MusicStickerStruct(musicId, str2, str, urlModel, Boolean.valueOf(aVMusic.isPgc()), i, LIZIZ(creativeModel)));
    }
}
