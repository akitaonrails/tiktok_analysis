package com.by.andInflater;

import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;
import dc.a;
import mcf.d0;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class friends_tab_v3_video_retry_layout implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.i9m);
        C786410Ut5.LJLLLLLL(8, frameLayout);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.zm});
        frameLayout.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.nh2);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        C786410Ut5.LJLLLLLL(8, linearLayout);
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a03});
        linearLayout.setBackgroundColor(typedArrayObtainStyledAttributes2.getColor(0, 0));
        typedArrayObtainStyledAttributes2.recycle();
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setContentDescription(context.getResources().getString(2131823526));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) resources.getDimension(R.dimen.sp), (int) resources.getDimension(R.dimen.sp));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) resources.getDimension(R.dimen.t8);
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130772403", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131100630", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout.addView(tuxIconView, layoutParams2);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1k});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes3.getColor(0, 0));
        typedArrayObtainStyledAttributes3.recycle();
        tuxTextView.setText(2131838836);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        new o();
        o.LIZ("app:tux_font", new a.c("P1_Regular"), tuxTextView);
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams3);
        }
        android.view.a.LIZ(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout.addView(linearLayout, layoutParams);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.vuh);
        C786410Ut5.LJLLLLLL(8, frameLayout2);
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a03});
        frameLayout2.setBackgroundColor(typedArrayObtainStyledAttributes4.getColor(0, 0));
        typedArrayObtainStyledAttributes4.recycle();
        ViewGroup.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        TuxSpinner tuxSpinner = new TuxSpinner(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) resources.getDimension(R.dimen.sp), (int) resources.getDimension(R.dimen.sp));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            i = 17;
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 17;
        } else {
            i = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = i;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams5)) {
            ((DrawerLayout$LayoutParams) layoutParams5).gravity = i;
        }
        d0 d0Var = new d0();
        d0Var.LIZ("app:tux_icon", new a.b("2130774721", "raw"), tuxSpinner);
        d0Var.LIZ("app:tux_tintColor", new a.b("2131100630", "attr"), tuxSpinner);
        android.view.a.LIZ(tuxSpinner);
        if (tuxSpinner.getParent() == null) {
            frameLayout2.addView(tuxSpinner, layoutParams5);
        }
        android.view.a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2, layoutParams4);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
