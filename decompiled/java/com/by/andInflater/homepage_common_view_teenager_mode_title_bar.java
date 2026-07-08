package com.by.andInflater;

import X.C424700Gl2;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class homepage_common_view_teenager_mode_title_bar implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.xg6);
        C786410Ut5.LJLLLLLL(8, relativeLayout);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        relativeLayout2.setId(R.id.xg5);
        relativeLayout2.setGravity(17);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(13, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout$LayoutParams) layoutParams).gravity = 17;
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.jxe);
        appCompatImageView.setImageResource(R.drawable.bvi);
        ViewGroup.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        a.LIZ(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            relativeLayout2.addView(appCompatImageView, layoutParams2);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.tv_title);
        tuxTextView.setGravity(17);
        tuxTextView.setShadowLayer(tuxTextView.getShadowRadius(), tuxTextView.getShadowDx(), tuxTextView.getShadowDy(), a.LIZIZ(R.attr.oz, context));
        tuxTextView.setShadowLayer(tuxTextView.getShadowRadius(), tuxTextView.getShadowDx(), 2.0f, tuxTextView.getShadowColor());
        tuxTextView.setShadowLayer(2.0f, tuxTextView.getShadowDx(), tuxTextView.getShadowDy(), tuxTextView.getShadowColor());
        tuxTextView.setText(2131829510);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ef});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams3)) {
            ((DrawerLayout$LayoutParams) layoutParams3).gravity = 16;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(17, R.id.jxe);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(1, R.id.jxe);
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Bold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            relativeLayout2.addView(tuxTextView, layoutParams3);
        }
        android.view.a.LIZ(relativeLayout2);
        if (relativeLayout2.getParent() == null) {
            relativeLayout.addView(relativeLayout2, layoutParams);
        }
        C424700Gl2 c424700Gl2 = new C424700Gl2(context);
        c424700Gl2.setId(R.id.xg4);
        c424700Gl2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        C786410Ut5.LJZI(8, c424700Gl2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            i = -1;
            layoutParams4.addRule(21, -1);
        } else {
            i = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(11, i);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.setMargins((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(c424700Gl2);
        if (c424700Gl2.getParent() == null) {
            relativeLayout.addView(c424700Gl2, layoutParams4);
        }
        android.view.a.LIZ(relativeLayout);
        C786410Ut5.W5(relativeLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(relativeLayout);
        }
        return relativeLayout;
    }
}
