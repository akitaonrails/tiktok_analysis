package com.by.andInflater;

import X.C19ME;
import X.C419060Gbw;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.ViewSwitcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class im_layout_title_bar_single_title_new implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setClipChildren(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        AvatarComponentView avatarComponentView = new AvatarComponentView(context);
        avatarComponentView.setId(R.id.l9h);
        avatarComponentView.setClipChildren(false);
        C19ME c19me = new C19ME((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.endToStart = R.id.xl7;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.horizontalBias = 0.0f;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.horizontalChainStyle = 2;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        a.LIZ(avatarComponentView);
        if (avatarComponentView.getParent() == null) {
            constraintLayout.addView(avatarComponentView, c19me);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.bhq);
        tuxIconView.setImportantForAccessibility(2);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        C19ME c19me2 = new C19ME((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(c19me2)) {
            ((LinearLayout.LayoutParams) c19me2).gravity = 8388693;
        }
        if (FrameLayout.LayoutParams.class.isInstance(c19me2)) {
            ((FrameLayout.LayoutParams) c19me2).gravity = 8388693;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(c19me2)) {
            ((DrawerLayout$LayoutParams) c19me2).gravity = 8388693;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            c19me2.setMarginEnd((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            ((ViewGroup.MarginLayoutParams) c19me2).bottomMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = R.id.l9h;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToEnd = R.id.l9h;
        }
        a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, c19me2);
        }
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(R.id.xl7);
        constraintLayout2.setClipChildren(false);
        constraintLayout2.setClipToPadding(false);
        C19ME c19me3 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.constrainedWidth = true;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToEnd = R.id.l9h;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToTop = 0;
        }
        C419060Gbw c419060Gbw = new C419060Gbw(context, null);
        c419060Gbw.setId(R.id.i0r);
        C19ME c19me4 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            ((ViewGroup.MarginLayoutParams) c19me4).topMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.bottomToTop = R.id.uhd;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.verticalChainStyle = 2;
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.i0q);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setGravity(8388627);
        tuxTextView.setMaxLines(1);
        tuxTextView.setSingleLine(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ(-2, -2, c419060Gbw);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H3_Bold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            c419060Gbw.addView(tuxTextView, marginLayoutParamsLJ2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.wa5);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = android.view.a.LJ(-2, -2, c419060Gbw);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ3).gravity = 16;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            c419060Gbw.addView(frameLayout, marginLayoutParamsLJ3);
        }
        android.view.a.LIZ(c419060Gbw);
        if (c419060Gbw.getParent() == null) {
            constraintLayout2.addView(c419060Gbw, c19me4);
        }
        ViewSwitcher viewSwitcher = new ViewSwitcher(context);
        viewSwitcher.setId(R.id.uhd);
        C786410Ut5.LJLLLLLL(8, viewSwitcher);
        viewSwitcher.setClipChildren(false);
        viewSwitcher.setClipToPadding(false);
        C19ME c19me5 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me5)) {
            ((ViewGroup.MarginLayoutParams) c19me5).topMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me5)) {
            i = 0;
            c19me5.bottomToBottom = 0;
        } else {
            i = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.endToEnd = i;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.horizontalBias = 0.0f;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.topToBottom = R.id.i0r;
        }
        TextSwitcher textSwitcher = new TextSwitcher(context);
        textSwitcher.setId(R.id.ugr);
        C786410Ut5.LJLLLLLL(8, textSwitcher);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = android.view.a.LJ(-1, -2, viewSwitcher);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            marginLayoutParamsLJ4.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(textSwitcher);
        if (textSwitcher.getParent() == null) {
            viewSwitcher.addView(textSwitcher, marginLayoutParamsLJ4);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.xu0);
        viewStub.setLayoutResource(R.layout.cq7);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ5 = android.view.a.LJ(-2, -2, viewSwitcher);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            marginLayoutParamsLJ5.setMarginStart((int) TypedValue.applyDimension(1, -8.0f, resources.getDisplayMetrics()));
        }
        viewStub.setInflatedId(-1);
        android.view.a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            viewSwitcher.addView(viewStub, marginLayoutParamsLJ5);
        }
        android.view.a.LIZ(viewSwitcher);
        if (viewSwitcher.getParent() == null) {
            constraintLayout2.addView(viewSwitcher, c19me5);
        }
        android.view.a.LIZ(constraintLayout2);
        if (constraintLayout2.getParent() == null) {
            constraintLayout.addView(constraintLayout2, c19me3);
        }
        android.view.a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
