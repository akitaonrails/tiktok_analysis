package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0rDz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1580250rDz implements InterfaceC1542220qEe {
    public C1749280vcc LIZ;

    @Override // X.InterfaceC1542220qEe
    public final C1749280vcc getView() {
        C1749280vcc c1749280vcc = this.LIZ;
        if (c1749280vcc == null) {
            return null;
        }
        return c1749280vcc;
    }

    @Override // X.InterfaceC1542220qEe
    public final void hide() {
        C1749280vcc c1749280vcc = this.LIZ;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 8);
    }

    @Override // X.InterfaceC1542220qEe
    public final void show() {
        C1749280vcc c1749280vcc = this.LIZ;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 0);
        c1749280vcc.LJ();
    }

    @Override // X.InterfaceC1542220qEe
    public final void LJIIJ(Context context) {
        this.LIZ = new C1749280vcc(context, null, 6);
    }
}
