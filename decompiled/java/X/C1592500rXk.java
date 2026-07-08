package X;

import android.view.animation.AccelerateInterpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0rXk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592500rXk implements InterfaceC469360Ias {
    public final WeakReference<C1592450rXf> LL;
    public int LLILLJJLI;
    public int LLILLL;

    public C1592500rXk(C1592450rXf c1592450rXf) {
        new AccelerateInterpolator();
        this.LL = new WeakReference<>(c1592450rXf);
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        C1592450rXf c1592450rXf;
        C1592630rXx tabAnimationHelper;
        this.LLILLJJLI = this.LLILLL;
        this.LLILLL = i;
        C1592450rXf c1592450rXf2 = this.LL.get();
        if (c1592450rXf2 != null && (tabAnimationHelper = c1592450rXf2.getTabAnimationHelper()) != null) {
            tabAnimationHelper.onPageScrollStateChanged(i);
        }
        if (i == 1 && (c1592450rXf = this.LL.get()) != null) {
            c1592450rXf.LLLIIII = true;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        boolean z;
        C1592450rXf c1592450rXf = this.LL.get();
        if (c1592450rXf != null && c1592450rXf.getSelectedTabPosition() != i && i < c1592450rXf.getTabCount()) {
            int i2 = this.LLILLL;
            if (i2 == 0 || (i2 == 2 && this.LLILLJJLI == 0)) {
                z = true;
            } else {
                z = false;
            }
            c1592450rXf.LJIJJ(c1592450rXf.LJIILIIL(i), z);
            C1592630rXx tabAnimationHelper = c1592450rXf.getTabAnimationHelper();
            if (tabAnimationHelper != null) {
                tabAnimationHelper.onPageSelected(i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048 A[PHI: r8
      0x0048: PHI (r8v1 boolean) = (r8v0 boolean), (r8v3 boolean) binds: [B:27:0x0045, B:10:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC469360Ias
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageScrolled(int r12, float r13, int r14) {
        /*
            r11 = this;
            java.lang.ref.WeakReference<X.0rXf> r0 = r11.LL
            java.lang.Object r5 = r0.get()
            X.0rXf r5 = (X.C1592450rXf) r5
            if (r5 == 0) goto L41
            int r4 = r11.LLILLL
            r3 = 2
            r2 = 0
            r1 = 1
            if (r4 != r3) goto L44
            int r0 = r11.LLILLJJLI
            if (r0 == r1) goto L44
            r8 = 0
        L16:
            int r0 = r11.LLILLJJLI
            if (r0 != 0) goto L48
            r9 = 0
        L1b:
            int r0 = r11.LLILLJJLI
            if (r0 == 0) goto L42
            r10 = 1
        L20:
            r6 = r13
            r7 = r12
            r5.LJIJJLI(r6, r7, r8, r9, r10)
            X.0rXh r1 = r5.LLILLL
            int r0 = r11.LLILLL
            if (r0 != r3) goto L2f
            int r0 = r11.LLILLJJLI
            if (r0 == 0) goto L30
        L2f:
            r2 = 1
        L30:
            r1.setMIsDragged(r2)
            X.0rXx r0 = r5.getTabAnimationHelper()
            if (r0 == 0) goto L3c
            r0.onPageScrolled(r7, r6, r14)
        L3c:
            X.0rXh r0 = r5.LLILLL
            r0.postInvalidateOnAnimation()
        L41:
            return
        L42:
            r10 = 0
            goto L20
        L44:
            r8 = 1
            if (r4 != r3) goto L48
            goto L16
        L48:
            r9 = 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1592500rXk.onPageScrolled(int, float, int):void");
    }
}
