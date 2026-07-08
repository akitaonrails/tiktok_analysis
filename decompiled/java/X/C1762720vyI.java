package X;

import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.0vyI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1762720vyI implements InterfaceC469360Ias {
    public final C21599719g3 LL;
    public final C21599719g3 LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        int count;
        this.LLILZIL = i;
        if (i == 0) {
            PagerAdapter adapter = this.LL.getAdapter();
            if (adapter != null) {
                count = adapter.getCount();
            } else {
                count = 0;
            }
            int i2 = this.LLILZ;
            if (i2 < count && i2 >= 0) {
                this.LL.LLFFF(i2, false);
            }
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        int count;
        this.LLILZ = i;
        if (this.LLILZIL != 0) {
            return;
        }
        PagerAdapter adapter = this.LL.getAdapter();
        if (adapter != null) {
            count = adapter.getCount();
        } else {
            count = 0;
        }
        int i2 = this.LLILZ;
        if (i2 < count && i2 >= 0) {
            this.LL.LLFFF(i2, false);
        }
    }

    public C1762720vyI(C1763720vzu c1763720vzu, C21599719g3 c21599719g3) {
        this.LL = c21599719g3;
        this.LLILLJJLI = c1763720vzu;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        float fLJIL;
        try {
            int width = ((((this.LLILLJJLI.getWidth() + this.LLILLJJLI.getPageMargin()) * (i - this.LLILLL)) + i2) * (this.LL.getWidth() + this.LL.getPageMargin())) / (this.LLILLJJLI.getWidth() + this.LLILLJJLI.getPageMargin());
            if (this.LL.getAdapter() != null) {
                fLJIL = this.LL.getAdapter().LJIL(i);
            } else {
                fLJIL = 1.0f;
            }
            if (this.LL.getScrollX() != width) {
                if (C426750GoL.LJ(this.LL)) {
                    this.LL.scrollTo(-((int) (width * fLJIL)), 0);
                } else {
                    this.LL.scrollTo((int) (width * fLJIL), 0);
                }
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
