package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.post.mode.debug.IPostModeDebugService;

/* JADX INFO: renamed from: X.0BhZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C295150BhZ {
    public static final C295150BhZ LIZ = new C295150BhZ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C295140BhY());

    public static boolean LIZ() {
        if (((Number) LIZIZ.getValue()).intValue() != 0) {
            return true;
        }
        IPostModeDebugService iPostModeDebugService = (IPostModeDebugService) PluggableExtentionKt.pluggableSpi$default(IPostModeDebugService.class, false, false, false, 14, null);
        if (iPostModeDebugService == null) {
            return false;
        }
        iPostModeDebugService.LIZ();
        return false;
    }
}
