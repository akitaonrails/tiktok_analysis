package X;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0c8A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1000040c8A extends AbstractC1024610cln {
    public boolean LL;

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        View viewE1;
        if (!this.LL && (viewE1 = interfaceC1541990qEH.e1()) != null) {
            C786410Ut5.W5(viewE1, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        this.LL = true;
    }
}
