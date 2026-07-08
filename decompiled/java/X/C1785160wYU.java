package X;

import Y.ARunnableS127S0100000_27;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0wYU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1785160wYU implements InterfaceC19716212Ca {
    public final Function0<Unit> LIZJ;
    public ARunnableS127S0100000_27 LJ;
    public final long LIZ = 2500;
    public final long LIZIZ = 200;
    public final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());
    public final List<Function0<Unit>> LJFF = new ArrayList();
    public EnumC1779840wPu LJI = EnumC1779840wPu.IDLE;

    @Override // X.InterfaceC19716212Ca
    public final boolean isPaused() {
        return this.LJI == EnumC1779840wPu.PAUSED;
    }

    @Override // X.InterfaceC19716212Ca
    public final boolean isRunning() {
        return this.LJI == EnumC1779840wPu.RUNNING;
    }

    @Override // X.InterfaceC19716212Ca
    public final void pause() {
        C1450070nq1.LIZJ("AutoSwitch_handler", "pause");
        if (this.LJI != EnumC1779840wPu.RUNNING) {
            return;
        }
        this.LJI = EnumC1779840wPu.PAUSED;
        ARunnableS127S0100000_27 aRunnableS127S0100000_27 = this.LJ;
        if (aRunnableS127S0100000_27 != null) {
            this.LIZLLL.removeCallbacks(aRunnableS127S0100000_27);
        }
    }

    @Override // X.InterfaceC19716212Ca
    public final void start() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start state: ");
        sbLIZ.append(this.LJI);
        C1450070nq1.LIZJ("AutoSwitch_handler", C2188811AlT.LIZIZ(sbLIZ));
        int i = C1779850wPv.LIZ[this.LJI.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                throw new C1954807lC();
            }
            return;
        }
        LIZ(this.LJI == EnumC1779840wPu.IDLE ? this.LIZIZ + this.LIZ : this.LIZ);
        this.LJI = EnumC1779840wPu.RUNNING;
        Iterator it2 = ((ArrayList) this.LJFF).iterator();
        while (it2.hasNext()) {
            ((Function0) it2.next()).invoke();
        }
    }

    @Override // X.InterfaceC19716212Ca
    public final void stop() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop state: ");
        sbLIZ.append(this.LJI);
        C1450070nq1.LIZJ("AutoSwitch_handler", C2188811AlT.LIZIZ(sbLIZ));
        this.LJI = EnumC1779840wPu.IDLE;
        ARunnableS127S0100000_27 aRunnableS127S0100000_27 = this.LJ;
        if (aRunnableS127S0100000_27 != null) {
            this.LIZLLL.removeCallbacks(aRunnableS127S0100000_27);
        }
        this.LJ = null;
    }

    @Override // X.InterfaceC19716212Ca
    public final void cancel() {
        stop();
    }

    public C1785160wYU(AwS563S0100000_19 awS563S0100000_19) {
        this.LIZJ = awS563S0100000_19;
    }

    public final void LIZ(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scheduleNext delay: ");
        sbLIZ.append(j);
        C1450070nq1.LIZJ("AutoSwitch_handler", C2188811AlT.LIZIZ(sbLIZ));
        ARunnableS127S0100000_27 aRunnableS127S0100000_27 = this.LJ;
        if (aRunnableS127S0100000_27 != null) {
            this.LIZLLL.removeCallbacks(aRunnableS127S0100000_27);
        }
        ARunnableS127S0100000_27 aRunnableS127S0100000_272 = new ARunnableS127S0100000_27(this, 76);
        this.LJ = aRunnableS127S0100000_272;
        C786410Ut5.LJLIIL(j, this.LIZLLL, aRunnableS127S0100000_272);
    }
}
