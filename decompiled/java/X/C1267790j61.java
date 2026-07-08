package X;

import Y.ARunnableS120S0100000_20;
import android.os.Handler;
import com.ss.lyrax.video.VideoBufferPoolConfig;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0j61, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267790j61 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final ConcurrentHashMap<String, List<C1267830j65>> LJFF = new ConcurrentHashMap<>();
    public final Handler LJI;
    public final ARunnableS120S0100000_20 LJII;

    public final synchronized void LIZ() {
        Handler handler = this.LJI;
        if (handler != null) {
            handler.removeCallbacks(this.LJII);
        }
        Handler handler2 = this.LJI;
        if (handler2 != null) {
            C786410Ut5.LJJZZIII(handler2, new ARunnableS120S0100000_20(this, 201));
        }
        this.LJFF.clear();
    }

    public C1267790j61(VideoBufferPoolConfig videoBufferPoolConfig) {
        this.LIZ = 5;
        this.LIZIZ = 5000;
        this.LIZJ = 5000;
        int i = videoBufferPoolConfig.recycleTimeoutMs;
        this.LIZIZ = i;
        this.LIZJ = videoBufferPoolConfig.checkIntervalMs;
        this.LIZ = videoBufferPoolConfig.maxSizePerResolution;
        this.LIZLLL = videoBufferPoolConfig.debugLogEnable;
        this.LJ = videoBufferPoolConfig.resetMatrixWhenRecycle;
        Handler handler = videoBufferPoolConfig.getHandler();
        this.LJI = handler;
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 202);
        this.LJII = aRunnableS120S0100000_20;
        if (handler != null) {
            C786410Ut5.LJLIIL(i, handler, aRunnableS120S0100000_20);
        }
    }
}
