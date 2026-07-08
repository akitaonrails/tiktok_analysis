package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0qdG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557480qdG implements InterfaceC469360Ias {
    public final WeakReference<C1846010y8d> LL;
    public int LLILLJJLI;
    public int LLILLL;

    public C1557480qdG(C1846010y8d c1846010y8d) {
        this.LL = new WeakReference<>(c1846010y8d);
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        this.LLILLJJLI = this.LLILLL;
        this.LLILLL = i;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        boolean z;
        C1846010y8d c1846010y8d = this.LL.get();
        if (c1846010y8d != null && c1846010y8d.getSelectedTabPosition() != i && i < c1846010y8d.getTabCount()) {
            int i2 = this.LLILLL;
            if (i2 == 0 || (i2 == 2 && this.LLILLJJLI == 0)) {
                z = true;
            } else {
                z = false;
            }
            C2153908cD c2153908cD = C2153908cD.LIZ;
            C1556740qc4 c1556740qc4 = new C1556740qc4(i, z);
            c2153908cD.getClass();
            C2153908cD.LIZIZ("explore_tab_bar", c1556740qc4);
            c1846010y8d.LJI(c1846010y8d.LJ(i), z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    @Override // X.InterfaceC469360Ias
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageScrolled(int r8, float r9, int r10) {
        /*
            r7 = this;
            java.lang.ref.WeakReference<X.0y8d> r0 = r7.LL
            java.lang.Object r6 = r0.get()
            X.0y8d r6 = (X.C1846010y8d) r6
            if (r6 == 0) goto L31
            int r2 = r7.LLILLL
            r1 = 2
            r5 = 0
            r4 = 1
            if (r2 != r1) goto L32
            int r0 = r7.LLILLJJLI
            if (r0 == r4) goto L32
            r3 = 0
        L16:
            int r0 = r7.LLILLJJLI
            if (r0 != 0) goto L1b
            r4 = 0
        L1b:
            X.08cD r2 = X.C2153908cD.LIZ
            kotlin.jvm.internal.AwS16S0111000_24 r1 = new kotlin.jvm.internal.AwS16S0111000_24
            r0 = 0
            r1.<init>(r8, r4, r6, r0)
            r2.getClass()
            java.lang.String r0 = "explore_tab_bar"
            X.C2153908cD.LIZIZ(r0, r1)
            boolean r0 = r6.LLIZ
            if (r0 == 0) goto L36
            r6.LLIZ = r5
        L31:
            return
        L32:
            r3 = 1
            if (r2 != r1) goto L1b
            goto L16
        L36:
            r6.LJIIIIZZ(r8, r9, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1557480qdG.onPageScrolled(int, float, int):void");
    }
}
