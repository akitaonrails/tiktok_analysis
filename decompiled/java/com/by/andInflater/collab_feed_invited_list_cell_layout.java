package com.by.andInflater;

import X.C197039127h;
import X.C19ME;
import X.C20742216Eq;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import X.ViewOnAttachStateChangeListenerC20604515jv;
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
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.f;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class collab_feed_invited_list_cell_layout implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        float f;
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.e4v);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        AvatarComponentView avatarComponentView = new AvatarComponentView(context);
        avatarComponentView.setId(R.id.e4u);
        C19ME c19me = new C19ME((int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToTop = R.id.e4y;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.verticalChainStyle = 2;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            c19me.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        a.LIZ(avatarComponentView);
        if (avatarComponentView.getParent() == null) {
            constraintLayout.addView(avatarComponentView, c19me);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.e4x);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        tuxTextView.setTextAlignment(5);
        C19ME c19me2 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToEnd = R.id.e4u;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToStart = R.id.e51;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToTop = R.id.e4u;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToTop = R.id.e4w;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.verticalChainStyle = 2;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            c19me2.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.constrainedWidth = true;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.horizontalBias = 0.0f;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, c19me2);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.e4w);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C19ME c19me3 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToBottom = R.id.e4x;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToEnd = R.id.e4u;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = R.id.e4u;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToStart = R.id.e51;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            ((ViewGroup.MarginLayoutParams) c19me3).topMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
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
        o.LIZ("app:tux_font", new a.c("P2_Regular"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            constraintLayout.addView(tuxTextView2, c19me3);
        }
        C20742216Eq c20742216Eq = new C20742216Eq(context);
        c20742216Eq.setId(R.id.e51);
        C19ME c19me4 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.orientation = 1;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.guideEnd = (int) TypedValue.applyDimension(1, 112.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c20742216Eq);
        if (c20742216Eq.getParent() == null) {
            constraintLayout.addView(c20742216Eq, c19me4);
        }
        RelationButton relationButton = new RelationButton(context);
        relationButton.setId(R.id.e4z);
        C786410Ut5.LJLLLLLL(8, relationButton);
        C19ME c19me5 = new C19ME((int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        new f();
        f.LIZ("app:tux_buttonSize", new a.c("small"), relationButton);
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.topToTop = R.id.e4u;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.bottomToBottom = R.id.e4u;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me5)) {
            c19me5.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(relationButton);
        if (relationButton.getParent() == null) {
            constraintLayout.addView(relationButton, c19me5);
        }
        C197039127h c197039127h = new C197039127h(context);
        c197039127h.setId(R.id.e50);
        c197039127h.setText(2131828887);
        C786410Ut5.LJLLLLLL(8, c197039127h);
        C19ME c19me6 = new C19ME((int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        new f();
        f.LIZ("app:tux_buttonSize", new a.c("small"), c197039127h);
        f.LIZ("app:tux_font", new a.c("P2_Semibold"), c197039127h);
        f.LIZ("app:tux_buttonVariant", new a.c("secondary"), c197039127h);
        f.LIZ("app:tux_buttonAutoSizing", new a.c("true"), c197039127h);
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.bottomToTop = R.id.e4y;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            c19me6.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(c197039127h);
        if (c197039127h.getParent() == null) {
            constraintLayout.addView(c197039127h, c19me6);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
        viewOnAttachStateChangeListenerC20604515jv.setId(R.id.e4y);
        C786410Ut5.LJLLLLLL(8, viewOnAttachStateChangeListenerC20604515jv);
        C19ME c19me7 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.topToBottom = R.id.e4u;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.endToEnd = 0;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me7)) {
            ((ViewGroup.MarginLayoutParams) c19me7).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me7)) {
            c19me7.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me7)) {
            f = 16.0f;
            c19me7.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        } else {
            f = 16.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me7)) {
            ((ViewGroup.MarginLayoutParams) c19me7).bottomMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(viewOnAttachStateChangeListenerC20604515jv);
        if (viewOnAttachStateChangeListenerC20604515jv.getParent() == null) {
            constraintLayout.addView(viewOnAttachStateChangeListenerC20604515jv, c19me7);
        }
        android.view.a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
