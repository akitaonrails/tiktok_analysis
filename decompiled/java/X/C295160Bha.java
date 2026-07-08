package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.post.mode.debug.IPostModeDebugService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Bha, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C295160Bha extends C09AY implements Function0<Integer> {
    public C295160Bha() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        IPostModeDebugService iPostModeDebugService;
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "post_mode_single_activity_final", true);
        if (iLJIJ == 0 && (iPostModeDebugService = (IPostModeDebugService) PluggableExtentionKt.pluggableSpi$default(IPostModeDebugService.class, false, false, false, 14, null)) != null) {
            iPostModeDebugService.LIZ();
        }
        return Integer.valueOf(iLJIJ);
    }
}
