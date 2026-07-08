package X;

import Y.AObjectS184S0300000_5;
import Y.AObjectS302S0200000_5;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0E1U, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E1U implements InterfaceC359970E9j {
    public final C0EY2 LL;
    public final InterfaceC361710EGb LLILLJJLI;
    public final InterfaceC377540ErA LLILLL;
    public final C0E48 LLILZ;

    @Override // X.InterfaceC359970E9j
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC359970E9j
    public final void LIZIZ(LifecycleOwner lifecycleOwner) {
        LiveEvent<Unit> liveEventNd2;
        C0EHI value = this.LL.zu2().getValue();
        if (value == null) {
            return;
        }
        C0ELJ c0elj = value.LJ;
        if (c0elj.getChangeBanMusicMode() == null) {
            return;
        }
        InterfaceC361710EGb interfaceC361710EGb = this.LLILLJJLI;
        if (interfaceC361710EGb != null) {
            interfaceC361710EGb.LLJJIJIIJIL(false);
        }
        InterfaceC377540ErA interfaceC377540ErA = this.LLILLL;
        if (interfaceC377540ErA != null && (liveEventNd2 = interfaceC377540ErA.Nd2()) != null) {
            liveEventNd2.LIZ(lifecycleOwner, new AObjectS302S0200000_5(new AObjectS184S0300000_5(lifecycleOwner, c0elj, this, 3), liveEventNd2, 8));
        }
    }

    public C0E1U(C0EY2 c0ey2, InterfaceC361710EGb interfaceC361710EGb, InterfaceC377540ErA interfaceC377540ErA, C0E48 c0e48) {
        this.LL = c0ey2;
        this.LLILLJJLI = interfaceC361710EGb;
        this.LLILLL = interfaceC377540ErA;
        this.LLILZ = c0e48;
    }
}
