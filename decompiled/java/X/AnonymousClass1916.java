package X;

import Y.ARunnableS132S0100000_32;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.scene.Scene;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.1916, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1916 extends AbstractC214793194d {
    public static final BPEAHandler LJIILIIL = new BPEAHandler(Looper.getMainLooper());
    public final Map<String, C191C> LJ;
    public final AbstractC214710190y LJFF;
    public final AnonymousClass1912 LJI;
    public final AbstractC214793194d LJII;
    public boolean LJIIIIZZ;
    public AnonymousClass1917 LJIIIZ;
    public final C191A LJIIJJI;
    public int LJIIJ = -1;
    public final ARunnableS132S0100000_32 LJIIL = new ARunnableS132S0100000_32(this, 99);

    @Override // X.AbstractC214793194d
    public final boolean LJFF(Class<? extends Scene> cls, Class<? extends Scene> cls2) {
        return true;
    }

    public final void LJIIL() {
        long millis = TimeUnit.SECONDS.toMillis(5L);
        if (this.LJIIIIZZ) {
            return;
        }
        C21494919Ad.LIZIZ.LIZIZ("SharedElementSceneTransitionExecutor", "invoke postponeEnterTransition to delay animation");
        this.LJIIIIZZ = true;
        C786410Ut5.LJLIIL(millis, LJIILIIL, this.LJIIL);
    }

    public final void LJIILIIL(boolean z) {
        C21494919Ad.LIZIZ.LIZIZ("SharedElementSceneTransitionExecutor", "invoke startPostponedEnterTransition to start pending animation");
        AnonymousClass1917 anonymousClass1917 = this.LJIIIZ;
        if (anonymousClass1917 != null) {
            anonymousClass1917.run();
            this.LJIIIZ = null;
        }
        this.LJIIIIZZ = false;
        if (z) {
            LJIILIIL.removeCallbacks(this.LJIIL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    @Override // X.AbstractC214793194d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C214795194f r21, X.C214795194f r22, java.lang.Runnable r23, X.C1447920nmY r24) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1916.LIZJ(X.194f, X.194f, java.lang.Runnable, X.0nmY):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d1  */
    @Override // X.AbstractC214793194d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C214795194f r25, final X.C214795194f r26, java.lang.Runnable r27, X.C1447920nmY r28) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1916.LJ(X.194f, X.194f, java.lang.Runnable, X.0nmY):void");
    }

    public AnonymousClass1916(Map map, AbstractC214710190y abstractC214710190y, C21392618nk c21392618nk, AnonymousClass1912 anonymousClass1912, C191A c191a) {
        this.LJ = map;
        this.LJFF = abstractC214710190y;
        this.LJI = anonymousClass1912;
        this.LJII = c21392618nk;
        this.LJIIJJI = c191a;
    }
}
