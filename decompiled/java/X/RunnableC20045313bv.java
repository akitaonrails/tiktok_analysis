package X;

import android.view.Choreographer;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13bv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class RunnableC20045313bv implements InterfaceC20044013bi, InterfaceC20035313aJ, Runnable, Choreographer.FrameCallback {
    public static long LLIZ;
    public final View LL;
    public boolean LLILLL;
    public boolean LLILZIL;
    public long LLILZLL;
    public final C19968013Aw<InterfaceC20044913br> LLILLJJLI = new C19968013Aw<>(new InterfaceC20044913br[16]);
    public final Choreographer LLILZ = C786410Ut5.v2();

    @Override // X.InterfaceC20035313aJ
    public final void LIZLLL() {
        this.LLILZIL = false;
        this.LL.removeCallbacks(this);
        this.LLILZ.removeFrameCallback(this);
    }

    @Override // X.InterfaceC20035313aJ
    public final void LJ() {
    }

    @Override // X.InterfaceC20035313aJ
    public final void LJFF() {
        this.LLILZIL = true;
    }

    public final void LIZIZ() {
        if (this.LLILLJJLI.LLILLL == 0 || !this.LLILLL || !this.LLILZIL || this.LL.getWindowVisibility() != 0) {
            this.LLILLL = false;
            return;
        }
        C20044713bp c20044713bp = new C20044713bp(this.LLILZLL + LLIZ);
        boolean z = false;
        while (true) {
            if (this.LLILLJJLI.LLILLL != 0) {
                if (z) {
                    break;
                }
                if (c20044713bp.LIZ() <= 0 || this.LLILLJJLI.LL[0].LIZIZ(c20044713bp)) {
                    z = true;
                } else {
                    this.LLILLJJLI.LJIILIIL(0);
                }
            } else if (!z) {
                this.LLILLL = false;
                return;
            }
        }
        this.LLILZ.postFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RunnableC20045313bv(android.view.View r6) {
        /*
            r5 = this;
            r5.<init>()
            r5.LL = r6
            X.13Aw r1 = new X.13Aw
            r0 = 16
            X.13br[] r0 = new X.InterfaceC20044913br[r0]
            r1.<init>(r0)
            r5.LLILLJJLI = r1
            android.view.Choreographer r0 = X.C786410Ut5.v2()
            r5.LLILZ = r0
            long r3 = X.RunnableC20045313bv.LLIZ
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L3c
            android.view.Display r1 = r6.getDisplay()
            boolean r0 = r6.isInEditMode()
            if (r0 != 0) goto L3d
            if (r1 == 0) goto L3d
            float r1 = r1.getRefreshRate()
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L3d
        L34:
            r0 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r0 = (float) r0
            float r0 = r0 / r1
            long r0 = (long) r0
            X.RunnableC20045313bv.LLIZ = r0
        L3c:
            return
        L3d:
            r1 = 1114636288(0x42700000, float:60.0)
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC20045313bv.<init>(android.view.View):void");
    }

    @Override // X.InterfaceC20044013bi
    public final void LIZ(C20044213bk c20044213bk) {
        this.LLILLJJLI.LIZLLL(c20044213bk);
        if (!this.LLILLL) {
            this.LLILLL = true;
            this.LL.post(this);
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.LLILZIL) {
            this.LLILZLL = j;
            this.LL.post(this);
        }
    }
}
