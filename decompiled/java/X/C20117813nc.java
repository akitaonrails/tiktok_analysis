package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.ugc.aweme.services.IPreloadVESo;
import com.ss.android.ugc.aweme.services.PreloadVESoStatus;
import com.ss.android.vesdk.VEConfigCenter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS219S0000000_30;
import lgo.a;
import lth.o;

/* JADX INFO: renamed from: X.13nc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20117813nc implements IPreloadVESo {
    public static final C01GW<C20117813nc> LJFF = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(99));
    public volatile boolean LIZLLL;
    public volatile PreloadVESoStatus LIZ = PreloadVESoStatus.UNLOAD;
    public volatile long LIZIZ = -1;
    public final C138P LIZJ = new C138P();
    public final CountDownLatch LJ = new CountDownLatch(1);

    @Override // com.ss.android.ugc.aweme.services.IPreloadVESo
    public final void makeSureVESoLoaded() throws InterruptedException {
        if (!this.LIZLLL) {
            C201955140j.LIZLLL(C201967140v.LIZIZ, "PreloadVESo", "not preload, start load now");
            preLoadVESo();
        }
        if (this.LJ.getCount() > 0) {
            C201955140j.LIZLLL(C201967140v.LIZIZ, "PreloadVESo", "still load, wait");
        }
        this.LJ.await();
    }

    @Override // com.ss.android.ugc.aweme.services.IPreloadVESo
    public final void preLoadVESo() {
        C2504709rh.LIZ();
        synchronized (this) {
            try {
                if (this.LIZLLL) {
                    return;
                }
                this.LIZLLL = true;
                C201955140j.LIZLLL(C201967140v.LIZIZ, "PreloadVESo", "preload so start");
                if (((Boolean) C263150ASz.LIZ.getValue()).booleanValue() && !VEConfigCenter.isConfigCenterInitialized()) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2483509oH(null), 3);
                }
                a.LIZIZ.LIZ().LIZLLL();
                C1449450np1.LIZ.LIZ(SystemClock.uptimeMillis(), "load_so_start");
                this.LIZJ.LIZLLL();
                this.LIZ = PreloadVESoStatus.LOADING;
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "open_camera_frame_optimize_pre_load_so", true, false)) {
                    try {
                        TENativeLibsLoader.enableLoadOptLibrary(true);
                        C13V8.LJ.LIZ(o.LIZ).LIZ();
                        TENativeLibsLoader.loadBase();
                        C0CHQ.LIZ().LJJ();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                this.LJ.countDown();
                this.LIZ = PreloadVESoStatus.LOADED;
                this.LIZJ.LJ();
                this.LIZIZ = this.LIZJ.LIZIZ(TimeUnit.MILLISECONDS);
                this.LIZJ.LIZJ();
                C201955140j.LIZLLL(C201967140v.LIZIZ, "PreloadVESo", "preload so end");
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IPreloadVESo
    public final long getPreLoadVESoCostTime() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.IPreloadVESo
    public final PreloadVESoStatus getPreLoadVESoStatus() {
        return this.LIZ;
    }
}
