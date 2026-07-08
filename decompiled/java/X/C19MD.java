package X;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.19MD, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19MD extends ViewGroup {
    public C19MB LL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C19M3(-2);
    }

    public C19MB getConstraintSet() {
        if (this.LL == null) {
            this.LL = new C19MB();
        }
        C19MB c19mb = this.LL;
        c19mb.getClass();
        int childCount = getChildCount();
        c19mb.LIZJ.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C19M3 c19m3 = (C19M3) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c19mb.LIZIZ && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!c19mb.LIZJ.containsKey(Integer.valueOf(id))) {
                c19mb.LIZJ.put(Integer.valueOf(id), new C19MA());
            }
            C19MA c19ma = c19mb.LIZJ.get(Integer.valueOf(id));
            if (childAt instanceof C19MX) {
                C19MX c19mx = (C19MX) childAt;
                c19ma.LIZJ(id, c19m3);
                if (c19mx instanceof C19MW) {
                    C19M2 c19m2 = c19ma.LIZLLL;
                    c19m2.LJJJLZIJ = 1;
                    C19MW c19mw = (C19MW) c19mx;
                    c19m2.LJJJLIIL = c19mw.getType();
                    c19ma.LIZLLL.LJJJZ = c19mw.getReferencedIds();
                    c19ma.LIZLLL.LJJJLL = c19mw.getMargin();
                }
            }
            c19ma.LIZJ(id, c19m3);
        }
        return this.LL;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C19M3(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C19ME(layoutParams);
    }
}
