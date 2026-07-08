package com.by.andInflater;

import X.C0WZX;
import X.C1115150f7p;
import X.C1115650f8d;
import X.C16F5;
import X.C19ME;
import X.C20586115gx;
import X.C2204961BRm;
import X.C418350Gan;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import dc.a;
import java.lang.reflect.Field;
import psf.d;
import psf.e;

/* JADX INFO: loaded from: classes32.dex */
public class ttlive_fragment_live_emoji_input_dialog_optimized_v2_hotspot_optimized implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) throws Throwable {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Resources resources = context.getResources();
        MeasureLinearLayout measureLinearLayout = new MeasureLinearLayout(context, null);
        measureLinearLayout.setId(R.id.eqx);
        measureLinearLayout.setFitsSystemWindows(true);
        measureLinearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.ko4);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -1, measureLinearLayout);
        View c1115150f7p = new C1115150f7p(context);
        c1115150f7p.setId(R.id.view_shadow);
        C19ME c19me = new C19ME(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToTop = R.id.ko2;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        a.LIZ(c1115150f7p);
        if (c1115150f7p.getParent() == null) {
            constraintLayout.addView(c1115150f7p, c19me);
        }
        View frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.ko3);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.c63});
        frameLayout.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.LJLLLLLL(8, frameLayout);
        C19ME c19me2 = new C19ME(-1, (int) TypedValue.applyDimension(1, 500.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToBottom = 0;
        }
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            constraintLayout.addView(frameLayout, c19me2);
        }
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(R.id.ko2);
        C19ME c19me3 = new C19ME(-1, -2);
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = 0;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.kqv);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.c63});
        linearLayout.setBackgroundColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        linearLayout.setClickable(true);
        linearLayout.setOrientation(0);
        C786410Ut5.LJLLLLLL(0, linearLayout);
        C19ME c19me4 = new C19ME(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(c19me4)) {
            ((LinearLayout.LayoutParams) c19me4).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(c19me4)) {
            ((FrameLayout.LayoutParams) c19me4).gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(c19me4)) {
            ((DrawerLayout$LayoutParams) c19me4).gravity = 80;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.topToTop = 0;
        }
        LiveIconView liveIconView = new LiveIconView(context, null);
        liveIconView.setId(R.id.vxm);
        C786410Ut5.LJZI(8, liveIconView);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            i = 80;
            layoutParams.gravity = 80;
        } else {
            i = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = i;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout$LayoutParams) layoutParams).gravity = i;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        new e();
        e.LIZ("app:icon", new a.b("2130976358", "drawable"), liveIconView);
        android.view.a.LIZ(liveIconView);
        if (liveIconView.getParent() == null) {
            linearLayout.addView(liveIconView, layoutParams);
        }
        ConstraintLayout constraintLayout3 = new ConstraintLayout(context);
        constraintLayout3.setId(R.id.xlh);
        if (TextView.class.isInstance(constraintLayout3)) {
            android.view.a.LJI((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), constraintLayout3);
        } else {
            constraintLayout3.setMinimumHeight((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        }
        constraintLayout3.setBackgroundResource(R.drawable.dqj);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) TypedValue.applyDimension(1, 7.5f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) TypedValue.applyDimension(1, 7.5f, resources.getDisplayMetrics());
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.weight = 1;
        }
        View view = new View(context);
        view.setId(R.id.mk9);
        view.setBackgroundResource(R.drawable.dqk);
        C19ME c19me5 = new C19ME((int) resources.getDimension(R.dimen.sr), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me5)) {
            c19me5.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.bottomToBottom = R.id.b67;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.topToTop = R.id.b67;
        }
        android.view.a.LIZ(view);
        if (view.getParent() == null) {
            constraintLayout3.addView(view, c19me5);
        }
        C16F5 c16f5 = new C16F5(context, null);
        c16f5.setId(R.id.b67);
        c16f5.setGravity(8388611);
        c16f5.setMaxLines(2);
        c16f5.setEllipsize(TextUtils.TruncateAt.END);
        C786410Ut5.LJLLLLLL(8, c16f5);
        c16f5.setTextAlignment(5);
        c16f5.setTextDirection(5);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ex6});
        c16f5.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        C19ME c19me6 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            ((ViewGroup.MarginLayoutParams) c19me6).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            c19me6.setMarginEnd((int) resources.getDimension(R.dimen.t8));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me6)) {
            c19me6.setMarginStart((int) resources.getDimension(R.dimen.t8));
        }
        if (C19ME.class.isInstance(c19me6)) {
            i2 = 0;
            c19me6.topToTop = 0;
        } else {
            i2 = 0;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.endToEnd = i2;
        }
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.startToEnd = R.id.mk9;
        }
        android.view.a.LIZ(c16f5);
        if (c16f5.getParent() == null) {
            constraintLayout3.addView(c16f5, c19me6);
        }
        LiveIconView liveIconView2 = new LiveIconView(context, null);
        liveIconView2.setId(R.id.pnx);
        liveIconView2.setPadding(liveIconView2.getPaddingLeft(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), liveIconView2.getPaddingRight(), liveIconView2.getPaddingBottom());
        liveIconView2.setPadding(liveIconView2.getPaddingLeft(), liveIconView2.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), liveIconView2.getPaddingBottom());
        liveIconView2.setPadding(liveIconView2.getPaddingLeft(), liveIconView2.getPaddingTop(), liveIconView2.getPaddingRight(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        C19ME c19me7 = new C19ME((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        new e();
        e.LIZ("app:icon", new a.b("2131104046", "attr"), liveIconView2);
        e.LIZ("app:iconTint", new a.b("2131108708", "attr"), liveIconView2);
        if (C19ME.class.isInstance(c19me7)) {
            i3 = 0;
            c19me7.bottomToBottom = 0;
        } else {
            i3 = 0;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.endToEnd = i3;
        }
        android.view.a.LIZ(liveIconView2);
        if (liveIconView2.getParent() == null) {
            constraintLayout3.addView(liveIconView2, c19me7);
        }
        LiveIconView liveIconView3 = new LiveIconView(context, null);
        liveIconView3.setId(R.id.pod);
        liveIconView3.setPadding(liveIconView3.getPaddingLeft(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), liveIconView3.getPaddingRight(), liveIconView3.getPaddingBottom());
        liveIconView3.setPadding(liveIconView3.getPaddingLeft(), liveIconView3.getPaddingTop(), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), liveIconView3.getPaddingBottom());
        liveIconView3.setPadding(liveIconView3.getPaddingLeft(), liveIconView3.getPaddingTop(), liveIconView3.getPaddingRight(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        C19ME c19me8 = new C19ME((int) TypedValue.applyDimension(1, 38.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        new e();
        e.LIZ("app:icon", new a.b("2131106646", "attr"), liveIconView3);
        e.LIZ("app:iconTint", new a.b("2131108708", "attr"), liveIconView3);
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.endToStart = R.id.pnx;
        }
        android.view.a.LIZ(liveIconView3);
        if (liveIconView3.getParent() == null) {
            constraintLayout3.addView(liveIconView3, c19me8);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.kri);
        C19ME c19me9 = new C19ME((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me9)) {
            ((ViewGroup.MarginLayoutParams) c19me9).topMargin = (int) resources.getDimension(R.dimen.sr);
        }
        if (C19ME.class.isInstance(c19me9)) {
            c19me9.topToBottom = R.id.b67;
        }
        if (C19ME.class.isInstance(c19me9)) {
            i4 = 0;
            c19me9.bottomToBottom = 0;
        } else {
            i4 = 0;
        }
        if (C19ME.class.isInstance(c19me9)) {
            c19me9.startToStart = i4;
        }
        if (C19ME.class.isInstance(c19me9)) {
            c19me9.endToStart = R.id.pod;
        }
        C20586115gx c20586115gx = new C20586115gx(context);
        c20586115gx.setId(R.id.grz);
        c20586115gx.setBackgroundDrawable(null);
        c20586115gx.setGravity(8388627);
        c20586115gx.setInputType(131073);
        c20586115gx.setMaxLines(3);
        c20586115gx.setText("");
        c20586115gx.setFocusable(true);
        c20586115gx.setTextAlignment(5);
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.c9n});
        c20586115gx.setTextColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        if (Build.VERSION.SDK_INT <= 28) {
            Integer numValueOf = Integer.valueOf(R.drawable.eel);
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(c20586115gx, numValueOf);
        } else {
            C2204961BRm.a0(android.view.a.LJFF(TextView.class, Drawable.class), c20586115gx, new Object[]{context.getResources().getDrawable(R.drawable.eel)}, new C0WZX("dzBzEgAjEcvSUX4vQx6FchA04S/u9RCI17PrqSMuRQSRNbEsPnlLCRfuCCnGYnayOr1VGpORbvkaR3M3lO9/6gJULVlU/QZrMkGI8mlEQYSrmug9OH+6ZhQ=", null));
        }
        c20586115gx.setTextSize(2, 17.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams3)) {
            ((DrawerLayout$LayoutParams) layoutParams3).gravity = 16;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            i5 = 1;
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        } else {
            i5 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = (int) TypedValue.applyDimension(i5, 6.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = (int) TypedValue.applyDimension(i5, 6.0f, resources.getDisplayMetrics());
        }
        new d();
        d.LIZ("android:cursorVisible", new a.c("true"), c20586115gx);
        c20586115gx.setLineSpacing(TypedValue.applyDimension(2, 5.0f, resources.getDisplayMetrics()), 1.0f);
        android.view.a.LIZ(c20586115gx);
        if (c20586115gx.getParent() == null) {
            frameLayout2.addView(c20586115gx, layoutParams3);
        }
        C418350Gan c418350Gan = new C418350Gan(context, null);
        c418350Gan.setId(R.id.gs8);
        c418350Gan.setBackgroundDrawable(null);
        c418350Gan.setClickable(false);
        c418350Gan.setFocusable(false);
        c418350Gan.setGravity(8388627);
        c418350Gan.setMaxLines(1);
        c418350Gan.setSingleLine(true);
        c418350Gan.setTextAlignment(5);
        TypedArray typedArrayObtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.cc8});
        c418350Gan.setTextColor(typedArrayObtainStyledAttributes5.getColor(0, 0));
        typedArrayObtainStyledAttributes5.recycle();
        c418350Gan.setTextSize(2, 15.0f);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams4)) {
            ((DrawerLayout$LayoutParams) layoutParams4).gravity = 16;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(c418350Gan);
        if (c418350Gan.getParent() == null) {
            frameLayout2.addView(c418350Gan, layoutParams4);
        }
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            constraintLayout3.addView(frameLayout2, c19me9);
        }
        android.view.a.LIZ(constraintLayout3);
        if (constraintLayout3.getParent() == null) {
            linearLayout.addView(constraintLayout3, layoutParams2);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.upa);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            i6 = 80;
            layoutParams5.gravity = 80;
        } else {
            i6 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((FrameLayout.LayoutParams) layoutParams5).gravity = i6;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams5)) {
            ((DrawerLayout$LayoutParams) layoutParams5).gravity = i6;
        }
        LiveIconView liveIconView4 = new LiveIconView(context, null);
        liveIconView4.setId(R.id.upp);
        liveIconView4.setPadding((int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), liveIconView4.getPaddingTop(), liveIconView4.getPaddingRight(), liveIconView4.getPaddingBottom());
        liveIconView4.setPadding(liveIconView4.getPaddingLeft(), liveIconView4.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), liveIconView4.getPaddingBottom());
        liveIconView4.setPadding(liveIconView4.getPaddingLeft(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), liveIconView4.getPaddingRight(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            i7 = 80;
            ((LinearLayout.LayoutParams) layoutParams6).gravity = 80;
        } else {
            i7 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.gravity = i7;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams6)) {
            ((DrawerLayout$LayoutParams) layoutParams6).gravity = i7;
        }
        new e();
        e.LIZ("app:icon", new a.b("2131106274", "attr"), liveIconView4);
        e.LIZ("app:iconTint", new a.b("2131108709", "attr"), liveIconView4);
        android.view.a.LIZ(liveIconView4);
        if (liveIconView4.getParent() == null) {
            frameLayout3.addView(liveIconView4, layoutParams6);
        }
        android.view.a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            linearLayout.addView(frameLayout3, layoutParams5);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            constraintLayout2.addView(linearLayout, c19me4);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.h05);
        linearLayout2.setClickable(true);
        TypedArray typedArrayObtainStyledAttributes6 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.c63});
        linearLayout2.setBackgroundColor(typedArrayObtainStyledAttributes6.getColor(0, 0));
        typedArrayObtainStyledAttributes6.recycle();
        linearLayout2.setOrientation(1);
        C786410Ut5.LJLLLLLL(8, linearLayout2);
        C19ME c19me10 = new C19ME(-1, (int) resources.getDimension(R.dimen.aqz));
        if (C19ME.class.isInstance(c19me10)) {
            c19me10.topToBottom = R.id.kqv;
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.h07);
        linearLayout3.setOrientation(0);
        C786410Ut5.LJLLLLLL(8, linearLayout3);
        linearLayout3.setGravity(16);
        ViewGroup.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        LiveIconView liveIconView5 = new LiveIconView(context, null);
        liveIconView5.setId(R.id.pnw);
        liveIconView5.setPadding((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        liveIconView5.setBackgroundResource(R.drawable.dql);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).leftMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).rightMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        new e();
        e.LIZ("app:icon", new a.b("2131105539", "attr"), liveIconView5);
        e.LIZ("app:iconTint", new a.b("2131108708", "attr"), liveIconView5);
        android.view.a.LIZ(liveIconView5);
        if (liveIconView5.getParent() == null) {
            linearLayout3.addView(liveIconView5, layoutParams8);
        }
        LiveIconView liveIconView6 = new LiveIconView(context, null);
        liveIconView6.setId(R.id.po3);
        liveIconView6.setPadding((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            ((ViewGroup.MarginLayoutParams) layoutParams9).leftMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            ((ViewGroup.MarginLayoutParams) layoutParams9).rightMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        new e();
        e.LIZ("app:icon", new a.b("2131105815", "attr"), liveIconView6);
        e.LIZ("app:iconTint", new a.b("2131108708", "attr"), liveIconView6);
        android.view.a.LIZ(liveIconView6);
        if (liveIconView6.getParent() == null) {
            linearLayout3.addView(liveIconView6, layoutParams9);
        }
        android.view.a.LIZ(linearLayout3);
        if (linearLayout3.getParent() == null) {
            linearLayout2.addView(linearLayout3, layoutParams7);
        }
        View c1115650f8d = new C1115650f8d(context);
        c1115650f8d.setId(R.id.ks8);
        TypedArray typedArrayObtainStyledAttributes7 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.c69});
        c1115650f8d.setBackgroundColor(typedArrayObtainStyledAttributes7.getColor(0, 0));
        typedArrayObtainStyledAttributes7.recycle();
        ViewGroup.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, -1);
        android.view.a.LIZ(c1115650f8d);
        if (c1115650f8d.getParent() == null) {
            linearLayout2.addView(c1115650f8d, layoutParams10);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            constraintLayout2.addView(linearLayout2, c19me10);
        }
        android.view.a.LIZ(constraintLayout2);
        if (constraintLayout2.getParent() == null) {
            constraintLayout.addView(constraintLayout2, c19me3);
        }
        android.view.a.LIZ(constraintLayout);
        if (constraintLayout.getParent() == null) {
            measureLinearLayout.addView(constraintLayout, layoutParamsLJ);
        }
        android.view.a.LIZ(measureLinearLayout);
        C786410Ut5.W5(measureLinearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(measureLinearLayout);
        }
        return measureLinearLayout;
    }
}
