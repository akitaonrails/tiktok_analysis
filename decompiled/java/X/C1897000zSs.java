package X;

import com.bytedance.touchpoint.core.pendant.feed.FeedTimerPendantManger;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import java.util.HashMap;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0zSs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1897000zSs {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static final C1897000zSs LIZ = new C1897000zSs();
    public static final HashMap<Integer, Boolean> LIZLLL = new HashMap<>();
    public static final HashMap<Integer, Boolean> LJ = new HashMap<>();

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDislikeAwemeEvent(C1372310lob c1372310lob) {
        if (c1372310lob.LIZ) {
            LIZIZ = true;
            C01GW<FeedTimerPendantManger> c01gw = FeedTimerPendantManger.LLJL;
            C1898700zVc c1898700zVc = C1893440zN8.LIZ().LLIZ;
            if (c1898700zVc != null) {
                C786410Ut5.j2(c1898700zVc, 8);
            }
            C01GW<SpecActPendantManager> c01gw2 = SpecActPendantManager.LLJJIJIIJIL;
            C1894330zOZ.LIZ().LJIIJJI().showOrHidePendant(false, false);
            return;
        }
        if (LIZJ || !LIZIZ) {
            return;
        }
        LIZIZ = false;
        C01GW<FeedTimerPendantManger> c01gw3 = FeedTimerPendantManger.LLJL;
        C1893440zN8.LIZ().LJJJZ();
        C01GW<SpecActPendantManager> c01gw4 = SpecActPendantManager.LLJJIJIIJIL;
        C1894330zOZ.LIZ().LJJIJL(true);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onFeedClearModeEvent(C714060Rzg c714060Rzg) {
        if (c714060Rzg.LIZ) {
            LIZJ = true;
            LIZIZ = true;
            C01GW<FeedTimerPendantManger> c01gw = FeedTimerPendantManger.LLJL;
            C1898700zVc c1898700zVc = C1893440zN8.LIZ().LLIZ;
            if (c1898700zVc != null) {
                C786410Ut5.j2(c1898700zVc, 8);
            }
            C01GW<SpecActPendantManager> c01gw2 = SpecActPendantManager.LLJJIJIIJIL;
            C1894330zOZ.LIZ().LJIIJJI().showOrHidePendant(false, false);
            return;
        }
        LIZJ = false;
        if (!LIZIZ) {
            return;
        }
        LIZIZ = false;
        C01GW<FeedTimerPendantManger> c01gw3 = FeedTimerPendantManger.LLJL;
        C1893440zN8.LIZ().LJJJZ();
        C01GW<SpecActPendantManager> c01gw4 = SpecActPendantManager.LLJJIJIIJIL;
        C1894330zOZ.LIZ().LJJIJL(true);
    }
}
