package X;

import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.assem.MusicFavoriteButtonAssem;

/* JADX INFO: renamed from: X.0Ooe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630780Ooe {
    public static C630790Oof LIZ(MusicDetail musicDetail) {
        Music music = musicDetail.music;
        if (music == null) {
            return C630790Oof.NONE;
        }
        MusicFavoriteButtonAssem.LLJLIL.getClass();
        return new C630790Oof(music.isPgc(), music.getPreviewPageShowMode(), !C630880Ooo.LIZ(musicDetail).getEnableNormalUiElements());
    }
}
