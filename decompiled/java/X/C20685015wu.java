package X;

import com.ss.android.ugc.aweme.explore.track.IExploreMobTrackExtension;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.15wu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20685015wu {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C20685215ww());

    public static void LIZ(String str, Map map) {
        if (map == null) {
            return;
        }
        for (IExploreMobTrackExtension iExploreMobTrackExtension : (Set) LIZ.getValue()) {
            if (iExploreMobTrackExtension.LIZLLL(str, map)) {
                iExploreMobTrackExtension.LIZ(str, map);
            }
        }
    }
}
