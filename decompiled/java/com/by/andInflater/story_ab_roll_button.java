package com.by.andInflater;

import X.C19ME;
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
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.ss.android.ugc.aweme.story.feed.immersive.abroll.StoryAbRollProgressButton;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class story_ab_roll_button implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        StoryAbRollProgressButton storyAbRollProgressButton = new StoryAbRollProgressButton(context, null);
        storyAbRollProgressButton.setId(R.id.tv_progress);
        storyAbRollProgressButton.setPadding((int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), storyAbRollProgressButton.getPaddingTop(), storyAbRollProgressButton.getPaddingRight(), storyAbRollProgressButton.getPaddingBottom());
        storyAbRollProgressButton.setPadding(storyAbRollProgressButton.getPaddingLeft(), storyAbRollProgressButton.getPaddingTop(), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), storyAbRollProgressButton.getPaddingBottom());
        if (TextView.class.isInstance(storyAbRollProgressButton)) {
            a.LJII((int) TypedValue.applyDimension(1, 164.0f, resources.getDisplayMetrics()), storyAbRollProgressButton);
        } else {
            storyAbRollProgressButton.setMinimumWidth((int) TypedValue.applyDimension(1, 164.0f, resources.getDisplayMetrics()));
        }
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), viewGroup);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.bottomMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.topMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ).gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ).gravity = 1;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ).gravity = 1;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ)) {
            ((C19ME) marginLayoutParamsLJ).bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ)) {
            ((C19ME) marginLayoutParamsLJ).endToEnd = 0;
        }
        if (C19ME.class.isInstance(marginLayoutParamsLJ)) {
            ((C19ME) marginLayoutParamsLJ).startToStart = 0;
        }
        a.LIZ(storyAbRollProgressButton);
        C786410Ut5.W5(storyAbRollProgressButton, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(storyAbRollProgressButton);
        }
        return storyAbRollProgressButton;
    }
}
