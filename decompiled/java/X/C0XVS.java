package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.video.IPlayerManagerService;

/* JADX INFO: renamed from: X.0XVS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XVS {
    public static final void LIZ() {
        IPlayerManagerService iPlayerManagerService = (IPlayerManagerService) PluggableExtentionKt.pluggableSpi$default(IPlayerManagerService.class, false, false, false, 14, null);
        if (iPlayerManagerService != null) {
            iPlayerManagerService.LIZ();
        }
    }
}
