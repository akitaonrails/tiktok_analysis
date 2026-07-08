package X;

import mn3.e0;

/* JADX INFO: renamed from: X.0sHz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1621170sHz extends AbstractC1622390sJx implements InterfaceC1623110sL7 {
    public final e0 LLILLJJLI;

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        return true;
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
    }

    public C1621170sHz(e0 e0Var) {
        this.LLILLJJLI = e0Var;
    }

    @Override // X.InterfaceC1623110sL7
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 17 && i3 == 3) {
            this.LLILLJJLI.Mu0(null, null);
        }
    }
}
