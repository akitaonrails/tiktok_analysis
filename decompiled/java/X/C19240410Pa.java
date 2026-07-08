package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Pa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19240410Pa {
    public static final C19240410Pa LIZ = new C19240410Pa();

    public static IPluginService.FeedRefreshData LIZ() {
        C0TA0 currentPluginData;
        IPluginService.PluginDataWrapper value;
        IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (iPluginService == null || (currentPluginData = iPluginService.getCurrentPluginData(EnumC19241510Pl.FEED_REFRESH_DATA)) == null || (value = currentPluginData.getValue()) == null) {
            return null;
        }
        return value.feedRefreshData;
    }

    public static boolean LIZIZ() {
        IPluginService.FeedRefreshData feedRefreshDataLIZ;
        Integer num;
        IPluginService.FeedRefreshData feedRefreshDataLIZ2 = LIZ();
        return (feedRefreshDataLIZ2 == null || !Intrinsics.LJFF(feedRefreshDataLIZ2.shouldRefreshFeedAfterAgeGate, Boolean.TRUE) || (feedRefreshDataLIZ = LIZ()) == null || (num = feedRefreshDataLIZ.refreshCondition) == null || num.intValue() != 2) ? false : true;
    }

    public static boolean LIZJ() {
        IPluginService.FeedRefreshData feedRefreshDataLIZ;
        Integer num;
        IPluginService.FeedRefreshData feedRefreshDataLIZ2 = LIZ();
        return (feedRefreshDataLIZ2 == null || !Intrinsics.LJFF(feedRefreshDataLIZ2.shouldRefreshFeedAfterAgeGate, Boolean.TRUE) || (feedRefreshDataLIZ = LIZ()) == null || (num = feedRefreshDataLIZ.refreshCondition) == null || num.intValue() != 1) ? false : true;
    }

    public static boolean LIZLLL() {
        return LIZJ() || LIZIZ();
    }
}
