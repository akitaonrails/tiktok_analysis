package Y;

import X.C0CNO;
import X.C0N5P;
import X.C0VWW;
import X.C15O7;
import X.C1C7U;
import X.C20508081q;
import X.C20684815ws;
import X.C2097608Jq;
import X.C306590C0b;
import X.C625470Og5;
import X.C625530OgB;
import X.C632130Oqp;
import X.InterfaceC625570OgF;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.cache.CacheManager;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import java.util.Queue;
import java.util.concurrent.Future;
import kotlin.Pair;
import kotlin.jvm.internal.AwS158S1100000_9;

/* JADX INFO: loaded from: classes10.dex */
public class ARunnableS5S1000000_9 implements Runnable {
    public final int $t;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C625530OgB.LIZ.getClass();
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = C625530OgB.LIZLLL();
        IAccountUserService iAccountUserService = C625530OgB.LIZLLL;
        String curSecUserId = iAccountUserService.getCurSecUserId();
        if (curSecUserId != null) {
            long jLJI = C625530OgB.LJI();
            C625470Og5.LL.getClass();
            Float fLJJIJ = interfaceC625570OgFLIZLLL.LJJIJ(jLJI, C625470Og5.LLILZIL, curSecUserId);
            if (fLJJIJ != null) {
                String str = this.s0;
                float fFloatValue = fLJJIJ.floatValue() - 1.0E-4f;
                InterfaceC625570OgF interfaceC625570OgFLIZLLL2 = C625530OgB.LIZLLL();
                String curSecUserId2 = iAccountUserService.getCurSecUserId();
                if (curSecUserId2 != null) {
                    interfaceC625570OgFLIZLLL2.LJIJJLI(fFloatValue, curSecUserId2, str);
                }
            }
        }
    }

    public final void LIZ$1() {
        INetworkStateService iNetworkStateService = (INetworkStateService) ServiceManager.get().getService(INetworkStateService.class);
        C20684815ws.LJIILLIIL("network_toast_show", C2097608Jq.LJIIIIZZ(new Pair("network_status", String.valueOf(iNetworkStateService != null ? iNetworkStateService.getEffectiveConnectionType() : -2)), new Pair("toast_content", this.s0)));
    }

    public ARunnableS5S1000000_9(int i) {
        this.$t = i;
        this.s0 = "optimize_firstonlayout";
    }

    public static final void run$0(ARunnableS5S1000000_9 aRunnableS5S1000000_9) {
        boolean zLIZ;
        MusicDetail musicDetail;
        C1C7U.LIZ("MDPPreloadHelper@3678.executeMusicDetailPreload$3");
        try {
            Future<MusicDetail> future = C632130Oqp.LJ;
            if (future != null) {
                musicDetail = future.get();
            } else {
                musicDetail = null;
            }
            C632130Oqp.LIZLLL = musicDetail;
            if (C306590C0b.LIZ() > 0) {
                CacheManager cacheManager = CacheManager.LIZ;
                String str = aRunnableS5S1000000_9.s0;
                MusicDetail musicDetail2 = C632130Oqp.LIZLLL;
                cacheManager.getClass();
                C0CNO.LIZ(C15O7.LJI, new AwS158S1100000_9(str, musicDetail2, 18));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MDPPreloadHelper@3678.executeMusicDetailPreload$3");
    }

    public static final void run$1(ARunnableS5S1000000_9 aRunnableS5S1000000_9) {
        String str = aRunnableS5S1000000_9.s0;
        C1C7U.LIZ("ChoreographerUtils@308a.postToCommit$2L");
        Queue<Runnable> queue = C20508081q.LIZIZ.get(str);
        if (queue != null) {
            while (!queue.isEmpty()) {
                Runnable runnablePoll = queue.poll();
                if (runnablePoll != null) {
                    runnablePoll.run();
                }
            }
        }
        C1C7U.LIZIZ("ChoreographerUtils@308a.postToCommit$2L");
    }

    public static final void run$2(ARunnableS5S1000000_9 aRunnableS5S1000000_9) {
        boolean zLIZ;
        C1C7U.LIZ("OfflineModeDBManager@97fc.updateConsumedVideoScore$1");
        try {
            aRunnableS5S1000000_9.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OfflineModeDBManager@97fc.updateConsumedVideoScore$1");
    }

    public static final void run$3(ARunnableS5S1000000_9 aRunnableS5S1000000_9) {
        String str = aRunnableS5S1000000_9.s0;
        C1C7U.LIZ("StartupJankOptEntry@3e83.onStartupJankStart$3L");
        C0VWW.LIZIZ(str);
        C1C7U.LIZIZ("StartupJankOptEntry@3e83.onStartupJankStart$3L");
    }

    public static final void run$4(ARunnableS5S1000000_9 aRunnableS5S1000000_9) {
        boolean zLIZ;
        C1C7U.LIZ("DoFrameBalancer@53c3.stop$1");
        try {
            C0N5P c0n5p = C0N5P.LIZ;
            C0N5P.LJ(aRunnableS5S1000000_9.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DoFrameBalancer@53c3.stop$1");
    }

    public static final void run$5(ARunnableS5S1000000_9 aRunnableS5S1000000_9) {
        boolean zLIZ;
        C1C7U.LIZ("MobToastUtils@e39e.onEvent$1$1");
        try {
            aRunnableS5S1000000_9.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MobToastUtils@e39e.onEvent$1$1");
    }

    public ARunnableS5S1000000_9(String str, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 2:
            case 4:
            case 5:
                this.s0 = str;
                break;
            case 1:
            case 3:
            default:
                this.s0 = str;
                break;
        }
    }
}
