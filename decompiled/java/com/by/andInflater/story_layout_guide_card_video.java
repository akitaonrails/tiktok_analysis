package com.by.andInflater;

import X.C19ME;
import X.C786410Ut5;
import X.InterfaceC20742716Ev;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class story_layout_guide_card_video implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.trb);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.player_view);
        C19ME c19me = new C19ME(-1, -1);
        if (C19ME.class.isInstance(c19me)) {
            c19me.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me)) {
            c19me.topToTop = 0;
        }
        a.LIZ(frameLayout);
        if (frameLayout.getParent() == null) {
            constraintLayout.addView(frameLayout, c19me);
        }
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.cover);
        smartImageView.setBackgroundResource(R.drawable.cfy);
        smartImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        C786410Ut5.LJZI(8, smartImageView);
        C19ME c19me2 = new C19ME(-1, -1);
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.topToTop = 0;
        }
        a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            constraintLayout.addView(smartImageView, c19me2);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.jct);
        C19ME c19me3 = new C19ME(-1, -1);
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.startToStart = 0;
        }
        if (C19ME.class.isInstance(c19me3)) {
            c19me3.topToTop = 0;
        }
        a.LIZ(frameLayout2);
        if (frameLayout2.getParent() == null) {
            constraintLayout.addView(frameLayout2, c19me3);
        }
        a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
