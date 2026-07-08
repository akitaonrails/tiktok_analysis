package X;

import android.animation.ArgbEvaluator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.HorizontalScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.19Ya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21557019Ya implements InterfaceC469360Ias {
    public final WeakReference<C19YY> LL;
    public int LLILLJJLI;
    public int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final ArgbEvaluator LLILZLL = new ArgbEvaluator();
    public final AccelerateInterpolator LLIZ = new AccelerateInterpolator();

    public C21557019Ya(C19YY c19yy) {
        new DecelerateInterpolator(1.6f);
        this.LL = new WeakReference<>(c19yy);
        this.LLILZIL = c19yy.getTabTextColors().getColorForState(HorizontalScrollView.SELECTED_STATE_SET, 0);
        this.LLILZ = c19yy.getTabTextColors().getDefaultColor();
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        this.LLILLJJLI = this.LLILLL;
        this.LLILLL = i;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        boolean z;
        C19YY c19yy = this.LL.get();
        if (c19yy != null && c19yy.getSelectedTabPosition() != i && i < c19yy.getTabCount()) {
            int i2 = this.LLILLL;
            if (i2 == 0 || (i2 == 2 && this.LLILLJJLI == 0)) {
                z = true;
            } else {
                z = false;
            }
            c19yy.LJIILJJIL(c19yy.LJIIIZ(i), z, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010e A[PHI: r1
      0x010e: PHI (r1v1 boolean) = (r1v0 boolean), (r1v16 boolean) binds: [B:35:0x010a, B:10:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC469360Ias
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageScrolled(int r13, float r14, int r15) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21557019Ya.onPageScrolled(int, float, int):void");
    }
}
