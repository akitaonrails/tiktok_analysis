package com.bytedance.android.live.rank.impl.list.fragment.behavior;

import X.C16G0;
import X.C16GX;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;

/* JADX INFO: loaded from: classes20.dex */
public final class RankBottomBehavior extends AppBarLayout$ScrollingViewBehavior {
    public C16GX LJ;
    public boolean LJFF;

    public RankBottomBehavior() {
        this.LJFF = true;
    }

    public RankBottomBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJFF = true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior, X.C16BC
    public final boolean onDependentViewChanged(C16G0 c16g0, View view, View view2) {
        C16GX c16gx;
        int totalScrollRange;
        boolean z;
        if (view2 instanceof C16GX) {
            c16gx = (C16GX) view2;
        } else {
            c16gx = null;
        }
        this.LJ = c16gx;
        super.onDependentViewChanged(c16g0, view, view2);
        C16GX c16gx2 = this.LJ;
        if (c16gx2 == null) {
            totalScrollRange = 0;
        } else {
            totalScrollRange = c16gx2.getTotalScrollRange() + c16gx2.getTop();
        }
        if (totalScrollRange != view.getPaddingBottom()) {
            z = true;
            if (this.LJFF) {
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), totalScrollRange);
            }
        } else {
            z = false;
        }
        if (!this.LJFF || !z) {
            return false;
        }
        return true;
    }
}
