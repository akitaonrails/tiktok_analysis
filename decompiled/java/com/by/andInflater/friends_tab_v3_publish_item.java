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
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.zhiliaoapp.musically.R;
import dc.a;
import fd8.d;
import xem.f;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class friends_tab_v3_publish_item implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setPadding((int) resources.getDimension(R.dimen.sf), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), (int) resources.getDimension(R.dimen.sf), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), (int) resources.getDimension(R.dimen.sb), constraintLayout.getPaddingBottom());
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), (int) resources.getDimension(R.dimen.sl));
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        AvatarComponentView avatarComponentView = new AvatarComponentView(context);
        avatarComponentView.setId(R.id.bh2);
        C19ME c19me = new C19ME((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        new d();
        d.LIZ(new a.c("size40"), avatarComponentView);
        android.view.a.LIZ(avatarComponentView);
        if (avatarComponentView.getParent() == null) {
            constraintLayout.addView(avatarComponentView, c19me);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.eui);
        linearLayout.setOrientation(1);
        C19ME c19me2 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            c19me2.setMarginStart((int) resources.getDimension(R.dimen.sb));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            c19me2.setMarginEnd((int) resources.getDimension(R.dimen.sb));
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToStart = R.id.pnn;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.horizontalWeight = 1.0f;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToEnd = R.id.bh2;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.baselineToBaseline = R.id.bh2;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToTop = 0;
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.user_info);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) resources.getDimension(R.dimen.sj);
        }
        new o();
        o.LIZ("android:textFontWeight", new a.c("600"), tuxTextView);
        o.LIZ("app:tux_font", new a.c("Headline_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams2);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.rjc);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1p});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("android:textFontWeight", new a.c("450"), tuxTextView2);
        o.LIZ("app:tux_font", new a.c("H4_Regular"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout.addView(tuxTextView2, layoutParams3);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            constraintLayout.addView(linearLayout, c19me2);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.pnn);
        tuxIconView.setContentDescription("open album");
        C19ME c19me3 = new C19ME((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToStart = R.id.d78;
        }
        if (C19ME.class.isInstance(c19me3)) {
            i = 0;
            c19me3.topToTop = 0;
        } else {
            i = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = i;
        }
        new k();
        k.LIZ("app:tux_tintColor", new a.b("2131100624", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, c19me3);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.d78);
        C19ME c19me4 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me4)) {
            i2 = 0;
            c19me4.endToEnd = 0;
        } else {
            i2 = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.topToTop = i2;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.bottomToBottom = i2;
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.xrd);
        tuxIconView2.setContentDescription("text to photo");
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_tintColor", new a.b("2131100624", "attr"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            linearLayout2.addView(tuxIconView2, layoutParams4);
        }
        C197039127h c197039127h = new C197039127h(context);
        c197039127h.setId(R.id.xpy);
        c197039127h.setText(2131850120);
        C786410Ut5.LJLLLLLL(8, c197039127h);
        c197039127h.setMaxWidth((int) TypedValue.applyDimension(1, 200.0f, resources.getDisplayMetrics()));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        new f();
        f.LIZ("android:enabled", new a.c("true"), c197039127h);
        f.LIZ("app:tux_iconStart", new a.b("2130774388", "raw"), c197039127h);
        f.LIZ("app:tux_buttonCapsule", new a.c("true"), c197039127h);
        f.LIZ("app:tux_buttonSize", new a.c("small"), c197039127h);
        android.view.a.LIZ(c197039127h);
        if (c197039127h.getParent() == null) {
            linearLayout2.addView(c197039127h, layoutParams5);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            constraintLayout.addView(linearLayout2, c19me4);
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
