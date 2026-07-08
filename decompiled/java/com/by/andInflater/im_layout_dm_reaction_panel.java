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
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactioncontainer.view.ReactionContainerFrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class im_layout_dm_reaction_panel implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        ReactionContainerFrameLayout reactionContainerFrameLayout = new ReactionContainerFrameLayout(context, null, 6);
        reactionContainerFrameLayout.setId(R.id.ncm);
        C786410Ut5.LJLLLLLL(8, reactionContainerFrameLayout);
        reactionContainerFrameLayout.setClipChildren(false);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, (int) resources.getDimension(R.dimen.a22), viewGroup);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ).gravity = 8388611;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ).gravity = 8388611;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ).gravity = 8388611;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        View view = new View(context);
        view.setId(R.id.stl);
        view.setBackgroundResource(R.drawable.c_o);
        C786410Ut5.LJLLLLLL(8, view);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), reactionContainerFrameLayout);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 8388613;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ2).gravity = 8388613;
        }
        a.LIZ(view);
        if (view.getParent() == null) {
            reactionContainerFrameLayout.addView(view, marginLayoutParamsLJ2);
        }
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.sty);
        recyclerView.setBackgroundResource(R.drawable.c_o);
        recyclerView.setPadding((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), recyclerView.getPaddingTop(), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), recyclerView.getPaddingBottom());
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = a.LJ(-2, -1, reactionContainerFrameLayout);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ3).gravity = 16;
        }
        a.LIZ(recyclerView);
        if (recyclerView.getParent() == null) {
            reactionContainerFrameLayout.addView(recyclerView, marginLayoutParamsLJ3);
        }
        a.LIZ(reactionContainerFrameLayout);
        C786410Ut5.W5(reactionContainerFrameLayout, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(reactionContainerFrameLayout);
        }
        return reactionContainerFrameLayout;
    }
}
