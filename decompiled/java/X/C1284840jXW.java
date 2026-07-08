package X;

import Y.ARunnableS120S0100000_20;
import android.view.Surface;
import android.view.SurfaceControl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.0jXW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1284840jXW extends AbstractC1284860jXY {
    public static final AtomicInteger LJIIIIZZ = new AtomicInteger(0);
    public SurfaceControl LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public volatile SurfaceControl LJFF;
    public Surface LJI;
    public final ReentrantLock LJ = new ReentrantLock();
    public volatile int LJII = 1;

    @Override // X.InterfaceC1472350oPx
    public final Surface LIZJ() {
        Surface surface = this.LJI;
        if (surface != null) {
            return surface;
        }
        this.LJ.lock();
        try {
            SurfaceControl surfaceControl = this.LJFF;
            if (surfaceControl == null || !surfaceControl.isValid()) {
                this.LJ.unlock();
                return null;
            }
            Surface surface2 = new Surface(surfaceControl);
            this.LJI = surface2;
            this.LJ.unlock();
            return surface2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJ.unlock();
            throw th;
        }
    }

    @Override // X.InterfaceC1472350oPx
    public final void destroy() {
        this.LJ.lock();
        try {
            Surface surface = this.LJI;
            if (surface != null) {
                surface.release();
            }
            this.LJI = null;
            SurfaceControl surfaceControl = this.LJFF;
            if (surfaceControl != null) {
                surfaceControl.release();
            }
            this.LJFF = null;
            this.LJII = 2;
            this.LJ.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJ.unlock();
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MBSurfaceControlSession:[mSurfaceControl:");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", mSurface:");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", surface valid:");
        Surface surface = this.LJI;
        sbLIZ.append(surface != null ? Boolean.valueOf(surface.isValid()) : null);
        sbLIZ.append("] .use ReentrantLock");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final SurfaceControl LJFF(int i, int i2) {
        SurfaceControl surfaceControl = this.LJFF;
        if (surfaceControl != null) {
            return surfaceControl;
        }
        if (this.LJII == 2) {
            return null;
        }
        SurfaceControl.Builder builder = new SurfaceControl.Builder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Vod-");
        sbLIZ.append(LJIIIIZZ.incrementAndGet());
        SurfaceControl surfaceControlBuild = builder.setName(C2188811AlT.LIZIZ(sbLIZ)).setBufferSize(i, i2).build();
        this.LJFF = surfaceControlBuild;
        return surfaceControlBuild;
    }

    @Override // X.InterfaceC1472350oPx
    public final void LIZIZ(final SurfaceControl surfaceControl, final Integer num, final Integer num2) {
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(new Runnable() { // from class: X.0jXV
            /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instruction units count: 227
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1284830jXV.run():void");
            }
        }, 411);
        if (((Boolean) C1474810oTv.y5.getValue()).booleanValue()) {
            LJ(aRunnableS120S0100000_20);
        } else if (((Boolean) C1474810oTv.z5.getValue()).booleanValue() && surfaceControl == null) {
            LJ(aRunnableS120S0100000_20);
        } else {
            aRunnableS120S0100000_20.run();
        }
    }
}
