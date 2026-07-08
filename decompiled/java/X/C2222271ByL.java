package X;

import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.1ByL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222271ByL implements InterfaceC2222251ByJ {
    public final List<EventListener> LIZ = new CopyOnWriteArrayList();

    @Override // X.InterfaceC2222251ByJ
    public final void LIZ() {
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIIIZ(C2222081By2 c2222081By2) {
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIIL(C2222371ByV c2222371ByV) {
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIILL(long j, C2222081By2 c2222081By2) {
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onRelease() {
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onStart() {
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onDestroy() {
        ((CopyOnWriteArrayList) this.LIZ).clear();
    }
}
