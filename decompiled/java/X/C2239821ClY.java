package X;

import Y.ARunnableS38S0201000_34;

/* JADX INFO: renamed from: X.1ClY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239821ClY implements InterfaceC469360Ias {
    public C2239811ClX LL;
    public final /* synthetic */ C2239781ClU LLILLJJLI;

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C2239821ClY(C2239781ClU c2239781ClU) {
        this.LLILLJJLI = c2239781ClU;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        C2239811ClX c2239811ClX = this.LL;
        if (c2239811ClX != null) {
            C2239781ClU c2239781ClU = this.LLILLJJLI;
            c2239811ClX.LJFF = Math.max(i, c2239811ClX.LJFF);
            C1498600p6I.LIZIZ(new ARunnableS38S0201000_34(c2239811ClX, c2239781ClU, i, 1));
        }
    }
}
