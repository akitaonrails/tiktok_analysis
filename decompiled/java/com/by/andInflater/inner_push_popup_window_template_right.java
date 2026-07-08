package com.by.andInflater;

import X.C19231910Lt;
import X.C197039127h;
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
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;
import xem.f;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class inner_push_popup_window_template_right implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.tmo);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, -1, viewGroup);
        View c19231910Lt = new C19231910Lt(context, null, 6);
        c19231910Lt.setId(R.id.kop);
        C786410Ut5.LJLLLLLL(8, c19231910Lt);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 8388629;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 8388629;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout$LayoutParams) layoutParams).gravity = 8388629;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        a.LIZ(c19231910Lt);
        if (c19231910Lt.getParent() == null) {
            frameLayout.addView(c19231910Lt, layoutParams);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.kom);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        tuxTextView.setPadding((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        tuxTextView.setAllCaps(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a04});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.LJLLLLLL(8, tuxTextView);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 8388629;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 8388629;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
            ((DrawerLayout$LayoutParams) layoutParams2).gravity = 8388629;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("H4_Semibold"), tuxTextView);
        o.LIZ("app:tux_minTextSize", new a.d("12", "sp"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            frameLayout.addView(tuxTextView, layoutParams2);
        }
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.koy);
        smartImageView.setMaxWidth((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        smartImageView.setMaxHeight((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        smartImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        C786410Ut5.LJZI(8, smartImageView);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            i = 8388629;
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 8388629;
        } else {
            i = 8388629;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = i;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams3)) {
            ((DrawerLayout$LayoutParams) layoutParams3).gravity = i;
        }
        c cVar = new c();
        cVar.LIZIZ("app:roundedCornerRadius", new a.d("4", "dp"), smartImageView);
        cVar.LIZIZ("app:roundingBorderColor", new a.b("2131100101", "attr"), smartImageView);
        cVar.LIZ(smartImageView);
        android.view.a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            frameLayout.addView(smartImageView, layoutParams3);
        }
        C197039127h c197039127h = new C197039127h(context);
        c197039127h.setId(R.id.koz);
        C786410Ut5.LJLLLLLL(8, c197039127h);
        if (TextView.class.isInstance(c197039127h)) {
            i2 = 1;
            android.view.a.LJII((int) TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()), c197039127h);
        } else {
            i2 = 1;
            c197039127h.setMinimumWidth((int) TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()));
        }
        c197039127h.setPadding((int) TypedValue.applyDimension(i2, 12.0f, resources.getDisplayMetrics()), c197039127h.getPaddingTop(), (int) TypedValue.applyDimension(i2, 12.0f, resources.getDisplayMetrics()), c197039127h.getPaddingBottom());
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, (int) TypedValue.applyDimension(i2, 32.0f, resources.getDisplayMetrics()));
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
            layoutParams4.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        new f();
        f.LIZ("app:tux_buttonAutoSizing", new a.c("true"), c197039127h);
        f.LIZ("app:tux_buttonSize", new a.c("small"), c197039127h);
        f.LIZ("app:tux_font", new a.c("H4_Semibold"), c197039127h);
        f.LIZ("app:tux_minTextSize", new a.d("12", "sp"), c197039127h);
        android.view.a.LIZ(c197039127h);
        if (c197039127h.getParent() == null) {
            frameLayout.addView(c197039127h, layoutParams4);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
