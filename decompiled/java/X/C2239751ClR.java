package X;

/* JADX INFO: renamed from: X.1ClR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239751ClR implements InterfaceC469360Ias {
    public C2239741ClQ LL;
    public final /* synthetic */ C2239731ClP LLILLJJLI;

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C2239751ClR(C2239731ClP c2239731ClP) {
        this.LLILLJJLI = c2239731ClP;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        C2239741ClQ c2239741ClQ = this.LL;
        if (c2239741ClQ != null) {
            C2239731ClP c2239731ClP = this.LLILLJJLI;
            c2239741ClQ.LJFF = Math.max(i, c2239741ClQ.LJFF);
            c2239731ClP.LIZJ(c2239741ClQ, i);
        }
    }
}
