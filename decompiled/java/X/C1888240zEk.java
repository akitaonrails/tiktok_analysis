package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.tns.commentsafety.ICommentSafetyDepService;

/* JADX INFO: renamed from: X.0zEk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1888240zEk {
    public static boolean LIZ() {
        ICommentSafetyDepService iCommentSafetyDepService;
        boolean z = C1888220zEi.LIZIZ.LJIIL() && ((iCommentSafetyDepService = (ICommentSafetyDepService) PluggableExtentionKt.pluggableSpi$default(ICommentSafetyDepService.class, false, false, false, 14, null)) == null || !iCommentSafetyDepService.LIZJ());
        ICommentSafetyDepService iCommentSafetyDepService2 = (ICommentSafetyDepService) PluggableExtentionKt.pluggableSpi$default(ICommentSafetyDepService.class, false, false, false, 14, null);
        return z || (iCommentSafetyDepService2 != null && iCommentSafetyDepService2.LIZIZ());
    }
}
