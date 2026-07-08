package X;

import Y.ARunnableS38S0201000_34;

/* JADX INFO: renamed from: X.1Cli, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239921Cli implements InterfaceC469360Ias {
    public C2239911Clh LL;
    public final /* synthetic */ C2239861Clc LLILLJJLI;

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C2239921Cli(C2239861Clc c2239861Clc) {
        this.LLILLJJLI = c2239861Clc;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        C2239911Clh c2239911Clh = this.LL;
        if (c2239911Clh != null) {
            C2239861Clc c2239861Clc = this.LLILLJJLI;
            c2239911Clh.LJFF = Math.max(i, c2239911Clh.LJFF);
            C1498600p6I.LIZIZ(new ARunnableS38S0201000_34(c2239911Clh, c2239861Clc, i, 2));
        }
    }
}
