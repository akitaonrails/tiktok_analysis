package X;

import com.bytedance.android.livesdk.livesetting.linkmic.cohost.InteractionSourceTypeWhiteList;

/* JADX INFO: renamed from: X.0azF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C956070azF {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Integer num) {
        if (num == null) {
            return true;
        }
        if (num.intValue() != C955540ayO.LJJJ.LIZ) {
            if (num.intValue() != C955540ayO.LJJJI.LIZ && !InteractionSourceTypeWhiteList.INSTANCE.skipOpenPanel(num.intValue())) {
                return true;
            }
            return false;
        }
        return false;
    }
}
