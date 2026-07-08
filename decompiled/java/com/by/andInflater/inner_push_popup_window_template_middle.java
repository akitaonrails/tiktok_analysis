package com.by.andInflater;

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
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class inner_push_popup_window_template_middle implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setId(R.id.ocg);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ).gravity = 16;
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.kp1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.kov);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        tuxTextView.setTextDirection(5);
        C19ME c19me = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        new o();
        o.LIZ("android:breakStrategy", new a.c("simple"), tuxTextView);
        o.LIZ("app:tux_font", new a.c("H4_Semibold"), tuxTextView);
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.endToStart = R.id.koj;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.horizontalBias = 0.0f;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.horizontalChainStyle = 2;
        }
        if (C19ME.class.isInstance(c19me)) {
            i = 0;
            c19me.startToStart = 0;
        } else {
            i = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = i;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.matchConstraintDefaultWidth = 1;
        }
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, c19me);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.koj);
        C19ME c19me2 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            c19me2.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me2)) {
            i2 = 0;
            c19me2.topToTop = 0;
        } else {
            i2 = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = i2;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToEnd = R.id.kov;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToStart = R.id.kp0;
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            constraintLayout.addView(frameLayout, c19me2);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.kp0);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView2);
        C19ME c19me3 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            c19me3.setMarginStart((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me3)) {
            i3 = 0;
            c19me3.bottomToBottom = 0;
        } else {
            i3 = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToEnd = i3;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToEnd = R.id.koj;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToTop = 0;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Semibold"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            constraintLayout.addView(tuxTextView2, c19me3);
        }
        android.view.a.LIZ(constraintLayout);
        if (constraintLayout.getParent() == null) {
            linearLayout.addView(constraintLayout, layoutParams);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setTextDirection(5);
        tuxTextView3.setId(R.id.kon);
        tuxTextView3.setGravity(16);
        tuxTextView3.setMaxLines(2);
        tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        new o();
        o.LIZ("android:breakStrategy", new a.c("simple"), tuxTextView3);
        o.LIZ("app:tux_font", new a.c("H4_Regular"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            linearLayout.addView(tuxTextView3, layoutParams2);
        }
        android.view.a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
