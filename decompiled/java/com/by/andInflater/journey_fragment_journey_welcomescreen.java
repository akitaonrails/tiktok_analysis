package com.by.andInflater;

import X.C197039127h;
import X.C19ME;
import X.C20742916Ex;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.f;

/* JADX INFO: loaded from: classes32.dex */
public class journey_fragment_journey_welcomescreen implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        constraintLayout.setId(R.id.tqy);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.cze, constraintLayout, false, R.layout.czc);
        viewLIZ.setId(R.id.ji7);
        C19ME c19me = new C19ME(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            c19me.setMarginStart((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            ((ViewGroup.MarginLayoutParams) c19me).leftMargin = (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            c19me.setMarginEnd((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            ((ViewGroup.MarginLayoutParams) c19me).rightMargin = (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics());
        }
        if (viewLIZ.getParent() == null) {
            constraintLayout.addView(viewLIZ, c19me);
        }
        View cardView = new CardView(context, null);
        cardView.setId(R.id.video_container);
        C19ME c19me2 = new C19ME((int) TypedValue.applyDimension(1, 376.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 376.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToTop = R.id.vzt;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.leftToLeft = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.rightToRight = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToBottom = R.id.ji7;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.verticalBias = 0.4f;
        }
        a.LIZ(cardView);
        if (cardView.getParent() == null) {
            constraintLayout.addView(cardView, c19me2);
        }
        C197039127h c197039127h = new C197039127h(context);
        c197039127h.setId(R.id.vzt);
        c197039127h.setBackgroundResource(R.drawable.at5);
        c197039127h.setGravity(17);
        c197039127h.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        c197039127h.setText(2131837989);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        c197039127h.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.LJLLLLLL(4, c197039127h);
        C19ME c19me3 = new C19ME(-1, (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(c19me3)) {
            ((LinearLayout.LayoutParams) c19me3).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(c19me3)) {
            ((FrameLayout.LayoutParams) c19me3).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(c19me3)) {
            ((DrawerLayout$LayoutParams) c19me3).gravity = 17;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            c19me3.setMarginStart((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            ((ViewGroup.MarginLayoutParams) c19me3).leftMargin = (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            c19me3.setMarginEnd((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            ((ViewGroup.MarginLayoutParams) c19me3).rightMargin = (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.leftToLeft = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.rightToRight = 0;
        }
        new f();
        f.LIZ("app:tux_font", new a.c("H4_Bold"), c197039127h);
        android.view.a.LIZ(c197039127h);
        if (c197039127h.getParent() == null) {
            constraintLayout.addView(c197039127h, c19me3);
        }
        android.view.a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
