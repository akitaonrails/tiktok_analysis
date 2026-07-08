package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0Qh2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C677020Qh2 implements InterfaceC469360Ias {
    public final WeakReference<C1846140y8q> LL;
    public int LLILLJJLI;
    public int LLILLL;

    public C677020Qh2(C1846140y8q c1846140y8q) {
        this.LL = new WeakReference<>(c1846140y8q);
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        this.LLILLJJLI = this.LLILLL;
        this.LLILLL = i;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        boolean z;
        C1846140y8q c1846140y8q = this.LL.get();
        if (c1846140y8q != null && c1846140y8q.getSelectedTabPosition() != i && i < c1846140y8q.getTabCount()) {
            int i2 = this.LLILLL;
            if (i2 == 0 || (i2 == 2 && this.LLILLJJLI == 0)) {
                z = true;
            } else {
                z = false;
            }
            c1846140y8q.LJIIJ(c1846140y8q.LJ(i), z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a A[PHI: r1
      0x001a: PHI (r1v3 boolean) = (r1v1 boolean), (r1v4 boolean) binds: [B:15:0x0020, B:10:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC469360Ias
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageScrolled(int r7, float r8, int r9) {
        /*
            r6 = this;
            java.lang.ref.WeakReference<X.0y8q> r0 = r6.LL
            java.lang.Object r5 = r0.get()
            X.0y8q r5 = (X.C1846140y8q) r5
            if (r5 == 0) goto L1e
            int r4 = r6.LLILLL
            r3 = 0
            r2 = 2
            r1 = 1
            if (r4 != r2) goto L1f
            int r0 = r6.LLILLJJLI
            if (r0 == r1) goto L1f
            r1 = 0
        L16:
            int r0 = r6.LLILLJJLI
            if (r0 == 0) goto L1b
        L1a:
            r3 = 1
        L1b:
            r5.LJIIL(r7, r8, r1, r3)
        L1e:
            return
        L1f:
            r1 = 1
            if (r4 != r2) goto L1a
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C677020Qh2.onPageScrolled(int, float, int):void");
    }
}
