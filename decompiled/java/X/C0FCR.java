package X;

import android.animation.AnimatorListenerAdapter;
import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS371S0200000_5;

/* JADX INFO: renamed from: X.0FCR, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FCR extends i<InterfaceC386130FBz, C0FCO, C0FCQ, C0FCS> implements InterfaceC379610EuV, InterfaceC386130FBz {
    public static final int LLJJI = 8;
    public final C1DRG LLJILJILJ;
    public final Function0<C0FCQ> LLJILLL;
    public final Function0<C0FCS> LLJJ;

    @Override // X.InterfaceC386130FBz
    public void L3() {
        i3(AFwS234S0000000_5.get$arr$(0));
    }

    @Override // ge.i, X.InterfaceC386130FBz
    public boolean isShowing() {
        return T2().LIZJ == C0FHM.VISIBLE;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0FCQ> o2() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0FCS> w2() {
        return this.LLJJ;
    }

    public C0FCR(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = AFwS191S0000000_5.get$arr$(8);
        this.LLJJ = AFwS191S0000000_5.get$arr$(9);
    }

    @Override // X.InterfaceC386130FBz
    public void DL2(C0FCN c0fcn, AnimatorListenerAdapter animatorListenerAdapter) {
        show();
        i3(new AwS371S0200000_5(c0fcn, animatorListenerAdapter, 0));
    }
}
