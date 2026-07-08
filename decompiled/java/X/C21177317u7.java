package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesAdService;

/* JADX INFO: renamed from: X.17u7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21177317u7 {
    public static final /* synthetic */ C21177317u7 LIZ = new C21177317u7();

    public static boolean LIZ(Aweme aweme) {
        ISeriesAdService iSeriesAdService;
        if (aweme == null || (iSeriesAdService = (ISeriesAdService) PluggableExtentionKt.pluggableSpi$default(ISeriesAdService.class, false, false, false, 14, null)) == null || !iSeriesAdService.LIZ(aweme)) {
            return false;
        }
        return true;
    }
}
