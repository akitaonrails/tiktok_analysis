package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0PcV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648730PcV implements InterfaceC648720PcU {
    public final Function0<InterfaceC648720PcU> LIZ;
    public InterfaceC648720PcU LIZIZ;

    @Override // X.InterfaceC648720PcU
    public final void LIZ() {
    }

    @Override // X.InterfaceC648720PcU
    public final void LIZJ() {
    }

    @Override // X.InterfaceC648720PcU
    public final void LJJLIIIJLLLLLLLZ() {
    }

    @Override // X.InterfaceC648720PcU
    public final void setPlayMetrics(C664400Q4g c664400Q4g) {
    }

    public final InterfaceC648720PcU LJII() {
        if (this.LIZIZ == null) {
            this.LIZIZ = this.LIZ.invoke();
        }
        return this.LIZIZ;
    }

    @Override // X.InterfaceC648720PcU
    public final void LJ() {
        InterfaceC648720PcU interfaceC648720PcULJII = LJII();
        if (interfaceC648720PcULJII != null) {
            interfaceC648720PcULJII.LJ();
        }
    }

    @Override // X.InterfaceC648720PcU
    public final void LJFF() {
        InterfaceC648720PcU interfaceC648720PcULJII = LJII();
        if (interfaceC648720PcULJII != null) {
            interfaceC648720PcULJII.LJFF();
        }
    }

    @Override // X.InterfaceC648720PcU
    public final Boolean isActive() {
        InterfaceC648720PcU interfaceC648720PcULJII = LJII();
        if (interfaceC648720PcULJII != null) {
            return interfaceC648720PcULJII.isActive();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C648730PcV(Function0<? extends InterfaceC648720PcU> function0) {
        this.LIZ = function0;
    }

    @Override // X.InterfaceC648720PcU
    public final void LIZIZ(C588600N6s c588600N6s) {
        InterfaceC648720PcU interfaceC648720PcUInvoke = this.LIZ.invoke();
        if (interfaceC648720PcUInvoke != null) {
            interfaceC648720PcUInvoke.LIZIZ(c588600N6s);
        }
    }

    @Override // X.InterfaceC648720PcU
    public final void LIZLLL(int i, InterfaceC648120PbW interfaceC648120PbW) {
        InterfaceC648720PcU interfaceC648720PcULJII = LJII();
        if (interfaceC648720PcULJII != null) {
            interfaceC648720PcULJII.LIZLLL(i, interfaceC648120PbW);
        }
    }

    @Override // X.InterfaceC648720PcU
    public final void LJJLL(Aweme aweme, C0PBW c0pbw) {
        InterfaceC648720PcU interfaceC648720PcULJII = LJII();
        if (interfaceC648720PcULJII != null) {
            interfaceC648720PcULJII.LJJLL(aweme, c0pbw);
        }
    }

    @Override // X.InterfaceC648720PcU
    public final void LJI(RecyclerView recyclerView, InterfaceC653000PjO interfaceC653000PjO, int i, boolean z) {
        InterfaceC648720PcU interfaceC648720PcUInvoke = this.LIZ.invoke();
        if (interfaceC648720PcUInvoke != null) {
            interfaceC648720PcUInvoke.LJI(recyclerView, interfaceC653000PjO, i, z);
        }
    }
}
