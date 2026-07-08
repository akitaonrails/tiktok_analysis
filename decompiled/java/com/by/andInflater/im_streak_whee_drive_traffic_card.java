package com.by.andInflater;

import X.C1295960jpS;
import X.C197039127h;
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
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.f;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class im_streak_whee_drive_traffic_card implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(frameLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), frameLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ).gravity = 17;
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.wak);
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
        tuxIconView.setId(R.id.waj);
        tuxIconView.setImportantForAccessibility(2);
        C19ME c19me = new C19ME((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            c19me.setMarginEnd((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130775058", "raw"), tuxIconView);
        k.LIZ("app:tux_iconHeight", new a.d("16", "dp"), tuxIconView);
        k.LIZ("app:tux_iconWidth", new a.d("16", "dp"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100625", "attr"), tuxIconView);
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.endToEnd = 0;
        }
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, c19me);
        }
        C1295960jpS c1295960jpS = new C1295960jpS(context);
        c1295960jpS.setId(R.id.wam);
        C19ME c19me2 = new C19ME((int) TypedValue.applyDimension(1, 144.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            ((ViewGroup.MarginLayoutParams) c19me2).topMargin = (int) resources.getDimension(R.dimen.sb);
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
        android.view.a.LIZ(c1295960jpS);
        if (c1295960jpS.getParent() == null) {
            constraintLayout.addView(c1295960jpS, c19me2);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.wan);
        tuxTextView.setGravity(17);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C19ME c19me3 = new C19ME(-1, -2);
        new o();
        o.LIZ("android:layout_marginHorizontal", new a.d("12", "dp"), tuxTextView);
        o.LIZ("app:tux_font", new a.c("Headline_Semibold"), tuxTextView);
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToBottom = R.id.wam;
        }
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, c19me3);
        }
        C197039127h c197039127h = new C197039127h(context);
        c197039127h.setId(R.id.wal);
        c197039127h.setGravity(17);
        C19ME c19me4 = new C19ME(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            i = 1;
            ((ViewGroup.MarginLayoutParams) c19me4).topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        } else {
            i = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            ((ViewGroup.MarginLayoutParams) c19me4).bottomMargin = (int) TypedValue.applyDimension(i, 12.0f, resources.getDisplayMetrics());
        }
        new f();
        f.LIZ("android:layout_marginHorizontal", new a.d("12", "dp"), c197039127h);
        f.LIZ("app:tux_buttonCapsule", new a.c("false"), c197039127h);
        f.LIZ("app:tux_buttonSize", new a.c("medium"), c197039127h);
        f.LIZ("app:tux_buttonAutoSizing", new a.c("false"), c197039127h);
        f.LIZ("app:tux_buttonVariant", new a.c("secondary"), c197039127h);
        f.LIZ("app:tux_font", new a.c("Headline_Semibold"), c197039127h);
        if (C19ME.class.isInstance(c19me4)) {
            i2 = 0;
            c19me4.bottomToBottom = 0;
        } else {
            i2 = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.endToEnd = i2;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.startToStart = i2;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.topToBottom = R.id.wan;
        }
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
