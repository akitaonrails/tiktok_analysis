package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0IsQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C480240IsQ implements InterfaceC469360Ias {
    public final WeakReference<C21546719Ub> LL;
    public int LLILLJJLI;
    public int LLILLL;

    public C480240IsQ(C21546719Ub c21546719Ub) {
        this.LL = new WeakReference<>(c21546719Ub);
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        this.LLILLJJLI = this.LLILLL;
        this.LLILLL = i;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        boolean z;
        C21546719Ub c21546719Ub = this.LL.get();
        if (c21546719Ub != null && c21546719Ub.getSelectedTabPosition() != i && i < c21546719Ub.getTabCount()) {
            int i2 = this.LLILLL;
            if (i2 == 0 || (i2 == 2 && this.LLILLJJLI == 0)) {
                z = true;
            } else {
                z = false;
            }
            c21546719Ub.LJIILJJIL(c21546719Ub.LJIIJ(i), z);
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
            java.lang.ref.WeakReference<X.19Ub> r0 = r6.LL
            java.lang.Object r5 = r0.get()
            X.19Ub r5 = (X.C21546719Ub) r5
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
            r5.LJIILLIIL(r7, r8, r1, r3)
        L1e:
            return
        L1f:
            r1 = 1
            if (r4 != r2) goto L1a
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C480240IsQ.onPageScrolled(int, float, int):void");
    }
}
