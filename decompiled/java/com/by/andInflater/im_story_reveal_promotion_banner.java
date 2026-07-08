package com.by.andInflater;

import X.C197039127h;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.f;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class im_story_reveal_promotion_banner implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.w9s);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.c3});
        constraintLayout.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        constraintLayout.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 240.0f, resources.getDisplayMetrics()), -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 1;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout$LayoutParams) layoutParams).gravity = 1;
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.jue);
        tuxIconView.setContentDescription(context.getResources().getString(2131828871));
        tuxIconView.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        C19ME c19me = new C19ME((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me)) {
            c19me.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130775058", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100625", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, c19me);
        }
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.w9t);
        smartImageView.setContentDescription(null);
        smartImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        C19ME c19me2 = new C19ME((int) TypedValue.applyDimension(1, 144.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            ((ViewGroup.MarginLayoutParams) c19me2).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
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
        android.view.a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            constraintLayout.addView(smartImageView, c19me2);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.tv_story_reveal_title);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setGravity(17);
        tuxTextView.setMaxLines(2);
        tuxTextView.setText(2131849072);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C19ME c19me3 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            ((ViewGroup.MarginLayoutParams) c19me3).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            c19me3.setMarginStart((int) TypedValue.applyDimension(1, 6.5f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            c19me3.setMarginEnd((int) TypedValue.applyDimension(1, 6.5f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToBottom = R.id.w9t;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H3_Bold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, c19me3);
        }
        C197039127h c197039127h = new C197039127h(context);
        c197039127h.setId(R.id.cvc);
        c197039127h.setGravity(17);
        c197039127h.setText(2131849071);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        c197039127h.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        C19ME c19me4 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            ((ViewGroup.MarginLayoutParams) c19me4).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.topToBottom = R.id.tv_story_reveal_title;
        }
        new f();
        f.LIZ("app:tux_buttonSize", new a.c("large"), c197039127h);
        f.LIZ("app:tux_buttonVariant", new a.c("secondary"), c197039127h);
        android.view.a.LIZ(c197039127h);
        if (c197039127h.getParent() == null) {
            constraintLayout.addView(c197039127h, c19me4);
        }
        android.view.a.LIZ(constraintLayout);
        if (constraintLayout.getParent() == null) {
            frameLayout.addView(constraintLayout, layoutParams);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
