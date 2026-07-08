package com.by.andInflater;

import X.C0RH0;
import X.C0SUL;
import X.C19ME;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class story_item_note implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.dyj);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        C0SUL c0sul = new C0SUL(context, null);
        c0sul.setId(R.id.long_press_layout);
        C19ME c19me = new C19ME(-1, -1);
        a.LIZ(c0sul);
        if (c0sul.getParent() == null) {
            constraintLayout.addView(c0sul, c19me);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.i8e);
        C19ME c19me2 = new C19ME(-1, -1);
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            constraintLayout.addView(frameLayout, c19me2);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.video_visible_area_container);
        C19ME c19me3 = new C19ME(-1, -1);
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            constraintLayout.addView(frameLayout2, c19me3);
        }
        C0RH0 c0rh0 = new C0RH0(context, null);
        c0rh0.setId(R.id.i6p);
        C19ME c19me4 = new C19ME(-1, -1);
        a.LIZ(c0rh0);
        if (c0rh0.getParent() == null) {
            constraintLayout.addView(c0rh0, c19me4);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.ia0);
        C19ME c19me5 = new C19ME(-1, -1);
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            constraintLayout.addView(frameLayout3, c19me5);
        }
        a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
