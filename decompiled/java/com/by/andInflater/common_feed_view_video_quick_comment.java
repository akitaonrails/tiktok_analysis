package com.by.andInflater;

import X.C1353500lKG;
import X.C197039127h;
import X.C19ME;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.f;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_view_video_quick_comment implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        float f;
        Resources resources = context.getResources();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.hk);
        Resources resources2 = contextThemeWrapper.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(contextThemeWrapper);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), viewGroup);
        View c1353500lKG = new C1353500lKG(contextThemeWrapper);
        c1353500lKG.setId(R.id.o_j);
        C786410Ut5.LJLLLLLL(8, c1353500lKG);
        C19ME c19me = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        a.LIZ(c1353500lKG);
        if (c1353500lKG.getParent() == null) {
            constraintLayout.addView(c1353500lKG, c19me);
        }
        SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(contextThemeWrapper);
        smartAvatarImageView.setId(R.id.l9h);
        C786410Ut5.LJZI(8, smartAvatarImageView);
        C19ME c19me2 = new C19ME((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            c19me2.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = 0;
        }
        a.LIZ(smartAvatarImageView);
        if (smartAvatarImageView.getParent() == null) {
            constraintLayout.addView(smartAvatarImageView, c19me2);
        }
        TuxTextView tuxTextView = new TuxTextView(contextThemeWrapper);
        tuxTextView.setId(R.id.zld);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setGravity(8388627);
        tuxTextView.setTextAlignment(5);
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        tuxTextView.setAutoSizeTextTypeWithDefaults(1);
        C19ME c19me3 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            c19me3.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources2.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            c19me3.setMarginEnd((int) TypedValue.applyDimension(1, 6.0f, resources2.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.goneStartMargin = (int) TypedValue.applyDimension(1, 20.0f, resources2.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Regular"), tuxTextView);
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToEnd = R.id.l9h;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToStart = R.id.i2d;
        }
        tuxTextView.setAutoSizeTextTypeUniformWithConfiguration((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), 1);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, c19me3);
        }
        View view = new View(contextThemeWrapper);
        view.setId(R.id.v_touch_area);
        C19ME c19me4 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1);
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.endToEnd = R.id.zld;
        }
        android.view.a.LIZ(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, c19me4);
        }
        FrameLayout frameLayout = new FrameLayout(contextThemeWrapper);
        frameLayout.setId(R.id.i2d);
        C19ME c19me5 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.endToStart = R.id.cuv;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.bottomToBottom = 0;
        }
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        linearLayout.setId(R.id.ncy);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.setMarginEnd((int) TypedValue.applyDimension(1, 14.0f, resources2.getDisplayMetrics()));
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout.addView(linearLayout, layoutParams);
        }
        FrameLayout frameLayout2 = new FrameLayout(contextThemeWrapper);
        frameLayout2.setId(R.id.krs);
        C786410Ut5.LJLLLLLL(8, frameLayout2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources2.getDisplayMetrics()));
        }
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2, layoutParams2);
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            constraintLayout.addView(frameLayout, c19me5);
        }
        C197039127h c197039127h = new C197039127h(contextThemeWrapper);
        c197039127h.setId(R.id.cuv);
        c197039127h.setContentDescription(contextThemeWrapper.getResources().getString(2131823225));
        C786410Ut5.LJLLLLLL(8, c197039127h);
        C19ME c19me6 = new C19ME((int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            f = 8.0f;
            c19me6.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources2.getDisplayMetrics()));
        } else {
            f = 8.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            c19me6.setMarginEnd((int) TypedValue.applyDimension(1, f, resources2.getDisplayMetrics()));
        }
        new f();
        f.LIZ("android:foregroundGravity", new a.c("center"), c197039127h);
        if (LinearLayout.LayoutParams.class.isInstance(c19me6)) {
            ((LinearLayout.LayoutParams) c19me6).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(c19me6)) {
            ((FrameLayout.LayoutParams) c19me6).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(c19me6)) {
            ((DrawerLayout$LayoutParams) c19me6).gravity = 16;
        }
        f.LIZ("app:tux_iconStart", new a.b("2130772479", "raw"), c197039127h);
        f.LIZ("app:tux_iconHeight", new a.d("16", "dp"), c197039127h);
        f.LIZ("app:tux_iconWidth", new a.d("16", "dp"), c197039127h);
        f.LIZ("app:tux_tintColor", new a.b("2131100593", "attr"), c197039127h);
        f.LIZ("app:tux_buttonCapsule", new a.c("true"), c197039127h);
        f.LIZ("app:tux_buttonVariant", new a.c("primary"), c197039127h);
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.bottomToBottom = 0;
        }
        android.view.a.LIZ(c197039127h);
        if (c197039127h.getParent() == null) {
            constraintLayout.addView(c197039127h, c19me6);
        }
        android.view.a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
