package X;

import Y.ARunnableS102S0200000_33;
import android.os.HandlerThread;
import co5.g;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1Ahn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2186531Ahn {
    public final C2186771AiB LIZ;
    public volatile boolean LIZIZ;
    public HandlerThread LIZLLL;
    public BPEAHandler LJ;
    public C2186581Ahs LJI;
    public volatile ActivityC2186501Ahk LJII;
    public final C2189631Amn LJIIIIZZ;
    public int LJIIIZ;
    public final C2186551Ahp LJIIJ;
    public final Object LIZJ = new Object();
    public volatile boolean LJFF = true;

    public final void LIZIZ() {
        C2186771AiB c2186771AiB = this.LIZ;
        if (c2186771AiB == null || !c2186771AiB.LJFF) {
            return;
        }
        C2186771AiB c2186771AiB2 = this.LIZ;
        C786410Ut5.LJJZZIII(c2186771AiB2.LJII, new ARunnableS102S0200000_33(c2186771AiB2, this.LJIIJ, 25));
    }

    public final void LIZJ() {
        C21147817pM.LIZ();
        this.LJIIIZ = 0;
        synchronized (this.LIZJ) {
            try {
                this.LIZIZ = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.1Ahp] */
    public C2186531Ahn(C2186771AiB c2186771AiB, ActivityC2186501Ahk activityC2186501Ahk) {
        new ThreadLocal();
        this.LJIIIIZZ = new C2189631Amn(this, 4);
        this.LJIIJ = new InterfaceC2186741Ai8() { // from class: X.1Ahp
            @Override // X.InterfaceC2186741Ai8
            public final void LIZ(C2186601Ahu c2186601Ahu) {
                synchronized (this.LIZ.LIZJ) {
                    try {
                        if (this.LIZ.LIZIZ) {
                            this.LIZ.LJ.obtainMessage(10001, c2186601Ahu).sendToTarget();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            @Override // X.InterfaceC2186741Ai8
            public final void LIZIZ(Exception exc) {
                exc.toString();
                this.LIZ.LIZIZ();
            }
        };
        C21147817pM.LIZ();
        this.LIZ = c2186771AiB;
        this.LJII = activityC2186501Ahk;
    }

    public final void LIZ(int i, int i2, String str, g gVar) {
        BPEAHandler bPEAHandler = this.LJ;
        if (bPEAHandler != null) {
            bPEAHandler.removeMessages(10002);
        }
        this.LIZLLL.quitSafely();
        ActivityC2186501Ahk activityC2186501Ahk = this.LJII;
        if (activityC2186501Ahk != null) {
            activityC2186501Ahk.LLLZ(i, i2, str, gVar, "scan");
            this.LJII = null;
        }
    }
}
