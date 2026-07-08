package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: X.111c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194330111c extends AbstractC194339111l<C21594319fB> {
    public final Rect LJI = new Rect();
    public final C19774712Yn LJII = new C19774712Yn(this, 11);

    @Override // X.AbstractC194339111l
    public final RecyclerView LIZLLL(View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(i);
            viewGroup2.getGlobalVisibleRect(this.LJI);
            Rect rect = this.LJI;
            if (rect.left == 0 && rect.right > 0) {
                View childAt = viewGroup2.getChildAt(0);
                if (!(childAt instanceof RecyclerView)) {
                    return null;
                }
                return (RecyclerView) childAt;
            }
        }
        return null;
    }

    @Override // X.AbstractC194339111l
    public final int LJ(View view) {
        ViewPager viewPager = (ViewPager) view;
        if (viewPager != null) {
            return viewPager.getCurrentItem();
        }
        return 0;
    }
}
