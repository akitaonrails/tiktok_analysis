package X;

import Y.ACListenerS159S0100000_25;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.absetting.EffectDiscoveryButtonMovedToRightExperiment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0sfL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1635650sfL extends C1635720sfS implements InterfaceC379610EuV {
    public final C1DRG LL;

    @Override // X.C1635720sfS, X.InterfaceC1635870sfh
    public final int LIZIZ() {
        return EffectDiscoveryButtonMovedToRightExperiment.isEnabled() ? R.layout.d3y : R.layout.d3x;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C1635650sfL(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.C1635720sfS, X.InterfaceC1635870sfh
    public final C19561611g6 LIZJ(ViewGroup viewGroup) {
        View viewFindViewById = viewGroup.findViewById(R.id.kgn);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS159S0100000_25(this, 82), viewFindViewById);
        }
        View viewFindViewById2 = viewGroup.findViewById(R.id.kgo);
        if (viewFindViewById2 != null) {
            C377000EqI.LIZ(viewFindViewById2);
        }
        return (C19561611g6) viewGroup.findViewById(R.id.wyy);
    }
}
