package com.by.andInflater;

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
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.ui.StoryTag;
import com.zhiliaoapp.musically.R;
import dc.a;
import xem.k;
import xem.o;

/* JADX INFO: loaded from: classes32.dex */
public class common_feed_viewstub_story_tag_layout implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) {
        Resources resources = context.getResources();
        StoryTag storyTag = new StoryTag(context, null, 6);
        storyTag.setId(R.id.w_a);
        storyTag.setPadding((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), storyTag.getPaddingTop(), storyTag.getPaddingRight(), storyTag.getPaddingBottom());
        storyTag.setPadding(storyTag.getPaddingLeft(), storyTag.getPaddingTop(), (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), storyTag.getPaddingBottom());
        storyTag.setGravity(16);
        storyTag.setBackgroundColor(resources.getColor(R.color.dr));
        C786410Ut5.LJLLLLLL(8, storyTag);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-2, (int) TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()), viewGroup);
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ)) {
            marginLayoutParamsLJ.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.w__);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ2 = a.LJ((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), storyTag);
        new k();
        k.LIZ("app:tux_icon", new a.b("2130774778", "raw"), tuxIconView);
        k.LIZ("app:tux_tintColor", new a.b("2131099768", "attr"), tuxIconView);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ2).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ2).gravity = 16;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(marginLayoutParamsLJ2)) {
            marginLayoutParamsLJ2.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        android.view.a.LIZ(tuxIconView);
        if (tuxIconView.getParent() == null) {
            storyTag.addView(tuxIconView, marginLayoutParamsLJ2);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.w9a);
        tuxTextView.setText(2131849134);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ee});
        tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ3 = android.view.a.LJ(-2, -2, storyTag);
        new o();
        o.LIZ("app:tux_font", new a.c("P3_Semibold"), tuxTextView);
        if (LinearLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((LinearLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((FrameLayout.LayoutParams) marginLayoutParamsLJ3).gravity = 16;
        }
        if (DrawerLayout$LayoutParams.class.isInstance(marginLayoutParamsLJ3)) {
            ((DrawerLayout$LayoutParams) marginLayoutParamsLJ3).gravity = 16;
        }
        android.view.a.LIZ(tuxTextView);
        if (tuxTextView.getParent() == null) {
            storyTag.addView(tuxTextView, marginLayoutParamsLJ3);
        }
        android.view.a.LIZ(storyTag);
        C786410Ut5.W5(storyTag, marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(storyTag);
        }
        return storyTag;
    }
}
