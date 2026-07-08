package com.by.andInflater;

import X.C0SXO;
import X.C1100300ejs;
import X.C1348310lBt;
import X.C1353500lKG;
import X.C197039127h;
import X.C19ME;
import X.C20742916Ex;
import X.C427870Gq9;
import X.C726240SeE;
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
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;
import xem.f;
import xem.j;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class aweme_comment_comment_edit_layout_new implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v182 */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v80, types: [boolean, int] */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        float f2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ?? r1;
        int i15;
        int i16;
        int i17;
        float f3;
        int i18;
        int i19;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.ea2);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.eak);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.hih);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.jk));
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            frameLayout2.addView(frameLayout3, layoutParams2);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.koa);
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.e_q);
        tuxTextView.setGravity(17);
        tuxTextView.setMaxLines(2);
        if (TextView.class.isInstance(tuxTextView)) {
            a.LJI((int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()), tuxTextView);
        } else {
            tuxTextView.setMinimumHeight((int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView);
        ViewGroup.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Regular"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            frameLayout4.addView(tuxTextView, layoutParams4);
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.eaj);
        constraintLayout.setBackgroundColor(resources.getColor(R.color.dr));
        if (TextView.class.isInstance(constraintLayout)) {
            android.view.a.LJI((int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()), constraintLayout);
        } else {
            constraintLayout.setMinimumHeight((int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        }
        ViewGroup.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.t83);
        appCompatImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        appCompatImageView.setImageResource(R.drawable.afa);
        C786410Ut5.LJZI(8, appCompatImageView);
        appCompatImageView.setContentDescription(context.getResources().getString(2131823226));
        C19ME c19me = new C19ME((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            c19me.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me)) {
            i = R.id.eaj;
            c19me.bottomToBottom = R.id.eaj;
        } else {
            i = R.id.eaj;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = i;
        }
        android.view.a.LIZ(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            constraintLayout.addView(appCompatImageView, c19me);
        }
        C427870Gq9 c427870Gq9 = new C427870Gq9(context);
        c427870Gq9.setId(R.id.e_l);
        C786410Ut5.LJZI(8, c427870Gq9);
        C19ME c19me2 = new C19ME((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            c19me2.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            ((ViewGroup.MarginLayoutParams) c19me2).bottomMargin = (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me2)) {
            i2 = R.id.eaj;
            c19me2.bottomToBottom = R.id.eaj;
        } else {
            i2 = R.id.eaj;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToStart = i2;
        }
        c cVar = new c();
        cVar.LIZIZ("app:placeholderImage", new a.b("2130972023", "drawable"), c427870Gq9);
        cVar.LIZIZ("app:roundingBorderColor", new a.b("2131100103", "attr"), c427870Gq9);
        cVar.LIZIZ("app:roundingBorderWidth", new a.d("0.5", "dp"), c427870Gq9);
        cVar.LIZ(c427870Gq9);
        android.view.a.LIZ(c427870Gq9);
        if (c427870Gq9.getParent() == null) {
            constraintLayout.addView(c427870Gq9, c19me2);
        }
        C726240SeE c726240SeE = new C726240SeE(context);
        c726240SeE.setId(R.id.vs_comment_expand_button_below_avatar);
        c726240SeE.setInflatedId(R.id.eas);
        c726240SeE.setLayoutResource(R.layout.a2i);
        c726240SeE.setExperimentImplementation(new C0SXO());
        C19ME c19me3 = new C19ME((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            c19me3.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = R.id.ma7;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToStart = R.id.eaj;
        }
        android.view.a.LIZ(c726240SeE);
        if (c726240SeE.getParent() == null) {
            constraintLayout.addView(c726240SeE, c19me3);
        }
        View c1100300ejs = new C1100300ejs(context);
        c1100300ejs.setId(R.id.nzw);
        C19ME c19me4 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            c19me4.setMarginEnd((int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            ((ViewGroup.MarginLayoutParams) c19me4).bottomMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me4)) {
            i3 = R.id.e_l;
            c19me4.bottomToBottom = R.id.e_l;
        } else {
            i3 = R.id.e_l;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.endToEnd = i3;
        }
        android.view.a.LIZ(c1100300ejs);
        if (c1100300ejs.getParent() == null) {
            constraintLayout.addView(c1100300ejs, c19me4);
        }
        View view = new View(context);
        view.setId(R.id.ma7);
        view.setBackgroundResource(R.drawable.aea);
        if (TextView.class.isInstance(view)) {
            i4 = 1;
            android.view.a.LJI((int) TypedValue.applyDimension(1, 38.0f, resources.getDisplayMetrics()), view);
        } else {
            i4 = 1;
            view.setMinimumHeight((int) TypedValue.applyDimension(1, 38.0f, resources.getDisplayMetrics()));
        }
        view.setPadding(view.getPaddingLeft(), (int) TypedValue.applyDimension(i4, 11.0f, resources.getDisplayMetrics()), view.getPaddingRight(), view.getPaddingBottom());
        C19ME c19me5 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me5)) {
            c19me5.setMarginStart((int) TypedValue.applyDimension(1, 58.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me5)) {
            ((ViewGroup.MarginLayoutParams) c19me5).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me5)) {
            c19me5.setMarginEnd((int) TypedValue.applyDimension(1, 58.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me5)) {
            ((ViewGroup.MarginLayoutParams) c19me5).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me5)) {
            i5 = R.id.eaj;
            c19me5.bottomToBottom = R.id.eaj;
        } else {
            i5 = R.id.eaj;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.endToEnd = i5;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.startToStart = i5;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.topToTop = i5;
        }
        android.view.a.LIZ(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, c19me5);
        }
        C1353500lKG c1353500lKG = new C1353500lKG(context);
        c1353500lKG.setId(R.id.eal);
        c1353500lKG.setGravity(8388659);
        c1353500lKG.setHint(context.getResources().getString(2131829129));
        c1353500lKG.setMaxLines(4);
        c1353500lKG.setPadding(c1353500lKG.getPaddingLeft(), (int) TypedValue.applyDimension(1, 11.0f, resources.getDisplayMetrics()), c1353500lKG.getPaddingRight(), c1353500lKG.getPaddingBottom());
        c1353500lKG.setPadding(c1353500lKG.getPaddingLeft(), c1353500lKG.getPaddingTop(), c1353500lKG.getPaddingRight(), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        c1353500lKG.setTextAlignment(5);
        c1353500lKG.setEllipsize(TextUtils.TruncateAt.END);
        c1353500lKG.setScrollBarSize((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        c1353500lKG.setVerticalScrollBarEnabled(true);
        c1353500lKG.setScrollbarFadingEnabled(true);
        C19ME c19me6 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            c19me6.setMarginStart((int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            c19me6.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            ((ViewGroup.MarginLayoutParams) c19me6).bottomMargin = (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        new j();
        j.LIZ("android:scrollbarThumbVertical", new a.b("2130969108", "drawable"), c1353500lKG);
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.bottomToTop = R.id.ec8;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.endToStart = R.id.k0y;
        }
        if (C19ME.class.isInstance(c19me6)) {
            i6 = R.id.ma7;
            c19me6.topToTop = R.id.ma7;
        } else {
            i6 = R.id.ma7;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.startToStart = i6;
        }
        j.LIZ("app:tux_font", new a.c("H4_Regular"), c1353500lKG);
        c1353500lKG.setLineSpacing(TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), 1.0f);
        android.view.a.LIZ(c1353500lKG);
        if (c1353500lKG.getParent() == null) {
            constraintLayout.addView(c1353500lKG, c19me6);
        }
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setId(R.id.ec8);
        C19ME c19me7 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me7)) {
            i7 = R.id.ma7;
            c19me7.bottomToBottom = R.id.ma7;
        } else {
            i7 = R.id.ma7;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.startToStart = i7;
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setId(R.id.ecn);
        C786410Ut5.LJLLLLLL(8, frameLayout6);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            i8 = 1;
            f = 14.0f;
            layoutParams6.setMarginStart((int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        } else {
            i8 = 1;
            f = 14.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = (int) TypedValue.applyDimension(i8, f, resources.getDisplayMetrics());
        }
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.ecm);
        smartImageView.setScaleType(ImageView.ScaleType.CENTER);
        C786410Ut5.LJZI(8, smartImageView);
        ViewGroup.LayoutParams layoutParams7 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()));
        c cVar2 = new c();
        cVar2.LIZIZ("app:roundedCornerRadius", new a.b("null", "dimen"), smartImageView);
        cVar2.LIZ(smartImageView);
        android.view.a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            frameLayout6.addView(smartImageView, layoutParams7);
        }
        FrameLayout frameLayout7 = new FrameLayout(context);
        frameLayout7.setId(R.id.nez);
        C786410Ut5.LJLLLLLL(8, frameLayout7);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((LinearLayout.LayoutParams) layoutParams8).gravity = 8388693;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.gravity = 8388693;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams8)) {
            ((DrawerLayout$LayoutParams) layoutParams8).gravity = 8388693;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            f2 = 4.0f;
            layoutParams8.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        } else {
            f2 = 4.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).bottomMargin = (int) TypedValue.applyDimension(1, f2, resources.getDisplayMetrics());
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.lnc);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        tuxIconView.setContentDescription(context.getResources().getString(2131836576));
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774171", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100549", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            frameLayout7.addView(tuxIconView, layoutParams9);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.lnd);
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        tuxIconView2.setContentDescription(context.getResources().getString(2131836578));
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774176", "raw"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131100549", "attr"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            frameLayout7.addView(tuxIconView2, layoutParams10);
        }
        android.view.a.LIZ(frameLayout7);
        if (frameLayout7.getParent() == null) {
            frameLayout6.addView(frameLayout7, layoutParams8);
        }
        android.view.a.LIZ(frameLayout6);
        if (frameLayout6.getParent() == null) {
            frameLayout5.addView(frameLayout6, layoutParams6);
        }
        View c1348310lBt = new C1348310lBt(context);
        c1348310lBt.setId(R.id.bao);
        C786410Ut5.LJLLLLLL(8, c1348310lBt);
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            ((ViewGroup.MarginLayoutParams) layoutParams11).leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            ((ViewGroup.MarginLayoutParams) layoutParams11).bottomMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(c1348310lBt);
        if (c1348310lBt.getParent() == null) {
            frameLayout5.addView(c1348310lBt, layoutParams11);
        }
        android.view.a.LIZ(frameLayout5);
        if (frameLayout5.getParent() == null) {
            constraintLayout.addView(frameLayout5, c19me7);
        }
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setId(R.id.fl0);
        C786410Ut5.LJLLLLLL(8, frameLayout8);
        C19ME c19me8 = new C19ME((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me8)) {
            c19me8.setMarginStart((int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me8)) {
            ((ViewGroup.MarginLayoutParams) c19me8).bottomMargin = (int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me8)) {
            i9 = R.id.ec8;
            c19me8.bottomToBottom = R.id.ec8;
        } else {
            i9 = R.id.ec8;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.startToStart = i9;
        }
        TuxIconView tuxIconView3 = new TuxIconView(context);
        tuxIconView3.setBackgroundResource(R.drawable.aem);
        C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
        tuxIconView3.setContentDescription(null);
        FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams12)) {
            i10 = 17;
            ((LinearLayout.LayoutParams) layoutParams12).gravity = 17;
        } else {
            i10 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.gravity = i10;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams12)) {
            ((DrawerLayout$LayoutParams) layoutParams12).gravity = i10;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130775061", "raw"), tuxIconView3);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView3);
        android.view.a.LIZ(tuxIconView3);
        if (tuxIconView3.getParent() == null) {
            frameLayout8.addView(tuxIconView3, layoutParams12);
        }
        android.view.a.LIZ(frameLayout8);
        if (frameLayout8.getParent() == null) {
            constraintLayout.addView(frameLayout8, c19me8);
        }
        FrameLayout frameLayout9 = new FrameLayout(context);
        frameLayout9.setId(R.id.fkj);
        C786410Ut5.LJLLLLLL(8, frameLayout9);
        C19ME c19me9 = new C19ME((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me9)) {
            c19me9.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me9)) {
            i11 = R.id.ec8;
            c19me9.leftToRight = R.id.ec8;
        } else {
            i11 = R.id.ec8;
        }
        if (C19ME.class.isInstance(c19me9)) {
            c19me9.bottomToBottom = i11;
        }
        if (C19ME.class.isInstance(c19me9)) {
            c19me9.topToTop = i11;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me9)) {
            ((ViewGroup.MarginLayoutParams) c19me9).bottomMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        TuxIconView tuxIconView4 = new TuxIconView(context);
        tuxIconView4.setBackgroundResource(R.drawable.aem);
        C786410Ut5.LLLLLLZZ(tuxIconView4, 0);
        tuxIconView4.setContentDescription(null);
        FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams13)) {
            i12 = 17;
            ((LinearLayout.LayoutParams) layoutParams13).gravity = 17;
        } else {
            i12 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.gravity = i12;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams13)) {
            ((DrawerLayout$LayoutParams) layoutParams13).gravity = i12;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130775061", "raw"), tuxIconView4);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView4);
        android.view.a.LIZ(tuxIconView4);
        if (tuxIconView4.getParent() == null) {
            frameLayout9.addView(tuxIconView4, layoutParams13);
        }
        android.view.a.LIZ(frameLayout9);
        if (frameLayout9.getParent() == null) {
            constraintLayout.addView(frameLayout9, c19me9);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.eco);
        tuxTextView2.setText(2131829121);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView2);
        C19ME c19me10 = new C19ME(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("P1_Regular"), tuxTextView2);
        if (C19ME.class.isInstance(c19me10)) {
            i13 = R.id.ma7;
            c19me10.startToStart = R.id.ma7;
        } else {
            i13 = R.id.ma7;
        }
        if (C19ME.class.isInstance(c19me10)) {
            c19me10.bottomToBottom = i13;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me10)) {
            i14 = 1;
            c19me10.setMarginStart((int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        } else {
            i14 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me10)) {
            ((ViewGroup.MarginLayoutParams) c19me10).bottomMargin = (int) TypedValue.applyDimension(i14, 12.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            constraintLayout.addView(tuxTextView2, c19me10);
        }
        FrameLayout frameLayout10 = new FrameLayout(context);
        frameLayout10.setId(R.id.ecc);
        C786410Ut5.LJLLLLLL(8, frameLayout10);
        C19ME c19me11 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me11)) {
            c19me11.setMarginEnd((int) TypedValue.applyDimension(i14, 12.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me11)) {
            c19me11.bottomToBottom = R.id.ma7;
        }
        if (C19ME.class.isInstance(c19me11)) {
            r1 = 0;
            c19me11.endToEnd = 0;
        } else {
            r1 = 0;
        }
        if (C19ME.class.isInstance(c19me11)) {
            c19me11.topToTop = R.id.ma7;
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.a1x, frameLayout10, r1, r1);
        viewLIZ.setId(R.id.edj);
        if (viewLIZ.getParent() == null) {
            frameLayout10.addView(viewLIZ);
        }
        android.view.a.LIZ(frameLayout10);
        if (frameLayout10.getParent() == null) {
            constraintLayout.addView(frameLayout10, c19me11);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.gzs);
        C786410Ut5.LJLLLLLL(8, linearLayout);
        linearLayout.setOrientation(0);
        C19ME c19me12 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me12)) {
            c19me12.setMarginEnd((int) TypedValue.applyDimension(i14, 2.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me12)) {
            c19me12.bottomToBottom = R.id.ma7;
        }
        if (C19ME.class.isInstance(c19me12)) {
            c19me12.endToStart = R.id.ed_;
        }
        if (C19ME.class.isInstance(c19me12)) {
            c19me12.topToTop = R.id.ma7;
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            constraintLayout.addView(linearLayout, c19me12);
        }
        View viewLIZ2 = C20742916Ex.LIZ(context, R.layout.a3h, constraintLayout, false, 0);
        viewLIZ2.setId(R.id.k0y);
        C19ME c19me13 = new C19ME(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me13)) {
            ((ViewGroup.MarginLayoutParams) c19me13).bottomMargin = (int) TypedValue.applyDimension(i14, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me13)) {
            c19me13.setMarginEnd((int) TypedValue.applyDimension(i14, 6.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me13)) {
            c19me13.bottomToBottom = R.id.ma7;
        }
        if (C19ME.class.isInstance(c19me13)) {
            c19me13.endToStart = R.id.ed_;
        }
        if (viewLIZ2.getParent() == null) {
            constraintLayout.addView(viewLIZ2, c19me13);
        }
        C726240SeE c726240SeE2 = new C726240SeE(context);
        c726240SeE2.setId(R.id.vs_comment_expand_button_inbox);
        c726240SeE2.setInflatedId(R.id.eat);
        c726240SeE2.setLayoutResource(R.layout.a2j);
        c726240SeE2.setExperimentImplementation(new C0SXO());
        C19ME c19me14 = new C19ME((int) TypedValue.applyDimension(i14, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(i14, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me14)) {
            c19me14.setMarginEnd((int) TypedValue.applyDimension(i14, 13.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me14)) {
            ((ViewGroup.MarginLayoutParams) c19me14).topMargin = (int) TypedValue.applyDimension(i14, 12.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me14)) {
            i15 = R.id.ma7;
            c19me14.topToTop = R.id.ma7;
        } else {
            i15 = R.id.ma7;
        }
        if (C19ME.class.isInstance(c19me14)) {
            c19me14.endToEnd = i15;
        }
        android.view.a.LIZ(c726240SeE2);
        if (c726240SeE2.getParent() == null) {
            constraintLayout.addView(c726240SeE2, c19me14);
        }
        TuxIconView tuxIconView5 = new TuxIconView(context);
        tuxIconView5.setId(R.id.ed_);
        C786410Ut5.LLLLLLZZ(tuxIconView5, 8);
        tuxIconView5.setContentDescription(context.getResources().getString(2131823225));
        C19ME c19me15 = new C19ME((int) TypedValue.applyDimension(i14, 28.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(i14, 28.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me15)) {
            c19me15.setMarginEnd((int) TypedValue.applyDimension(i14, 9.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me15)) {
            ((ViewGroup.MarginLayoutParams) c19me15).bottomMargin = (int) TypedValue.applyDimension(i14, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me15)) {
            c19me15.setMarginStart((int) TypedValue.applyDimension(i14, 2.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130773040", "raw"), tuxIconView5);
        k.LIZ("app:tux_iconWidth", new a.d("25.5", "dp"), tuxIconView5);
        k.LIZ("app:tux_iconHeight", new a.d("25.5", "dp"), tuxIconView5);
        if (C19ME.class.isInstance(c19me15)) {
            i16 = R.id.ma7;
            c19me15.bottomToBottom = R.id.ma7;
        } else {
            i16 = R.id.ma7;
        }
        if (C19ME.class.isInstance(c19me15)) {
            c19me15.endToEnd = i16;
        }
        android.view.a.LIZ(tuxIconView5);
        if (tuxIconView5.getParent() == null) {
            constraintLayout.addView(tuxIconView5, c19me15);
        }
        C197039127h c197039127h = new C197039127h(context);
        c197039127h.setId(R.id.ed9);
        c197039127h.setPadding((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), c197039127h.getPaddingTop(), c197039127h.getPaddingRight(), c197039127h.getPaddingBottom());
        c197039127h.setPadding(c197039127h.getPaddingLeft(), c197039127h.getPaddingTop(), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), c197039127h.getPaddingBottom());
        C786410Ut5.LJLLLLLL(8, c197039127h);
        c197039127h.setMaxLines(1);
        c197039127h.setText("");
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1h});
        c197039127h.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        c197039127h.setContentDescription(context.getResources().getString(2131823225));
        C19ME c19me16 = new C19ME((int) TypedValue.applyDimension(1, 46.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me16)) {
            c19me16.setMarginEnd((int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me16)) {
            ((ViewGroup.MarginLayoutParams) c19me16).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me16)) {
            c19me16.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        new f();
        f.LIZ("android:foregroundGravity", new a.c("center"), c197039127h);
        if (LinearLayout.LayoutParams.class.isInstance(c19me16)) {
            ((LinearLayout.LayoutParams) c19me16).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(c19me16)) {
            ((FrameLayout.LayoutParams) c19me16).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(c19me16)) {
            ((DrawerLayout$LayoutParams) c19me16).gravity = 16;
        }
        f.LIZ("android:enabled", new a.c("false"), c197039127h);
        f.LIZ("app:tux_iconStart", new a.b("2130772479", "raw"), c197039127h);
        f.LIZ("app:tux_iconHeight", new a.d("16", "dp"), c197039127h);
        f.LIZ("app:tux_iconWidth", new a.d("16", "dp"), c197039127h);
        f.LIZ("app:tux_tintColor", new a.b("2131100622", "attr"), c197039127h);
        f.LIZ("app:tux_buttonCapsule", new a.c("true"), c197039127h);
        f.LIZ("app:tux_buttonVariant", new a.c("primary"), c197039127h);
        f.LIZ("app:tux_buttonSize", new a.c("tiny"), c197039127h);
        if (C19ME.class.isInstance(c19me16)) {
            i17 = R.id.ma7;
            c19me16.bottomToBottom = R.id.ma7;
        } else {
            i17 = R.id.ma7;
        }
        if (C19ME.class.isInstance(c19me16)) {
            c19me16.endToEnd = i17;
        }
        android.view.a.LIZ(c197039127h);
        if (c197039127h.getParent() == null) {
            constraintLayout.addView(c197039127h, c19me16);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.ed2);
        tuxTextView3.setBackgroundResource(R.drawable.aew);
        tuxTextView3.setGravity(17);
        tuxTextView3.setText(2131834421);
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView3);
        C19ME c19me17 = new C19ME((int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me17)) {
            c19me17.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me17)) {
            c19me17.bottomToBottom = R.id.ma7;
        }
        if (C19ME.class.isInstance(c19me17)) {
            c19me17.endToEnd = R.id.eaj;
        }
        if (C19ME.class.isInstance(c19me17)) {
            c19me17.topToTop = R.id.ma7;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P1_Semibold"), tuxTextView3);
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            constraintLayout.addView(tuxTextView3, c19me17);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.e_z);
        tuxTextView4.setText("4123/4000");
        TypedArray typedArrayObtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1p});
        tuxTextView4.setTextColor(typedArrayObtainStyledAttributes5.getColor(0, 0));
        typedArrayObtainStyledAttributes5.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView4);
        C19ME c19me18 = new C19ME(-2, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me18)) {
            f3 = 8.0f;
            ((ViewGroup.MarginLayoutParams) c19me18).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        } else {
            f3 = 8.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me18)) {
            c19me18.setMarginEnd((int) TypedValue.applyDimension(1, f3, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me18)) {
            i18 = R.id.ma7;
            c19me18.bottomToBottom = R.id.ma7;
        } else {
            i18 = R.id.ma7;
        }
        if (C19ME.class.isInstance(c19me18)) {
            c19me18.endToEnd = i18;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Regular"), tuxTextView4);
        android.view.a.LIZ(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            constraintLayout.addView(tuxTextView4, c19me18);
        }
        View frameLayout11 = new FrameLayout(context);
        frameLayout11.setId(R.id.awt);
        C19ME c19me19 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me19)) {
            c19me19.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me19)) {
            c19me19.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me19)) {
            c19me19.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me19)) {
            c19me19.bottomToBottom = 0;
        }
        android.view.a.LIZ(frameLayout11);
        if (frameLayout11.getParent() == null) {
            constraintLayout.addView(frameLayout11, c19me19);
        }
        android.view.a.LIZ(constraintLayout);
        if (constraintLayout.getParent() == null) {
            frameLayout4.addView(constraintLayout, layoutParams5);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams14)) {
            ((LinearLayout.LayoutParams) layoutParams14).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams14)) {
            ((DrawerLayout$LayoutParams) layoutParams14).gravity = 80;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams14)) {
            i19 = 1;
            ((ViewGroup.MarginLayoutParams) layoutParams14).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        } else {
            i19 = 1;
        }
        View view2 = new View(context);
        view2.setId(R.id.v_divider_top_line);
        int[] iArr = new int[i19];
        iArr[0] = R.attr.a02;
        TypedArray typedArrayObtainStyledAttributes6 = context.getTheme().obtainStyledAttributes(iArr);
        view2.setBackgroundColor(typedArrayObtainStyledAttributes6.getColor(0, 0));
        typedArrayObtainStyledAttributes6.recycle();
        C786410Ut5.LJLLLLLL(8, view2);
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(i19, 1.0f, resources.getDisplayMetrics()));
        android.view.a.LIZ(view2);
        if (view2.getParent() == null) {
            linearLayout2.addView(view2, layoutParams15);
        }
        FrameLayout frameLayout12 = new FrameLayout(context);
        frameLayout12.setId(R.id.j0_);
        frameLayout12.setBackgroundResource(R.drawable.ae9);
        LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams(-1, -2);
        android.view.a.LIZ(frameLayout12);
        if (frameLayout12.getParent() == null) {
            linearLayout2.addView(frameLayout12, layoutParams16);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            frameLayout4.addView(linearLayout2, layoutParams14);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams17)) {
            ((LinearLayout.LayoutParams) layoutParams17).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams17)) {
            layoutParams17.gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams17)) {
            ((DrawerLayout$LayoutParams) layoutParams17).gravity = 80;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams17)) {
            ((ViewGroup.MarginLayoutParams) layoutParams17).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        FrameLayout frameLayout13 = new FrameLayout(context);
        frameLayout13.setId(R.id.o7p);
        LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams(-1, -2);
        android.view.a.LIZ(frameLayout13);
        if (frameLayout13.getParent() == null) {
            linearLayout3.addView(frameLayout13, layoutParams18);
        }
        View view3 = new View(context);
        view3.setId(R.id.v_divider_bottom_line);
        TypedArray typedArrayObtainStyledAttributes7 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a02});
        view3.setBackgroundColor(typedArrayObtainStyledAttributes7.getColor(0, 0));
        typedArrayObtainStyledAttributes7.recycle();
        C786410Ut5.LJLLLLLL(8, view3);
        LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        android.view.a.LIZ(view3);
        if (view3.getParent() == null) {
            linearLayout3.addView(view3, layoutParams19);
        }
        android.view.a.LIZ(linearLayout3);
        if (linearLayout3.getParent() == null) {
            frameLayout4.addView(linearLayout3, layoutParams17);
        }
        android.view.a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            frameLayout2.addView(frameLayout4, layoutParams3);
        }
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2, layoutParams);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
