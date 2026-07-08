package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0jbq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1287520jbq extends BPEAThread {
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJJ;
    public C1287490jbn LLJJIJI;
    public final WeakReference<TextureViewSurfaceTextureListenerC1287530jbr> LLJJIJIIJIL;
    public final ArrayList<Runnable> LLJJI = new ArrayList<>();
    public boolean LLJJIII = true;
    public int LLJIJIL = 0;
    public int LLJILJIL = 0;
    public boolean LLJILLL = true;
    public int LLJILJILJ = 1;

    /* JADX WARN: Removed duplicated region for block: B:205:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0138 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void guardedRun() {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1287520jbq.guardedRun():void");
    }

    public final boolean readyToDraw() {
        if (this.LLILZ || !this.LLILZIL || this.LLILZLL || this.LLJIJIL <= 0 || this.LLJILJIL <= 0) {
            return false;
        }
        return this.LLJILLL || this.LLJILJILJ == 1;
    }

    public final void requestExitAndWait() {
        C1287540jbs c1287540jbs = TextureViewSurfaceTextureListenerC1287530jbr.LLJILJIL;
        synchronized (c1287540jbs) {
            try {
                this.LL = true;
                c1287540jbs.notifyAll();
                while (!this.LLILLJJLI) {
                    try {
                        TextureViewSurfaceTextureListenerC1287530jbr.LLJILJIL.wait();
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C786410Ut5.u3().interrupt();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("GLTextureView$GLThread@7995.run");
        boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
        try {
            LIZJ();
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("GLTextureView$GLThread@7995.run");
    }

    public final void stopEglContextLocked() {
        if (this.LLIZLLLIL) {
            this.LLJJIJI.LIZJ();
            this.LLIZLLLIL = false;
            C1287540jbs c1287540jbs = TextureViewSurfaceTextureListenerC1287530jbr.LLJILJIL;
            if (c1287540jbs.LJ == this) {
                c1287540jbs.LJ = null;
            }
            c1287540jbs.notifyAll();
        }
    }

    public final void stopEglSurfaceLocked() {
        if (this.LLJ) {
            this.LLJ = false;
            this.LLJJIJI.LIZIZ();
        }
    }

    public final void LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GLThread ");
        sbLIZ.append(getId());
        setName(C2188811AlT.LIZIZ(sbLIZ));
        try {
            guardedRun();
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            TextureViewSurfaceTextureListenerC1287530jbr.LLJILJIL.LIZLLL(this);
            throw th;
        }
        TextureViewSurfaceTextureListenerC1287530jbr.LLJILJIL.LIZLLL(this);
    }

    public C1287520jbq(WeakReference<TextureViewSurfaceTextureListenerC1287530jbr> weakReference) {
        this.LLJJIJIIJIL = weakReference;
    }

    public final void setRenderMode(int i) {
        if (i >= 0 && i <= 1) {
            C1287540jbs c1287540jbs = TextureViewSurfaceTextureListenerC1287530jbr.LLJILJIL;
            synchronized (c1287540jbs) {
                try {
                    this.LLJILJILJ = i;
                    c1287540jbs.notifyAll();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        throw new IllegalArgumentException("renderMode");
    }
}
