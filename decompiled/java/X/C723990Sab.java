package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Sab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723990Sab {
    public static final void LIZ(Lifecycle.State state, AbstractC738140SxQ abstractC738140SxQ) {
        if (C725080ScM.LIZLLL) {
            try {
                InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                if (interfaceC723720SaA != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("handle lifecycle of ");
                    sbLIZ.append(abstractC738140SxQ);
                    sbLIZ.append(", dstState: ");
                    sbLIZ.append(state);
                    sbLIZ.append(", assem state: ");
                    sbLIZ.append(abstractC738140SxQ.getLifecycle().getCurrentState());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2187451AjH.LIZ;
                    interfaceC723720SaA.log("AssemSupervisor", strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        int i2 = C0J83.LIZ[state.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        if (abstractC738140SxQ.getLifecycle().getCurrentState().compareTo(Lifecycle.State.RESUMED) >= 0) {
                            abstractC738140SxQ.handleOnPause$assem_release();
                        }
                        if (abstractC738140SxQ.getLifecycle().getCurrentState().compareTo(Lifecycle.State.STARTED) >= 0) {
                            abstractC738140SxQ.handleOnStop$assem_release();
                        }
                        if (abstractC738140SxQ.getLifecycle().getCurrentState().compareTo(Lifecycle.State.CREATED) >= 0) {
                            abstractC738140SxQ.handleOnDestroy$assem_release();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (abstractC738140SxQ.getLifecycle().getCurrentState().compareTo(Lifecycle.State.RESUMED) >= 0) {
                    return;
                }
                if (abstractC738140SxQ.getLifecycle().getCurrentState().compareTo(Lifecycle.State.CREATED) < 0) {
                    abstractC738140SxQ.handleOnCreate$assem_release();
                }
                if (abstractC738140SxQ.getLifecycle().getCurrentState().compareTo(Lifecycle.State.STARTED) < 0) {
                    abstractC738140SxQ.handleOnStart$assem_release();
                }
                abstractC738140SxQ.handleOnResume();
                return;
            }
            Lifecycle.State currentState = abstractC738140SxQ.getLifecycle().getCurrentState();
            Lifecycle.State state2 = Lifecycle.State.STARTED;
            if (currentState.compareTo(state2) < 0) {
                if (abstractC738140SxQ.getLifecycle().getCurrentState().compareTo(Lifecycle.State.CREATED) < 0) {
                    abstractC738140SxQ.handleOnCreate$assem_release();
                }
                abstractC738140SxQ.handleOnStart$assem_release();
                return;
            } else {
                if (abstractC738140SxQ.getLifecycle().getCurrentState().compareTo(state2) <= 0) {
                    return;
                }
                abstractC738140SxQ.handleOnPause$assem_release();
                return;
            }
        }
        Lifecycle.State currentState2 = abstractC738140SxQ.getLifecycle().getCurrentState();
        Lifecycle.State state3 = Lifecycle.State.CREATED;
        if (currentState2.compareTo(state3) < 0) {
            abstractC738140SxQ.handleOnCreate$assem_release();
            return;
        }
        if (abstractC738140SxQ.getLifecycle().getCurrentState().compareTo(Lifecycle.State.STARTED) > 0) {
            abstractC738140SxQ.handleOnPause$assem_release();
        }
        if (abstractC738140SxQ.getLifecycle().getCurrentState().compareTo(state3) <= 0) {
            return;
        }
        abstractC738140SxQ.handleOnStop$assem_release();
    }
}
