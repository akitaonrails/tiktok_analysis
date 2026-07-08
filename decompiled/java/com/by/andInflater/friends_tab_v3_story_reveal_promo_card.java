package com.by.andInflater;

import X.C197039127h;
import X.C19ME;
import X.C427760Gpy;
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
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.zhiliaoapp.musically.R;
import dc.a;
import fd8.d;
import xem.f;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class friends_tab_v3_story_reveal_promo_card implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        AvatarComponentView avatarComponentView = new AvatarComponentView(context);
        avatarComponentView.setId(R.id.imf);
        avatarComponentView.setClipChildren(false);
        C19ME c19me = new C19ME((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        new d();
        d.LIZ(new a.c("size40"), avatarComponentView);
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        android.view.a.LIZ(avatarComponentView);
        if (avatarComponentView.getParent() == null) {
            constraintLayout.addView(avatarComponentView, c19me);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.imm);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setText(2131849085);
        tuxTextView.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C19ME c19me2 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            c19me2.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToStart = R.id.imh;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToEnd = R.id.imf;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToTop = 0;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("Headline_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, c19me2);
        }
        C197039127h c197039127h = new C197039127h(context);
        c197039127h.setId(R.id.imh);
        c197039127h.setEllipsize(TextUtils.TruncateAt.END);
        c197039127h.setText(2131849084);
        c197039127h.setTextSize(2, 12.0f);
        C19ME c19me3 = new C19ME((int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        new f();
        f.LIZ("app:tux_buttonCapsule", new a.c("true"), c197039127h);
        f.LIZ("app:tux_buttonSize", new a.c("tiny"), c197039127h);
        f.LIZ("app:tux_buttonVariant", new a.c("secondary"), c197039127h);
        f.LIZ("app:tux_font", new a.c("P3_Semibold"), c197039127h);
        f.LIZ("app:tux_minTextSize", new a.d("10", "dp"), c197039127h);
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToTop = R.id.imf;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToEnd = 0;
        }
        android.view.a.LIZ(c197039127h);
        if (c197039127h.getParent() == null) {
            constraintLayout.addView(c197039127h, c19me3);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.iml);
        tuxTextView2.setText(2131849083);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C19ME c19me4 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            ((ViewGroup.MarginLayoutParams) c19me4).topMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me4)) {
            i = R.id.imm;
            c19me4.topToBottom = R.id.imm;
        } else {
            i = R.id.imm;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.startToStart = i;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.endToEnd = 0;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Regular"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            constraintLayout.addView(tuxTextView2, c19me4);
        }
        RadiusLayout radiusLayout = new RadiusLayout(context);
        radiusLayout.setId(R.id.imk);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a03});
        radiusLayout.setBackgroundColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        C19ME c19me5 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 172.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me5)) {
            ((ViewGroup.MarginLayoutParams) c19me5).topMargin = (int) resources.getDimension(R.dimen.s9);
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.topToBottom = R.id.iml;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.startToStart = R.id.imm;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.endToEnd = 0;
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.imj);
        appCompatImageView.setContentDescription(null);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = android.view.a.LJ(-1, -1, radiusLayout);
        android.view.a.LIZ(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            radiusLayout.addView(appCompatImageView, marginLayoutParamsLJ2);
        }
        android.view.a.LIZ(radiusLayout);
        if (radiusLayout.getParent() == null) {
            constraintLayout.addView(radiusLayout, c19me5);
        }
        View c427760Gpy = new C427760Gpy(context);
        c427760Gpy.setId(R.id.img);
        C19ME c19me6 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            ((ViewGroup.MarginLayoutParams) c19me6).topMargin = (int) resources.getDimension(R.dimen.s9);
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.topToBottom = R.id.imk;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.startToStart = R.id.imm;
        }
        android.view.a.LIZ(c427760Gpy);
        if (c427760Gpy.getParent() == null) {
            constraintLayout.addView(c427760Gpy, c19me6);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.imi);
        tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView3.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        C19ME c19me7 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me7)) {
            c19me7.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.bottomToBottom = R.id.img;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.startToEnd = R.id.img;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.topToTop = R.id.img;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Regular"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            constraintLayout.addView(tuxTextView3, c19me7);
        }
        android.view.a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
