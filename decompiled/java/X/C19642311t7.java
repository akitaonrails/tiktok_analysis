package X;

import android.animation.ArgbEvaluator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.HorizontalScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.11t7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19642311t7 extends AbstractC712240Rwk implements InterfaceC469360Ias {
    public final WeakReference<C19YA> LL;
    public int LLILLJJLI;
    public int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final ArgbEvaluator LLILZLL = new ArgbEvaluator();
    public final AccelerateInterpolator LLIZ = new AccelerateInterpolator();

    public C19642311t7(C19YA c19ya) {
        new DecelerateInterpolator(1.6f);
        this.LL = new WeakReference<>(c19ya);
        this.LLILZIL = c19ya.getTabTextColors().getColorForState(HorizontalScrollView.SELECTED_STATE_SET, 0);
        this.LLILZ = c19ya.getTabTextColors().getDefaultColor();
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageScrollStateChanged(int i) {
        this.LLILLJJLI = this.LLILLL;
        this.LLILLL = i;
    }

    @Override // X.AbstractC712240Rwk
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010e A[PHI: r1
      0x010e: PHI (r1v1 boolean) = (r1v0 boolean), (r1v16 boolean) binds: [B:35:0x010a, B:10:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC712240Rwk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageScrolled(int r13, float r14, int r15) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19642311t7.onPageScrolled(int, float, int):void");
    }
}
