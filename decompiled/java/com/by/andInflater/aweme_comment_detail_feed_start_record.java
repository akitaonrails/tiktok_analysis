package com.by.andInflater;

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
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class aweme_comment_detail_feed_start_record implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.vz7);
        frameLayout.setBackgroundResource(R.drawable.aen);
        if (TextView.class.isInstance(frameLayout)) {
            a.LJII((int) TypedValue.applyDimension(1, 70.0f, resources.getDisplayMetrics()), frameLayout);
        } else {
            frameLayout.setMinimumWidth((int) TypedValue.applyDimension(1, 70.0f, resources.getDisplayMetrics()));
        }
        frameLayout.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), frameLayout.getPaddingBottom());
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), viewGroup);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout$LayoutParams) layoutParams).gravity = 17;
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.syy);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_icon", new a.b("2130775000", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout.addView(tuxIconView, layoutParams2);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.szn);
        tuxTextView.setMaxWidth((int) TypedValue.applyDimension(1, 102.0f, resources.getDisplayMetrics()));
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        tuxTextView.setText(2131857990);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        new o();
        o.LIZ("app:tux_font", new a.c("P1_Semibold"), tuxTextView);
        o.LIZ("app:tux_minTextSize", new a.d("12", "dp"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams3);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout.addView(linearLayout, layoutParams);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
