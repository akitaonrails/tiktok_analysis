package X;

import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.19K7, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C19K7 implements Choreographer.FrameCallback {
    public final boolean LL;
    public final List<C19KC> LLILLJJLI = new ArrayList();
    public boolean LLILLL;

    public void LIZIZ() {
    }

    public void LIZJ() {
    }

    public abstract void LIZLLL();

    public C19K7(boolean z) {
        this.LL = z;
    }

    public void LIZ(C19KC c19kc) {
        ((ArrayList) this.LLILLJJLI).add(c19kc);
        if (!this.LLILLL) {
            if (this.LL) {
                C786410Ut5.v2().postFrameCallback(this);
            }
            this.LLILLL = true;
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (!this.LLILLL) {
            return;
        }
        C786410Ut5.v2().removeFrameCallback(this);
        C786410Ut5.v2().postFrameCallback(this);
        LIZIZ();
    }
}
