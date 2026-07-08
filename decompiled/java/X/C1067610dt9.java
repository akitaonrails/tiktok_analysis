package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;

/* JADX INFO: renamed from: X.0dt9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1067610dt9 {
    public static final C0PSA LIZ;

    static {
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        LIZ = iLiveOuterService != null ? iLiveOuterService.Q3() : null;
    }
}
