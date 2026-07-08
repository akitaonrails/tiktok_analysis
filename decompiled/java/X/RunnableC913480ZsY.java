package X;

import com.ss.android.ugc.aweme.im.saas.host.api.feed.IMCommonFeedBridgeApi;

/* JADX INFO: renamed from: X.0ZsY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class RunnableC913480ZsY implements Runnable {
    public static final RunnableC913480ZsY LL = new RunnableC913480ZsY();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("CreateGroupShare@19b7.shareEndEventRunnable$1");
        try {
            IMCommonFeedBridgeApi.LIZ.getClass();
            IMCommonFeedBridgeApi value = C913490ZsZ.LIZIZ.getValue();
            if (value != null) {
                value.LIZ();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CreateGroupShare@19b7.shareEndEventRunnable$1");
    }
}
