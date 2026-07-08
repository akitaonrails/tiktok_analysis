package X;

import android.hardware.Camera;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: X.1AiE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2186801AiE {
    public static final Collection<String> LJI;
    public boolean LIZ;
    public volatile boolean LIZIZ;
    public final boolean LIZJ;
    public final Camera LIZLLL;
    public final BPEAHandler LJ;
    public final C2186851AiJ LJFF;

    public final synchronized void LIZ() {
        if (!this.LIZ && !this.LJ.hasMessages(1)) {
            BPEAHandler bPEAHandler = this.LJ;
            C786410Ut5.LJLJLJ(bPEAHandler, bPEAHandler.obtainMessage(1), Mp4ScreenVideoLoadTimeout.CONTROL);
        }
    }

    public final void LIZJ() {
        this.LIZ = true;
        this.LIZIZ = false;
        this.LJ.removeMessages(1);
        if (this.LIZJ) {
            try {
                this.LIZLLL.cancelAutoFocus();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        LJI = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public final void LIZIZ() {
        if (!this.LIZJ || this.LIZ || this.LIZIZ) {
            return;
        }
        try {
            this.LIZLLL.autoFocus(this.LJFF);
            this.LIZIZ = true;
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            LIZ();
        }
    }

    public C2186801AiE(Camera camera, C2186981AiW c2186981AiW) {
        new ArrayList(1);
        C2189631Amn c2189631Amn = new C2189631Amn(this, 3);
        this.LJFF = new C2186851AiJ(this);
        this.LJ = new BPEAHandler(c2189631Amn);
        this.LIZLLL = camera;
        String focusMode = camera.getParameters().getFocusMode();
        c2186981AiW.getClass();
        this.LIZJ = ((ArrayList) LJI).contains(focusMode);
        this.LIZ = false;
        LIZIZ();
    }
}
