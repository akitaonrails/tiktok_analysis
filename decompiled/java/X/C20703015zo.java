package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.ICaptionKevaService;

/* JADX INFO: renamed from: X.15zo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20703015zo {
    public static final C20703015zo LIZ = new C20703015zo();

    public static boolean LIZ(Aweme aweme, boolean z, boolean z2, boolean z3) {
        if (aweme == null || !C0A7T.LIZ() || !C293260BeW.LIZ() || z3 || z2 || z || C2179771ASp.LJIIIIZZ() > 0.13d) {
            return false;
        }
        Integer numLJIILL = C20703515zt.LJIILL(aweme);
        if (numLJIILL != null && numLJIILL.intValue() <= 20000) {
            return false;
        }
        C20703515zt.LIZ.getClass();
        if (C20703515zt.LJJIIZI(aweme, null)) {
            return false;
        }
        ICaptionKevaService iCaptionKevaService = (ICaptionKevaService) ServiceManager.get().getService(ICaptionKevaService.class);
        if (iCaptionKevaService.LIZ()) {
            return false;
        }
        int iLJIILIIL = iCaptionKevaService.LJIILIIL();
        long jLJJLIIIJLLLLLLLZ = iCaptionKevaService.LJJLIIIJLLLLLLLZ();
        if (iLJIILIIL < 2) {
            if (System.currentTimeMillis() - jLJJLIIIJLLLLLLLZ < C20703215zq.LIZ) {
                return false;
            }
            return true;
        }
        if (System.currentTimeMillis() - jLJJLIIIJLLLLLLLZ < C20703215zq.LIZIZ) {
            return false;
        }
        return true;
    }
}
