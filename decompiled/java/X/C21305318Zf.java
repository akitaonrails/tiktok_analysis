package X;

import Y.ARunnableS132S0100000_32;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastLogBlockIntervalConfig;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastLogBlockOpt;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastLogBlockTotalTime;
import com.bytedance.applog.util.BlockHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.18Zf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21305318Zf {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public long LJ;
    public final AtomicBoolean LJFF;
    public long LJI;
    public final C054G LJII;
    public final ARunnableS132S0100000_32 LJIIIIZZ;

    public C21305318Zf() {
        long jValue = LiveBroadcastLogBlockTotalTime.value();
        this.LIZ = jValue;
        long executeTime = LiveBroadcastLogBlockIntervalConfig.getExecuteTime();
        this.LIZIZ = executeTime;
        long blockTime = LiveBroadcastLogBlockIntervalConfig.getBlockTime();
        this.LIZJ = blockTime;
        this.LIZLLL = jValue / (executeTime + blockTime);
        this.LJ = jValue;
        this.LJFF = new AtomicBoolean(false);
        this.LJI = 100L;
        this.LJII = C2296808zG.LIZ(C0PEM.LIZJ.plus(new C21305218Ze(CoroutineExceptionHandler.LJJLIL, this)));
        this.LJIIIIZZ = new ARunnableS132S0100000_32(this, 13);
    }

    public final void LIZ() {
        if (LiveBroadcastLogBlockOpt.isStrategy1()) {
            this.LJ = Math.max(this.LIZ - 4000, 0L);
            C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.18Zg
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveBroadcastLogBlockHelper@ad4b.startBlockStrategy$1");
                    try {
                        BlockHelper.beginBlock();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveBroadcastLogBlockHelper@ad4b.startBlockStrategy$1");
                }
            });
            C786410Ut5.LJLIIL(4000L, C799570VYd.LIZIZ(), this.LJIIIIZZ);
        }
        if (LiveBroadcastLogBlockOpt.isStrategy2()) {
            this.LJ = this.LIZ;
            C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), this.LJIIIIZZ);
        }
    }
}
