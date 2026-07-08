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
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.ss.android.ugc.aweme.comment.keyboard.ui.ClipLinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class aweme_comment_horizontal_emoji_mini_panel implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        ClipLinearLayout clipLinearLayout = new ClipLinearLayout(context, null);
        clipLinearLayout.setId(R.id.gzl);
        C786410Ut5.LJLLLLLL(0, clipLinearLayout);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), viewGroup);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ).gravity = 16;
        }
        a.LIZ(clipLinearLayout);
        C786410Ut5.W5(clipLinearLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(clipLinearLayout);
        }
        return clipLinearLayout;
    }
}
