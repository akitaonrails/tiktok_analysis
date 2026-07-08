package X;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Psv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C658910Psv implements InterfaceC655620Pnc {
    public C663070Pzd LL;
    public C658930Psx LLILLJJLI;

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        return true;
    }

    @Override // X.InterfaceC655620Pnc
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

    @Override // X.InterfaceC655620Pnc
    public final void LLJJJ() {
        C658930Psx c658930Psx = this.LLILLJJLI;
        if (c658930Psx != null) {
            c658930Psx.LLJJJ();
        }
    }

    @Override // X.InterfaceC655620Pnc
    public final void LLLLLILLIL() {
        C658930Psx c658930Psx = this.LLILLJJLI;
        if (c658930Psx != null) {
            c658930Psx.LLLLLILLIL();
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        C658930Psx c658930Psx = this.LLILLJJLI;
        if (c658930Psx != null) {
            return c658930Psx.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC655620Pnc
    public final void onDestroy() {
        C658930Psx c658930Psx = this.LLILLJJLI;
        if (c658930Psx != null) {
            c658930Psx.onDestroy();
        }
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

    @Override // X.InterfaceC648350Pbt
    public final void LJJJLIIL() {
        C655580PnY.LIZJ(this);
    }

    public final void LIZ(Function0<C663070Pzd> function0) {
        C663070Pzd c663070PzdInvoke = function0.invoke();
        this.LL = c663070PzdInvoke;
        this.LLILLJJLI = new C658930Psx(this.LL, c663070PzdInvoke.getDataProvider());
    }

    @Override // X.InterfaceC655620Pnc
    public final void u4(long j) {
        C658930Psx c658930Psx = this.LLILLJJLI;
        if (c658930Psx != null) {
            c658930Psx.u4(j);
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        C655580PnY.LIZLLL(this, j);
    }
}
