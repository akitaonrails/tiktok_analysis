package X;

import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.lynx.tasm.behavior.ui.list.container.UIListContainer;

/* JADX INFO: renamed from: X.0kGu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class RunnableC1312980kGu implements Runnable {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public final C1312490kG7 LLILZIL;
    public AbstractC1311850kF5 LLILZLL;
    public final /* synthetic */ C1317480kOA LLIZ;

    public final void LIZ() {
        C1312490kG7 c1312490kG7 = this.LLILZIL;
        if (!c1312490kG7.LIZIZ()) {
            this.LLIZ.setScrollState(1);
            if (this.LLIZ.LLJJJIL.LJIIIIZZ(1)) {
                this.LLIZ.stopNestedScroll(1);
            }
            this.LL = 0;
            this.LLILLJJLI = 0;
            this.LLILLL = 0;
            this.LLILZ = 0;
            AbstractC1311850kF5 abstractC1311850kF5 = this.LLILZLL;
            if (abstractC1311850kF5 != null) {
                abstractC1311850kF5.LIZ();
                return;
            }
            return;
        }
        C1317480kOA c1317480kOA = this.LLIZ;
        int[] iArr = c1317480kOA.LLJILJILJ;
        int i = c1312490kG7.LIZIZ.LIZIZ;
        int i2 = c1312490kG7.LIZJ.LIZIZ;
        AbstractC1311850kF5 abstractC1311850kF52 = this.LLILZLL;
        if (abstractC1311850kF52 != null) {
            int[] iArr2 = c1317480kOA.LLJJI;
            C1311840kF4 c1311840kF4 = (C1311840kF4) abstractC1311850kF52;
            UIListContainer uIListContainer = c1311840kF4.LIZJ;
            boolean z = uIListContainer.LL;
            int i3 = !z ? i : i2;
            int i4 = c1311840kF4.LIZ;
            if (i4 != 0) {
                i3 = (int) (i3 * ((uIListContainer.LLJLIL * 1.0f) / i4));
            }
            int i5 = uIListContainer.LLJLIL;
            if (i5 > 0 && (!c1311840kF4.LIZIZ ? i3 < i5 : i3 > i5)) {
                i3 = i5;
            }
            if (!z) {
                i = i3;
            }
            iArr2[0] = i;
            if (z) {
                i2 = i3;
            }
            iArr2[1] = i2;
        } else {
            i -= this.LLILLL;
            i2 -= this.LLILZ;
        }
        int i6 = i - this.LL;
        int i7 = i2 - this.LLILLJJLI;
        if (c1317480kOA.dispatchNestedPreScroll(i6, i7, iArr, null, 1)) {
            i6 -= iArr[0];
            i7 -= iArr[1];
        }
        C1317480kOA c1317480kOA2 = this.LLIZ;
        int[] iArr3 = c1317480kOA2.LLJJ;
        iArr3[0] = 0;
        iArr3[1] = 0;
        c1317480kOA2.LJII(i6, i7, iArr3);
        C1317480kOA c1317480kOA3 = this.LLIZ;
        int[] iArr4 = c1317480kOA3.LLJJ;
        int i8 = iArr4[0];
        int i9 = iArr4[1];
        int i10 = i6 - i8;
        int i11 = i7 - i9;
        c1317480kOA3.LIZIZ(i8, i9, i10, i11, null, 1);
        C1317480kOA c1317480kOA4 = this.LLIZ;
        boolean z2 = c1317480kOA4.LLILLJJLI;
        if (!z2 ? (z2 || (i6 != 0 && i10 != 0)) && 0 == 0 : i7 != 0 && i11 != 0) {
            if (!c1317480kOA4.LLJJJIL.LJIIIIZZ(1)) {
                this.LLIZ.setScrollState(1);
            }
        }
        this.LL = this.LLIZ.getScrollX();
        int scrollY = this.LLIZ.getScrollY();
        this.LLILLJJLI = scrollY;
        this.LLILLL += i - this.LL;
        this.LLILZ += i2 - scrollY;
        LIZLLL();
    }

    public final boolean LIZIZ() {
        C1317480kOA c1317480kOA = this.LLIZ;
        if (c1317480kOA.LL == null || c1317480kOA.LLJI == 1) {
            return false;
        }
        c1317480kOA.setScrollState(3);
        this.LLILZLL = null;
        this.LL = this.LLIZ.getScrollX();
        this.LLILLJJLI = this.LLIZ.getScrollY();
        this.LLILLL = 0;
        this.LLILZ = 0;
        LIZJ(0, 0);
        LIZLLL();
        return true;
    }

    public final void LIZLLL() {
        HandlerHook.viewRemoveCallbacks(this.LLIZ, this);
        this.LLIZ.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("NestedScrollContainerView$ScrollHelper@1869.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NestedScrollContainerView$ScrollHelper@1869.run");
    }

    public RunnableC1312980kGu(C1317470kO9 c1317470kO9) {
        this.LLIZ = c1317470kO9;
        this.LLILZIL = new C1312490kG7(c1317470kO9.getContext(), C1317480kOA.LLJJJJJIL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0117, code lost:
    
        if (r1 != (-1)) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0 A[PHI: r6 r9
      0x00a0: PHI (r6v7 android.view.View) = (r6v1 android.view.View), (r6v9 android.view.View) binds: [B:23:0x0098, B:26:0x009e] A[DONT_GENERATE, DONT_INLINE]
      0x00a0: PHI (r9v5 int) = (r9v1 int), (r9v7 int) binds: [B:23:0x0098, B:26:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0188 A[PHI: r1 r7
      0x0188: PHI (r1v7 int) = (r1v6 int), (r1v18 int), (r1v18 int) binds: [B:59:0x0129, B:61:0x0142, B:68:0x0184] A[DONT_GENERATE, DONT_INLINE]
      0x0188: PHI (r7v4 int) = (r7v3 int), (r7v3 int), (r7v10 int) binds: [B:59:0x0129, B:61:0x0142, B:68:0x0184] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1312980kGu.LIZJ(int, int):void");
    }
}
