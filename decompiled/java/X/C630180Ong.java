package X;

import android.content.Context;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import kotlin.text.u;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Ong, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630180Ong {
    public static boolean LIZIZ(Music music) {
        boolean z;
        boolean zIsOriginMusic = music.isOriginMusic();
        boolean zLIZ = C123100dR.LIZ(music.getOwnerId());
        if (C703302op.LIZ(music.getExtra()) && new JSONObject(music.getExtra()).optInt("has_edited") == 1) {
            z = true;
        } else {
            z = false;
        }
        if (music.isMemeSong() || zIsOriginMusic || !zLIZ || z) {
            return false;
        }
        String ownerId = music.getOwnerId();
        if (!C2093608Ic.LJ(ownerId) && C2093608Ic.LIZJ(ownerId, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(MusicDetail musicDetail) {
        Music music = musicDetail.music;
        if (music == null || !C298510Bmz.LIZ() || C630310Ont.LIZIZ(music) || music.getMusicStatus() == 0 || !C630880Ooo.LIZ(musicDetail).getEnableNormalUiElements()) {
            return false;
        }
        return true;
    }

    public static String LIZ(Context context, Music music) {
        boolean zIsOriginMusic = music.isOriginMusic();
        boolean zLIZ = C123100dR.LIZ(music.getOwnerId());
        String musicName = music.getMusicName();
        if (musicName == null) {
            musicName = "";
        }
        if (!zIsOriginMusic) {
            if (zLIZ) {
                if (!music.isMatchMetadata() && u.LJJIIJZLJL(musicName, e3.g, false)) {
                    return musicName.substring(1);
                }
            } else {
                return musicName;
            }
        } else if (!zLIZ) {
            return musicName;
        }
        if (!C703302op.LIZ(music.getExtra()) || new JSONObject(music.getExtra()).optInt("has_edited") == 1 || music.isMemeSong()) {
            return musicName;
        }
        return context.getString(2131839044);
    }
}
