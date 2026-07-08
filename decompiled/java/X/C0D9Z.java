package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutLineItem;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import java.util.List;

/* JADX INFO: renamed from: X.0D9Z, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D9Z {
    public final InterfaceC334880DAw LIZ;
    public final C0D9T LIZIZ;
    public final C2252321DDq LIZJ;
    public final AnonymousClass0951 LIZLLL;
    public final C2252331DDr LJ;
    public final AnonymousClass0950 LJFF;

    public C0D9Z() {
        C0DAX c0dax = new InterfaceC334880DAw() { // from class: X.0DAX
            @Override // X.InterfaceC334880DAw
            public final CheckoutLineItem LIZ(int i, CheckoutSession checkoutSession) {
                List<CheckoutLineItem> list;
                if (checkoutSession != null && (list = checkoutSession.lineItems) != null) {
                    return (CheckoutLineItem) C13LP.LJJJLZIJ(i, list);
                }
                return null;
            }
        };
        C0D9T c0d9t = new C0D9T(c0dax);
        this.LIZ = c0dax;
        this.LIZIZ = c0d9t;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C334500D9k(0));
        this.LIZJ = c2252321DDqLIZ;
        this.LIZLLL = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, null, 5);
        this.LJ = c2252331DDrLIZIZ;
        this.LJFF = C09IC.LIZ(c2252331DDrLIZIZ);
    }

    public final void LIZ() {
        C2252321DDq c2252321DDq = this.LIZJ;
        C334500D9k c334500D9k = (C334500D9k) c2252321DDq.getValue();
        c2252321DDq.setValue(new C334500D9k(c334500D9k.LIZ, C00Y8.IDLE));
    }
}
