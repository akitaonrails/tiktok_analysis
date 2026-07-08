package com.by.andInflater;

import X.C1749280vcc;
import X.C197039127h;
import X.C19ME;
import X.C427660Gpo;
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
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;
import xem.f;
import xem.k;
import xem.n;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class mix_feed_mix_detail_dialog_fragment implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.ohd);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.p1b);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        View tuxNavBar = new TuxNavBar(context);
        tuxNavBar.setId(R.id.p15);
        C19ME c19me = new C19ME(-1, -2);
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        a.LIZ(tuxNavBar);
        if (tuxNavBar.getParent() == null) {
            constraintLayout.addView(tuxNavBar, c19me);
        }
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(R.id.fdv);
        C786410Ut5.LJLLLLLL(8, constraintLayout2);
        C19ME c19me2 = new C19ME(-1, (int) TypedValue.applyDimension(1, 74.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToTop = 0;
        }
        View view = new View(context);
        view.setId(R.id.cel);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a03});
        view.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C19ME c19me3 = new C19ME(-1, (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToStart = 0;
        }
        a.LIZ(view);
        if (view.getParent() == null) {
            constraintLayout2.addView(view, c19me3);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.qv2);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setTextDirection(5);
        tuxTextView.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C19ME c19me4 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            c19me4.setMarginStart((int) resources.getDimension(R.dimen.sf));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            c19me4.setMarginEnd((int) resources.getDimension(R.dimen.sr));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            ((ViewGroup.MarginLayoutParams) c19me4).topMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.constrainedWidth = true;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.endToStart = R.id.h4t;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.horizontalBias = 0.0f;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.topToTop = 0;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H3_Bold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout2.addView(tuxTextView, c19me4);
        }
        C427660Gpo c427660Gpo = new C427660Gpo(context);
        c427660Gpo.setId(R.id.user_avatar);
        C786410Ut5.LJZI(4, c427660Gpo);
        C19ME c19me5 = new C19ME((int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me5)) {
            ((ViewGroup.MarginLayoutParams) c19me5).topMargin = (int) resources.getDimension(R.dimen.sz);
        }
        c cVar = new c();
        cVar.LIZIZ("app:failureImage", new a.b("2130976610", "drawable"), c427660Gpo);
        if (C19ME.class.isInstance(c19me5)) {
            i = R.id.qv2;
            c19me5.startToStart = R.id.qv2;
        } else {
            i = R.id.qv2;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.topToBottom = i;
        }
        cVar.LIZIZ("app:placeholderImage", new a.b("2130976610", "drawable"), c427660Gpo);
        cVar.LIZ(c427660Gpo);
        android.view.a.LIZ(c427660Gpo);
        if (c427660Gpo.getParent() == null) {
            constraintLayout2.addView(c427660Gpo, c19me5);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.wlq);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        C19ME c19me6 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            c19me6.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            c19me6.setMarginEnd((int) resources.getDimension(R.dimen.sr));
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.bottomToBottom = R.id.user_avatar;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.endToStart = R.id.h4t;
        }
        if (C19ME.class.isInstance(c19me6)) {
            i2 = R.id.user_avatar;
            c19me6.startToEnd = R.id.user_avatar;
        } else {
            i2 = R.id.user_avatar;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.topToTop = i2;
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.bc6);
        tuxTextView2.setTextDirection(5);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout.addView(tuxTextView2, layoutParams2);
        }
        View view2 = new View(context);
        view2.setId(R.id.uqc);
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1p});
        view2.setBackgroundColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        C786410Ut5.LJLLLLLL(8, view2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()), (int) resources.getDimension(R.dimen.s9));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            i3 = R.dimen.sz;
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = (int) resources.getDimension(R.dimen.sz);
        } else {
            i3 = R.dimen.sz;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = (int) resources.getDimension(i3);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.setMarginStart((int) resources.getDimension(R.dimen.t8));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.setMarginEnd((int) resources.getDimension(R.dimen.t8));
        }
        android.view.a.LIZ(view2);
        if (view2.getParent() == null) {
            linearLayout.addView(view2, layoutParams3);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.qux);
        tuxTextView3.setTextDirection(5);
        tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView3.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes5.getColor(0, 0));
        typedArrayObtainStyledAttributes5.recycle();
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            linearLayout.addView(tuxTextView3, layoutParams4);
        }
        View view3 = new View(context);
        view3.setId(R.id.uqd);
        TypedArray typedArrayObtainStyledAttributes6 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1p});
        view3.setBackgroundColor(typedArrayObtainStyledAttributes6.getColor(0, 0));
        typedArrayObtainStyledAttributes6.recycle();
        C786410Ut5.LJLLLLLL(8, view3);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()), (int) resources.getDimension(R.dimen.s9));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            i4 = R.dimen.sz;
            ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = (int) resources.getDimension(R.dimen.sz);
        } else {
            i4 = R.dimen.sz;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = (int) resources.getDimension(i4);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            i5 = R.dimen.t8;
            layoutParams5.setMarginStart((int) resources.getDimension(R.dimen.t8));
        } else {
            i5 = R.dimen.t8;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.setMarginEnd((int) resources.getDimension(i5));
        }
        android.view.a.LIZ(view3);
        if (view3.getParent() == null) {
            linearLayout.addView(view3, layoutParams5);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.qv4);
        tuxTextView4.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView4.setTextDirection(5);
        tuxTextView4.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes7 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView4.setTextColor(typedArrayObtainStyledAttributes7.getColor(0, 0));
        typedArrayObtainStyledAttributes7.recycle();
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView4);
        android.view.a.LIZ(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            linearLayout.addView(tuxTextView4, layoutParams6);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            constraintLayout2.addView(linearLayout, c19me6);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.h4t);
        linearLayout2.setOrientation(0);
        C19ME c19me7 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me7)) {
            c19me7.setMarginEnd((int) resources.getDimension(R.dimen.t2));
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.topToTop = 0;
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.goo);
        tuxIconView.setContentDescription(context.getResources().getString(2131833248));
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            i6 = 16;
            layoutParams7.gravity = 16;
        } else {
            i6 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((FrameLayout.LayoutParams) layoutParams7).gravity = i6;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams7)) {
            ((DrawerLayout$LayoutParams) layoutParams7).gravity = i6;
        }
        new k();
        k.LIZ("android:layout_marginVertical", new a.b("2131296935", "dimen"), tuxIconView);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.setMarginStart((int) resources.getDimension(R.dimen.t9));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.setMarginEnd((int) resources.getDimension(R.dimen.t2));
        }
        k.LIZ("app:tux_icon", new a.b("2130773650", "raw"), tuxIconView);
        k.LIZ("app:tux_iconHeight", new a.b("2131296937", "dimen"), tuxIconView);
        k.LIZ("app:tux_iconWidth", new a.b("2131296913", "dimen"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout2.addView(tuxIconView, layoutParams7);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.e1y);
        tuxIconView2.setContentDescription(context.getResources().getString(2131828870));
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            i7 = 16;
            layoutParams8.gravity = 16;
        } else {
            i7 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((FrameLayout.LayoutParams) layoutParams8).gravity = i7;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams8)) {
            ((DrawerLayout$LayoutParams) layoutParams8).gravity = i7;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.setMargins((int) resources.getDimension(R.dimen.t9), (int) resources.getDimension(R.dimen.t9), (int) resources.getDimension(R.dimen.t9), (int) resources.getDimension(R.dimen.t9));
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130775055", "raw"), tuxIconView2);
        k.LIZ("app:tux_iconHeight", new a.b("2131296937", "dimen"), tuxIconView2);
        k.LIZ("app:tux_iconWidth", new a.b("2131296913", "dimen"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            linearLayout2.addView(tuxIconView2, layoutParams8);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            constraintLayout2.addView(linearLayout2, c19me7);
        }
        android.view.a.LIZ(constraintLayout2);
        if (constraintLayout2.getParent() == null) {
            constraintLayout.addView(constraintLayout2, c19me2);
        }
        android.view.a.LIZ(constraintLayout);
        if (constraintLayout.getParent() == null) {
            relativeLayout.addView(constraintLayout, layoutParams);
        }
        View viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
        viewOnAttachStateChangeListenerC20604515jv.setId(R.id.rn0);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.addRule(2, R.id.d88);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.addRule(3, R.id.p1b);
        }
        android.view.a.LIZ(viewOnAttachStateChangeListenerC20604515jv);
        if (viewOnAttachStateChangeListenerC20604515jv.getParent() == null) {
            relativeLayout.addView(viewOnAttachStateChangeListenerC20604515jv, layoutParams9);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.d88);
        TypedArray typedArrayObtainStyledAttributes8 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1b});
        linearLayout3.setBackgroundColor(typedArrayObtainStyledAttributes8.getColor(0, 0));
        typedArrayObtainStyledAttributes8.recycle();
        linearLayout3.setLayoutDirection(3);
        linearLayout3.setOrientation(0);
        C786410Ut5.LJLLLLLL(8, linearLayout3);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.addRule(12, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.setMarginStart((int) resources.getDimension(R.dimen.sf));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            ((ViewGroup.MarginLayoutParams) layoutParams10).topMargin = (int) resources.getDimension(R.dimen.sb);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.setMarginEnd((int) resources.getDimension(R.dimen.sf));
        }
        C197039127h c197039127h = new C197039127h(context);
        c197039127h.setId(R.id.uyq);
        c197039127h.setPadding((int) resources.getDimension(R.dimen.sh), c197039127h.getPaddingTop(), (int) resources.getDimension(R.dimen.sh), c197039127h.getPaddingBottom());
        c197039127h.setText(2131824970);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.setMarginEnd((int) resources.getDimension(R.dimen.sz));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.weight = 1;
        }
        new f();
        f.LIZ("app:tux_buttonAutoSizing", new a.c("true"), c197039127h);
        f.LIZ("app:tux_buttonSize", new a.c("large"), c197039127h);
        f.LIZ("app:tux_buttonVariant", new a.c("secondary"), c197039127h);
        f.LIZ("app:tux_iconStart", new a.b("2130772475", "raw"), c197039127h);
        f.LIZ("app:tux_minTextSize", new a.d("11", "sp"), c197039127h);
        android.view.a.LIZ(c197039127h);
        if (c197039127h.getParent() == null) {
            linearLayout3.addView(c197039127h, layoutParams11);
        }
        C197039127h c197039127h2 = new C197039127h(context);
        c197039127h2.setId(R.id.hpq);
        c197039127h2.setPadding((int) resources.getDimension(R.dimen.sh), c197039127h2.getPaddingTop(), (int) resources.getDimension(R.dimen.sh), c197039127h2.getPaddingBottom());
        c197039127h2.setText(2131824971);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.setMarginStart((int) resources.getDimension(R.dimen.sz));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.weight = 1;
        }
        new f();
        f.LIZ("app:tux_buttonAutoSizing", new a.c("true"), c197039127h2);
        f.LIZ("app:tux_buttonSize", new a.c("large"), c197039127h2);
        f.LIZ("app:tux_buttonVariant", new a.c("secondary"), c197039127h2);
        f.LIZ("app:tux_iconStart", new a.b("2130772735", "raw"), c197039127h2);
        f.LIZ("app:tux_minTextSize", new a.d("11", "sp"), c197039127h2);
        android.view.a.LIZ(c197039127h2);
        if (c197039127h2.getParent() == null) {
            linearLayout3.addView(c197039127h2, layoutParams12);
        }
        android.view.a.LIZ(linearLayout3);
        if (linearLayout3.getParent() == null) {
            relativeLayout.addView(linearLayout3, layoutParams10);
        }
        C1749280vcc c1749280vcc = new C1749280vcc(context);
        c1749280vcc.setId(R.id.w28);
        TypedArray typedArrayObtainStyledAttributes9 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.bx});
        c1749280vcc.setBackgroundColor(typedArrayObtainStyledAttributes9.getColor(0, 0));
        typedArrayObtainStyledAttributes9.recycle();
        C786410Ut5.LLLZLZ(c1749280vcc, 8);
        RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.addRule(3, R.id.p1b);
        }
        new n();
        n.LIZ(new a.c("hug_content"), c1749280vcc);
        android.view.a.LIZ(c1749280vcc);
        if (c1749280vcc.getParent() == null) {
            relativeLayout.addView(c1749280vcc, layoutParams13);
        }
        android.view.a.LIZ(relativeLayout);
        C786410Ut5.W5(relativeLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(relativeLayout);
        }
        return relativeLayout;
    }
}
