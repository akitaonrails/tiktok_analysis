package X;

import Y.ARunnableS46S0101000_35;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.otis.resource.psi.ResourceContentionConfig;
import com.bytedance.otis.resource.psi.ResourceContentionSnapshot;
import com.bytedance.otis.resource.psi.ResourcePsiListener;

/* JADX INFO: renamed from: X.1Dyw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273601Dyw {
    public final ResourceContentionConfig LIZ;
    public final ResourcePsiListener LIZIZ;
    public final C2273571Dyt LIZJ = new C2273571Dyt();
    public HandlerThread LIZLLL;
    public BPEAHandler LJ;
    public C2273581Dyu LJFF;
    public volatile ResourceContentionSnapshot LJI;
    public long LJII;
    public boolean LJIIIIZZ;
    public volatile boolean LJIIIZ;
    public volatile int LJIIJ;
    public ARunnableS46S0101000_35 LJIIJJI;

    /* JADX WARN: Removed duplicated region for block: B:48:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2273601Dyw.LIZ():void");
    }

    public final void LIZIZ() {
        if (this.LJIIIZ) {
            return;
        }
        this.LJIIIZ = true;
        int i = this.LJIIJ + 1;
        this.LJIIJ = i;
        this.LJIIJJI = new ARunnableS46S0101000_35(this, i, 4);
        HandlerThread handlerThread = new HandlerThread("resource-psi-background");
        this.LIZLLL = handlerThread;
        handlerThread.start();
        this.LJ = new BPEAHandler(C786410Ut5.W2(this.LIZLLL));
    }

    public C2273601Dyw(ResourceContentionConfig resourceContentionConfig, C2273691Dz5 c2273691Dz5) {
        this.LIZ = resourceContentionConfig;
        this.LIZIZ = c2273691Dz5;
    }
}
