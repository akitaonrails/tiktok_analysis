package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostActivityBadgeEnableSetting;

/* JADX INFO: renamed from: X.0bRR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973550bRR {
    public final C973540bRQ LIZ;
    public final C973540bRQ LIZIZ;

    public static boolean LIZ(Context context) {
        if (context == null || !CohostActivityBadgeEnableSetting.INSTANCE.isSupportDarkMode()) {
            return false;
        }
        return C011Z.LIZ.LJIJ(context);
    }

    public C973550bRR(C973540bRQ c973540bRQ, C973540bRQ c973540bRQ2) {
        this.LIZ = c973540bRQ;
        this.LIZIZ = c973540bRQ2;
    }
}
