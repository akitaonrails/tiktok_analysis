package com.by.andInflater;

import X.C19ME;
import X.C20742916Ex;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.story.feed.immersive.panel.ui.ImmersiveGestureMonitor;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class story_item_immersive_collection implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        Resources resources = context.getResources();
        ImmersiveGestureMonitor immersiveGestureMonitor = new ImmersiveGestureMonitor(context, null);
        immersiveGestureMonitor.setId(R.id.dyk);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.dyj);
        ViewGroup.LayoutParams layoutParamsLJ = a.LJ(-1, -1, immersiveGestureMonitor);
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.fcr, constraintLayout, false, 0);
        viewLIZ.setId(R.id.qm5);
        C19ME c19me = new C19ME(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = (int) resources.getDimension(R.dimen.ahz);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me)) {
            ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = (int) resources.getDimension(R.dimen.ahy);
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToBottom = 0;
        }
        if (viewLIZ.getParent() == null) {
            constraintLayout.addView(viewLIZ, c19me);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.under_interaction_overlay);
        C19ME c19me2 = new C19ME(-1, -1);
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            constraintLayout.addView(frameLayout, c19me2);
        }
        View viewLIZ2 = C20742916Ex.LIZ(context, R.layout.fcu, constraintLayout, false, 0);
        viewLIZ2.setId(R.id.kvh);
        C19ME c19me3 = new C19ME(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me3)) {
            ((ViewGroup.MarginLayoutParams) c19me3).topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToTop = 0;
        }
        if (viewLIZ2.getParent() == null) {
            constraintLayout.addView(viewLIZ2, c19me3);
        }
        View viewLIZ3 = C20742916Ex.LIZ(context, R.layout.fcq, constraintLayout, false, 0);
        viewLIZ3.setId(R.id.kvb);
        C19ME c19me4 = new C19ME(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.topToBottom = R.id.kvh;
        }
        if (C19ME.class.isInstance(c19me4)) {
            c19me4.bottomToTop = R.id.kv2;
        }
        if (viewLIZ3.getParent() == null) {
            constraintLayout.addView(viewLIZ3, c19me4);
        }
        View viewLIZ4 = C20742916Ex.LIZ(context, R.layout.fco, constraintLayout, false, 0);
        viewLIZ4.setId(R.id.kv2);
        C19ME c19me5 = new C19ME(-1, -2);
        if (C19ME.class.isInstance(c19me5)) {
            c19me5.bottomToTop = R.id.kv3;
        }
        if (viewLIZ4.getParent() == null) {
            constraintLayout.addView(viewLIZ4, c19me5);
        }
        View viewLIZ5 = C20742916Ex.LIZ(context, R.layout.fc8, constraintLayout, false, 0);
        viewLIZ5.setId(R.id.kv3);
        C786410Ut5.LJLLLLLL(8, viewLIZ5);
        C19ME c19me6 = new C19ME(-1, (int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me6)) {
            c19me6.bottomToBottom = 0;
        }
        if (viewLIZ5.getParent() == null) {
            constraintLayout.addView(viewLIZ5, c19me6);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.i95);
        C19ME c19me7 = new C19ME(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (C19ME.class.isInstance(c19me7)) {
            i = R.id.qm5;
            c19me7.topToTop = R.id.qm5;
        } else {
            i = R.id.qm5;
        }
        if (C19ME.class.isInstance(c19me7)) {
            c19me7.bottomToBottom = i;
        }
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            constraintLayout.addView(frameLayout2, c19me7);
        }
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.lr1);
        C786410Ut5.T4(smartImageView, 0.0f);
        smartImageView.setImageResource(R.drawable.cfs);
        C786410Ut5.LJZI(8, smartImageView);
        C19ME c19me8 = new C19ME(-2, -2);
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.topToTop = 0;
        }
        if (C19ME.class.isInstance(c19me8)) {
            c19me8.bottomToBottom = 0;
        }
        a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            constraintLayout.addView(smartImageView, c19me8);
        }
        a.LIZ(constraintLayout);
        if (constraintLayout.getParent() == null) {
            immersiveGestureMonitor.addView(constraintLayout, layoutParamsLJ);
        }
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.pwk);
        ViewGroup.LayoutParams layoutParamsLJ2 = a.LJ(-1, -1, immersiveGestureMonitor);
        a.LIZ(frameLayout3);
        if (frameLayout3.getParent() == null) {
            immersiveGestureMonitor.addView(frameLayout3, layoutParamsLJ2);
        }
        View frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.w98);
        ViewGroup.LayoutParams layoutParamsLJ3 = a.LJ(-1, -1, immersiveGestureMonitor);
        a.LIZ(frameLayout4);
        if (frameLayout4.getParent() == null) {
            immersiveGestureMonitor.addView(frameLayout4, layoutParamsLJ3);
        }
        a.LIZ(immersiveGestureMonitor);
        C786410Ut5.W5(immersiveGestureMonitor, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(immersiveGestureMonitor);
        }
        return immersiveGestureMonitor;
    }
}
