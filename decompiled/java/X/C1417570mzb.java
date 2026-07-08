package X;

import android.app.Application;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.service.IMusicNameService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: renamed from: X.0mzb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417570mzb {
    public static final String LIZ(AVMusic aVMusic) {
        String strLIZ;
        MusicModel musicModelLIZ = C389120FNm.LIZ(aVMusic);
        Application application = C0CHQ.LIZ;
        if (application == null) {
            return aVMusic.musicName;
        }
        IMusicNameService iMusicNameService = (IMusicNameService) PluggableExtentionKt.pluggableSpi$default(IMusicNameService.class, false, false, false, 14, null);
        if (iMusicNameService == null || (strLIZ = iMusicNameService.LIZ(application, musicModelLIZ)) == null) {
            return aVMusic.musicName;
        }
        return strLIZ;
    }
}
