package com.by.andInflater;

import X.C19ME;
import X.C21415018rM;
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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_layout_tikbot_icon_bubble implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.xvl);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 150.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 150.0f, resources.getDisplayMetrics()), viewGroup);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ).gravity = 8388693;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ).gravity = 8388693;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ).gravity = 8388693;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        View view = new View(context);
        view.setId(R.id.xvk);
        C19ME c19me = new C19ME((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.endToEnd = 0;
        }
        a.LIZ(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, c19me);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.xvm);
        C19ME c19me2 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToEnd = 0;
        }
        View view2 = new View(context);
        view2.setId(R.id.xvf);
        C786410Ut5.T4(view2, 0.4f);
        C786410Ut5.LJLLLLLL(8, view2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) resources.getDimension(R.dimen.tb), (int) resources.getDimension(R.dimen.tb));
        a.LIZ(view2);
        if (view2.getParent() == null) {
            frameLayout.addView(view2, layoutParams);
        }
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.xvc);
        smartImageView.setImportantForAccessibility(2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            frameLayout.addView(smartImageView, layoutParams2);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.xvd);
        appCompatImageView.setBackgroundResource(R.drawable.des);
        appCompatImageView.setImportantForAccessibility(2);
        C786410Ut5.LJZI(8, appCompatImageView);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        a.LIZ(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            frameLayout.addView(appCompatImageView, layoutParams3);
        }
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            constraintLayout.addView(frameLayout, c19me2);
        }
        View smartImageView2 = new SmartImageView(context);
        smartImageView2.setId(R.id.xvn);
        C19ME c19me3 = new C19ME((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            c19me3.setMarginEnd((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            ((ViewGroup.MarginLayoutParams) c19me3).bottomMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToEnd = 0;
        }
        a.LIZ(smartImageView2);
        if (smartImageView2.getParent() == null) {
            constraintLayout.addView(smartImageView2, c19me3);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.xvj);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setGravity(16);
        tuxTextView.setMaxLines(1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C19ME c19me4 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.bottomToBottom = R.id.xvn;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.startToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.topToTop = R.id.xvn;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, c19me4);
        }
        View c21415018rM = new C21415018rM(context);
        c21415018rM.setId(R.id.xvo);
        C786410Ut5.T4(c21415018rM, 0.0f);
        C19ME c19me5 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.startToStart = R.id.xvn;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.topToTop = R.id.xvn;
        }
        android.view.a.LIZ(c21415018rM);
        if (c21415018rM.getParent() == null) {
            constraintLayout.addView(c21415018rM, c19me5);
        }
        android.view.a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
