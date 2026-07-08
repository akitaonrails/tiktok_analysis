package com.bytedance.android.live.design.view.sheet;

import X.C16BC;
import X.C16G0;
import X.C16G1;
import X.C786410Ut5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveSheetOutsideBehavior<V extends View> extends C16BC<V> {
    public LiveSheetOutsideBehavior() {
    }

    public LiveSheetOutsideBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.C16BC
    public final boolean layoutDependsOn(C16G0 c16g0, V v, View view) {
        if (view.getId() == R.id.fpl) {
            return true;
        }
        return false;
    }

    @Override // X.C16BC
    public final boolean onDependentViewChanged(C16G0 c16g0, V v, View view) {
        C16G1 c16g1;
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof C16G1) {
            c16g1 = (C16G1) layoutParams;
        } else {
            c16g1 = null;
        }
        if (c16g1 == null || c16g1.LIZLLL != 8388611) {
            return false;
        }
        int width = c16g0.getWidth() - view.getWidth();
        int width2 = view.getWidth();
        if (((ViewGroup.MarginLayoutParams) c16g1).width != width || c16g1.getMarginEnd() != width2) {
            ((ViewGroup.MarginLayoutParams) c16g1).width = width;
            c16g1.setMarginEnd(width2);
            C786410Ut5.W5(v, c16g1);
            return true;
        }
        return true;
    }
}
