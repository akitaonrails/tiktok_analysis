package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import java.util.LinkedHashMap;
import java.util.Map;
import lth.o;

/* JADX INFO: renamed from: X.0MnW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C579120MnW {
    public static final Map<String, Integer> LIZ = new LinkedHashMap();

    public static long LIZIZ(AVMusic aVMusic) {
        int duration;
        if (aVMusic.getPresenterDuration() > 0) {
            duration = aVMusic.getPresenterDuration();
        } else {
            duration = aVMusic.getDuration();
        }
        long j = duration;
        if (aVMusic.getMusicEndFromCut() > 0) {
            return Math.min(j, Math.min(aVMusic.getTrimmedMusicDuration(), aVMusic.getMusicEndFromCut() - aVMusic.getMusicStartFromCut()));
        }
        if (!aVMusic.isNeedReuse()) {
            return j;
        }
        return Math.min(j, aVMusic.getTrimmedMusicDuration());
    }

    public static final long LIZ(AVMusic aVMusic, String str) {
        int musicDuration;
        if (aVMusic.getPresenterDuration() > 0) {
            musicDuration = aVMusic.getPresenterDuration();
        } else {
            musicDuration = o.LJI.getMusicDuration(str);
        }
        long j = musicDuration;
        if (C579130MnX.LIZ() && aVMusic.isNeedReuse()) {
            return Math.min(j, aVMusic.getTrimmedMusicDuration());
        }
        return j;
    }
}
