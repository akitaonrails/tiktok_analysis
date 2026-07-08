package com.by.andInflater;

import X.C16GA;
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
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_viewstub_story_tag_v2_layout implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(context, null);
        linearLayoutCompat.setId(R.id.w_a);
        linearLayoutCompat.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), linearLayoutCompat.getPaddingTop(), linearLayoutCompat.getPaddingRight(), linearLayoutCompat.getPaddingBottom());
        linearLayoutCompat.setPadding(linearLayoutCompat.getPaddingLeft(), linearLayoutCompat.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), linearLayoutCompat.getPaddingBottom());
        linearLayoutCompat.setGravity(16);
        linearLayoutCompat.setBackgroundResource(R.drawable.bbz);
        C786410Ut5.LJLLLLLL(8, linearLayoutCompat);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), viewGroup);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.w__);
        C16GA c16ga = new C16GA((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774778", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView);
        if (LinearLayout.LayoutParams.class.isInstance(c16ga)) {
            ((LinearLayout.LayoutParams) c16ga).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(c16ga)) {
            ((FrameLayout.LayoutParams) c16ga).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(c16ga)) {
            ((DrawerLayout$LayoutParams) c16ga).gravity = 16;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c16ga)) {
            c16ga.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayoutCompat.addView(tuxIconView, c16ga);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.w9a);
        tuxTextView.setText(2131849134);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        C16GA c16ga2 = new C16GA(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Semibold"), tuxTextView);
        if (LinearLayout.LayoutParams.class.isInstance(c16ga2)) {
            ((LinearLayout.LayoutParams) c16ga2).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(c16ga2)) {
            ((FrameLayout.LayoutParams) c16ga2).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(c16ga2)) {
            ((DrawerLayout$LayoutParams) c16ga2).gravity = 16;
        }
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayoutCompat.addView(tuxTextView, c16ga2);
        }
        android.view.a.LIZ(linearLayoutCompat);
        C786410Ut5.W5(linearLayoutCompat, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayoutCompat);
        }
        return linearLayoutCompat;
    }
}
