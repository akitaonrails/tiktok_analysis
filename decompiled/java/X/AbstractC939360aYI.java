package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

/* JADX INFO: renamed from: X.0aYI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC939360aYI implements InterfaceC942030acb, LifecycleOwner {
    public final InterfaceC923120a86 LL;
    public final InterfaceC920220a3Q LLILLJJLI;
    public final LifecycleRegistry LLILLL;

    @Override // X.InterfaceC942030acb
    public void LIZ(String str, boolean z) {
    }

    @Override // X.InterfaceC942030acb
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC942030acb
    public final void LIZJ() {
    }

    @Override // X.InterfaceC942030acb
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC942030acb
    public final void LJ() {
    }

    @Override // X.InterfaceC942030acb
    public void LJI() {
    }

    @Override // X.InterfaceC942030acb
    public void LJII(String str, boolean z) {
    }

    @Override // X.InterfaceC942030acb
    public void LJIIIIZZ(EnumC934000aPe enumC934000aPe) {
    }

    @Override // X.InterfaceC942030acb
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC942030acb
    public final void LJIIJ() {
    }

    @Override // X.InterfaceC942030acb
    public void LJIIJJI(EnumC965730bEp enumC965730bEp) {
    }

    @Override // X.InterfaceC942030acb
    public final C955310ay1 LJIIL(C955310ay1 c955310ay1) {
        return c955310ay1;
    }

    @Override // X.InterfaceC942030acb
    public final void LJIILIIL() {
    }

    @Override // X.InterfaceC942030acb
    public final void LJIILJJIL() {
    }

    @Override // X.InterfaceC942030acb
    public C939730aYt LJIILLIIL(C939730aYt c939730aYt, C957020b0m c957020b0m) {
        return c939730aYt;
    }

    @Override // X.InterfaceC942030acb
    public final void LJIIZILJ() {
    }

    @Override // X.InterfaceC942030acb
    public final void LJIJI() {
    }

    @Override // X.InterfaceC942030acb
    public void LJIJJ(String str, EnumC942070acf enumC942070acf) {
    }

    @Override // X.InterfaceC942030acb
    public final void LJIJJLI() {
    }

    @Override // X.InterfaceC942030acb
    public void LJIL(C942080acg c942080acg) {
    }

    @Override // X.InterfaceC942030acb
    public void onDetach() {
        if (this.LLILLL.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            Lifecycle.State currentState = this.LLILLL.getCurrentState();
            Lifecycle.State state = Lifecycle.State.DESTROYED;
            if (currentState != state) {
                this.LLILLL.setCurrentState(state);
            }
        }
    }

    public /* synthetic */ AbstractC939360aYI() {
        this(C940770aaZ.LIZ());
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILLL;
    }

    public AbstractC939360aYI(InterfaceC923120a86 interfaceC923120a86) {
        this.LL = interfaceC923120a86;
        this.LLILLJJLI = interfaceC923120a86.getDataSource();
        this.LLILLL = new LifecycleRegistry(this);
    }

    @Override // X.InterfaceC942030acb
    public void LJIJ(InterfaceC940060aZQ interfaceC940060aZQ) {
        this.LLILLL.setCurrentState(Lifecycle.State.STARTED);
    }
}
