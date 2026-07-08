package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Pb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19240510Pb {
    public static final C19240510Pb LIZ = new C19240510Pb();

    public static IPluginService.FeedRefreshData LIZ() {
        INewUserDebugService iNewUserDebugServiceLIZIZ;
        C0TA0 currentPluginData;
        IPluginService.PluginDataWrapper value;
        IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        IPluginService.FeedRefreshData feedRefreshData = (iPluginService == null || (currentPluginData = iPluginService.getCurrentPluginData(EnumC19241510Pl.FEED_REFRESH_DATA)) == null || (value = currentPluginData.getValue()) == null) ? null : value.feedRefreshData;
        C1865740yeS.LIZ.getClass();
        if (C1865740yeS.LIZ() && (iNewUserDebugServiceLIZIZ = C1865740yeS.LIZIZ()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("feedRefreshData shouldRefreshFeedAfterAgeGate=");
            sbLIZ.append(feedRefreshData != null ? feedRefreshData.shouldRefreshFeedAfterAgeGate : null);
            sbLIZ.append(", refreshCondition=");
            sbLIZ.append(feedRefreshData != null ? feedRefreshData.refreshCondition : null);
            iNewUserDebugServiceLIZIZ.LJI("SignalMarker_KMP", C2188811AlT.LIZIZ(sbLIZ));
        }
        return feedRefreshData;
    }

    public static boolean LIZIZ() {
        Integer num;
        IPluginService.FeedRefreshData feedRefreshDataLIZ = LIZ();
        return feedRefreshDataLIZ != null && Intrinsics.LJFF(feedRefreshDataLIZ.shouldRefreshFeedAfterAgeGate, Boolean.TRUE) && (num = feedRefreshDataLIZ.refreshCondition) != null && num.intValue() == 1;
    }

    public static boolean LIZJ() {
        Integer num;
        IPluginService.FeedRefreshData feedRefreshDataLIZ = LIZ();
        return feedRefreshDataLIZ != null && Intrinsics.LJFF(feedRefreshDataLIZ.shouldRefreshFeedAfterAgeGate, Boolean.TRUE) && (num = feedRefreshDataLIZ.refreshCondition) != null && num.intValue() == 2;
    }
}
