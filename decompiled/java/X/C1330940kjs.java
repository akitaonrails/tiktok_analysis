package X;

import X.InterfaceC1330960kju;
import Y.ARunnableS120S0100000_20;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0kjs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1330940kjs<T extends InterfaceC1330960kju> extends C1330930kjr<T> {
    public final InterfaceC1331160kkE LIZJ;
    public final ScheduledExecutorService LIZLLL;
    public boolean LJ;
    public long LJFF;
    public final InterfaceC1330920kjq LJI;
    public final ARunnableS120S0100000_20 LJII;

    public final synchronized void LJI() {
        if (!this.LJ) {
            this.LJ = true;
            this.LIZLLL.schedule(this.LJII, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // X.C1330930kjr, X.InterfaceC1330960kju
    public final boolean LIZIZ(int i, Canvas canvas, Drawable drawable) {
        this.LJFF = this.LIZJ.now();
        boolean zLIZIZ = super.LIZIZ(i, canvas, drawable);
        LJI();
        return zLIZIZ;
    }

    public C1330940kjs(C1329630khl c1329630khl, C1329630khl c1329630khl2, InterfaceC1331160kkE interfaceC1331160kkE, ScheduledExecutorService scheduledExecutorService) {
        super(c1329630khl);
        this.LJII = new ARunnableS120S0100000_20(this, 200);
        this.LJI = c1329630khl2;
        this.LIZJ = interfaceC1331160kkE;
        this.LIZLLL = scheduledExecutorService;
    }

    public C1330940kjs(C1330000kiM c1330000kiM, C1329630khl c1329630khl, C1329630khl c1329630khl2, InterfaceC1331160kkE interfaceC1331160kkE, ScheduledExecutorService scheduledExecutorService) {
        super(c1329630khl, c1330000kiM);
        this.LJII = new ARunnableS120S0100000_20(this, 200);
        this.LJI = c1329630khl2;
        this.LIZJ = interfaceC1331160kkE;
        this.LIZLLL = scheduledExecutorService;
    }
}
