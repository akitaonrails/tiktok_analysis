package com.by.andInflater;

import X.C117T;
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
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;

/* JADX INFO: loaded from: classes32.dex */
public class aweme_comment_im_emoji_panel_v2 implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(1);
        linearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, (int) resources.getDimension(R.dimen.x2), viewGroup);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.maf);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1b});
        linearLayout2.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        linearLayout2.setOrientation(0);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.h0c);
        tuxIconView.setBackgroundResource(R.drawable.bq5);
        tuxIconView.setPadding(tuxIconView.getPaddingLeft(), tuxIconView.getPaddingTop(), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), tuxIconView.getPaddingBottom());
        tuxIconView.setPadding((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), tuxIconView.getPaddingTop(), tuxIconView.getPaddingRight(), tuxIconView.getPaddingBottom());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        new k();
        k.LIZ("app:tux_iconWidth", new a.d("24", "dp"), tuxIconView);
        k.LIZ("app:tux_iconHeight", new a.d("24", "dp"), tuxIconView);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        k.LIZ("app:tux_icon", new a.b("2130773902", "raw"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout2.addView(tuxIconView, layoutParams2);
        }
        View view = new View(context);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.nd});
        view.setBackgroundColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), -1);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics());
        }
        android.view.a.LIZ(view);
        if (view.getParent() == null) {
            linearLayout2.addView(view, layoutParams3);
        }
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.h0s);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.weight = 1;
        }
        android.view.a.LIZ(recyclerView);
        if (recyclerView.getParent() == null) {
            linearLayout2.addView(recyclerView, layoutParams4);
        }
        android.view.a.LIZ(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.q1l);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.weight = 1;
        }
        C117T c117t = new C117T(context);
        c117t.setId(R.id.h03);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        android.view.a.LIZ(c117t);
        if (c117t.getParent() == null) {
            frameLayout.addView(c117t, layoutParams6);
        }
        android.view.a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams5);
        }
        android.view.a.LIZ(linearLayout);
        C786410Ut5.W5(linearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
