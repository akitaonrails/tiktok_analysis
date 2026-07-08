package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;

/* JADX INFO: renamed from: X.0xtg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836740xtg extends AbstractC712240Rwk {
    public final LinearLayoutManager LL;
    public InterfaceC440740HQa LLILLJJLI;

    @Override // X.AbstractC712240Rwk
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageSelected(int i) {
    }

    public C1836740xtg(LinearLayoutManager linearLayoutManager) {
        this.LL = linearLayoutManager;
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageScrolled(int i, float f, int i2) {
        if (this.LLILLJJLI == null) {
            return;
        }
        float f2 = -f;
        for (int i3 = 0; i3 < this.LL.getChildCount(); i3++) {
            View childAt = this.LL.getChildAt(i3);
            if (childAt != null) {
                this.LLILLJJLI.LIZ(childAt, (this.LL.getPosition(childAt) - i) + f2);
            } else {
                throw new IllegalStateException(C786410Ut5.k4(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[]{Integer.valueOf(i3), Integer.valueOf(this.LL.getChildCount())}));
            }
        }
    }
}
