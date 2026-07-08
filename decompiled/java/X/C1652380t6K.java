package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0t6K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1652380t6K {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(ShortVideoContext shortVideoContext) {
        int i;
        AVMusic aVMusicExtractAVMusic;
        if (!C1458070o2v.LJFF() || !C1458070o2v.LJ(shortVideoContext.creativeModel.musicBuzModel) || (i = shortVideoContext.shootMode) == 16 || i == 29 || (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel)) == null) {
            return false;
        }
        long jLIZIZ = C579120MnW.LIZIZ(aVMusicExtractAVMusic);
        if (!aVMusicExtractAVMusic.isUnlimitedMusic() && C1458070o2v.LIZLLL() < jLIZIZ) {
            return false;
        }
        return true;
    }
}
