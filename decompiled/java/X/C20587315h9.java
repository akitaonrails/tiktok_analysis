package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.15h9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20587315h9 implements InterfaceC469360Ias {
    public final WeakReference<C19U1> LL;
    public int LLILLJJLI;
    public int LLILLL;

    public C20587315h9(C19U1 c19u1) {
        this.LL = new WeakReference<>(c19u1);
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        this.LLILLJJLI = this.LLILLL;
        this.LLILLL = i;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        boolean z;
        C19U1 c19u1 = this.LL.get();
        if (c19u1 != null && c19u1.getSelectedTabPosition() != i && i < c19u1.getTabCount()) {
            int i2 = this.LLILLL;
            if (i2 == 0 || (i2 == 2 && this.LLILLJJLI == 0)) {
                z = true;
            } else {
                z = false;
            }
            c19u1.selectTab(c19u1.getTabAt(i), z);
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
            java.lang.ref.WeakReference<X.19U1> r0 = r6.LL
            java.lang.Object r5 = r0.get()
            X.19U1 r5 = (X.C19U1) r5
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
            r5.setScrollPosition(r7, r8, r1, r3)
        L1e:
            return
        L1f:
            r1 = 1
            if (r4 != r2) goto L1a
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20587315h9.onPageScrolled(int, float, int):void");
    }
}
