package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0P0I, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P0I {
    public static final Map<String, Music> LIZ = new LinkedHashMap();

    public static void LIZ(MusicModel musicModel, C0P0F c0p0f) {
        String bindChallengeId;
        Music music;
        String musicId = musicModel.getMusicId();
        if (musicId != null && musicId.length() != 0) {
            String bindChallengeId2 = musicModel.getBindChallengeId();
            if (bindChallengeId2 == null || bindChallengeId2.length() == 0 || ((bindChallengeId = musicModel.getBindChallengeId()) != null && bindChallengeId.equals(CardStruct.IStatusCode.DEFAULT))) {
                c0p0f.LIZ(musicModel);
                return;
            }
            if (musicModel.getMusic() != null && (music = musicModel.getMusic()) != null && music.getChallenge() != null) {
                LIZ.put(musicModel.getMusicId(), musicModel.getMusic());
                c0p0f.LIZ(musicModel);
                return;
            } else {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0P0H(c0p0f, musicModel, null), 3);
                return;
            }
        }
        c0p0f.LIZ(musicModel);
    }
}
