package com.by.andInflater;

import X.C0HZQ;
import X.C19ME;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.zhiliaoapp.musically.R;
import dc.a;
import fd8.d;
import xem.g;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class story_layout_user_list_mention_panel_cell_layout implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.w_l);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        AvatarComponentView avatarComponentView = new AvatarComponentView(context);
        avatarComponentView.setId(R.id.w_j);
        C19ME c19me = new C19ME((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            c19me.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        new d();
        d.LIZ(new a.c("size48"), avatarComponentView);
        android.view.a.LIZ(avatarComponentView);
        if (avatarComponentView.getParent() == null) {
            constraintLayout.addView(avatarComponentView, c19me);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.w_m);
        tuxTextView.setTextAlignment(5);
        tuxTextView.setMaxLines(1);
        tuxTextView.setSingleLine(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.u_});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        tuxTextView.setMaxWidth((int) TypedValue.applyDimension(1, 226.0f, resources.getDisplayMetrics()));
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        C19ME c19me2 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToEnd = R.id.w_j;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToTop = R.id.w_n;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.verticalChainStyle = 2;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToStart = R.id.w_k;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            c19me2.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            c19me2.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.constrainedWidth = true;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.horizontalBias = 0.0f;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Semibold"), tuxTextView);
        o.LIZ("android:labelFor", new a.b("null", "+id"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, c19me2);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.w_n);
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setSingleLine(true);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ug});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        tuxTextView2.setMaxWidth((int) TypedValue.applyDimension(1, 226.0f, resources.getDisplayMetrics()));
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        C19ME c19me3 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToEnd = R.id.w_j;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToBottom = R.id.w_m;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToStart = R.id.w_k;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            c19me3.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            c19me3.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            ((ViewGroup.MarginLayoutParams) c19me3).topMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.constrainedWidth = true;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.horizontalBias = 0.0f;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Regular"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            constraintLayout.addView(tuxTextView2, c19me3);
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(R.id.o73);
        appCompatTextView.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), appCompatTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), appCompatTextView.getPaddingBottom());
        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingRight(), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        appCompatTextView.setTextColor(resources.getColorStateList(android.R.color.white));
        appCompatTextView.setTextSize(2, 9.0f);
        C786410Ut5.LJLLLLLL(8, appCompatTextView);
        C19ME c19me4 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.endToStart = R.id.w_k;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.bottomToBottom = 0;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            c19me4.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(appCompatTextView);
        if (appCompatTextView.getParent() == null) {
            constraintLayout.addView(appCompatTextView, c19me4);
        }
        C0HZQ c0hzq = new C0HZQ(context);
        c0hzq.setId(R.id.w_k);
        c0hzq.setClickable(false);
        C19ME c19me5 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.bottomToBottom = 0;
        }
        new g();
        g.LIZ("app:tux_checkBoxShape", new a.c("circle"), c0hzq);
        g.LIZ("app:tux_checkBoxSize", new a.c("medium"), c0hzq);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me5)) {
            c19me5.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(c0hzq);
        if (c0hzq.getParent() == null) {
            constraintLayout.addView(c0hzq, c19me5);
        }
        android.view.a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
