package X;

import android.database.DataSetObserver;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: X.19XX, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19XX extends DataSetObserver {
    public final PagerAdapter LIZ;
    public final C19XW LIZIZ;
    public final /* synthetic */ C19XW LIZJ;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        ViewPager viewPager = this.LIZJ.LLILLJJLI;
        if (viewPager != null) {
            viewPager.requestLayout();
        }
        C21599719g3 c21599719g3 = this.LIZJ.LLILLL;
        if (c21599719g3 != null) {
            c21599719g3.requestLayout();
        }
        this.LIZIZ.setUpViews(this.LIZ);
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        ViewPager viewPager = this.LIZJ.LLILLJJLI;
        if (viewPager != null) {
            viewPager.requestLayout();
        }
        C21599719g3 c21599719g3 = this.LIZJ.LLILLL;
        if (c21599719g3 != null) {
            c21599719g3.requestLayout();
        }
        this.LIZIZ.setUpViews(this.LIZ);
    }

    public C19XX(C19XW c19xw, C19XW c19xw2, PagerAdapter pagerAdapter) {
        this.LIZJ = c19xw;
        this.LIZ = pagerAdapter;
        this.LIZIZ = c19xw2;
    }
}
