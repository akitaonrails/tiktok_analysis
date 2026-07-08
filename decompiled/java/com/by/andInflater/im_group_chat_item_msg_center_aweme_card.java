package com.by.andInflater;

import X.C19ME;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class im_group_chat_item_msg_center_aweme_card implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.eqx);
        C786410Ut5.LJLLLLLL(0, constraintLayout);
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), (int) resources.getDimension(R.dimen.sz), constraintLayout.getPaddingRight(), (int) resources.getDimension(R.dimen.sz));
        if (Build.VERSION.SDK_INT >= 26) {
            constraintLayout.setForeground(context.getResources().getDrawable(R.drawable.cap));
        }
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        new psf.a();
        psf.a.LIZ("android:layout_marginHorizontal", new a.b("2131296924", "dimen"), constraintLayout);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.knx);
        tuxTextView.setBackgroundResource(R.drawable.ca_);
        tuxTextView.setGravity(17);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingRight(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        C19ME c19me = new C19ME(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(c19me)) {
            ((LinearLayout.LayoutParams) c19me).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(c19me)) {
            ((FrameLayout.LayoutParams) c19me).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(c19me)) {
            ((DrawerLayout$LayoutParams) c19me).gravity = 17;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Regular"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, c19me);
        }
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.video_cover);
        smartImageView.setContentDescription(context.getResources().getString(R.string.video));
        smartImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        C786410Ut5.LJZI(0, smartImageView);
        C19ME c19me2 = new C19ME((int) TypedValue.applyDimension(1, 114.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 140.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            ((ViewGroup.MarginLayoutParams) c19me2).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToBottom = R.id.knx;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = 0;
        }
        android.view.a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            constraintLayout.addView(smartImageView, c19me2);
        }
        View view = new View(context);
        view.setId(R.id.video_overlay_cover);
        C786410Ut5.LJLLLLLL(0, view);
        view.setImportantForAccessibility(2);
        view.setFocusable(false);
        C19ME c19me3 = new C19ME((int) TypedValue.applyDimension(1, 114.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 140.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToTop = R.id.video_cover;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = R.id.video_cover;
        }
        android.view.a.LIZ(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, c19me3);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.lb2);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        tuxIconView.setImportantForAccessibility(2);
        tuxIconView.setFocusable(false);
        C19ME c19me4 = new C19ME((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(c19me4)) {
            ((LinearLayout.LayoutParams) c19me4).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(c19me4)) {
            ((FrameLayout.LayoutParams) c19me4).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(c19me4)) {
            ((DrawerLayout$LayoutParams) c19me4).gravity = 17;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774488", "raw"), tuxIconView);
        k.LIZ("app:tux_iconShadow", new a.c("true"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView);
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.topToTop = R.id.video_cover;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.bottomToBottom = R.id.video_cover;
        }
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, c19me4);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.xvv);
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        tuxIconView2.setImportantForAccessibility(2);
        tuxIconView2.setFocusable(false);
        C19ME c19me5 = new C19ME((int) TypedValue.applyDimension(1, 70.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 70.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(c19me5)) {
            i = 17;
            ((LinearLayout.LayoutParams) c19me5).gravity = 17;
        } else {
            i = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(c19me5)) {
            ((FrameLayout.LayoutParams) c19me5).gravity = i;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(c19me5)) {
            ((DrawerLayout$LayoutParams) c19me5).gravity = i;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130772229", "raw"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131099671", "attr"), tuxIconView2);
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.topToTop = R.id.video_cover;
        }
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.bottomToBottom = R.id.video_cover;
        }
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            constraintLayout.addView(tuxIconView2, c19me5);
        }
        android.view.a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
