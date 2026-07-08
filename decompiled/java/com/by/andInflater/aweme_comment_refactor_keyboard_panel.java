package com.by.andInflater;

import X.C0SXO;
import X.C19ME;
import X.C726240SeE;
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
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public class aweme_comment_refactor_keyboard_panel implements InterfaceC20742716Ev {
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
        int i8;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ).gravity = 80;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.eqx);
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout$LayoutParams) layoutParams).gravity = 80;
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.esr);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.yaa);
        frameLayout3.setBackgroundResource(R.drawable.ae9);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams3)) {
            ((DrawerLayout$LayoutParams) layoutParams3).gravity = 80;
        }
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            frameLayout2.addView(frameLayout3, layoutParams3);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.o7o);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams4)) {
            ((DrawerLayout$LayoutParams) layoutParams4).gravity = 80;
        }
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setId(R.id.eca);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        a.LIZ(frameLayout5);
        if (frameLayout5.getParent() == null) {
            frameLayout4.addView(frameLayout5, layoutParams5);
        }
        a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            frameLayout2.addView(frameLayout4, layoutParams4);
        }
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout.addView(frameLayout2, layoutParams2);
        }
        C726240SeE c726240SeE = new C726240SeE(context);
        c726240SeE.setId(R.id.vs_collapse_title_container);
        c726240SeE.setInflatedId(R.id.y1v);
        c726240SeE.setLayoutResource(R.layout.a2h);
        c726240SeE.setExperimentImplementation(new C0SXO());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            i = 80;
            layoutParams6.gravity = 80;
        } else {
            i = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((FrameLayout.LayoutParams) layoutParams6).gravity = i;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams6)) {
            ((DrawerLayout$LayoutParams) layoutParams6).gravity = i;
        }
        a.LIZ(c726240SeE);
        if (c726240SeE.getParent() == null) {
            linearLayout.addView(c726240SeE, layoutParams6);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.hi8);
        linearLayout2.setOrientation(1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1b});
        linearLayout2.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        View view = new View(context);
        view.setId(R.id.eah);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.nd});
        view.setBackgroundColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        ViewGroup.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(0, 1.0f, resources.getDisplayMetrics()));
        a.LIZ(view);
        if (view.getParent() == null) {
            linearLayout2.addView(view, layoutParams8);
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        ViewGroup.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2);
        View frameLayout7 = new FrameLayout(context);
        frameLayout7.setId(R.id.odz);
        frameLayout7.setPadding(frameLayout7.getPaddingLeft(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), frameLayout7.getPaddingRight(), frameLayout7.getPaddingBottom());
        C786410Ut5.LJLLLLLL(8, frameLayout7);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams10)) {
            i2 = 80;
            ((LinearLayout.LayoutParams) layoutParams10).gravity = 80;
        } else {
            i2 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.gravity = i2;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams10)) {
            ((DrawerLayout$LayoutParams) layoutParams10).gravity = i2;
        }
        a.LIZ(frameLayout7);
        if (frameLayout7.getParent() == null) {
            frameLayout6.addView(frameLayout7, layoutParams10);
        }
        View frameLayout8 = new FrameLayout(context);
        frameLayout8.setId(R.id.eew);
        C786410Ut5.LJLLLLLL(8, frameLayout8);
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams11)) {
            i3 = 80;
            ((LinearLayout.LayoutParams) layoutParams11).gravity = 80;
        } else {
            i3 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.gravity = i3;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams11)) {
            ((DrawerLayout$LayoutParams) layoutParams11).gravity = i3;
        }
        a.LIZ(frameLayout8);
        if (frameLayout8.getParent() == null) {
            frameLayout6.addView(frameLayout8, layoutParams11);
        }
        a.LIZ(frameLayout6);
        if (frameLayout6.getParent() == null) {
            linearLayout2.addView(frameLayout6, layoutParams9);
        }
        View frameLayout9 = new FrameLayout(context);
        frameLayout9.setId(R.id.vc8);
        ViewGroup.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-1, -2);
        a.LIZ(frameLayout9);
        if (frameLayout9.getParent() == null) {
            linearLayout2.addView(frameLayout9, layoutParams12);
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        ViewGroup.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-1, -2);
        FrameLayout frameLayout10 = new FrameLayout(context);
        frameLayout10.setId(R.id.ks2);
        C19ME c19me = new C19ME(-1, -2);
        if (C19ME.class.isInstance(c19me)) {
            i4 = 0;
            c19me.startToStart = 0;
        } else {
            i4 = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.endToEnd = i4;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = i4;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToBottom = i4;
        }
        a.LIZ(frameLayout10);
        if (frameLayout10.getParent() == null) {
            constraintLayout.addView(frameLayout10, c19me);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        C19ME c19me2 = new C19ME(-1, -2);
        if (C19ME.class.isInstance(c19me2)) {
            i5 = 0;
            c19me2.startToStart = 0;
        } else {
            i5 = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToEnd = i5;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = i5;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            i6 = 1;
            ((ViewGroup.MarginLayoutParams) c19me2).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        } else {
            i6 = 1;
        }
        View view2 = new View(context);
        view2.setId(R.id.v_divider_top_line);
        int[] iArr = new int[i6];
        iArr[0] = R.attr.a02;
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(iArr);
        view2.setBackgroundColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        C786410Ut5.LJLLLLLL(8, view2);
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        a.LIZ(view2);
        if (view2.getParent() == null) {
            linearLayout3.addView(view2, layoutParams14);
        }
        FrameLayout frameLayout11 = new FrameLayout(context);
        frameLayout11.setId(R.id.j0_);
        frameLayout11.setBackgroundResource(R.drawable.ae9);
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-1, -2);
        a.LIZ(frameLayout11);
        if (frameLayout11.getParent() == null) {
            linearLayout3.addView(frameLayout11, layoutParams15);
        }
        a.LIZ(linearLayout3);
        if (linearLayout3.getParent() == null) {
            constraintLayout.addView(linearLayout3, c19me2);
        }
        View view3 = new View(context);
        view3.setId(R.id.v_full_screen_mask);
        C786410Ut5.LJLLLLLL(8, view3);
        C19ME c19me3 = new C19ME(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me3)) {
            i7 = 0;
            c19me3.startToStart = 0;
        } else {
            i7 = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToEnd = i7;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToTop = i7;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = i7;
        }
        a.LIZ(view3);
        if (view3.getParent() == null) {
            constraintLayout.addView(view3, c19me3);
        }
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        C19ME c19me4 = new C19ME(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me4)) {
            ((ViewGroup.MarginLayoutParams) c19me4).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me4)) {
            i8 = 0;
            c19me4.startToStart = 0;
        } else {
            i8 = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.endToEnd = i8;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.bottomToBottom = i8;
        }
        FrameLayout frameLayout12 = new FrameLayout(context);
        frameLayout12.setId(R.id.o7p);
        LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams(-1, -2);
        a.LIZ(frameLayout12);
        if (frameLayout12.getParent() == null) {
            linearLayout4.addView(frameLayout12, layoutParams16);
        }
        View view4 = new View(context);
        view4.setId(R.id.v_divider_bottom_line);
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a02});
        view4.setBackgroundColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        C786410Ut5.LJLLLLLL(8, view4);
        LinearLayout.LayoutParams layoutParams17 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        a.LIZ(view4);
        if (view4.getParent() == null) {
            linearLayout4.addView(view4, layoutParams17);
        }
        a.LIZ(linearLayout4);
        if (linearLayout4.getParent() == null) {
            constraintLayout.addView(linearLayout4, c19me4);
        }
        a.LIZ(constraintLayout);
        if (constraintLayout.getParent() == null) {
            linearLayout2.addView(constraintLayout, layoutParams13);
        }
        View frameLayout13 = new FrameLayout(context);
        frameLayout13.setId(R.id.vcb);
        ViewGroup.LayoutParams layoutParams18 = new LinearLayout.LayoutParams(-1, -2);
        a.LIZ(frameLayout13);
        if (frameLayout13.getParent() == null) {
            linearLayout2.addView(frameLayout13, layoutParams18);
        }
        View frameLayout14 = new FrameLayout(context);
        frameLayout14.setId(R.id.oe0);
        C786410Ut5.LJLLLLLL(8, frameLayout14);
        ViewGroup.LayoutParams layoutParams19 = new LinearLayout.LayoutParams(-1, -2);
        a.LIZ(frameLayout14);
        if (frameLayout14.getParent() == null) {
            linearLayout2.addView(frameLayout14, layoutParams19);
        }
        a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams7);
        }
        View frameLayout15 = new FrameLayout(context);
        frameLayout15.setId(R.id.opa);
        TypedArray typedArrayObtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1b});
        frameLayout15.setBackgroundColor(typedArrayObtainStyledAttributes5.getColor(0, 0));
        typedArrayObtainStyledAttributes5.recycle();
        ViewGroup.LayoutParams layoutParams20 = new LinearLayout.LayoutParams(-1, -2);
        a.LIZ(frameLayout15);
        if (frameLayout15.getParent() == null) {
            linearLayout.addView(frameLayout15, layoutParams20);
        }
        a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout.addView(linearLayout, layoutParams);
        }
        View frameLayout16 = new FrameLayout(context);
        frameLayout16.setId(R.id.voice_record_panel_container);
        TypedArray typedArrayObtainStyledAttributes6 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1b});
        frameLayout16.setBackgroundColor(typedArrayObtainStyledAttributes6.getColor(0, 0));
        typedArrayObtainStyledAttributes6.recycle();
        ViewGroup.LayoutParams layoutParams21 = new FrameLayout.LayoutParams(-1, -2);
        a.LIZ(frameLayout16);
        if (frameLayout16.getParent() == null) {
            frameLayout.addView(frameLayout16, layoutParams21);
        }
        a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
