package com.by.andInflater;

import X.C19ME;
import X.C337760DLy;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class explore_item implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.rj8);
        relativeLayout.setClipChildren(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.kgf);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        c cVar = new c();
        cVar.LIZIZ("app:actualImageScaleType", new a.c("centerCrop"), smartImageView);
        cVar.LIZIZ("app:placeholderImage", new a.b("2131099674", "attr"), smartImageView);
        cVar.LIZIZ("app:roundAsCircle", new a.c("false"), smartImageView);
        cVar.LIZIZ("app:roundedCornerRadius", new a.b("null", "dimen"), smartImageView);
        cVar.LIZ(smartImageView);
        android.view.a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            relativeLayout.addView(smartImageView, layoutParams);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.kh4);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(6, R.id.kgf);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(19, R.id.kgf);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            relativeLayout.addView(tuxIconView, layoutParams2);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.hhl);
        linearLayout.setOrientation(1);
        linearLayout.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(3, R.id.kgf);
        }
        View frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.m4c);
        ViewGroup.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams4);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.tvw_desc);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(2);
        tuxTextView.setTextAlignment(5);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("P1_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams5);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.wey);
        linearLayout2.setGravity(16);
        linearLayout2.setOrientation(0);
        ViewGroup.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.user_profile_layout);
        linearLayout3.setOrientation(0);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.weight = 1;
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.kg1);
        ViewGroup.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(context);
        smartAvatarImageView.setId(R.id.kg0);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        c cVar2 = new c();
        cVar2.LIZIZ("app:roundingBorderColor", new a.b("2131100570", "attr"), smartAvatarImageView);
        cVar2.LIZIZ("app:roundingBorderWidth", new a.d("0.5", "dp"), smartAvatarImageView);
        cVar2.LIZ(smartAvatarImageView);
        android.view.a.LIZ(smartAvatarImageView);
        if (smartAvatarImageView.getParent() == null) {
            frameLayout2.addView(smartAvatarImageView, layoutParams9);
        }
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout3.addView(frameLayout2, layoutParams8);
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        ViewGroup.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -1);
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.tvw_nick);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C19ME c19me = new C19ME(-2, -1);
        if (C19ME.class.isInstance(c19me)) {
            c19me.constrainedWidth = true;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.endToStart = R.id.c4k;
        }
        if (C19ME.class.isInstance(c19me)) {
            i = 0;
            c19me.startToStart = 0;
        } else {
            i = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = i;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Regular"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            constraintLayout.addView(tuxTextView2, c19me);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.c4k);
        tuxIconView2.setContentDescription("blueV");
        tuxIconView2.setPadding((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        C19ME c19me2 = new C19ME((int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.horizontalBias = 0.0f;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToEnd = R.id.tvw_nick;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToTop = 0;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130773493", "raw"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            constraintLayout.addView(tuxIconView2, c19me2);
        }
        android.view.a.LIZ(constraintLayout);
        if (constraintLayout.getParent() == null) {
            linearLayout3.addView(constraintLayout, layoutParams10);
        }
        android.view.a.LIZ(linearLayout3);
        if (linearLayout3.getParent() == null) {
            linearLayout2.addView(linearLayout3, layoutParams7);
        }
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setId(R.id.fu8);
        linearLayout4.setGravity(16);
        linearLayout4.setOrientation(0);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        C337760DLy c337760DLy = new C337760DLy(context, null, 0);
        c337760DLy.setId(R.id.kgy);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        android.view.a.LIZ(c337760DLy);
        if (c337760DLy.getParent() == null) {
            linearLayout4.addView(c337760DLy, layoutParams12);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.tvw_like_counts);
        tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView3.setMaxLines(1);
        tuxTextView3.setTextAlignment(5);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.setMarginStart((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Regular"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            linearLayout4.addView(tuxTextView3, layoutParams13);
        }
        android.view.a.LIZ(linearLayout4);
        if (linearLayout4.getParent() == null) {
            linearLayout2.addView(linearLayout4, layoutParams11);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams6);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            relativeLayout.addView(linearLayout, layoutParams3);
        }
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.o0x);
        C786410Ut5.LJLLLLLL(8, frameLayout3);
        ViewGroup.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        android.view.a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            relativeLayout.addView(frameLayout3, layoutParams14);
        }
        android.view.a.LIZ(relativeLayout);
        C786410Ut5.W5(relativeLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(relativeLayout);
        }
        return relativeLayout;
    }
}
