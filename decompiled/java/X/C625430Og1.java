package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt;

/* JADX INFO: renamed from: X.0Og1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C625430Og1 {
    public static final boolean LIZ(Aweme aweme) {
        if (!C297220Bku.LIZ() || aweme == null) {
            return false;
        }
        if ((!C0NIZ.LIZJ(aweme) && AwemeBizOptExtKt.getAwemeCacheType(aweme) != 3) || !C0NIZ.LIZIZ(aweme) || C0NIZ.LIZ(aweme)) {
            return false;
        }
        C01GW c01gw = C625420Og0.LIZ;
        if (C625420Og0.LIZLLL || C625420Og0.LJIIIIZZ().getBoolean("reach_bottom_guide_clicked", false) || C625420Og0.LJIIIIZZ().getInt("reach_bottom_guide_show_count", 0) >= 3) {
            return false;
        }
        Integer num = (Integer) C13LP.LJJLIIIJLJLI(C624670Oen.LJ());
        if (num != null) {
            if (C625420Og0.LIZ() >= num.intValue()) {
                return false;
            }
        }
        return true;
    }
}
