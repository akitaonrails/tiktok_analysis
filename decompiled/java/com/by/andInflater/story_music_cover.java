package com.by.andInflater;

import X.C0GU2;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;

/* JADX INFO: loaded from: classes32.dex */
public class story_music_cover implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.w9g);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), viewGroup);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        C0GU2 c0gu2 = new C0GU2(context, null, 6);
        c0gu2.setId(R.id.w9h);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout$LayoutParams) layoutParams).gravity = 17;
        }
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.otv);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ((int) resources.getDimension(R.dimen.ahw), (int) resources.getDimension(R.dimen.ahw), c0gu2);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ2).gravity = 17;
        }
        a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            c0gu2.addView(smartImageView, marginLayoutParamsLJ2);
        }
        a.LIZ(c0gu2);
        if (c0gu2.getParent() == null) {
            frameLayout.addView(c0gu2, layoutParams);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.p_u);
        tuxIconView.setImportantForAccessibility(2);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 17;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
            ((DrawerLayout$LayoutParams) layoutParams2).gravity = 17;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774329", "raw"), tuxIconView);
        k.LIZ("app:tux_iconHeight", new a.d("22", "dp"), tuxIconView);
        k.LIZ("app:tux_iconWidth", new a.d("22", "dp"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            frameLayout.addView(tuxIconView, layoutParams2);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
