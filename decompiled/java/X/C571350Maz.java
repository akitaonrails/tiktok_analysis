package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Maz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571350Maz {
    public static boolean LIZ(AVMusic aVMusic) {
        if (aVMusic == null || !C1458570o3j.LIZ(aVMusic)) {
            return false;
        }
        List<AVMusic> extendMusicList = aVMusic.getExtendMusicList();
        if (extendMusicList != null) {
            Iterator<AVMusic> it2 = extendMusicList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AVMusic next = it2.next();
                if (!C1458570o3j.LIZ(next)) {
                    if (next == null) {
                        break;
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
