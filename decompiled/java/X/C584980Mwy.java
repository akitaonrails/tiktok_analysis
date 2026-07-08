package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: renamed from: X.0Mwy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C584980Mwy {
    public static boolean LIZ(Aweme aweme) {
        if (((Boolean) C2264471DkD.LJIIIZ.getValue()).booleanValue()) {
            return C1010120cOQ.LJIJI(aweme);
        }
        if (AwemeExtKt.isAdTraffic(aweme) && C1010120cOQ.LJIJI(aweme)) {
            return true;
        }
        return false;
    }
}
