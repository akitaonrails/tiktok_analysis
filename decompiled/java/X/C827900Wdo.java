package X;

import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService;

/* JADX INFO: renamed from: X.0Wdo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C827900Wdo {
    public static InterfaceC827920Wdq LIZ;
    public static InterfaceC827910Wdp LIZIZ;

    public static InterfaceC827920Wdq LIZ() {
        if (!C2206241BWk.LIZIZ()) {
            return LIZ;
        }
        IKidsCommonService iKidsCommonService = (IKidsCommonService) PluggableExtentionKt.pluggableSpi(IKidsCommonService.class);
        return (iKidsCommonService == null || !((AccountUserService) C0XQ7.LJFF()).LIZ()) ? AbstractC827890Wdn.LIZIZ() : iKidsCommonService.LIZ();
    }
}
