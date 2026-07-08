package X;

/* JADX INFO: renamed from: X.0Iac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C469200Iac implements InterfaceC469360Ias {
    public int LL;

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        if (this.LL == -1) {
            this.LL = i;
        }
        if (this.LL == i) {
            this.LL = i;
            return;
        }
        throw null;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        throw null;
    }
}
