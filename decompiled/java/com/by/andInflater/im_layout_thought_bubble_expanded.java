package com.by.andInflater;

import X.C1826440xd4;
import X.C197039127h;
import X.C19M4;
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
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.social.thought.view.SocialThoughtBaseBubbleBackgroundView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.f;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class im_layout_thought_bubble_expanded implements InterfaceC20742716Ev {
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v25 */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        ?? r1;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.xu3);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        SocialThoughtBaseBubbleBackgroundView socialThoughtBaseBubbleBackgroundView = new SocialThoughtBaseBubbleBackgroundView(context);
        socialThoughtBaseBubbleBackgroundView.setId(R.id.xty);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.xtz);
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        constraintLayout.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), constraintLayout.getPaddingBottom());
        constraintLayout.setClipChildren(false);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -2, socialThoughtBaseBubbleBackgroundView);
        C19M4 c19m4 = new C19M4(context);
        c19m4.setId(R.id.xu4);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        c19m4.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C19ME c19me = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        new o();
        o.LIZ("app:tux_iconPadding", new a.d("4", "dp"), c19m4);
        o.LIZ("app:tux_font", new a.c("SmallText1_Regular"), c19m4);
        o.LIZ("app:tux_iconStart", new a.b("2130773821", "raw"), c19m4);
        o.LIZ("app:tux_tintColorStart", new a.b("2131100625", "attr"), c19m4);
        o.LIZ("app:tux_iconHeightStart", new a.d("12", "dp"), c19m4);
        o.LIZ("app:tux_iconWidthStart", new a.d("12", "dp"), c19m4);
        android.view.a.LIZ(c19m4);
        if (c19m4.getParent() == null) {
            constraintLayout.addView(c19m4, c19me);
        }
        C1826440xd4 c1826440xd4 = new C1826440xd4(context, null, 6);
        c1826440xd4.setId(R.id.xtx);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        c1826440xd4.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C19ME c19me2 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            r1 = 1;
            c19me2.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        } else {
            r1 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            ((ViewGroup.MarginLayoutParams) c19me2).topMargin = (int) TypedValue.applyDimension(r1, 4.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.constrainedWidth = r1;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToStart = R.id.xug;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.horizontalBias = 0.0f;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToBottom = R.id.xu4;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("Headline_Regular"), c1826440xd4);
        android.view.a.LIZ(c1826440xd4);
        if (c1826440xd4.getParent() == null) {
            constraintLayout.addView(c1826440xd4, c19me2);
        }
        C197039127h c197039127h = new C197039127h(context);
        c197039127h.setId(R.id.xug);
        c197039127h.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), c197039127h.getPaddingTop(), c197039127h.getPaddingRight(), c197039127h.getPaddingBottom());
        c197039127h.setPadding(c197039127h.getPaddingLeft(), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), c197039127h.getPaddingRight(), c197039127h.getPaddingBottom());
        c197039127h.setPadding(c197039127h.getPaddingLeft(), c197039127h.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), c197039127h.getPaddingBottom());
        c197039127h.setPadding(c197039127h.getPaddingLeft(), c197039127h.getPaddingTop(), c197039127h.getPaddingRight(), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        c197039127h.setText(2131850194);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        c197039127h.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        C19ME c19me3 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToTop = 0;
        }
        new f();
        f.LIZ("app:tux_buttonCapsule", new a.c("true"), c197039127h);
        f.LIZ("app:tux_buttonSize", new a.c("small"), c197039127h);
        f.LIZ("app:tux_buttonVariant", new a.c("secondary"), c197039127h);
        f.LIZ("app:tux_font", new a.c("P2_Semibold"), c197039127h);
        f.LIZ("app:tux_iconHeightStart", new a.d("14", "dp"), c197039127h);
        f.LIZ("app:tux_iconPadding", new a.d("4", "dp"), c197039127h);
        f.LIZ("app:tux_iconStart", new a.b("2130772473", "raw"), c197039127h);
        f.LIZ("app:tux_iconWidthStart", new a.d("14", "dp"), c197039127h);
        f.LIZ("app:tux_tintColorStart", new a.b("2131100622", "attr"), c197039127h);
        android.view.a.LIZ(c197039127h);
        if (c197039127h.getParent() == null) {
            constraintLayout.addView(c197039127h, c19me3);
        }
        android.view.a.LIZ(constraintLayout);
        if (constraintLayout.getParent() == null) {
            socialThoughtBaseBubbleBackgroundView.addView(constraintLayout, layoutParamsLJ);
        }
        android.view.a.LIZ(socialThoughtBaseBubbleBackgroundView);
        if (socialThoughtBaseBubbleBackgroundView.getParent() == null) {
            frameLayout.addView(socialThoughtBaseBubbleBackgroundView, layoutParams);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
