package com.by.andInflater;

import X.C0SLX;
import X.C19ME;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class post_mode_feed_item_slide_photos_in_collection implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.qeg);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        C0SLX c0slx = new C0SLX(context, null);
        c0slx.setId(R.id.qez);
        C19ME c19me = new C19ME(-1, -1);
        if (C19ME.class.isInstance(c19me)) {
            c19me.verticalBias = 0.0f;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        a.LIZ(c0slx);
        if (c0slx.getParent() == null) {
            constraintLayout.addView(c0slx, c19me);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.qf0);
        viewStub.setInflatedId(R.id.qej);
        viewStub.setLayoutResource(R.layout.e_i);
        C19ME c19me2 = new C19ME(-1, -1);
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToTop = 0;
        }
        a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            constraintLayout.addView(viewStub, c19me2);
        }
        a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
