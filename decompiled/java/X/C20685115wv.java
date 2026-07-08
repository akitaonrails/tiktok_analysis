package X;

import com.ss.android.ugc.aweme.texttoimage.track.IText2ImageMobTrackExtension;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.15wv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20685115wv {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C20685315wx());

    public static void LIZ(String str, Map map) {
        if (map == null) {
            return;
        }
        for (IText2ImageMobTrackExtension iText2ImageMobTrackExtension : (Set) LIZ.getValue()) {
            if (iText2ImageMobTrackExtension.LIZ(str)) {
                iText2ImageMobTrackExtension.LIZIZ(map);
            }
        }
    }
}
