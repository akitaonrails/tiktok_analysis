package com.by.andInflater;

import X.C427870Gq9;
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
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class layout_detail_action_button implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.fps);
        linearLayout.setOrientation(0);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, (int) resources.getDimension(R.dimen.rk), viewGroup);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ).addRule(12, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ).addRule(14, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.bottomMargin = (int) resources.getDimension(R.dimen.rj);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.vz7);
        ViewGroup.MarginLayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) resources.getDimension(R.dimen.rk));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(14, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.bottomMargin = (int) resources.getDimension(R.dimen.rj);
        }
        View view = new View(context);
        view.setId(R.id.vzd);
        view.setBackgroundResource(R.drawable.bgm);
        C786410Ut5.LJLLLLLL(8, view);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) resources.getDimension(R.dimen.ro), (int) resources.getDimension(R.dimen.rn));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
            ((DrawerLayout$LayoutParams) layoutParams2).gravity = 17;
        }
        a.LIZ(view);
        if (view.getParent() == null) {
            frameLayout.addView(view, layoutParams2);
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.vz_);
        relativeLayout.setPadding((int) resources.getDimension(R.dimen.ry), relativeLayout.getPaddingTop(), relativeLayout.getPaddingRight(), relativeLayout.getPaddingBottom());
        relativeLayout.setPadding((int) resources.getDimension(R.dimen.ry), relativeLayout.getPaddingTop(), relativeLayout.getPaddingRight(), relativeLayout.getPaddingBottom());
        relativeLayout.setPadding(relativeLayout.getPaddingLeft(), relativeLayout.getPaddingTop(), (int) resources.getDimension(R.dimen.ry), relativeLayout.getPaddingBottom());
        relativeLayout.setPadding(relativeLayout.getPaddingLeft(), relativeLayout.getPaddingTop(), (int) resources.getDimension(R.dimen.ry), relativeLayout.getPaddingBottom());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 65.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams3)) {
            ((DrawerLayout$LayoutParams) layoutParams3).gravity = 17;
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.vzf);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(20, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(9, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.setMarginEnd((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130775000", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            relativeLayout.addView(tuxIconView, layoutParams4);
        }
        C427870Gq9 c427870Gq9 = new C427870Gq9(context);
        c427870Gq9.setId(R.id.vz8);
        C786410Ut5.LJZI(8, c427870Gq9);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            i = R.id.vzf;
            layoutParams5.addRule(17, R.id.vzf);
        } else {
            i = R.id.vzf;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(1, i);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            i2 = -1;
            layoutParams5.addRule(20, -1);
        } else {
            i2 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(9, i2);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(15, i2);
        }
        c cVar = new c();
        cVar.LIZIZ("app:placeholderImageScaleType", new a.c("centerCrop"), c427870Gq9);
        cVar.LIZIZ("app:roundAsCircle", new a.c("true"), c427870Gq9);
        cVar.LIZIZ("app:roundingBorderWidth", new a.d("1.5", "dp"), c427870Gq9);
        cVar.LIZIZ("app:roundingBorderColor", new a.b("2131099768", "attr"), c427870Gq9);
        cVar.LIZ(c427870Gq9);
        android.view.a.LIZ(c427870Gq9);
        if (c427870Gq9.getParent() == null) {
            relativeLayout.addView(c427870Gq9, layoutParams5);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.vze);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setGravity(16);
        tuxTextView.setMaxWidth((int) resources.getDimension(R.dimen.rt));
        tuxTextView.setMaxLines(1);
        tuxTextView.setSingleLine(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 65.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.addRule(15, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            i3 = R.id.vz8;
            layoutParams6.addRule(17, R.id.vz8);
        } else {
            i3 = R.id.vz8;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.addRule(1, i3);
        }
        new o();
        o.LIZ("app:tux_font", new a.c("Headline_Bold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            relativeLayout.addView(tuxTextView, layoutParams6);
        }
        android.view.a.LIZ(relativeLayout);
        if (relativeLayout.getParent() == null) {
            frameLayout.addView(relativeLayout, layoutParams3);
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.hrc);
        C786410Ut5.LJLLLLLL(8, frameLayout2);
        ViewGroup.MarginLayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, (int) resources.getDimension(R.dimen.rk));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams7)) {
            i4 = -1;
            ((RelativeLayout.LayoutParams) layoutParams7).addRule(12, -1);
        } else {
            i4 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((RelativeLayout.LayoutParams) layoutParams7).addRule(14, i4);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.setMarginStart((int) resources.getDimension(R.dimen.s1));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.hrh);
        linearLayout2.setPadding((int) resources.getDimension(R.dimen.s0), (int) resources.getDimension(R.dimen.s0), (int) resources.getDimension(R.dimen.s0), (int) resources.getDimension(R.dimen.s0));
        linearLayout2.setBackgroundResource(R.drawable.bgl);
        linearLayout2.setOrientation(0);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, (int) resources.getDimension(R.dimen.rh));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            i5 = 17;
            ((LinearLayout.LayoutParams) layoutParams8).gravity = 17;
        } else {
            i5 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.gravity = i5;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams8)) {
            ((DrawerLayout$LayoutParams) layoutParams8).gravity = i5;
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.vzf);
        ViewGroup.MarginLayoutParams layoutParams9 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams9)) {
            i6 = -1;
            ((RelativeLayout.LayoutParams) layoutParams9).addRule(20, -1);
        } else {
            i6 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams9)) {
            ((RelativeLayout.LayoutParams) layoutParams9).addRule(15, i6);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130773840", "raw"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131099754", "attr"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            linearLayout2.addView(tuxIconView2, layoutParams9);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.hrl);
        tuxTextView2.setGravity(16);
        tuxTextView2.setPadding(tuxTextView2.getPaddingLeft(), tuxTextView2.getPaddingTop(), tuxTextView2.getPaddingRight(), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        tuxTextView2.setPadding((int) resources.getDimension(R.dimen.ru), tuxTextView2.getPaddingTop(), tuxTextView2.getPaddingRight(), tuxTextView2.getPaddingBottom());
        tuxTextView2.setSingleLine(true);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ej});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        tuxTextView2.setText(2131833523);
        ViewGroup.MarginLayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams10)) {
            ((RelativeLayout.LayoutParams) layoutParams10).addRule(15, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams10)) {
            ((RelativeLayout.LayoutParams) layoutParams10).addRule(17, R.id.vz8);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Semibold"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout2.addView(tuxTextView2, layoutParams10);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            frameLayout2.addView(linearLayout2, layoutParams8);
        }
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout.addView(frameLayout2, layoutParams7);
        }
        android.view.a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
