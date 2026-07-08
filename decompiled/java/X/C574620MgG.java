package X;

import com.ss.android.vesdk.VEEditor;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MgG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574620MgG implements InterfaceC574650MgJ {
    public final InterfaceC1452170ntP LIZ;
    public final Function0<VEEditorAutoStartStopArbiter> LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 977));

    public final long LIZ() {
        return this.LIZ.LLL();
    }

    public final long LIZIZ() {
        return this.LIZ.getDuration();
    }

    public final VEEditorAutoStartStopArbiter LIZJ() {
        return (VEEditorAutoStartStopArbiter) this.LIZJ.getValue();
    }

    public final boolean LIZLLL() {
        return this.LIZ.getState() == VEEditor.VEState.STARTED;
    }

    public final void LJ(boolean z) {
        if (z) {
            LIZJ().LIZJ(false, false, false);
        } else {
            LIZJ().LIZ();
        }
    }

    public final void LJI(boolean z) {
        LIZJ().LLILZ = z;
    }

    public final void LJII(boolean z) {
        if (z) {
            LIZJ().LIZJ(true, false, false);
        } else {
            LIZJ().LIZIZ();
        }
    }

    public C574620MgG(InterfaceC1452170ntP interfaceC1452170ntP, Function0<VEEditorAutoStartStopArbiter> function0) {
        this.LIZ = interfaceC1452170ntP;
        this.LIZIZ = function0;
    }

    public final boolean LJFF(long j, VEEditor.SEEK_MODE seek_mode, InterfaceC1464180oCm interfaceC1464180oCm) {
        if (this.LIZ.Yf((int) j, seek_mode, interfaceC1464180oCm) == 0) {
            return true;
        }
        return false;
    }
}
