package com.by.andInflater;

import X.C19ME;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class story_layout_bottom_bar_container implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.i_c);
        C19ME c19me = new C19ME(-1, -1);
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            constraintLayout.addView(frameLayout, c19me);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.i8m);
        C19ME c19me2 = new C19ME(-1, -1);
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            constraintLayout.addView(frameLayout2, c19me2);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.i8n);
        C19ME c19me3 = new C19ME(-1, -1);
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            constraintLayout.addView(frameLayout3, c19me3);
        }
        a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
