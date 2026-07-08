package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.video.preload.PreloadSessionManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* JADX INFO: renamed from: X.0ofv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1482250ofv {
    public static int LIZ(VideoUrlModel videoUrlModel, String str) {
        LruCache<String, SimVideoUrlModel> lruCache = C1483340ohg.LIZ;
        if (C1478160oZK.LIZ().isCache(C1481230oeH.LJII(videoUrlModel))) {
            return C1483340ohg.LJIIIZ(videoUrlModel);
        }
        if (PreloadSessionManager.LIZIZ.LIZ(str) == null) {
            return -2;
        }
        return -1;
    }
}
