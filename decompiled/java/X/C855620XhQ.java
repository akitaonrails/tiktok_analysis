package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.csi.ISearchCSIService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XhQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C855620XhQ {
    public static final /* synthetic */ C855620XhQ LIZ = new C855620XhQ();
    public static volatile String LIZIZ;

    public static void LIZ(String str) {
        ISearchCSIService iSearchCSIService;
        if (LIZIZ(LIZIZ) && (iSearchCSIService = (ISearchCSIService) PluggableExtentionKt.pluggableSpi$default(ISearchCSIService.class, false, false, false, 14, null)) != null) {
            iSearchCSIService.LIZLLL(str);
        }
        LIZIZ = null;
    }

    public static boolean LIZIZ(String str) {
        if (!Intrinsics.LJFF(str, "educate_phase_iii") && !Intrinsics.LJFF(str, "educate_phase_iii_feedback") && !Intrinsics.LJFF(str, "mt_help_post_card_search")) {
            return false;
        }
        return true;
    }
}
