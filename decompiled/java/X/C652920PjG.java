package X;

import Y.ARunnableS110S0100000_10;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0PjG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C652920PjG implements InterfaceC652960PjK {
    public final RecyclerView LL;
    public final View LLILLJJLI;
    public final InterfaceC652950PjJ LLILLL;
    public final InterfaceC641090PCp LLILZ;
    public InterfaceC652940PjI LLIZ;
    public Aweme LLJI;
    public InterfaceViewOnAttachStateChangeListenerC652360PiM LLJIJIL;
    public final boolean LLILZIL = true;
    public boolean LLILZLL = false;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1305));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1304));

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        return true;
    }

    @Override // X.InterfaceC648270Pbl
    public final void LJJJJ() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJLIIIJLLLLLLLZ() {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean LLLLIIIILLL() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LLZZZIL(C587060N0u c587060N0u) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void Mu(C650630PfZ c650630PfZ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean N1() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final View getDetectView() {
        return null;
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
    public final void wp(C650630PfZ c650630PfZ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final Boolean z3() {
        return null;
    }

    public final C652990PjN LIZ() {
        return (C652990PjN) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC653050PjT
    public final boolean LLD() {
        return this.LLILZIL && this.LLILZLL;
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLJJJ() {
        if (this.LLILZIL) {
            this.LLILZLL = false;
        }
        C652990PjN c652990PjNLIZ = LIZ();
        c652990PjNLIZ.LIZ();
        c652990PjNLIZ.LIZIZ();
        c652990PjNLIZ.LIZJ();
        InterfaceC652940PjI interfaceC652940PjI = this.LLIZ;
        if (interfaceC652940PjI != null) {
            interfaceC652940PjI.pauseAll();
        }
        InterfaceC652950PjJ interfaceC652950PjJ = this.LLILLL;
        if (interfaceC652950PjJ != null) {
            interfaceC652950PjJ.LJLJJI();
        }
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLIL() {
        if (this.LLILZIL) {
            this.LLILZLL = true;
        }
        C2487409ou.LIZJ(new ARunnableS110S0100000_10(this, 186));
        InterfaceC652950PjJ interfaceC652950PjJ = this.LLILLL;
        if (interfaceC652950PjJ != null) {
            interfaceC652950PjJ.LLLFF(this.LLJI);
        }
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLILLIL() {
        if (this.LLILZIL) {
            this.LLILZLL = false;
        }
        C652990PjN c652990PjNLIZ = LIZ();
        c652990PjNLIZ.LIZ();
        c652990PjNLIZ.LIZIZ();
        c652990PjNLIZ.LIZJ();
        InterfaceC652940PjI interfaceC652940PjI = this.LLIZ;
        if (interfaceC652940PjI != null) {
            interfaceC652940PjI.LLLLLILLIL();
        }
        InterfaceC652950PjJ interfaceC652950PjJ = this.LLILLL;
        if (interfaceC652950PjJ != null) {
            interfaceC652950PjJ.LJLJJI();
        }
    }

    @Override // X.InterfaceC648270Pbl
    public final void O4() {
        if (this.LLILZIL) {
            this.LLILZLL = false;
        }
        LIZ().LIZIZ.clear();
        InterfaceC652940PjI interfaceC652940PjI = this.LLIZ;
        if (interfaceC652940PjI != null) {
            interfaceC652940PjI.pauseAll();
        }
        InterfaceC652950PjJ interfaceC652950PjJ = this.LLILLL;
        if (interfaceC652950PjJ != null) {
            interfaceC652950PjJ.LJLJJI();
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        InterfaceC652940PjI interfaceC652940PjI = this.LLIZ;
        if (interfaceC652940PjI != null) {
            return interfaceC652940PjI.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC648350Pbt
    public final String getDebugId() {
        return C655580PnY.LIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    @InterfaceC1294060jmO
    public final View p0() {
        return C655580PnY.LIZIZ(this);
    }

    @Override // X.InterfaceC648270Pbl
    public final View LJJIIJ() {
        return this.LL;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJJLIIL() {
        C655580PnY.LIZJ(this);
    }

    @Override // X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        C655580PnY.LIZLLL(this, j);
    }

    public C652920PjG(RecyclerView recyclerView, View view, InterfaceC652950PjJ interfaceC652950PjJ, InterfaceC641090PCp interfaceC641090PCp) {
        this.LL = recyclerView;
        this.LLILLJJLI = view;
        this.LLILLL = interfaceC652950PjJ;
        this.LLILZ = interfaceC641090PCp;
    }
}
