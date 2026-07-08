package com.by.andInflater;

import X.C1473870oSP;
import X.C1602160rnK;
import X.C19ME;
import X.C20742916Ex;
import X.C427660Gpo;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.challenge.ui.q0;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class detail_base_item_detail_aweme implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        float f3;
        int i5;
        float f4;
        int i6;
        float f5;
        float f6;
        int i7;
        int i8;
        int i9;
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        float f8;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Resources resources = context.getResources();
        FixedRatioFrameLayout fixedRatioFrameLayout = new FixedRatioFrameLayout(context);
        fixedRatioFrameLayout.setId(R.id.eqx);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), viewGroup);
        new q0();
        q0.LIZ("app:frMode", new a.c("fixed_width"), fixedRatioFrameLayout);
        q0.LIZ("app:whRatio", new a.c("0.75"), fixedRatioFrameLayout);
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.cover);
        ViewGroup.LayoutParams layoutParamsLJ = android.view.a.LJ(-1, -1, fixedRatioFrameLayout);
        c cVar = new c();
        cVar.LIZIZ("app:actualImageScaleType", new a.c("centerCrop"), smartImageView);
        cVar.LIZIZ("app:placeholderImage", new a.b("2131099674", "attr"), smartImageView);
        cVar.LIZIZ("app:placeholderImageScaleType", new a.c("centerInside"), smartImageView);
        cVar.LIZ(smartImageView);
        android.view.a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            fixedRatioFrameLayout.addView(smartImageView, layoutParamsLJ);
        }
        View c1473870oSP = new C1473870oSP(context);
        c1473870oSP.setId(R.id.video_view);
        int visibility = c1473870oSP.getVisibility();
        c1473870oSP.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c1473870oSP);
        ViewGroup.LayoutParams layoutParamsLJ2 = android.view.a.LJ(-1, -1, fixedRatioFrameLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ2).gravity = 8388659;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ2).gravity = 8388659;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ2).gravity = 8388659;
        }
        android.view.a.LIZ(c1473870oSP);
        if (c1473870oSP.getParent() == null) {
            fixedRatioFrameLayout.addView(c1473870oSP, layoutParamsLJ2);
        }
        View frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.qe7);
        C786410Ut5.LJLLLLLL(8, frameLayout);
        ViewGroup.LayoutParams layoutParamsLJ3 = android.view.a.LJ(-1, -1, fixedRatioFrameLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ3).gravity = 8388659;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ3).gravity = 8388659;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ3).gravity = 8388659;
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            fixedRatioFrameLayout.addView(frameLayout, layoutParamsLJ3);
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.hra);
        ViewGroup.LayoutParams layoutParamsLJ4 = android.view.a.LJ(-1, -1, fixedRatioFrameLayout);
        SmartImageView smartImageView2 = new SmartImageView(context);
        smartImageView2.setId(R.id.hrg);
        C19ME c19me = new C19ME((int) resources.getDimension(R.dimen.xg), (int) resources.getDimension(R.dimen.xg));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = (int) resources.getDimension(R.dimen.ag1);
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        android.view.a.LIZ(smartImageView2);
        if (smartImageView2.getParent() == null) {
            constraintLayout.addView(smartImageView2, c19me);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.hrk);
        tuxTextView.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        tuxTextView.setGravity(17);
        tuxTextView.setText(2131833522);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C19ME c19me2 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            i = R.dimen.ag1;
            ((ViewGroup.MarginLayoutParams) c19me2).topMargin = (int) resources.getDimension(R.dimen.ag1);
        } else {
            i = R.dimen.ag1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            c19me2.setMarginStart((int) resources.getDimension(i));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            c19me2.setMarginEnd((int) resources.getDimension(i));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            ((ViewGroup.MarginLayoutParams) c19me2).bottomMargin = (int) resources.getDimension(i);
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToBottom = R.id.hrg;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P1_Bold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, c19me2);
        }
        android.view.a.LIZ(constraintLayout);
        if (constraintLayout.getParent() == null) {
            fixedRatioFrameLayout.addView(constraintLayout, layoutParamsLJ4);
        }
        RemoteImageView remoteImageView = new RemoteImageView(context);
        remoteImageView.setId(R.id.lee);
        C786410Ut5.LJZI(8, remoteImageView);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = android.view.a.LJ((int) TypedValue.applyDimension(1, 31.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), fixedRatioFrameLayout);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 8388661;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 8388661;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ2).gravity = 8388661;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.rightMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.topMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.setMarginEnd((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(remoteImageView);
        if (remoteImageView.getParent() == null) {
            fixedRatioFrameLayout.addView(remoteImageView, marginLayoutParamsLJ2);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.lwp);
        tuxTextView2.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTextView2.getPaddingTop(), tuxTextView2.getPaddingRight(), tuxTextView2.getPaddingBottom());
        tuxTextView2.setPadding(tuxTextView2.getPaddingLeft(), tuxTextView2.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTextView2.getPaddingBottom());
        tuxTextView2.setMaxWidth((int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics()));
        C786410Ut5.LJLLLLLL(8, tuxTextView2);
        tuxTextView2.setSingleLine(true);
        tuxTextView2.setGravity(17);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = android.view.a.LJ(-2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), fixedRatioFrameLayout);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            i2 = 8388659;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 8388659;
        } else {
            i2 = 8388659;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ3).gravity = i2;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ3).gravity = i2;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            f = 6.0f;
            marginLayoutParamsLJ3.leftMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        } else {
            f = 6.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.setMarginStart((int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            marginLayoutParamsLJ3.topMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P1_Regular"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            fixedRatioFrameLayout.addView(tuxTextView2, marginLayoutParamsLJ3);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.lvf);
        tuxTextView3.setBackgroundResource(R.drawable.bh1);
        tuxTextView3.setGravity(17);
        tuxTextView3.setMaxEms(12);
        tuxTextView3.setPadding((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), tuxTextView3.getPaddingTop(), tuxTextView3.getPaddingRight(), tuxTextView3.getPaddingBottom());
        tuxTextView3.setPadding(tuxTextView3.getPaddingLeft(), tuxTextView3.getPaddingTop(), (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), tuxTextView3.getPaddingBottom());
        tuxTextView3.setPadding((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), tuxTextView3.getPaddingTop(), tuxTextView3.getPaddingRight(), tuxTextView3.getPaddingBottom());
        tuxTextView3.setPadding(tuxTextView3.getPaddingLeft(), tuxTextView3.getPaddingTop(), (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), tuxTextView3.getPaddingBottom());
        tuxTextView3.setPadding(tuxTextView3.getPaddingLeft(), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), tuxTextView3.getPaddingRight(), tuxTextView3.getPaddingBottom());
        tuxTextView3.setPadding(tuxTextView3.getPaddingLeft(), tuxTextView3.getPaddingTop(), tuxTextView3.getPaddingRight(), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        tuxTextView3.setText(2131836390);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView3);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ4 = android.view.a.LJ(-2, -2, fixedRatioFrameLayout);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            i3 = 8388659;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ4).gravity = 8388659;
        } else {
            i3 = 8388659;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ4).gravity = i3;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ4).gravity = i3;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            f2 = 6.0f;
            marginLayoutParamsLJ4.leftMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        } else {
            f2 = 6.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            marginLayoutParamsLJ4.topMargin = (int) TypedValue.applyDimension(1, f2, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ4)) {
            marginLayoutParamsLJ4.setMarginStart((int) TypedValue.applyDimension(1, f2, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Semibold"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            fixedRatioFrameLayout.addView(tuxTextView3, marginLayoutParamsLJ4);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.lvo);
        linearLayout.setBackgroundResource(R.drawable.bh5);
        linearLayout.setOrientation(0);
        C786410Ut5.LJLLLLLL(8, linearLayout);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ5 = android.view.a.LJ(-2, (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), fixedRatioFrameLayout);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            i4 = 8388659;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ5).gravity = 8388659;
        } else {
            i4 = 8388659;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ5).gravity = i4;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ5).gravity = i4;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            f3 = 8.0f;
            marginLayoutParamsLJ5.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            f3 = 8.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            marginLayoutParamsLJ5.leftMargin = (int) TypedValue.applyDimension(1, f3, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            marginLayoutParamsLJ5.topMargin = (int) TypedValue.applyDimension(1, f3, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            marginLayoutParamsLJ5.setMarginEnd((int) TypedValue.applyDimension(1, f3, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ5)) {
            marginLayoutParamsLJ5.rightMargin = (int) TypedValue.applyDimension(1, f3, resources.getDisplayMetrics());
        }
        View c427660Gpo = new C427660Gpo(context);
        c427660Gpo.setId(R.id.lvp);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) resources.getDimension(R.dimen.sc), (int) resources.getDimension(R.dimen.sc));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout$LayoutParams) layoutParams).gravity = 17;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(c427660Gpo);
        if (c427660Gpo.getParent() == null) {
            linearLayout.addView(c427660Gpo, layoutParams);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.lvq);
        tuxTextView4.setGravity(17);
        tuxTextView4.setLines(1);
        tuxTextView4.setPadding((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), tuxTextView4.getPaddingTop(), tuxTextView4.getPaddingRight(), tuxTextView4.getPaddingBottom());
        tuxTextView4.setPadding(tuxTextView4.getPaddingLeft(), tuxTextView4.getPaddingTop(), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), tuxTextView4.getPaddingBottom());
        tuxTextView4.setSingleLine(true);
        tuxTextView4.setText(2131836392);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.z_});
        tuxTextView4.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Semibold"), tuxTextView4);
        android.view.a.LIZ(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            frameLayout2.addView(tuxTextView4, layoutParams3);
        }
        View view = new View(context);
        view.setId(R.id.o0y);
        C786410Ut5.LJLLLLLL(0, view);
        view.setBackgroundResource(R.drawable.bhs);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), -1);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 8388613;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams4)) {
            ((DrawerLayout$LayoutParams) layoutParams4).gravity = 8388613;
        }
        android.view.a.LIZ(view);
        if (view.getParent() == null) {
            frameLayout2.addView(view, layoutParams4);
        }
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout.addView(frameLayout2, layoutParams2);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            fixedRatioFrameLayout.addView(linearLayout, marginLayoutParamsLJ5);
        }
        TuxTextView tuxTextView5 = new TuxTextView(context);
        tuxTextView5.setId(R.id.lvn);
        tuxTextView5.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView5.setGravity(17);
        tuxTextView5.setLines(1);
        tuxTextView5.setSingleLine(true);
        tuxTextView5.setText(2131836392);
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView5.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView5);
        tuxTextView5.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTextView5.getPaddingTop(), tuxTextView5.getPaddingRight(), tuxTextView5.getPaddingBottom());
        tuxTextView5.setPadding(tuxTextView5.getPaddingLeft(), tuxTextView5.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTextView5.getPaddingBottom());
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ6 = android.view.a.LJ(-2, (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), fixedRatioFrameLayout);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            i5 = 8388659;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ6).gravity = 8388659;
        } else {
            i5 = 8388659;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ6).gravity = i5;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ6).gravity = i5;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            f4 = 8.0f;
            marginLayoutParamsLJ6.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            f4 = 8.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            marginLayoutParamsLJ6.leftMargin = (int) TypedValue.applyDimension(1, f4, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            marginLayoutParamsLJ6.setMarginEnd((int) TypedValue.applyDimension(1, f4, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            marginLayoutParamsLJ6.rightMargin = (int) TypedValue.applyDimension(1, f4, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ6)) {
            marginLayoutParamsLJ6.topMargin = (int) TypedValue.applyDimension(1, f4, resources.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Semibold"), tuxTextView5);
        android.view.a.LIZ(tuxTextView5);
        if (tuxTextView5.getParent() == null) {
            fixedRatioFrameLayout.addView(tuxTextView5, marginLayoutParamsLJ6);
        }
        TuxTextView tuxTextView6 = new TuxTextView(context);
        tuxTextView6.setId(R.id.lfa);
        TypedArray typedArrayObtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.e4});
        tuxTextView6.setBackgroundColor(typedArrayObtainStyledAttributes5.getColor(0, 0));
        typedArrayObtainStyledAttributes5.recycle();
        tuxTextView6.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView6.setGravity(17);
        tuxTextView6.setLines(1);
        tuxTextView6.setPadding(tuxTextView6.getPaddingLeft(), (int) TypedValue.applyDimension(1, 5.5f, resources.getDisplayMetrics()), tuxTextView6.getPaddingRight(), tuxTextView6.getPaddingBottom());
        tuxTextView6.setPadding(tuxTextView6.getPaddingLeft(), tuxTextView6.getPaddingTop(), tuxTextView6.getPaddingRight(), (int) TypedValue.applyDimension(1, 5.5f, resources.getDisplayMetrics()));
        tuxTextView6.setSingleLine(true);
        tuxTextView6.setText(2131834509);
        TypedArray typedArrayObtainStyledAttributes6 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView6.setTextColor(typedArrayObtainStyledAttributes6.getColor(0, 0));
        typedArrayObtainStyledAttributes6.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView6);
        ViewGroup.LayoutParams layoutParamsLJ5 = android.view.a.LJ(-1, -2, fixedRatioFrameLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ5)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ5).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ5)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ5).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ5)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ5).gravity = 80;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Semibold"), tuxTextView6);
        android.view.a.LIZ(tuxTextView6);
        if (tuxTextView6.getParent() == null) {
            fixedRatioFrameLayout.addView(tuxTextView6, layoutParamsLJ5);
        }
        View view2 = new View(context);
        view2.setId(R.id.cev);
        C786410Ut5.LJLLLLLL(8, view2);
        ViewGroup.LayoutParams layoutParamsLJ6 = android.view.a.LJ(-1, (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), fixedRatioFrameLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ6)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ6).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ6)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ6).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ6)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ6).gravity = 80;
        }
        android.view.a.LIZ(view2);
        if (view2.getParent() == null) {
            fixedRatioFrameLayout.addView(view2, layoutParamsLJ6);
        }
        TuxTextView tuxTextView7 = new TuxTextView(context);
        tuxTextView7.setId(R.id.mnh);
        tuxTextView7.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        tuxTextView7.setGravity(16);
        TypedArray typedArrayObtainStyledAttributes7 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView7.setTextColor(typedArrayObtainStyledAttributes7.getColor(0, 0));
        typedArrayObtainStyledAttributes7.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView7);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ7 = android.view.a.LJ(-2, -2, fixedRatioFrameLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ7)) {
            i6 = -1;
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ7).addRule(20, -1);
        } else {
            i6 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ7)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ7).addRule(9, i6);
        }
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ7)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ7).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ7)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ7).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ7)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ7).gravity = 80;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ7)) {
            f5 = 5.0f;
            marginLayoutParamsLJ7.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        } else {
            f5 = 5.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ7)) {
            marginLayoutParamsLJ7.leftMargin = (int) TypedValue.applyDimension(1, f5, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ7)) {
            marginLayoutParamsLJ7.bottomMargin = (int) TypedValue.applyDimension(1, f5, resources.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Regular"), tuxTextView7);
        tuxTextView7.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.cfr), (Drawable) null, (Drawable) null, (Drawable) null);
        android.view.a.LIZ(tuxTextView7);
        if (tuxTextView7.getParent() == null) {
            fixedRatioFrameLayout.addView(tuxTextView7, marginLayoutParamsLJ7);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        C786410Ut5.LJLLLLLL(8, linearLayout2);
        linearLayout2.setId(R.id.hpz);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ8 = android.view.a.LJ(-2, -2, fixedRatioFrameLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ8)) {
            f6 = 8.0f;
            i7 = 1;
            marginLayoutParamsLJ8.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            f6 = 8.0f;
            i7 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ8)) {
            marginLayoutParamsLJ8.bottomMargin = (int) TypedValue.applyDimension(i7, f6, resources.getDisplayMetrics());
        }
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ8)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ8).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ8)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ8).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ8)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ8).gravity = 80;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ8)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ8).addRule(20, -1);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setImportantForAccessibility(2);
        tuxIconView.setFocusable(false);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((FrameLayout.LayoutParams) layoutParams5).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams5)) {
            ((DrawerLayout$LayoutParams) layoutParams5).gravity = 16;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774118", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100549", "attr"), tuxIconView);
        k.LIZ("app:tux_iconHeight", new a.d("16", "dp"), tuxIconView);
        k.LIZ("app:tux_iconWidth", new a.d("16", "dp"), tuxIconView);
        k.LIZ("app:tux_iconShadow", new a.c("true"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout2.addView(tuxIconView, layoutParams5);
        }
        TuxTextView tuxTextView8 = new TuxTextView(context);
        tuxTextView8.setId(R.id.hq0);
        TypedArray typedArrayObtainStyledAttributes8 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.zi});
        tuxTextView8.setTextColor(typedArrayObtainStyledAttributes8.getColor(0, 0));
        typedArrayObtainStyledAttributes8.recycle();
        tuxTextView8.setShadowLayer(tuxTextView8.getShadowRadius(), tuxTextView8.getShadowDx(), tuxTextView8.getShadowDy(), android.view.a.LIZIZ(R.attr.oz, context));
        tuxTextView8.setShadowLayer(tuxTextView8.getShadowRadius(), 2.0f, tuxTextView8.getShadowDy(), tuxTextView8.getShadowColor());
        tuxTextView8.setShadowLayer(tuxTextView8.getShadowRadius(), tuxTextView8.getShadowDx(), 2.0f, tuxTextView8.getShadowColor());
        tuxTextView8.setShadowLayer(2.0f, tuxTextView8.getShadowDx(), tuxTextView8.getShadowDy(), tuxTextView8.getShadowColor());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Semibold"), tuxTextView8);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            i8 = 16;
            layoutParams6.gravity = 16;
        } else {
            i8 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((FrameLayout.LayoutParams) layoutParams6).gravity = i8;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams6)) {
            ((DrawerLayout$LayoutParams) layoutParams6).gravity = i8;
        }
        android.view.a.LIZ(tuxTextView8);
        if (tuxTextView8.getParent() == null) {
            linearLayout2.addView(tuxTextView8, layoutParams6);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            fixedRatioFrameLayout.addView(linearLayout2, marginLayoutParamsLJ8);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.view_count_icon);
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ9 = android.view.a.LJ((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), fixedRatioFrameLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ9)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ9).addRule(20, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ9)) {
            i9 = 80;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ9).gravity = 80;
        } else {
            i9 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ9)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ9).gravity = i9;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ9)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ9).gravity = i9;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ9)) {
            f7 = 4.0f;
            i10 = 1;
            marginLayoutParamsLJ9.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        } else {
            f7 = 4.0f;
            i10 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ9)) {
            marginLayoutParamsLJ9.bottomMargin = (int) TypedValue.applyDimension(i10, f7, resources.getDisplayMetrics());
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774483", "raw"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            fixedRatioFrameLayout.addView(tuxIconView2, marginLayoutParamsLJ9);
        }
        TuxTextView tuxTextView9 = new TuxTextView(context);
        tuxTextView9.setId(R.id.view_count);
        tuxTextView9.setGravity(16);
        int[] iArr = new int[i10];
        iArr[0] = R.attr.ee;
        TypedArray typedArrayObtainStyledAttributes9 = context.getTheme().obtainStyledAttributes(iArr);
        tuxTextView9.setTextColor(typedArrayObtainStyledAttributes9.getColor(0, 0));
        typedArrayObtainStyledAttributes9.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView9);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ10 = android.view.a.LJ(-2, -2, fixedRatioFrameLayout);
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ10)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ10).addRule(20, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ10)) {
            i11 = 80;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ10).gravity = 80;
        } else {
            i11 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ10)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ10).gravity = i11;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ10)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ10).gravity = i11;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ10)) {
            i12 = 1;
            marginLayoutParamsLJ10.setMarginStart((int) TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()));
        } else {
            i12 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ10)) {
            marginLayoutParamsLJ10.bottomMargin = (int) TypedValue.applyDimension(i12, 4.0f, resources.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Regular"), tuxTextView9);
        android.view.a.LIZ(tuxTextView9);
        if (tuxTextView9.getParent() == null) {
            fixedRatioFrameLayout.addView(tuxTextView9, marginLayoutParamsLJ10);
        }
        TuxTextView tuxTextView10 = new TuxTextView(context);
        tuxTextView10.setId(R.id.x1n);
        tuxTextView10.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView10.setMaxLines(i12);
        tuxTextView10.setPadding((int) TypedValue.applyDimension(i12, 4.0f, resources.getDisplayMetrics()), tuxTextView10.getPaddingTop(), tuxTextView10.getPaddingRight(), tuxTextView10.getPaddingBottom());
        tuxTextView10.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTextView10.getPaddingTop(), tuxTextView10.getPaddingRight(), tuxTextView10.getPaddingBottom());
        tuxTextView10.setPadding(tuxTextView10.getPaddingLeft(), tuxTextView10.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTextView10.getPaddingBottom());
        tuxTextView10.setPadding(tuxTextView10.getPaddingLeft(), tuxTextView10.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTextView10.getPaddingBottom());
        tuxTextView10.setPadding(tuxTextView10.getPaddingLeft(), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), tuxTextView10.getPaddingRight(), tuxTextView10.getPaddingBottom());
        tuxTextView10.setPadding(tuxTextView10.getPaddingLeft(), tuxTextView10.getPaddingTop(), tuxTextView10.getPaddingRight(), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        TypedArray typedArrayObtainStyledAttributes10 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ef});
        tuxTextView10.setTextColor(typedArrayObtainStyledAttributes10.getColor(0, 0));
        typedArrayObtainStyledAttributes10.recycle();
        tuxTextView10.setBackgroundResource(R.drawable.bgo);
        C786410Ut5.LJLLLLLL(8, tuxTextView10);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ11 = android.view.a.LJ(-2, -2, fixedRatioFrameLayout);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ11)) {
            i13 = 8388661;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ11).gravity = 8388661;
        } else {
            i13 = 8388661;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ11)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ11).gravity = i13;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ11)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ11).gravity = i13;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ11)) {
            f8 = 6.0f;
            i14 = 1;
            marginLayoutParamsLJ11.rightMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        } else {
            f8 = 6.0f;
            i14 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ11)) {
            marginLayoutParamsLJ11.setMarginEnd((int) TypedValue.applyDimension(i14, f8, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ11)) {
            marginLayoutParamsLJ11.topMargin = (int) TypedValue.applyDimension(i14, f8, resources.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Regular"), tuxTextView10);
        android.view.a.LIZ(tuxTextView10);
        if (tuxTextView10.getParent() == null) {
            fixedRatioFrameLayout.addView(tuxTextView10, marginLayoutParamsLJ11);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.wbg);
        viewStub.setInflatedId(R.id.hiq);
        ViewGroup.LayoutParams layoutParamsLJ7 = android.view.a.LJ(-1, -1, fixedRatioFrameLayout);
        android.view.a.LIZ(viewStub);
        if (viewStub.getParent() == null) {
            fixedRatioFrameLayout.addView(viewStub, layoutParamsLJ7);
        }
        TuxIconView tuxIconView3 = new TuxIconView(context);
        tuxIconView3.setId(R.id.qcw);
        C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
        tuxIconView3.setImportantForAccessibility(2);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ12 = android.view.a.LJ((int) TypedValue.applyDimension(i14, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), fixedRatioFrameLayout);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ12)) {
            marginLayoutParamsLJ12.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ12)) {
            marginLayoutParamsLJ12.topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ12)) {
            marginLayoutParamsLJ12.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ12)) {
            i15 = -1;
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ12).addRule(21, -1);
        } else {
            i15 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ12)) {
            ((RelativeLayout.LayoutParams) marginLayoutParamsLJ12).addRule(10, i15);
        }
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ12)) {
            i16 = 8388661;
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ12).gravity = 8388661;
        } else {
            i16 = 8388661;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ12)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ12).gravity = i16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ12)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ12).gravity = i16;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ12)) {
            i17 = 0;
            ((C19ME) marginLayoutParamsLJ12).endToEnd = 0;
        } else {
            i17 = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ12)) {
            ((C19ME) marginLayoutParamsLJ12).topToTop = i17;
        }
        new k();
        k.LIZ("app:tux_iconShadow", new a.c("true"), tuxIconView3);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView3);
        k.LIZ("app:tux_icon", new a.b("2130773995", "raw"), tuxIconView3);
        android.view.a.LIZ(tuxIconView3);
        if (tuxIconView3.getParent() == null) {
            fixedRatioFrameLayout.addView(tuxIconView3, marginLayoutParamsLJ12);
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.bkc, fixedRatioFrameLayout, false, R.layout.bk3);
        if (viewLIZ.getParent() == null) {
            fixedRatioFrameLayout.addView(viewLIZ);
        }
        TuxIconView tuxIconView4 = new TuxIconView(context);
        tuxIconView4.setImportantForAccessibility(2);
        tuxIconView4.setId(R.id.oy4);
        C786410Ut5.LLLLLLZZ(tuxIconView4, 8);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ13 = android.view.a.LJ((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), fixedRatioFrameLayout);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ13)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ13).gravity = 8388693;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ13)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ13).gravity = 8388693;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ13)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ13).gravity = 8388693;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774712", "raw"), tuxIconView4);
        k.LIZ("app:tux_tintColor", new a.b("2131100549", "attr"), tuxIconView4);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ13)) {
            marginLayoutParamsLJ13.bottomMargin = (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics());
        }
        k.LIZ("app:tux_iconWidth", new a.d("22", "dp"), tuxIconView4);
        k.LIZ("app:tux_iconHeight", new a.d("22", "dp"), tuxIconView4);
        android.view.a.LIZ(tuxIconView4);
        if (tuxIconView4.getParent() == null) {
            fixedRatioFrameLayout.addView(tuxIconView4, marginLayoutParamsLJ13);
        }
        View constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(R.id.y_m);
        C786410Ut5.LJLLLLLL(8, constraintLayout2);
        ViewGroup.LayoutParams layoutParamsLJ8 = android.view.a.LJ(-1, -2, fixedRatioFrameLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ8)) {
            i18 = 8388659;
            ((LinearLayout.LayoutParams) layoutParamsLJ8).gravity = 8388659;
        } else {
            i18 = 8388659;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ8)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ8).gravity = i18;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ8)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ8).gravity = i18;
        }
        android.view.a.LIZ(constraintLayout2);
        if (constraintLayout2.getParent() == null) {
            fixedRatioFrameLayout.addView(constraintLayout2, layoutParamsLJ8);
        }
        View constraintLayout3 = new ConstraintLayout(context);
        C786410Ut5.LJLLLLLL(8, constraintLayout3);
        constraintLayout3.setId(R.id.ccl);
        ViewGroup.LayoutParams layoutParamsLJ9 = android.view.a.LJ(-1, -2, fixedRatioFrameLayout);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParamsLJ9)) {
            ((LinearLayout.LayoutParams) layoutParamsLJ9).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParamsLJ9)) {
            ((FrameLayout.LayoutParams) layoutParamsLJ9).gravity = 8388691;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParamsLJ9)) {
            ((DrawerLayout$LayoutParams) layoutParamsLJ9).gravity = 8388691;
        }
        android.view.a.LIZ(constraintLayout3);
        if (constraintLayout3.getParent() == null) {
            fixedRatioFrameLayout.addView(constraintLayout3, layoutParamsLJ9);
        }
        android.view.a.LIZ(fixedRatioFrameLayout);
        C786410Ut5.W5(fixedRatioFrameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(fixedRatioFrameLayout);
        }
        return fixedRatioFrameLayout;
    }
}
