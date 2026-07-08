package com.by.andInflater;

import X.C19ME;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class friends_tab_top_dot implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingBottom());
        tuxTextView.setLines(1);
        tuxTextView.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingBottom());
        tuxTextView.setGravity(17);
        C786410Ut5.T4(tuxTextView, 0.6f);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.ao));
        tuxTextView.setId(android.R.id.text1);
        tuxTextView.setText(2131834932);
        C786410Ut5.LJLLLLLL(0, tuxTextView);
        C19ME c19me = new C19ME(-2, (int) TypedValue.applyDimension(1, 58.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(c19me)) {
            ((RelativeLayout.LayoutParams) c19me).addRule(15, -1);
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
        new o();
        o.LIZ("app:tux_font", new a.c("H3_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, c19me);
        }
        View view = new View(context);
        view.setId(R.id.tv_tab_dot);
        view.setBackgroundResource(R.drawable.bvn);
        C786410Ut5.LJLLLLLL(8, view);
        C19ME c19me2 = new C19ME((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            ((ViewGroup.MarginLayoutParams) c19me2).topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToTop = 0;
        }
        android.view.a.LIZ(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, c19me2);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.tv_tab_dot_count);
        tuxTextView2.setBackgroundResource(R.drawable.bte);
        tuxTextView2.setClickable(false);
        tuxTextView2.setGravity(17);
        tuxTextView2.setMaxLines(1);
        if (TextView.class.isInstance(tuxTextView2)) {
            android.view.a.LJII((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), tuxTextView2);
        } else {
            tuxTextView2.setMinimumWidth((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        tuxTextView2.setPadding((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), tuxTextView2.getPaddingTop(), (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), tuxTextView2.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView2);
        C19ME c19me3 = new C19ME(-2, (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            ((ViewGroup.MarginLayoutParams) c19me3).topMargin = (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToTop = 0;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Regular"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            constraintLayout.addView(tuxTextView2, c19me3);
        }
        android.view.a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
