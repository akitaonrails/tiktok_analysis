package com.by.andInflater;

import X.C1295960jpS;
import X.C197039127h;
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
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.f;
import xem.k;

/* JADX INFO: loaded from: classes32.dex */
public class aweme_comment_keyboard_icon_group_view implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.lzc);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("android:foregroundGravity", new a.c("center"), tuxIconView);
        k.LIZ("app:tux_icon", new a.b("2130774999", "raw"), tuxIconView);
        k.LIZ("app:tux_iconHeight", new a.d("24", "dp"), tuxIconView);
        k.LIZ("app:tux_iconWidth", new a.d("24", "dp"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout.addView(tuxIconView, layoutParams);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.lml);
        tuxIconView2.setContentDescription(context.getResources().getString(2131823218));
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("android:foregroundGravity", new a.c("center"), tuxIconView2);
        k.LIZ("app:tux_icon", new a.b("2130774138", "raw"), tuxIconView2);
        k.LIZ("app:tux_iconHeight", new a.d("24", "dp"), tuxIconView2);
        k.LIZ("app:tux_iconWidth", new a.d("24", "dp"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            linearLayout.addView(tuxIconView2, layoutParams2);
        }
        TuxIconView tuxIconView3 = new TuxIconView(context);
        tuxIconView3.setId(R.id.l99);
        tuxIconView3.setContentDescription(context.getResources().getString(2131823218));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("android:foregroundGravity", new a.c("center"), tuxIconView3);
        k.LIZ("app:tux_icon", new a.b("2130772503", "raw"), tuxIconView3);
        k.LIZ("app:tux_iconHeight", new a.d("24", "dp"), tuxIconView3);
        k.LIZ("app:tux_iconWidth", new a.d("24", "dp"), tuxIconView3);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView3);
        android.view.a.LIZ(tuxIconView3);
        if (tuxIconView3.getParent() == null) {
            linearLayout.addView(tuxIconView3, layoutParams3);
        }
        TuxIconView tuxIconView4 = new TuxIconView(context);
        tuxIconView4.setId(R.id.lis);
        tuxIconView4.setContentDescription(context.getResources().getString(2131831365));
        C786410Ut5.LLLLLLZZ(tuxIconView4, 8);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("android:foregroundGravity", new a.c("center"), tuxIconView4);
        k.LIZ("app:tux_icon", new a.b("2130772779", "raw"), tuxIconView4);
        k.LIZ("app:tux_iconHeight", new a.d("24", "dp"), tuxIconView4);
        k.LIZ("app:tux_iconWidth", new a.d("24", "dp"), tuxIconView4);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView4);
        android.view.a.LIZ(tuxIconView4);
        if (tuxIconView4.getParent() == null) {
            linearLayout.addView(tuxIconView4, layoutParams4);
        }
        TuxIconView tuxIconView5 = new TuxIconView(context);
        tuxIconView5.setId(R.id.lfo);
        tuxIconView5.setContentDescription(context.getResources().getString(2131823216));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("android:foregroundGravity", new a.c("center"), tuxIconView5);
        k.LIZ("app:tux_icon", new a.b("2130773654", "raw"), tuxIconView5);
        k.LIZ("app:tux_iconHeight", new a.d("24", "dp"), tuxIconView5);
        k.LIZ("app:tux_iconWidth", new a.d("24", "dp"), tuxIconView5);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView5);
        android.view.a.LIZ(tuxIconView5);
        if (tuxIconView5.getParent() == null) {
            linearLayout.addView(tuxIconView5, layoutParams5);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.kcl);
        frameLayout.setImportantForAccessibility(1);
        frameLayout.setFocusable(true);
        frameLayout.setClickable(true);
        frameLayout.setContentDescription(context.getResources().getString(2131823176));
        ViewGroup.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        TuxIconView tuxIconView6 = new TuxIconView(context);
        tuxIconView6.setId(R.id.ll7);
        tuxIconView6.setImportantForAccessibility(2);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("android:foregroundGravity", new a.c("center"), tuxIconView6);
        k.LIZ("app:tux_icon", new a.b("2130773993", "raw"), tuxIconView6);
        k.LIZ("app:tux_iconHeight", new a.d("24", "dp"), tuxIconView6);
        k.LIZ("app:tux_iconWidth", new a.d("24", "dp"), tuxIconView6);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView6);
        android.view.a.LIZ(tuxIconView6);
        if (tuxIconView6.getParent() == null) {
            frameLayout.addView(tuxIconView6, layoutParams7);
        }
        C1295960jpS c1295960jpS = new C1295960jpS(context);
        c1295960jpS.setId(R.id.kcm);
        C786410Ut5.LJZI(8, c1295960jpS);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(c1295960jpS);
        if (c1295960jpS.getParent() == null) {
            frameLayout.addView(c1295960jpS, layoutParams8);
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams6);
        }
        TuxIconView tuxIconView7 = new TuxIconView(context);
        tuxIconView7.setId(R.id.lzj);
        C786410Ut5.LLLLLLZZ(tuxIconView7, 8);
        tuxIconView7.setImportantForAccessibility(2);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("android:foregroundGravity", new a.c("center"), tuxIconView7);
        k.LIZ("app:tux_icon", new a.b("2130774293", "raw"), tuxIconView7);
        k.LIZ("app:tux_iconHeight", new a.d("24", "dp"), tuxIconView7);
        k.LIZ("app:tux_iconWidth", new a.d("24", "dp"), tuxIconView7);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView7);
        android.view.a.LIZ(tuxIconView7);
        if (tuxIconView7.getParent() == null) {
            linearLayout.addView(tuxIconView7, layoutParams9);
        }
        TuxIconView tuxIconView8 = new TuxIconView(context);
        tuxIconView8.setId(R.id.lie);
        C786410Ut5.LLLLLLZZ(tuxIconView8, 8);
        tuxIconView8.setContentDescription(context.getResources().getString(2131823217));
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("android:foregroundGravity", new a.c("center"), tuxIconView8);
        k.LIZ("app:tux_icon", new a.b("2130773907", "raw"), tuxIconView8);
        k.LIZ("app:tux_iconHeight", new a.d("24", "dp"), tuxIconView8);
        k.LIZ("app:tux_iconWidth", new a.d("24", "dp"), tuxIconView8);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView8);
        android.view.a.LIZ(tuxIconView8);
        if (tuxIconView8.getParent() == null) {
            linearLayout.addView(tuxIconView8, layoutParams10);
        }
        TuxIconView tuxIconView9 = new TuxIconView(context);
        tuxIconView9.setId(R.id.lri);
        tuxIconView9.setContentDescription(context.getResources().getString(2131829074));
        C786410Ut5.LLLLLLZZ(tuxIconView9, 8);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("android:foregroundGravity", new a.c("center"), tuxIconView9);
        k.LIZ("app:tux_icon", new a.b("2130774519", "raw"), tuxIconView9);
        k.LIZ("app:tux_iconHeight", new a.d("24", "dp"), tuxIconView9);
        k.LIZ("app:tux_iconWidth", new a.d("24", "dp"), tuxIconView9);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView9);
        android.view.a.LIZ(tuxIconView9);
        if (tuxIconView9.getParent() == null) {
            linearLayout.addView(tuxIconView9, layoutParams11);
        }
        TuxIconView tuxIconView10 = new TuxIconView(context);
        tuxIconView10.setId(R.id.lre);
        tuxIconView10.setContentDescription(context.getResources().getString(2131829132));
        C786410Ut5.LLLLLLZZ(tuxIconView10, 8);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("android:foregroundGravity", new a.c("center"), tuxIconView10);
        k.LIZ("app:tux_icon", new a.b("2130772503", "raw"), tuxIconView10);
        k.LIZ("app:tux_iconHeight", new a.d("24", "dp"), tuxIconView10);
        k.LIZ("app:tux_iconWidth", new a.d("24", "dp"), tuxIconView10);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView10);
        android.view.a.LIZ(tuxIconView10);
        if (tuxIconView10.getParent() == null) {
            linearLayout.addView(tuxIconView10, layoutParams12);
        }
        View view = new View(context);
        view.setId(R.id.v_spacer);
        ViewGroup.LayoutParams layoutParams13 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        android.view.a.LIZ(view);
        if (view.getParent() == null) {
            linearLayout.addView(view, layoutParams13);
        }
        C197039127h c197039127h = new C197039127h(context);
        c197039127h.setId(R.id.cuv);
        if (TextView.class.isInstance(c197039127h)) {
            i = 1;
            android.view.a.LJII((int) TypedValue.applyDimension(1, 46.0f, resources.getDisplayMetrics()), c197039127h);
        } else {
            i = 1;
            c197039127h.setMinimumWidth((int) TypedValue.applyDimension(1, 46.0f, resources.getDisplayMetrics()));
        }
        c197039127h.setMaxWidth((int) TypedValue.applyDimension(1, 200.0f, resources.getDisplayMetrics()));
        c197039127h.setPadding((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), c197039127h.getPaddingTop(), c197039127h.getPaddingRight(), c197039127h.getPaddingBottom());
        c197039127h.setPadding(c197039127h.getPaddingLeft(), c197039127h.getPaddingTop(), (int) TypedValue.applyDimension(i, 6.0f, resources.getDisplayMetrics()), c197039127h.getPaddingBottom());
        c197039127h.setContentDescription(context.getResources().getString(2131823225));
        C786410Ut5.LJLLLLLL(8, c197039127h);
        c197039127h.setMaxLines(i);
        c197039127h.setText("");
        int[] iArr = new int[i];
        iArr[0] = R.attr.a0p;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(iArr);
        c197039127h.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        new f();
        f.LIZ("android:enabled", new a.c("false"), c197039127h);
        f.LIZ("android:foregroundGravity", new a.c("center"), c197039127h);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.gravity = 48;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams14)) {
            ((FrameLayout.LayoutParams) layoutParams14).gravity = 48;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams14)) {
            ((DrawerLayout$LayoutParams) layoutParams14).gravity = 48;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams14)) {
            ((ViewGroup.MarginLayoutParams) layoutParams14).topMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        f.LIZ("app:tux_iconStart", new a.b("2130772479", "raw"), c197039127h);
        f.LIZ("app:tux_iconHeight", new a.d("16", "dp"), c197039127h);
        f.LIZ("app:tux_iconWidth", new a.d("16", "dp"), c197039127h);
        f.LIZ("app:tux_tintColor", new a.b("2131100593", "attr"), c197039127h);
        f.LIZ("app:tux_buttonCapsule", new a.c("true"), c197039127h);
        f.LIZ("app:tux_buttonVariant", new a.c("primary"), c197039127h);
        f.LIZ("app:tux_buttonSize", new a.c("tiny"), c197039127h);
        android.view.a.LIZ(c197039127h);
        if (c197039127h.getParent() == null) {
            linearLayout.addView(c197039127h, layoutParams14);
        }
        android.view.a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
