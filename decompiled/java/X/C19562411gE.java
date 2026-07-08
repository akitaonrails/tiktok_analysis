package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.11gE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19562411gE implements InterfaceC469360Ias {
    public final WeakReference<C19YA> LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public final boolean LLILZIL;

    public C19562411gE(C19561511g5 c19561511g5) {
        this.LL = new WeakReference<>(c19561511g5);
        this.LLILZIL = c19561511g5.getLayoutDirection() == 1;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        this.LLILLJJLI = this.LLILLL;
        this.LLILLL = i;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        boolean z;
        C19YA c19ya = this.LL.get();
        if (c19ya != null && c19ya.getSelectedTabPosition() != i && i < c19ya.getTabCount()) {
            int i2 = this.LLILLL;
            if (i2 == 0 || (i2 == 2 && this.LLILLJJLI == 0)) {
                z = true;
            } else {
                z = false;
            }
            c19ya.selectTab(c19ya.getTabAt(i), z, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[PHI: r8
      0x004c: PHI (r8v1 boolean) = (r8v0 boolean), (r8v3 boolean) binds: [B:17:0x0049, B:12:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC469360Ias
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageScrolled(final int r11, float r12, int r13) {
        /*
            r10 = this;
            r4 = r10
            java.lang.ref.WeakReference<X.19YA> r0 = r4.LL
            java.lang.Object r7 = r0.get()
            X.19YA r7 = (X.C19YA) r7
            int r0 = r4.LLILZ
            r6 = r11
            if (r0 != r6) goto Lf
            return
        Lf:
            if (r7 == 0) goto L47
            int r3 = r4.LLILLL
            r2 = 1
            r1 = 2
            if (r3 != r1) goto L48
            int r0 = r4.LLILLJJLI
            if (r0 == r2) goto L48
            r8 = 0
        L1c:
            int r0 = r4.LLILLJJLI
            if (r0 != 0) goto L4c
            r9 = 0
        L21:
            float[] r0 = new float[r1]
            r0 = {x004e: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            r0 = 200(0xc8, double:9.9E-322)
            android.animation.ValueAnimator r1 = r2.setDuration(r0)
            int r5 = r4.LLILZ
            X.11gF r3 = new X.11gF
            r3.<init>()
            r1.addUpdateListener(r3)
            r4.LLILZ = r6
            X.11gG r0 = new X.11gG
            r0.<init>()
            r1.addListener(r0)
            r1.start()
        L47:
            return
        L48:
            r8 = 1
            if (r3 != r1) goto L4c
            goto L1c
        L4c:
            r9 = 1
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19562411gE.onPageScrolled(int, float, int):void");
    }
}
