package com.by.andInflater;

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
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;

/* JADX INFO: loaded from: classes32.dex */
public class music_dsp_fragment_main_v2 implements InterfaceC20742716Ev {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.tnx);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        View relativeLayout2 = new RelativeLayout(context);
        relativeLayout2.setId(R.id.tpv);
        ViewGroup.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        a.LIZ(relativeLayout2);
        if (relativeLayout2.getParent() == null) {
            relativeLayout.addView(relativeLayout2, layoutParams2);
        }
        View view = new View(context);
        view.setId(R.id.w0u);
        ViewGroup.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        a.LIZ(view);
        if (view.getParent() == null) {
            relativeLayout.addView(view, layoutParams3);
        }
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.i89);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(3, R.id.w0u);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(14, -1);
        }
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            relativeLayout.addView(frameLayout2, layoutParams4);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.l_a);
        tuxIconView.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), tuxIconView.getPaddingTop(), tuxIconView.getPaddingRight(), tuxIconView.getPaddingBottom());
        tuxIconView.setPadding(tuxIconView.getPaddingLeft(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), tuxIconView.getPaddingRight(), tuxIconView.getPaddingBottom());
        tuxIconView.setPadding(tuxIconView.getPaddingLeft(), tuxIconView.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), tuxIconView.getPaddingBottom());
        tuxIconView.setPadding(tuxIconView.getPaddingLeft(), tuxIconView.getPaddingTop(), tuxIconView.getPaddingRight(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(3, R.id.w0u);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((FrameLayout.LayoutParams) layoutParams5).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(layoutParams5)) {
            ((DrawerLayout$LayoutParams) layoutParams5).gravity = 16;
        }
        new k();
        k.LIZ("app:tux_icon", new a.b("2130772433", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView);
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            relativeLayout.addView(tuxIconView, layoutParams5);
        }
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.j2f);
        ViewGroup.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -1);
        android.view.a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            relativeLayout.addView(frameLayout3, layoutParams6);
        }
        View frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.ai_);
        C786410Ut5.LJLLLLLL(8, frameLayout4);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.addRule(3, R.id.i89);
        }
        android.view.a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            relativeLayout.addView(frameLayout4, layoutParams7);
        }
        android.view.a.LIZ(relativeLayout);
        if (relativeLayout.getParent() == null) {
            frameLayout.addView(relativeLayout, layoutParams);
        }
        android.view.a.LIZ(frameLayout);
        C786410Ut5.W5(frameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
