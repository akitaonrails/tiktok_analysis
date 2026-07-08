package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.text.u;
import lth.o;

/* JADX INFO: renamed from: X.0nmc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1447960nmc {
    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        MusicBuzModel musicBuzModel;
        CreativeModel creativeModel;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null) {
            musicBuzModel = creativeModel.musicBuzModel;
        } else {
            musicBuzModel = null;
        }
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
        if (aVMusicExtractAVMusic != null && aVMusicExtractAVMusic.isPreventDownload()) {
            InterfaceC1420020n3Y interfaceC1420020n3Y = o.LJFF;
            if (u.LJIJI("JP", C20186013yc.LIZ(), true) && o.LJIJJLI != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        MusicBuzModel musicBuzModel;
        CreativeModel creativeModel;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null) {
            musicBuzModel = creativeModel.musicBuzModel;
        } else {
            musicBuzModel = null;
        }
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
        o.LJIJJLI.getClass();
        return C621180OYa.LIZ.LJIIIIZZ(aVMusicExtractAVMusic, str);
    }
}
