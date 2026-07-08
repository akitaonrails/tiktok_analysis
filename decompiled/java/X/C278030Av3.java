package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;

/* JADX INFO: renamed from: X.0Av3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C278030Av3 {
    public static final C278030Av3 LIZ = new C278030Av3();

    public static final boolean LIZ() {
        IToolsDebugGpService iToolsDebugGpService;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "smart_movie_keep_zip", true, false) && (iToolsDebugGpService = (IToolsDebugGpService) PluggableExtentionKt.pluggableSpi$default(IToolsDebugGpService.class, false, false, false, 14, null)) != null) {
            iToolsDebugGpService.isOpen();
        }
        return false;
    }
}
