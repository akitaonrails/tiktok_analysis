package com.by.andInflater;

import X.C197039127h;
import X.C425800Gmo;
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
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.f;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class layout_video_expose_sharer implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.LJLLLLLL(8, frameLayout);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -2, viewGroup);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.hi5);
        relativeLayout.setBackgroundResource(R.drawable.ba9);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        C197039127h c197039127h = new C197039127h(context);
        c197039127h.setId(R.id.zmf);
        c197039127h.setText(2131837643);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(10, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(21, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        new f();
        f.LIZ("app:tux_buttonAutoSizing", new a.c("true"), c197039127h);
        f.LIZ("app:tux_buttonVariant", new a.c("primary"), c197039127h);
        f.LIZ("app:tux_font", new a.c("P2_Semibold"), c197039127h);
        android.view.a.LIZ(c197039127h);
        if (c197039127h.getParent() == null) {
            relativeLayout.addView(c197039127h, layoutParams2);
        }
        SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(context);
        smartAvatarImageView.setId(R.id.v3t);
        C786410Ut5.LJZI(0, smartAvatarImageView);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(smartAvatarImageView);
        if (smartAvatarImageView.getParent() == null) {
            relativeLayout.addView(smartAvatarImageView, layoutParams3);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.tv_sharer_name);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setGravity(8388611);
        tuxTextView.setMaxLines(1);
        tuxTextView.setText("yyggpppjjllLL");
        tuxTextView.setTextAlignment(5);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(10, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(16, R.id.zmf);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(17, R.id.v3t);
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Semibold"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            relativeLayout.addView(tuxTextView, layoutParams4);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.tv_sharing_text);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setGravity(8388611);
        tuxTextView2.setMaxLines(2);
        tuxTextView2.setText(2131822146);
        tuxTextView2.setTextAlignment(5);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView2.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            i = R.id.tv_sharer_name;
            layoutParams5.addRule(3, R.id.tv_sharer_name);
        } else {
            i = R.id.tv_sharer_name;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(18, i);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(19, i);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics());
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P2_Regular"), tuxTextView2);
        android.view.a.LIZ(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            relativeLayout.addView(tuxTextView2, layoutParams5);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.ozi);
        C786410Ut5.x5(tuxIconView, 0.0f);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            i2 = -1;
            layoutParams6.addRule(21, -1);
        } else {
            i2 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.addRule(11, i2);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.addRule(15, i2);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130772913", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            relativeLayout.addView(tuxIconView, layoutParams6);
        }
        android.view.a.LIZ(relativeLayout);
        if (relativeLayout.getParent() == null) {
            frameLayout.addView(relativeLayout, layoutParams);
        }
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        relativeLayout2.setId(R.id.snx);
        relativeLayout2.setElevation(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        C786410Ut5.LJLLLLLL(8, relativeLayout2);
        ViewGroup.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        RelativeLayout relativeLayout3 = new RelativeLayout(context);
        relativeLayout3.setId(R.id.mjp);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.addRule(15, -1);
        }
        C425800Gmo c425800Gmo = new C425800Gmo(context, null, 6);
        c425800Gmo.setId(R.id.so0);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.setMargins((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(c425800Gmo);
        if (c425800Gmo.getParent() == null) {
            relativeLayout3.addView(c425800Gmo, layoutParams9);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.so2);
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        tuxIconView2.setImportantForAccessibility(2);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774372", "raw"), tuxIconView2);
        k.LIZ("app:tux_tintColor", new a.b("2131099769", "attr"), tuxIconView2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        k.LIZ("app:tux_iconHeight", new a.d("20", "dp"), tuxIconView2);
        k.LIZ("app:tux_iconWidth", new a.d("20", "dp"), tuxIconView2);
        android.view.a.LIZ(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            relativeLayout3.addView(tuxIconView2, layoutParams10);
        }
        android.view.a.LIZ(relativeLayout3);
        if (relativeLayout3.getParent() == null) {
            relativeLayout2.addView(relativeLayout3, layoutParams8);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.so1);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView3.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        tuxTextView3.setSingleLine(true);
        tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Regular"), tuxTextView3);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.addRule(15, -1);
        }
        o.LIZ("app:tux_minTextSize", new a.d("12", "dp"), tuxTextView3);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.addRule(17, R.id.mjp);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.addRule(16, R.id.gzl);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            relativeLayout2.addView(tuxTextView3, layoutParams11);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.gzl);
        linearLayout.setOrientation(0);
        RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.setMarginStart((int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.addRule(21, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.setMarginEnd((int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.addRule(15, -1);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.gz5);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("H1_Bold"), tuxTextView4);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams13)) {
            i3 = 16;
            layoutParams13.gravity = 16;
        } else {
            i3 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams13)) {
            ((FrameLayout.LayoutParams) layoutParams13).gravity = i3;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams13)) {
            ((DrawerLayout$LayoutParams) layoutParams13).gravity = i3;
        }
        android.view.a.LIZ(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            linearLayout.addView(tuxTextView4, layoutParams13);
        }
        TuxTextView tuxTextView5 = new TuxTextView(context);
        tuxTextView5.setId(R.id.gz8);
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("H1_Bold"), tuxTextView5);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams14)) {
            i4 = 16;
            layoutParams14.gravity = 16;
        } else {
            i4 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams14)) {
            ((FrameLayout.LayoutParams) layoutParams14).gravity = i4;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams14)) {
            ((DrawerLayout$LayoutParams) layoutParams14).gravity = i4;
        }
        android.view.a.LIZ(tuxTextView5);
        if (tuxTextView5.getParent() == null) {
            linearLayout.addView(tuxTextView5, layoutParams14);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            relativeLayout2.addView(linearLayout, layoutParams12);
        }
        android.view.a.LIZ(relativeLayout2);
        if (relativeLayout2.getParent() == null) {
            frameLayout.addView(relativeLayout2, layoutParams7);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
