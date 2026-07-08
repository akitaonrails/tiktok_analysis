package X;

import android.view.View;
import kotlin.jvm.internal.AwS411S0200000_10;

/* JADX INFO: renamed from: X.0PiJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC652330PiJ extends AbstractViewOnAttachStateChangeListenerC654600Ply implements InterfaceViewOnAttachStateChangeListenerC652360PiM {
    public final boolean LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        return true;
    }

    @Override // X.InterfaceC648270Pbl
    public final void LJJJJ() {
    }

    public void LJJLIIIJLLLLLLLZ() {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean LLLLIIIILLL() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LLZZZIL(C587060N0u c587060N0u) {
    }

    @Override // X.InterfaceC648350Pbt
    public final InterfaceC584630MwP getPreload() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final C0PCQ getPriority() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean l2() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void release() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayMetrics(C664400Q4g c664400Q4g) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayableLifecycleListener(InterfaceC659190PtN interfaceC659190PtN) {
    }

    @Override // X.InterfaceC648350Pbt
    public final Boolean z3() {
        return null;
    }

    public final InterfaceViewOnAttachStateChangeListenerC652360PiM P5() {
        return (InterfaceViewOnAttachStateChangeListenerC652360PiM) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC648270Pbl
    public final View LJJIIJ() {
        return P5().LJJIIJ();
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLJJJ() {
        P5().LLJJJ();
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLIL() {
        P5().LLLLLIL();
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLILLIL() {
        P5().LLLLLILLIL();
    }

    @Override // X.InterfaceC648270Pbl
    public final void O4() {
        P5().O4();
    }

    @Override // X.InterfaceViewOnAttachStateChangeListenerC652360PiM
    public final boolean RA() {
        return P5().RA();
    }

    @Override // X.InterfaceC648350Pbt
    public final String getDebugId() {
        return C655580PnY.LIZ(this);
    }

    @Override // X.InterfaceViewOnAttachStateChangeListenerC652360PiM
    public final int getRank() {
        return P5().getRank();
    }

    @Override // X.InterfaceC648350Pbt
    @InterfaceC1294060jmO
    public final View p0() {
        return C655580PnY.LIZIZ(this);
    }

    @Override // X.InterfaceViewOnAttachStateChangeListenerC652360PiM
    public final void pk() {
        P5().pk();
    }

    public void LJJJLIIL() {
        C655580PnY.LIZJ(this);
    }

    @Override // X.InterfaceViewOnAttachStateChangeListenerC652360PiM
    public final void Cp(int i) {
        P5().Cp(i);
    }

    @Override // X.InterfaceViewOnAttachStateChangeListenerC652360PiM
    public final void Lw(AbstractC652910PjF abstractC652910PjF) {
        P5().Lw(abstractC652910PjF);
    }

    @Override // X.AbstractViewOnAttachStateChangeListenerC654600Ply, android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        super.onViewAttachedToWindow(view);
        P5().onViewAttachedToWindow(view);
    }

    @Override // X.AbstractViewOnAttachStateChangeListenerC654600Ply, android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        super.onViewDetachedFromWindow(view);
        P5().onViewDetachedFromWindow(view);
    }

    public AbstractC652330PiJ(View view, InterfaceC641090PCp interfaceC641090PCp) {
        super(view);
        this.LLIZ = true;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS411S0200000_10(view, this, 119));
        this.LLJ = C452501pT.LIZIZ(new AwS411S0200000_10(interfaceC641090PCp, view, 120));
    }

    public void W0(long j, C587060N0u c587060N0u) {
        C655580PnY.LIZLLL(this, j);
    }
}
