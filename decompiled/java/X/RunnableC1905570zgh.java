package X;

import com.bytedance.android.livesdkapi.depend.model.live.bubble.LiveBubbleData;
import com.ss.android.ugc.aweme.feed.util.LiveBubbleUtil;

/* JADX INFO: renamed from: X.0zgh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class RunnableC1905570zgh implements Runnable {
    public static final RunnableC1905570zgh LL = new RunnableC1905570zgh();

    public static void LIZ() {
        if (!LiveBubbleUtil.LJIJI || LiveBubbleUtil.LJI == null) {
            return;
        }
        LiveBubbleUtil.LIZ.getClass();
        if (LiveBubbleUtil.LJIJ) {
            return;
        }
        LiveBubbleData liveBubbleData = LiveBubbleUtil.LJI;
        if (liveBubbleData == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        LiveBubbleUtil.LIZ(liveBubbleData);
        if (LiveBubbleUtil.LJ) {
            return;
        }
        LiveBubbleUtil.LJ = true;
        C1905610zgl.LJ("livesdk_back_homepage_stay");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LiveBubbleUtil@6424.showBubbleRunnable$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveBubbleUtil@6424.showBubbleRunnable$1");
    }
}
