package X;

import com.bytedance.ies.safemode.SmartProtected.state.BaseState;
import com.bytedance.ies.safemode.SmartProtected.state.ExceptionManager;
import com.bytedance.ies.safemode.SmartProtected.state.SmartProtectedStateMachine;
import com.bytedance.ies.safemode.SmartProtected.state.StateParam;

/* JADX INFO: renamed from: X.1BMh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2203611BMh extends BaseState {
    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState
    public final void LJII(C1BN4 c1bn4) {
    }

    @Override // X.C1BN4
    public final String getName() {
        return "InitState";
    }

    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState
    public final void LJI(C1BN4 c1bn4, StateParam stateParam) {
        C1BMY.LIZIZ().getClass();
        ExceptionManager.LIZJ(this.LIZ.LJ).LJFF();
        if (c1bn4 != null && c1bn4.getClass() != C2203611BMh.class) {
            this.LIZ.LJIIIZ(c1bn4, c1bn4.getParam());
        } else {
            SmartProtectedStateMachine smartProtectedStateMachine = this.LIZ;
            smartProtectedStateMachine.LJIIIZ(smartProtectedStateMachine.mCheckingState, new StateParam());
        }
    }
}
