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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.story.feed.immersive.abroll.StoryAbRollProgressButton;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class story_layout_ab_roll_view implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -1, viewGroup);
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.l__);
        C786410Ut5.T4(smartImageView, 0.0f);
        C19ME c19me = new C19ME(-1, -1);
        a.LIZ(smartImageView);
        if (smartImageView.getParent() == null) {
            constraintLayout.addView(smartImageView, c19me);
        }
        StoryAbRollProgressButton storyAbRollProgressButton = new StoryAbRollProgressButton(context, null);
        storyAbRollProgressButton.setId(R.id.tv_progress);
        storyAbRollProgressButton.setPadding((int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), storyAbRollProgressButton.getPaddingTop(), storyAbRollProgressButton.getPaddingRight(), storyAbRollProgressButton.getPaddingBottom());
        storyAbRollProgressButton.setPadding(storyAbRollProgressButton.getPaddingLeft(), storyAbRollProgressButton.getPaddingTop(), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), storyAbRollProgressButton.getPaddingBottom());
        C19ME c19me2 = new C19ME(-2, (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(c19me2)) {
            ((ViewGroup.MarginLayoutParams) c19me2).bottomMargin = (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics());
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.bottomToBottom = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.endToEnd = 0;
        }
        if (C19ME.class.isInstance(c19me2)) {
            c19me2.startToStart = 0;
        }
        a.LIZ(storyAbRollProgressButton);
        if (storyAbRollProgressButton.getParent() == null) {
            constraintLayout.addView(storyAbRollProgressButton, c19me2);
        }
        a.LIZ(constraintLayout);
        C786410Ut5.W5(constraintLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
