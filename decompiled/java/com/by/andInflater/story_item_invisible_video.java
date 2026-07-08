package com.by.andInflater;

import X.C0RH0;
import X.C0SUL;
import X.C19ME;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class story_item_invisible_video implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.tqy);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.e1});
        constraintLayout.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        C0SUL c0sul = new C0SUL(context, null);
        c0sul.setId(R.id.long_press_layout);
        C19ME c19me = new C19ME(-1, -1);
        a.LIZ(c0sul);
        if (c0sul.getParent() == null) {
            constraintLayout.addView(c0sul, c19me);
        }
        C0RH0 c0rh0 = new C0RH0(context, null);
        c0rh0.setId(R.id.oqx);
        C19ME c19me2 = new C19ME(-1, -1);
        a.LIZ(c0rh0);
        if (c0rh0.getParent() == null) {
            constraintLayout.addView(c0rh0, c19me2);
        }
        a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
