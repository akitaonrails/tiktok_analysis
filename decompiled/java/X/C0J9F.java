package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.util.LiveBubbleUtil;
import com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0J9F, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J9F {
    public static final HashSet<C0J9E> LIZ = new HashSet<>();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0J9G());
    public static final C0J90 LIZJ = new C0J90();
    public static boolean LIZLLL;

    public static void LIZ() {
        HashSet<C0J9E> hashSet = LIZ;
        synchronized (hashSet) {
            try {
                for (C0J9E c0j9e : hashSet) {
                    if (c0j9e.isShowing()) {
                        c0j9e.LLZZ();
                    }
                }
                LIZ.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static String LIZIZ(boolean z) {
        C01GW c01gw = LIZIZ;
        if (((ILiveBubblePopService) c01gw.getValue()).LIZ()) {
            return "ad";
        }
        if (((ILiveBubblePopService) c01gw.getValue()).LIZJ()) {
            return "dialog";
        }
        if (((ILiveBubblePopService) c01gw.getValue()).LIZIZ()) {
            return "inner_push";
        }
        if (((ILiveBubblePopService) c01gw.getValue()).LIZLLL()) {
            return "video_guide";
        }
        if (z) {
            if (LIZLLL) {
                return "toplive_bubble_show";
            }
            LiveBubbleUtil.LIZ.getClass();
            if (LiveBubbleUtil.LJIJ) {
                return "operating_bubble_show";
            }
            return "";
        }
        return "";
    }
}
