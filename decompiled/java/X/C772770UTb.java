package X;

import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0UTb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C772770UTb extends AbstractC1585810rMx {
    public final InterfaceC1162920gMs LL;
    public final Window LLILLJJLI;

    public C772770UTb(C1300480jwk c1300480jwk, Window window) {
        this.LL = c1300480jwk;
        this.LLILLJJLI = window;
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        if (i != 0) {
            InterfaceC1162920gMs interfaceC1162920gMs = this.LL;
            if (interfaceC1162920gMs != null) {
                interfaceC1162920gMs.LIZJ(this.LLILLJJLI);
                return;
            }
            return;
        }
        InterfaceC1162920gMs interfaceC1162920gMs2 = this.LL;
        if (interfaceC1162920gMs2 == null) {
            return;
        }
        interfaceC1162920gMs2.stop();
    }
}
