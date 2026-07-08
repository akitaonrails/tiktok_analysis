package com.by.andInflater;

import X.C20742916Ex;
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
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import dc.a;
import jf8.c;

/* JADX INFO: loaded from: classes32.dex */
public class friends_tab_v3_repost_video_content implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.ibd);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.nc5);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.ibc);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a03});
        frameLayout2.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.ibf);
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            frameLayout2.addView(frameLayout3, layoutParams3);
        }
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.ld7);
        C786410Ut5.LJZI(8, smartImageView);
        ViewGroup.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        c cVar = new c();
        cVar.LIZIZ("app:placeholderImage", new a.b("2131100570", "attr"), smartImageView);
        cVar.LIZIZ("app:placeholderImageScaleType", new a.c("centerCrop"), smartImageView);
        cVar.LIZ(smartImageView);
        android.view.a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            frameLayout2.addView(smartImageView, layoutParams4);
        }
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.cbz, frameLayout2, false, 0);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 80;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams5)) {
            ((DrawerLayout$LayoutParams) layoutParams5).gravity = 80;
        }
        if (viewLIZ.getParent() == null) {
            frameLayout2.addView(viewLIZ, layoutParams5);
        }
        View viewLIZ2 = C20742916Ex.LIZ(context, R.layout.cc1, frameLayout2, false, 0);
        if (viewLIZ2.getParent() == null) {
            frameLayout2.addView(viewLIZ2);
        }
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout.addView(frameLayout2, layoutParams2);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout.addView(linearLayout, layoutParams);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.fgo);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        ViewGroup.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            frameLayout.addView(tuxTextView, layoutParams6);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
