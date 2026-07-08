package com.by.andInflater;

import X.C19ME;
import X.C20742216Eq;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class collab_feed_invited_list_pending_cell_layout implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        float f;
        int i2;
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.e52);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.e5b);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        tuxTextView.setText(2131828890);
        C19ME c19me = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            c19me.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, c19me);
        }
        AvatarComponentView avatarComponentView = new AvatarComponentView(context);
        avatarComponentView.setId(R.id.e57);
        C19ME c19me2 = new C19ME((int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToBottom = R.id.e5b;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToStart = 0;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            ((ViewGroup.MarginLayoutParams) c19me2).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            c19me2.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(avatarComponentView);
        if (avatarComponentView.getParent() == null) {
            constraintLayout.addView(avatarComponentView, c19me2);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.e5a);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        tuxTextView2.setTextAlignment(5);
        C19ME c19me3 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToEnd = R.id.e57;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToStart = R.id.e5c;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToTop = R.id.e57;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToTop = R.id.e5_;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.verticalChainStyle = 2;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            c19me3.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.constrainedWidth = true;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.horizontalBias = 0.0f;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Semibold"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            constraintLayout.addView(tuxTextView2, c19me3);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.e5_);
        tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView3.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        C19ME c19me4 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.topToBottom = R.id.e5a;
        }
        if (C19ME.class.isInstance(c19me4)) {
            i = R.id.e57;
            c19me4.startToEnd = R.id.e57;
        } else {
            i = R.id.e57;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.bottomToBottom = i;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.endToStart = R.id.e5c;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            ((ViewGroup.MarginLayoutParams) c19me4).topMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            c19me4.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.constrainedWidth = true;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.horizontalBias = 0.0f;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Regular"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            constraintLayout.addView(tuxTextView3, c19me4);
        }
        C20742216Eq c20742216Eq = new C20742216Eq(context);
        c20742216Eq.setId(R.id.e5c);
        C19ME c19me5 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.orientation = 1;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.guideEnd = (int) TypedValue.applyDimension(1, 112.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c20742216Eq);
        if (c20742216Eq.getParent() == null) {
            constraintLayout.addView(c20742216Eq, c19me5);
        }
        View view = new View(context);
        view.setId(R.id.e58);
        C19ME c19me6 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.topToBottom = R.id.e57;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.endToStart = R.id.e55;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            ((ViewGroup.MarginLayoutParams) c19me6).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            ((ViewGroup.MarginLayoutParams) c19me6).bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            c19me6.setMarginStart((int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, c19me6);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.e59);
        tuxTextView4.setText(2131828888);
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView4.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        C19ME c19me7 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.topToTop = R.id.e58;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.bottomToBottom = R.id.e58;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.startToStart = R.id.e58;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.endToEnd = R.id.e58;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Semibold"), tuxTextView4);
        android.view.a.LIZ(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            constraintLayout.addView(tuxTextView4, c19me7);
        }
        View view2 = new View(context);
        view2.setId(R.id.e55);
        C19ME c19me8 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.topToBottom = R.id.e57;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.startToEnd = R.id.e58;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.endToEnd = 0;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me8)) {
            f = 8.0f;
            c19me8.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            f = 8.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me8)) {
            ((ViewGroup.MarginLayoutParams) c19me8).topMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me8)) {
            ((ViewGroup.MarginLayoutParams) c19me8).bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me8)) {
            c19me8.setMarginEnd((int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(view2);
        if (view2.getParent() == null) {
            constraintLayout.addView(view2, c19me8);
        }
        TuxTextView tuxTextView5 = new TuxTextView(context);
        tuxTextView5.setId(R.id.e56);
        tuxTextView5.setText(2131828889);
        TypedArray typedArrayObtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView5.setTextColor(typedArrayObtainStyledAttributes5.getColor(0, 0));
        typedArrayObtainStyledAttributes5.recycle();
        C19ME c19me9 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me9)) {
            i2 = R.id.e55;
            c19me9.topToTop = R.id.e55;
        } else {
            i2 = R.id.e55;
        }
        if (C19ME.class.isInstance(c19me9)) {
            c19me9.bottomToBottom = i2;
        }
        if (C19ME.class.isInstance(c19me9)) {
            c19me9.startToStart = i2;
        }
        if (C19ME.class.isInstance(c19me9)) {
            c19me9.endToEnd = i2;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Semibold"), tuxTextView5);
        android.view.a.LIZ(tuxTextView5);
        if (tuxTextView5.getParent() == null) {
            constraintLayout.addView(tuxTextView5, c19me9);
        }
        android.view.a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
