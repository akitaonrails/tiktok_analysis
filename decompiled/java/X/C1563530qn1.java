package X;

import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0qn1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563530qn1 implements InterfaceC1616070s9l {
    public boolean LL;
    public boolean LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(421));

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onBeforePageChange() {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageScrolledEnd(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageUnSelected(C0SZ8 c0sz8) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageSelected(int i, boolean z) {
        if (z) {
            return;
        }
        if (this.LL) {
            ((InterfaceC1563540qn2) this.LLILLL.getValue()).LIZLLL();
        } else if (this.LLILLJJLI) {
            ((InterfaceC1563540qn2) this.LLILLL.getValue()).LIZIZ();
        } else {
            ((InterfaceC1563540qn2) this.LLILLL.getValue()).LIZJ();
        }
        this.LL = false;
        this.LLILLJJLI = false;
    }
}
