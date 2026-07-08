package X;

import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.0rRC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1588440rRC extends AbstractC1216410hl9<C1601380rm4, C1601390rm5> implements InterfaceC1603420rpM {
    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 2;
    }

    public C1588440rRC(AbstractC1255880imo abstractC1255880imo) {
        this.mModel = abstractC1255880imo instanceof C1601380rm4 ? abstractC1255880imo : new C1601380rm4();
    }

    @Override // X.InterfaceC1603420rpM
    public final void bindPreLoadView(InterfaceC666290QBn interfaceC666290QBn) {
        ((C1601390rm5) this.mPresenter).LLILZLL = interfaceC666290QBn;
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final boolean init(Fragment fragment) {
        this.mPresenter = new C1601390rm5(fragment);
        return true;
    }

    @Override // X.InterfaceC1603420rpM
    public final void setPreLoad(boolean z) {
        ((C1601390rm5) this.mPresenter).LLIZLLLIL = true;
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        int i3;
        C1601440rmA c1601440rmA = new C1601440rmA();
        c1601440rmA.LIZ = 2;
        c1601440rmA.LJJIZ = "detail_timeline";
        if (i != 2) {
            if (i != 4) {
                i3 = 1;
            } else {
                i3 = 2;
            }
        } else {
            i3 = 3;
        }
        c1601440rmA.LIZIZ = i3;
        this.mPresenter.LIZJ(Integer.valueOf(i), c1601440rmA.LIZ());
    }
}
