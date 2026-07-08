package X;

import com.ss.android.ugc.aweme.internalshare.api.experiment.SharePanelOperationDelayStrategy;

/* JADX INFO: renamed from: X.0lYM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362240lYM {
    public static final SharePanelOperationDelayStrategy LIZ;
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;

    static {
        SharePanelOperationDelayStrategy sharePanelOperationDelayStrategy = new SharePanelOperationDelayStrategy(0, 0);
        SharePanelOperationDelayStrategy sharePanelOperationDelayStrategy2 = (SharePanelOperationDelayStrategy) C0C64.LJIILLIIL().LJJII(SharePanelOperationDelayStrategy.class, sharePanelOperationDelayStrategy, "share_panel_operation_delay_strategy", true);
        if (sharePanelOperationDelayStrategy2 != null) {
            sharePanelOperationDelayStrategy = sharePanelOperationDelayStrategy2;
        }
        LIZ = sharePanelOperationDelayStrategy;
    }
}
